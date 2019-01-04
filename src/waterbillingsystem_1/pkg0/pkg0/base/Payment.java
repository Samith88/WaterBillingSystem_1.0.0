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
public class Payment {

    public String getPyid() {
        return pyid;
    }

    public void setPyid(String pyid) {
        this.pyid = pyid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public double getOldOutStandingTotal() {
        return oldOutStandingTotal;
    }

    public void setOldOutStandingTotal(double oldOutStandingTotal) {
        this.oldOutStandingTotal = oldOutStandingTotal;
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
    
    private double NewOutStandingTotal;

    public double getNewOutStandingTotal() {
        return NewOutStandingTotal;
    }

    public void setNewOutStandingTotal(double NewOutStandingTotal) {
        this.NewOutStandingTotal = NewOutStandingTotal;
    }

    private String pyid;
    private String cid;
    private String nic;
    private double amount;
    private String Date;
    private double oldOutStandingTotal;
    
}
