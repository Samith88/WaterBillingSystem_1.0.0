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
        return customerId+DateDetails.getDateMonth()+ DateDetails.getDateYear();
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
        monthlyBillDetails.setGroup(CustomerDataDatabase.getGroupFromNIC(billData.getNic()));
        
        CustomerDataDatabase customerDataDatabase=new CustomerDataDatabase();
        Customer customer = customerDataDatabase.getCustomer(billData.getNic());
        
        monthlyBillDetails.setOldMeter(customer.getCurrentMeter());
        monthlyBillDetails.setNewMeter(billData.getNewMeter());
        
        UnitPricesDB unitPricesDB=new UnitPricesDB();
        monthlyBillDetails.setMonthlyConsumption(CalculateUsageBill.calculateConsumingBill(billData, unitPricesDB.getUnitPricesFromDB()));
        monthlyBillDetails.setFixedCharge(VariableStorage.FixedCharge);
        if(billData.isAbsentCharge())
            monthlyBillDetails.setAbsentCharge(VariableStorage.AbsentCharge);
        else
            monthlyBillDetails.setAbsentCharge(0);
        if(billData.isSramadhana())
            monthlyBillDetails.setSramadhana(VariableStorage.SramadhanaCharge);
        else
            monthlyBillDetails.setSramadhana(0);
        
        monthlyBillDetails.setCurrentTotalAmount(customer.getTotalOutstandingAmount());
        
        monthlyBillDetails.setTotalMonthlyAmount(monthlyBillDetails.getMonthlyConsumption()+monthlyBillDetails.getFixedCharge()+
                monthlyBillDetails.getSramadhana()+monthlyBillDetails.getAbsentCharge());
        monthlyBillDetails.setTotalOutstandingMonthly(monthlyBillDetails.getCurrentTotalAmount()+monthlyBillDetails.getTotalMonthlyAmount());
        monthlyBillDetails.setMonth(billData.getMonth());
        monthlyBillDetails.setMonthlyUsageUnit(billData.getMonthlyUsageUnit());
        monthlyBillDetails.setLastPaymentDay(DateDetails.getDateNextMonth()+"/"+DateDetails.getDateNextYear());
        
        MonthlyBillDB monthlyBillDB=new MonthlyBillDB();
        return monthlyBillDB.putMonthlyBillDetails(monthlyBillDetails);
    }
    
    
    
}
