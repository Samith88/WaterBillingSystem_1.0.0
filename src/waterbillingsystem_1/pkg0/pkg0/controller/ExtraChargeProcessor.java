/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import waterbillingsystem_1.pkg0.pkg0.VariableStorage;
import waterbillingsystem_1.pkg0.pkg0.base.ExtraCharges;
import waterbillingsystem_1.pkg0.pkg0.dao.ExtraChargeDB;

/**
 *
 * @author UDISSSA1
 */
public class ExtraChargeProcessor {
    
    public ExtraCharges getExtraCharges() throws Exception {
    
        ExtraChargeDB extraChargeDB=new ExtraChargeDB();
        return extraChargeDB.getExtraCharges();
    }
    
    public boolean updateUnitPrice(ExtraCharges extraCharges){
    
        ExtraChargeDB extraChargeDB=new ExtraChargeDB();
        return extraChargeDB.updateUnitPrice(extraCharges);
    }
    
    public void setGlobeChargingVariables() throws Exception{
    
        ExtraCharges extraCharges= getExtraCharges();
        VariableStorage.setAbsentCharge(extraCharges.getAbsentCharge());
        VariableStorage.setSramadhanaCharge(extraCharges.getSramadhanaCharge());
        VariableStorage.setFixedCharge(extraCharges.getFixedCharge());
    }
}
