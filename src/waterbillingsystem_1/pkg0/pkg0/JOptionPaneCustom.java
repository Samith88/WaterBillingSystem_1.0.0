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
import javax.swing.JOptionPane;

public class JOptionPaneCustom {
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, "<HTML><BODY>"+infoMessage+"</BODY></HTML>", "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }    
    public static void errorBox(String errorMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, "<HTML><BODY>"+errorMessage+"</BODY></HTML>", "ErrorBox: " + titleBar, JOptionPane.ERROR_MESSAGE);
    }      
}
