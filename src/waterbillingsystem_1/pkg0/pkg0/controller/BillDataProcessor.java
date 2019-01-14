/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import waterbillingsystem_1.pkg0.pkg0.VariableStorage;
import waterbillingsystem_1.pkg0.pkg0.DateDetails;
import waterbillingsystem_1.pkg0.pkg0.base.BillData;
import waterbillingsystem_1.pkg0.pkg0.base.Customer;
import waterbillingsystem_1.pkg0.pkg0.base.MonthlyBillDetails;
import waterbillingsystem_1.pkg0.pkg0.dao.CustomerDataDatabase;
import waterbillingsystem_1.pkg0.pkg0.dao.MonthlyBillDB;
import waterbillingsystem_1.pkg0.pkg0.dao.UnitPricesDB;

/**
 *
 * @author UDISSSA1
 */
public class BillDataProcessor {
    
    public String getBillId(String customerId){
        if(customerId.length()==1)
            customerId = "00"+customerId;
        if(customerId.length()==2)
            customerId = "0"+customerId;  
        
        return customerId+ DateDetails.getDateYear()+DateDetails.getDateMonth();
    }
    
    public boolean putBillData(BillData billData){
        
        billData.setMbid(getBillId(billData.getCid()));
        billData.setMonth(DateDetails.getDateMonth()+"/"+DateDetails.getDateYear());
        
        MonthlyBillDB MonthlyBillDB=new MonthlyBillDB();
        return MonthlyBillDB.putBillData(billData);
    }
    
    public boolean setMonthlyBillDetails(BillData billData) throws Exception{
    
        MonthlyBillDetails monthlyBillDetails =new MonthlyBillDetails();
        monthlyBillDetails.setInvoiceNo(getBillId(billData.getCid()));
        monthlyBillDetails.setCid(billData.getCid());
        monthlyBillDetails.setNic(billData.getNic());
        monthlyBillDetails.setGroup(CustomerDataDatabase.getCustomerGroupIdFromNIC(billData.getNic()));
        
        CustomerDataDatabase customerDataDatabase=new CustomerDataDatabase();
        Customer customer = customerDataDatabase.getCustomer(billData.getNic());
        
        monthlyBillDetails.setOldMeter(customer.getCurrentMeter());
        billData.setOldMeter(customer.getCurrentMeter());
        
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
        
        
        monthlyBillDetails.setFixedCharge(VariableStorage.FixedCharge);
        
        if(billData.isAbsentCharge())
            monthlyBillDetails.setAbsentCharge(VariableStorage.AbsentCharge);
        else
            monthlyBillDetails.setAbsentCharge(0);
        if(billData.isSramadhana())
            monthlyBillDetails.setSramadhana(VariableStorage.SramadhanaCharge);
        else
            monthlyBillDetails.setSramadhana(0);
        
        monthlyBillDetails.setMonthlyConsumption(calculateUsageBill.calculateConsumingBill(monthlyBillDetails.getMonthlyUsageUnit(), unitPricesDB.getUnitPricesFromDB()));         
        
        monthlyBillDetails.setCurrentTotalAmount(customer.getTotalOutstandingAmount());
        
        monthlyBillDetails.setTotalMonthlyAmount(monthlyBillDetails.getMonthlyConsumption()+monthlyBillDetails.getFixedCharge()+
        monthlyBillDetails.getSramadhana()+monthlyBillDetails.getAbsentCharge());
        monthlyBillDetails.setTotalOutstandingMonthly(monthlyBillDetails.getCurrentTotalAmount()+monthlyBillDetails.getTotalMonthlyAmount());
        monthlyBillDetails.setMonth(billData.getMonth());
        
        monthlyBillDetails.setLastPaymentDay(DateDetails.getDateNextMonth()+"/"+DateDetails.getDateNextYear());
        
        MonthlyBillDB monthlyBillDB=new MonthlyBillDB();
        return monthlyBillDB.putMonthlyBillDetails(monthlyBillDetails) && updateCustomerWithBill(monthlyBillDetails);
    }
    
    private boolean updateCustomerWithBill(MonthlyBillDetails monthlyBillDetails) throws Exception{
        
        MonthlyBillDB monthlyBillDB=new MonthlyBillDB();
        return monthlyBillDB.updateCustomerWithBill(monthlyBillDetails);
    }
    
    public boolean DeleteMonthlyBillDBByMBId(String MBId) throws Exception{
        MonthlyBillDB monthlyBillDB =new MonthlyBillDB();
        return monthlyBillDB.deleteBillDataByBDId(MBId);
    }
    
    
}
