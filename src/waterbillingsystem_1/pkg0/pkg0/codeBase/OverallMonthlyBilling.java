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
public class OverallMonthlyBilling {

    public double getTotalIncomeShramadhana() {
        return totalIncomeShramadhana;
    }

    public void setTotalIncomeShramadhana(double totalIncomeShramadhana) {
        this.totalIncomeShramadhana = totalIncomeShramadhana;
    }

    public double getTotalIncomePanelty() {
        return totalIncomePanelty;
    }

    public void setTotalIncomePanelty(double totalIncomePanelty) {
        this.totalIncomePanelty = totalIncomePanelty;
    }

    public double getTotalIncomeFixedCharge() {
        return totalIncomeFixedCharge;
    }

    public void setTotalIncomeFixedCharge(double totalIncomeFixedCharge) {
        this.totalIncomeFixedCharge = totalIncomeFixedCharge;
    }

    public double getTotalIncomeFromBill() {
        return totalIncomeFromBill;
    }

    public void setTotalIncomeFromBill(double totalIncomeFromBill) {
        this.totalIncomeFromBill = totalIncomeFromBill;
    }
    
    public String getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(String billingMonth) {
        this.billingMonth = billingMonth;
    }
    
    private double totalIncomeShramadhana;
    private double totalIncomePanelty ;
    private double totalIncomeFixedCharge;
    private double totalIncomeFromBill;
    private String billingMonth;


}
