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

    public int getMbid() {
        return mbid;
    }

    public void setMbid(int mbid) {
        this.mbid = mbid;
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

    public int getNewMeter() {
        return NewMeter;
    }

    public void setNewMeter(int NewMeter) {
        this.NewMeter = NewMeter;
    }

    public boolean isSramadhana() {
        return Sramadhana;
    }

    public void setSramadhana(boolean Sramadhana) {
        this.Sramadhana = Sramadhana;
    }

    public boolean isAbsentCharge() {
        return AbsentCharge;
    }

    public void setAbsentCharge(boolean AbsentCharge) {
        this.AbsentCharge = AbsentCharge;
    }

    private int OldMeter;

    public int getOldMeter() {
        return OldMeter;
    }

    public void setOldMeter(int OldMeter) {
        this.OldMeter = OldMeter;
    }
    private int Month;

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getMonthlyUsageUnit() {
        return MonthlyUsageUnit;
    }

    public void setMonthlyUsageUnit(int MonthlyUsageUnit) {
        this.MonthlyUsageUnit = MonthlyUsageUnit;
    }
    
    private int    mbid;
    private int    cid;
    private String nic;
    private int NewMeter;
    private boolean Sramadhana;
    private boolean AbsentCharge;
    private int MonthlyUsageUnit;    
}
