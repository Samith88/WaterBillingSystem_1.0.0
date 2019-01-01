/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.base;

/**
 *
 * @author UDISSSA1
 */
public class MonthlyBillDetails {

    public int getInvoiceNo() {
        return InvoiceNo;
    }

    public void setInvoiceNo(int InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public int getOldMeter() {
        return OldMeter;
    }

    public void setOldMeter(int OldMeter) {
        this.OldMeter = OldMeter;
    }

    public int getNewMeter() {
        return NewMeter;
    }

    public void setNewMeter(int NewMeter) {
        this.NewMeter = NewMeter;
    }

    public double getMonthlyConsumption() {
        return MonthlyConsumption;
    }

    public void setMonthlyConsumption(double MonthlyConsumption) {
        this.MonthlyConsumption = MonthlyConsumption;
    }

    public double getCurrentTotalAmount() {
        return CurrentTotalAmount;
    }

    public void setCurrentTotalAmount(double CurrentTotalAmount) {
        this.CurrentTotalAmount = CurrentTotalAmount;
    }

    public double getFixedCharge() {
        return FixedCharge;
    }

    public void setFixedCharge(double FixedCharge) {
        this.FixedCharge = FixedCharge;
    }

    public double getSramadhana() {
        return Sramadhana;
    }

    public void setSramadhana(double Sramadhana) {
        this.Sramadhana = Sramadhana;
    }

    public double getAbsentCharge() {
        return AbsentCharge;
    }

    public void setAbsentCharge(double AbsentCharge) {
        this.AbsentCharge = AbsentCharge;
    }

    public double getTotalMonthlyAmount() {
        return TotalMonthlyAmount;
    }

    public void setTotalMonthlyAmount(double TotalMonthlyAmount) {
        this.TotalMonthlyAmount = TotalMonthlyAmount;
    }

    public double getTotalOutstandingMonthly() {
        return TotalOutstandingMonthly;
    }

    public void setTotalOutstandingMonthly(double TotalOutstandingMonthly) {
        this.TotalOutstandingMonthly = TotalOutstandingMonthly;
    }
 
    private String Group;

    public String getGroup() {
        return Group;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }    
    private int  InvoiceNo;
    private int   cid;
    private String nic;
    private int OldMeter;
    private int NewMeter;
    private double MonthlyConsumption;
    private double CurrentTotalAmount;
    private double FixedCharge;
    private double Sramadhana;
    private double AbsentCharge;
    private double TotalMonthlyAmount;
    private int Month;
    private double TotalOutstandingMonthly;
    
}
