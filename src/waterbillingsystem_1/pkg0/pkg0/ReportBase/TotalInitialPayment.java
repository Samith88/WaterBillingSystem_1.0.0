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
public class TotalInitialPayment {

    public String getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(String billingMonth) {
        this.billingMonth = billingMonth;
    }

    public int getInitialPaymentRecivedCountMonthly() {
        return InitialPaymentRecivedMonthlyCount;
    }

    public void setInitialPaymentRecivedCountMonthly(int InitialPaymentRecivedCountMonthly) {
        this.InitialPaymentRecivedMonthlyCount = InitialPaymentRecivedCountMonthly;
    }

    public double getInitialTotalPaymentRecivedMonthly() {
        return InitialTotalPaymentRecivedMonthly;
    }

    public void setInitialTotalPaymentRecivedMonthly(double InitialTotalPaymentRecivedMonthly) {
        this.InitialTotalPaymentRecivedMonthly = InitialTotalPaymentRecivedMonthly;
    }
    
    private String billingMonth;    
    private int InitialPaymentRecivedMonthlyCount ;    
    private double InitialTotalPaymentRecivedMonthly ;    
    
}
