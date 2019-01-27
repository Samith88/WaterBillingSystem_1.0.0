/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import waterbillingsystem_1.pkg0.pkg0.base.InitialPayment;
import waterbillingsystem_1.pkg0.pkg0.dao.InitialPaymentDB;

/**
 *
 * @author UDISSSA1
 */
public class InitialPaymentProcessor {
    
    public boolean putInitialPayment(InitialPayment initialPayment){
    
        InitialPaymentDB initialPaymentDB=new InitialPaymentDB();
        return initialPaymentDB.putInitialPayment(initialPayment);
    }
    
    public boolean updateUnitPrice(InitialPayment initialPayment){
        InitialPaymentDB initialPaymentDB=new InitialPaymentDB();
        return initialPaymentDB.updateUnitPrice(initialPayment);    
    }
    
    public InitialPayment getAInitialPaymentDB(String cid) throws Exception{
        InitialPaymentDB initialPaymentDB=new InitialPaymentDB();
        return initialPaymentDB.getAInitialPaymentDB(cid);        
        
    }
}
