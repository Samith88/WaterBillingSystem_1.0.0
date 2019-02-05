/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import waterbillingsystem_1.pkg0.pkg0.VariableStorage;
import waterbillingsystem_1.pkg0.pkg0.dao.UnitPricesDB;

/**
 *
 * @author UDISSSA1
 */
public class UnitCalculatorProcessor {
    
    public double[] geteConsumingBill(int unitUsage,boolean Sramadhana,boolean Absent) throws Exception{
        
        double[] charges = new double[2];
        
        UnitPricesDB unitPricesDB=new UnitPricesDB();
        double totalMonthlyBill = 0.0;
        if(Sramadhana)
            totalMonthlyBill += VariableStorage.getSramadhanaCharge();
        
        if(Absent)
            totalMonthlyBill += VariableStorage.getAbsentCharge();
        
        totalMonthlyBill += VariableStorage.getFixedCharge();
        
        CalculateUsageBill calculateUsageBill=new CalculateUsageBill();
            
         
        charges[0] = calculateUsageBill.calculateConsumingBill(unitUsage, unitPricesDB.getUnitPricesFromDB());
        charges[1] = charges[0] + totalMonthlyBill;
        
        return charges;
    }
    
}
