/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.base;

import java.sql.Date;


/**
 *
 * @author UDISSSA1
 */
public class Payment {

    public int getPyid() {
        return pyid;
    }

    public void setPyid(int pyid) {
        this.pyid = pyid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public double getOldOutStandingTotal() {
        return oldOutStandingTotal;
    }

    public void setOldOutStandingTotal(double oldOutStandingTotal) {
        this.oldOutStandingTotal = oldOutStandingTotal;
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
    
    private double NewOutStandingTotal;

    public double getNewOutStandingTotal() {
        return NewOutStandingTotal;
    }

    public void setNewOutStandingTotal(double NewOutStandingTotal) {
        this.NewOutStandingTotal = NewOutStandingTotal;
    }

    private int	pyid;
    private int cid;
    private String nic;
    private double amount;
    private Date Date;
    private double oldOutStandingTotal;
    
}
