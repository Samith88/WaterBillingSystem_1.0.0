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
public class CustomerInitialPayment {

    public String getInitialPaymentCID() {
        return InitialPaymentCID;
    }

    public void setInitialPaymentCID(String InitialPaymentCID) {
        this.InitialPaymentCID = InitialPaymentCID;
    }

    public double getInitialPaymentAmt() {
        return InitialPaymentAmt;
    }

    public void setInitialPaymentAmt(double InitialPaymentAmt) {
        this.InitialPaymentAmt = InitialPaymentAmt;
    }

    public double getInitialPaymentAmtReceived() {
        return InitialPaymentAmtReceived;
    }

    public void setInitialPaymentAmtReceived(double InitialPaymentAmtReceived) {
        this.InitialPaymentAmtReceived = InitialPaymentAmtReceived;
    }
    
        private String InitialPaymentCID;
        private double InitialPaymentAmt;
        private double InitialPaymentAmtReceived;
        
    
}
