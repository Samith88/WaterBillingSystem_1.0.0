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
public class ExtraCharges {

    public double getSramadhanaCharge() {
        return SramadhanaCharge;
    }

    public void setSramadhanaCharge(double SramadhanaCharge) {
        this.SramadhanaCharge = SramadhanaCharge;
    }

    public double getAbsentCharge() {
        return AbsentCharge;
    }

    public void setAbsentCharge(double AbsentCharge) {
        this.AbsentCharge = AbsentCharge;
    }

    public double getFixedCharge() {
        return FixedCharge;
    }

    public void setFixedCharge(double FixedCharge) {
        this.FixedCharge = FixedCharge;
    }

    private double SramadhanaCharge;
    private double AbsentCharge;
    private double FixedCharge;
    

    
}
