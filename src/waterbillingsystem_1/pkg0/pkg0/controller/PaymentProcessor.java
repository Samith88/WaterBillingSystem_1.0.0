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
    
   
    public boolean updatePeymentCustomer(Payment payment) throws Exception{
    
        ProcessPayment processPayment=new ProcessPayment();
        return processPayment.updatePayment(payment);
    }
    
    private String generatePaymentId(String customerId){
        if(customerId.length()==1)
            customerId = "00"+ customerId;
        if(customerId.length()==2)
            customerId = "0"+ customerId; 
        
        return DateDetails.getDateYear()+DateDetails.getDateMonth()+DateDetails.getDateDate()+DateDetails.getDateHour()+DateDetails.getDateMinute()+ customerId;
    }
    
    public Payment getCustomerPaymentByNIC(String nic) throws Exception{
        ProcessPayment processPayment=new ProcessPayment();
        return processPayment.getLatestPaymentByNIC(nic);
        
    }   
    
    public boolean deletePayment(Payment payment) throws Exception{
        
        ProcessPayment processPayment=new ProcessPayment();
        return processPayment.deletePayment(payment);
    }
    
}
