/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import waterbillingsystem_1.pkg0.pkg0.base.UnitPrice;
import waterbillingsystem_1.pkg0.pkg0.dao.UnitPricesDB;

/**
 *
 * @author UDISSSA1
 */
public class UnitPriceProcessor {
    
    public boolean putUnitPrice(UnitPrice unitPrice){
    
        UnitPricesDB unitPricesDB=new UnitPricesDB();
        return unitPricesDB.putUnitPrices(unitPrice);
    }
    
    public UnitPrice getAUnitPrice(String unitPriceId) throws Exception{
    
        UnitPricesDB unitPricesDB=new UnitPricesDB();
        return unitPricesDB.getAUnitPriceFromDB(unitPriceId);
    }
    
    public boolean updateUnitPrice(UnitPrice unitPrice){
    
        UnitPricesDB unitPricesDB=new UnitPricesDB();
        return unitPricesDB.updateUnitPrice(unitPrice);
    }    
    
    public boolean deleteUnitPrice(String uid){
        
        UnitPricesDB unitPricesDB=new UnitPricesDB();
        return unitPricesDB.deleteUnitPrice(uid);
        
    }
}
