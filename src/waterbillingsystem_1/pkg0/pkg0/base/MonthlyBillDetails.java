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

    public String getInvoiceNo() {
        return InvoiceNo;
    }

    public void setInvoiceNo(String InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
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

    public String getMonth() {
        return Month;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }    
    
    public int getMonthlyUsageUnit() {
        return MonthlyUsageUnit;
    }

    public void setMonthlyUsageUnit(int MonthlyUsageUnit) {
        this.MonthlyUsageUnit = MonthlyUsageUnit;
    }

    public String getLastPaymentDay() {
        return LastPaymentDay;
    }

    public void setLastPaymentDay(String LastPaymentDay) {
        this.LastPaymentDay = LastPaymentDay;
    }    
    
    private String  InvoiceNo;
    private String   cid;
    private String nic;
    private int OldMeter;
    private int NewMeter;
    private int MonthlyUsageUnit;
    private double MonthlyConsumption;
    private double CurrentTotalAmount;
    private double FixedCharge;
    private double Sramadhana;
    private double AbsentCharge;
    private double TotalMonthlyAmount;
    private String Month;
    private double TotalOutstandingMonthly;
    private String LastPaymentDay;

    
}
