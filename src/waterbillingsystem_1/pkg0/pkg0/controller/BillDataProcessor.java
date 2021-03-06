/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import waterbillingsystem_1.pkg0.pkg0.VariableStorage;
import waterbillingsystem_1.pkg0.pkg0.DateDetails;
import waterbillingsystem_1.pkg0.pkg0.Validations;
import waterbillingsystem_1.pkg0.pkg0.base.BillData;
import waterbillingsystem_1.pkg0.pkg0.base.Customer;
import waterbillingsystem_1.pkg0.pkg0.base.MonthlyBillDetails;
import waterbillingsystem_1.pkg0.pkg0.dao.CustomerDB;
import waterbillingsystem_1.pkg0.pkg0.dao.MonthlyBillDB;
import waterbillingsystem_1.pkg0.pkg0.dao.UnitPricesDB;

/**
 *
 * @author UDISSSA1
 */
public class BillDataProcessor {
    
    public String getBillId(String customerId,String Year, String Month){
        if(customerId.length()==1)
            customerId = "00"+customerId;
        if(customerId.length()==2)
            customerId = "0"+customerId;  
        if(!Year.equals("") && !Month.equals("") )
            return Year+Month+customerId;
        else
            return DateDetails.getDateYear()+DateDetails.getDateMonth()+customerId;
    }
    
    public boolean putBillData(BillData billData){
        //String customerId,String Year, String Month
        billData.setMbid(getBillId(billData.getCid(),billData.getMonth().substring(0, 4),billData.getMonth().substring(4, 6)));
        //billData.setMonth(DateDetails.getDateMonth()+"/"+DateDetails.getDateYear());
        
        MonthlyBillDB MonthlyBillDB=new MonthlyBillDB();
        return MonthlyBillDB.putBillData(billData);
    }
    
    public boolean setMonthlyBillDetails(BillData billData) throws Exception{
    
        MonthlyBillDetails monthlyBillDetails =new MonthlyBillDetails();
        monthlyBillDetails.setInvoiceNo(billData.getMbid());
        //monthlyBillDetails.setOldMeter(billData.getOldMeter()+billData.getMonthlyUsageUnit());
        monthlyBillDetails.setCid(billData.getCid());
        //monthlyBillDetails.setNic(billData.getNic());
        monthlyBillDetails.setGroup(CustomerDB.getCustomerGroupIdFromCID(billData.getCid()));
        
        monthlyBillDetails = getUpdatedBillDetails( monthlyBillDetails, billData,"insert");
        
        monthlyBillDetails.setMonth(billData.getMonth());
        monthlyBillDetails.setLastPaymentDay(DateDetails.getDateNextMonth()+"/"+DateDetails.getDateNextYear());
        
        MonthlyBillDB monthlyBillDB=new MonthlyBillDB();
        return monthlyBillDB.putMonthlyBillDetails(monthlyBillDetails) && updateCustomerWithBill(monthlyBillDetails,"insert");
    }
    
    private boolean updateCustomerWithBill(MonthlyBillDetails monthlyBillDetails,String event) throws Exception{
        
        MonthlyBillDB monthlyBillDB=new MonthlyBillDB();
        return monthlyBillDB.updateCustomerWithBill(monthlyBillDetails,event);
    }
    
    public boolean DeleteMonthlyBillDBByMBId(String MBId) throws Exception{
        MonthlyBillDB monthlyBillDB =new MonthlyBillDB();
        return monthlyBillDB.deleteBillDataByBDId(MBId);
    }

    public boolean updateBillData(BillData billData) {
        
        MonthlyBillDB monthlyBillDB=new MonthlyBillDB();
        return monthlyBillDB.updateBillData(billData);
        
    }

    public boolean updateMonthlyBillDetails(BillData billData) throws Exception {
        
        MonthlyBillDB monthlyBillDB=new MonthlyBillDB(); 
        
        MonthlyBillDetails monthlyBillDetails = monthlyBillDB.getMonthlyBillDetailsByInvoiceNo(billData.getMbid());
        
        monthlyBillDetails.setInvoiceNo(billData.getMbid());
        //monthlyBillDetails.setNic(billData.getNic());
        
        getUpdatedBillDetails( monthlyBillDetails, billData,"update");
         
        return monthlyBillDB.updateMonthlyBillDetails(monthlyBillDetails) && updateCustomerWithBill(monthlyBillDetails,"update");
    }
    
    private MonthlyBillDetails getUpdatedBillDetails(MonthlyBillDetails monthlyBillDetails,BillData billData,String event) throws Exception{
        
        CustomerDB customerDataDatabase=new CustomerDB();
        Customer customer = customerDataDatabase.getCustomer(billData.getCid());
        //customer.setCid(customerDataProcessor.getCorrectCID(customer.getCid()));
        
        monthlyBillDetails.setCid(Validations.getCorrectCID(customer.getCid()));
        monthlyBillDetails.setOldMeter(customer.getCurrentMeter());
        //billData.setOldMeter(customer.getPreMeter());
        monthlyBillDetails.setGroup(customer.getGid());
        
        if(billData.getNewMeter()==0 && billData.getMonthlyUsageUnit() > 0)
        {
            monthlyBillDetails.setNewMeter(billData.getMonthlyUsageUnit()+monthlyBillDetails.getOldMeter());
            monthlyBillDetails.setMonthlyUsageUnit(billData.getMonthlyUsageUnit());
        }
        
        if(billData.getNewMeter() > 0 && billData.getMonthlyUsageUnit()==0)
        {
            monthlyBillDetails.setNewMeter(billData.getNewMeter());
            monthlyBillDetails.setMonthlyUsageUnit(billData.getNewMeter()- monthlyBillDetails.getOldMeter());
        } 
        
        UnitPricesDB unitPricesDB=new UnitPricesDB();
        CalculateUsageBill calculateUsageBill=new CalculateUsageBill();
        
        monthlyBillDetails.setFixedCharge(VariableStorage.getFixedCharge());
        
        if(billData.isAbsentCharge()==1)
            monthlyBillDetails.setAbsentCharge(VariableStorage.getAbsentCharge());
        else
            monthlyBillDetails.setAbsentCharge(0);
        if(billData.isSramadhana()==1)
            monthlyBillDetails.setSramadhana(VariableStorage.getSramadhanaCharge());
        else
            monthlyBillDetails.setSramadhana(0);
        
        monthlyBillDetails.setMonthlyConsumption(calculateUsageBill.calculateConsumingBill(monthlyBillDetails.getMonthlyUsageUnit(), unitPricesDB.getUnitPricesFromDB()));         
        
        //This is in-correct when update.
        if(event.equals("insert"))
            monthlyBillDetails.setCurrentTotalAmount(customer.getTotalOutstandingAmount());
        
        monthlyBillDetails.setTotalMonthlyAmount(monthlyBillDetails.getMonthlyConsumption()+monthlyBillDetails.getFixedCharge()+
        monthlyBillDetails.getSramadhana()+monthlyBillDetails.getAbsentCharge());
        monthlyBillDetails.setTotalOutstandingMonthly(monthlyBillDetails.getCurrentTotalAmount()+monthlyBillDetails.getTotalMonthlyAmount());
        
        return monthlyBillDetails;
    }
    
    public BillData getLatestMBIdFromCID(String cid) throws Exception {
    
        MonthlyBillDB monthlyBillDB=new MonthlyBillDB(); 
        return monthlyBillDB.getLatestMBIdFromCID(cid);
        
    }

    public boolean deleteBillData(BillData currentBillData) throws Exception {
        
        MonthlyBillDB monthlyBillDB=new MonthlyBillDB(); 
        return monthlyBillDB.deleteBillData(currentBillData);
    }
}
