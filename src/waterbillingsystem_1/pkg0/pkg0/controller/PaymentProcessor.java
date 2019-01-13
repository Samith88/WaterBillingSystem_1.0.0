/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import waterbillingsystem_1.pkg0.pkg0.DateDetails;
import waterbillingsystem_1.pkg0.pkg0.base.Payment;
import waterbillingsystem_1.pkg0.pkg0.dao.CustomerDataDatabase;
import waterbillingsystem_1.pkg0.pkg0.dao.ProcessPayment;

/**
 *
 * @author UDISSSA1
 */
public class PaymentProcessor {

    public PaymentProcessor() {
    }
    public boolean putPayment(Payment payment) throws Exception{
        
        payment.setPyid(generatePaymentId(payment.getCid()));
        ProcessPayment processPayment=new ProcessPayment();

        
        payment.setCid(CustomerDataDatabase.getCIDFromNIC(payment.getNic()));
        payment.setOldOutStandingTotal(CustomerDataDatabase.getCustomerTotalOSTNIC(payment.getNic()));
        payment.setNewOutStandingTotal(payment.getOldOutStandingTotal() - payment.getAmount() );
        
        
        return processPayment.insertPayment(payment) && updatePeymentCustomer(payment);
    }
   
    private boolean updatePeymentCustomer(Payment payment) throws Exception{
    
        ProcessPayment processPayment=new ProcessPayment();
        return processPayment.updateCustomerWithPayment(payment);
    }
    
    private String generatePaymentId(String customerId){
        return customerId+DateDetails.getDateMinute()+DateDetails.getDateHour()+DateDetails.getDateDate()+DateDetails.getDateMonth()+DateDetails.getDateDate();
    }
    
}
