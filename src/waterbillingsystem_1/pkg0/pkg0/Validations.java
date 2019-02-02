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
public class Validations {

    public static String getCorrectCID(String currentCID) {
        switch (currentCID.length()) {
            case 1:
                return "00" + currentCID;
            case 2:
                return "0" + currentCID;
            case 3:
                return currentCID;
            default:
                return currentCID;
        }
    }
    
    public static String nullValidator(String value){
        if(value == null)
            return " ";
        else
            return value;
    }    

    public static String setLabelText(String value) {
        return "Rs: " + value;
    }
    
}
