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
public class ChargingType {

    public int getChId() {
        return chId;
    }

    public void setChId(int chId) {
        this.chId = chId;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public double getChAmount() {
        return chAmount;
    }

    public void setChAmount(double chAmount) {
        this.chAmount = chAmount;
    }

    public String getChDesc() {
        return chDesc;
    }

    public void setChDesc(String chDesc) {
        this.chDesc = chDesc;
    }
    
    private int chId;
    private String chName  ;
    private double chAmount;
    private String chDesc;
    
}
