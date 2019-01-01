/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import java.util.Calendar;
import waterbillingsystem_1.pkg0.pkg0.DateDetails;
import waterbillingsystem_1.pkg0.pkg0.base.Payment;
import waterbillingsystem_1.pkg0.pkg0.dao.getExistingCustomer;

/**
 *
 * @author UDISSSA1
 */
public class PaymentProcessor {

    public PaymentProcessor() {
    }
    public Payment getPayment(Payment payment) throws Exception{
        
        payment.setPyid(generatePaymentId(payment.getCid()));
        
        payment.setCid(getExistingCustomer.getCIDFromNIC(payment.getNic()));
        payment.setNewOutStandingTotal(payment.getOldOutStandingTotal() - payment.getAmount());
        
        return payment;
    }
    
    private int generatePaymentId(int customerId){
        return customerId+DateDetails.getDateDate();
    }
    
}
