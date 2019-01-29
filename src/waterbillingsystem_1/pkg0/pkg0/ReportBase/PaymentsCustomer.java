/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.ReportBase;

/**
 *
 * @author UDISSSA1
 */
public class PaymentsCustomer {

    public String getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(String billingMonth) {
        this.billingMonth = billingMonth;
    }

    public String getPaymentCID() {
        return PaymentCID;
    }

    public void setPaymentCID(String PaymentCID) {
        this.PaymentCID = PaymentCID;
    }

    public double getCustomerPaymentMonthAmt() {
        return CustomerPaymentMonthAmt;
    }

    public void setCustomerPaymentMonthAmt(double CustomerPaymentMonthAmt) {
        this.CustomerPaymentMonthAmt = CustomerPaymentMonthAmt;
    }

    public double getCustomerPaymentMonthPendingAmt() {
        return CustomerPaymentMonthPendingAmt;
    }

    public void setCustomerPaymentMonthPendingAmt(double CustomerPaymentMonthPendingAmt) {
        this.CustomerPaymentMonthPendingAmt = CustomerPaymentMonthPendingAmt;
    }
    
        private String billingMonth;
        private String PaymentCID;
        private double CustomerPaymentMonthAmt;
        private double CustomerPaymentMonthPendingAmt;

}
