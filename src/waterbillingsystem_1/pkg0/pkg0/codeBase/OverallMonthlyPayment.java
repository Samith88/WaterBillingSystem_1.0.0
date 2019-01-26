/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.codeBase;

/**
 *
 * @author UDISSSA1
 */
public class OverallMonthlyPayment {

    public double getOverallMonthlyPayments() {
        return overallMonthlyPayments;
    }

    public void setOverallMonthlyPayments(double overallMonthlyPayments) {
        this.overallMonthlyPayments = overallMonthlyPayments;
    }

    public int getMonthlyPaymentCount() {
        return monthlyPaymentCount;
    }

    public void setMonthlyPaymentCount(int monthlyPaymentCount) {
        this.monthlyPaymentCount = monthlyPaymentCount;
    }

    public String getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(String billingMonth) {
        this.billingMonth = billingMonth;
    }
    
    private double overallMonthlyPayments;
    private int monthlyPaymentCount;
    private String billingMonth;    
    
}
