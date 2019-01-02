/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import java.util.ArrayList;
import java.util.List;
import waterbillingsystem_1.pkg0.pkg0.base.BillData;
import waterbillingsystem_1.pkg0.pkg0.base.UnitPrice;

/**
 *
 * @author UDISSSA1
 */
public class CalculateUsageBill {
    
    public static double calculateConsumingBill(BillData monthlyBill,List<UnitPrice> unitprices){
        int thisMonthUsage=0;
        if(monthlyBill.getMonthlyUsageUnit()==0)
            thisMonthUsage= monthlyBill.getNewMeter()-monthlyBill.getOldMeter();
        else 
            thisMonthUsage= monthlyBill.getMonthlyUsageUnit();
        
        int  unitPriceCount= unitprices.size();
        double currentBill = 0;
        int unitPerRange = 0;
        
        while(unitPriceCount>0){
            unitPerRange = thisMonthUsage-unitprices.get(unitPriceCount-1).getLower();
            if(unitPerRange > 0)
                currentBill += unitPerRange * unitprices.get(unitPriceCount-1).getPrice();
            
            unitPriceCount--;
            
            if(unitPerRange > 0)
                thisMonthUsage -= unitPerRange;
        }
        return currentBill;
        
    }
    
    public static void main(String[] args) {
        BillData MonthlyBill=new BillData();
        MonthlyBill.setCid(10);
        MonthlyBill.setMonth(112018);
        MonthlyBill.setNewMeter(490);
        MonthlyBill.setNic("12121212");
        MonthlyBill.setOldMeter(400);
        
        List<UnitPrice> unitprices=new ArrayList<>();
        UnitPrice unitPrice=new UnitPrice();
        unitPrice.setUid(1);
        unitPrice.setLower(0);
        unitPrice.setUpper(10);
        unitPrice.setPrice(50.00);
        
        unitprices.add(unitPrice);
        unitPrice=new UnitPrice();
        
        unitPrice.setUid(2);
        unitPrice.setLower(10);
        unitPrice.setUpper(15);
        unitPrice.setPrice(75.00); 
        
        unitprices.add(unitPrice);  
        unitPrice=new UnitPrice();
        
        unitPrice.setUid(3);
        unitPrice.setLower(15);
        unitPrice.setUpper(100);
        unitPrice.setPrice(100.00); 
        
        unitprices.add(unitPrice);    
        
        CalculateUsageBill CalculateUsageBill=new CalculateUsageBill();
        
    }
    
}
