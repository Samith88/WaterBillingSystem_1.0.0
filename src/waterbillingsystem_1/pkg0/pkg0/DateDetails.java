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
    public static int getDateMonth(){
        return calendar.get(Calendar.MONTH)+calendar.get(Calendar.YEAR);
    }

    public static int getDateDate(){
        return calendar.get(Calendar.DATE)+calendar.get(Calendar.MONTH)+calendar.get(Calendar.YEAR);
    }   
    
    public static int getDateYear(){
        return calendar.get(Calendar.YEAR);
    }       
 
    public static int getDateHour(){
        return calendar.get(Calendar.HOUR);
    }      
}
