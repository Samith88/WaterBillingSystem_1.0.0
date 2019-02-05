/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0;

/**
 *
 * @author UDISSSA1
 */
public class VariableStorage {

    public static double getSramadhanaCharge() {
        return SramadhanaCharge;
    }

    public static void setSramadhanaCharge(double SramadhanaCharge) {
        VariableStorage.SramadhanaCharge = SramadhanaCharge;
    }

    public static double getAbsentCharge() {
        return AbsentCharge;
    }

    public static void setAbsentCharge(double AbsentCharge) {
        VariableStorage.AbsentCharge = AbsentCharge;
    }

    public static double getFixedCharge() {
        return FixedCharge;
    }

    public static void setFixedCharge(double FixedCharge) {
        VariableStorage.FixedCharge = FixedCharge;
    }
    
    private  static double SramadhanaCharge;
    private  static double AbsentCharge;
    private  static double FixedCharge;
       
}
