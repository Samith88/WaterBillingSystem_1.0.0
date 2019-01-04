/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0;

import java.util.Calendar;

/**
 *
 * @author UDISSSA1
 */
public class DateDetails {
    
    private static final Calendar calendar = Calendar.getInstance();
    public static String getDateMonth(){
        return String.valueOf(calendar.get(Calendar.MONTH)) +String.valueOf(calendar.get(Calendar.YEAR));
    }

    public static String getDateDate(){
        return String.valueOf(calendar.get(Calendar.DATE))+String.valueOf(calendar.get(Calendar.MONTH))+String.valueOf(calendar.get(Calendar.YEAR));
    }   
    
    public static String  getDateYear(){
        return String.valueOf(calendar.get(Calendar.YEAR));
    }       
 
    public static String getDateHour(){
        return String.valueOf(calendar.get(Calendar.HOUR));
    }      
}
