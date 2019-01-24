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
public class BillData {

    public String getMbid() {
        return mbid;
    }

    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }


    public int getNewMeter() {
        return NewMeter;
    }

    public void setNewMeter(int NewMeter) {
        this.NewMeter = NewMeter;
    }

    public int isSramadhana() {
        return Sramadhana;
    }

    public void setSramadhana(int Sramadhana) {
        this.Sramadhana = Sramadhana;
    }

    public int isAbsentCharge() {
        return AbsentCharge;
    }

    public void setAbsentCharge(int AbsentCharge) {
        this.AbsentCharge = AbsentCharge;
    }

    private int OldMeter;

    public int getOldMeter() {
        return OldMeter;
    }

    public void setOldMeter(int OldMeter) {
        this.OldMeter = OldMeter;
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
    
    private String    mbid;
    private String    cid;
    private int NewMeter;
    private int Sramadhana;
    private int AbsentCharge;
    private int MonthlyUsageUnit; 
    private String Month;
}
