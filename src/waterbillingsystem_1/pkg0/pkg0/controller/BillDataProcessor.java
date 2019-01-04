/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import waterbillingsystem_1.pkg0.pkg0.ChargingDetails;
import waterbillingsystem_1.pkg0.pkg0.DateDetails;
import waterbillingsystem_1.pkg0.pkg0.base.BillData;
import waterbillingsystem_1.pkg0.pkg0.base.Customer;
import waterbillingsystem_1.pkg0.pkg0.base.MonthlyBillDetails;
import waterbillingsystem_1.pkg0.pkg0.dao.CustomerDataDatabase;
import waterbillingsystem_1.pkg0.pkg0.dao.MonthlyBillDB;
import waterbillingsystem_1.pkg0.pkg0.dao.getUnitPrices;

/**
 *
 * @author UDISSSA1
 */
public class BillDataProcessor {
    
    private String getBillId(String customerId){
        return customerId+Integer.parseInt(DateDetails.getDateMonth()) ;
    }
    
    public boolean putBillData(BillData billData){
        
        billData.setMbid(getBillId(billData.getCid()));
        billData.setMonth(DateDetails.getDateYear()+DateDetails.getDateMonth());
        
        MonthlyBillDB MonthlyBillDB=new MonthlyBillDB();
        return MonthlyBillDB.putBillData(billData);
    }
    
    private String generateInvoiceNo(String customerId){
        return customerId+DateDetails.getDateMonth();
    }
    
    public boolean setMonthlyBillDetails(BillData billData) throws Exception{
    
        MonthlyBillDetails monthlyBillDetails =new MonthlyBillDetails();
        monthlyBillDetails.setInvoiceNo(generateInvoiceNo(billData.getCid()));
        monthlyBillDetails.setCid(billData.getCid());
        monthlyBillDetails.setGroup(CustomerDataDatabase.getGroupFromNIC(billData.getNic()));
        
        Customer customer = CustomerDataDatabase.getCustomer(billData.getNic());
        
        monthlyBillDetails.setOldMeter(customer.getCurrentMeter());
        monthlyBillDetails.setNewMeter(billData.getNewMeter());
        monthlyBillDetails.setMonthlyConsumption(CalculateUsageBill.calculateConsumingBill(billData, getUnitPrices.getUnitPricesFromDB()));
        monthlyBillDetails.setFixedCharge(ChargingDetails.FixedCharge);
        if(billData.isAbsentCharge())
            monthlyBillDetails.setAbsentCharge(ChargingDetails.AbsentCharge);
        else
            monthlyBillDetails.setAbsentCharge(0);
        if(billData.isSramadhana())
            monthlyBillDetails.setSramadhana(ChargingDetails.SramadhanaCharge);
        else
            monthlyBillDetails.setSramadhana(0);
        
        monthlyBillDetails.setCurrentTotalAmount(customer.getTotalOutstandingAmount());
        
        monthlyBillDetails.setTotalMonthlyAmount(monthlyBillDetails.getMonthlyConsumption()+monthlyBillDetails.getFixedCharge()+
                monthlyBillDetails.getSramadhana()+monthlyBillDetails.getAbsentCharge());
        monthlyBillDetails.setTotalOutstandingMonthly(monthlyBillDetails.getCurrentTotalAmount()+monthlyBillDetails.getTotalMonthlyAmount());
        monthlyBillDetails.setMonth(billData.getMonth());
        monthlyBillDetails.setMonthlyUsageUnit(billData.getMonthlyUsageUnit());
        
        MonthlyBillDB monthlyBillDB=new MonthlyBillDB();
        return monthlyBillDB.putMonthlyBillDetails( monthlyBillDetails);
    }
    
    
    
}
