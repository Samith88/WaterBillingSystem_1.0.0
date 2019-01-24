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
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;
import net.sf.jasperreports.engine.*;
import java.util.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

 
/**
 *
 * @author sqlitetutorial.net
 */
public class testdbConnect {
     /**
     * Connect to a sample database
     */
    
    //private static final Logger log = Logger.getLogger("confLogger");
    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:waterbill.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            getLogger.getLog().debug("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                getLogger.getLog().debug(ex.toString());
            }
        }
    }
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws net.sf.jasperreports.engine.JRException
     */
    public static void main(String[] args) throws FileNotFoundException, JRException {
        //testdbConnect testdbConnect=new testdbConnect();
        //testdbConnect.jasperTest();
        //String id = "201901131512001";
        //System.out.println(id.substring(0, 4));
        String test="";
        System.out.println(test.length());
    }
    
   public void jasperTest() throws FileNotFoundException, JRException
   {
       
        // Set values
        HashMap<String, Object> map = new HashMap<>();
        map.put("P_InvoiceNo","12345");
        map.put("P_cid","001");
        map.put("P_nic", "883512847V");
        map.put("P_Group", "001");
        map.put("P_OldMeter",400 );
        map.put("P_NewMeter",415 );
        map.put("P_MonthlyConsumption",500.00 );
        map.put("P_CurrentTotalAmount",100.00 );
        map.put("P_FixedCharge",300.00 );
        map.put("P_Sramadhana",25.00 );
        map.put("P_AbsentCharge",25.00 );
        map.put("P_TotalMonthlyAmount",900.00 );
        map.put("P_TotalOutstandingMonthly",1500.00 );
        map.put("P_MonthlyUsageUnit",15 );
        map.put("P_MeterNo",11223344);
        map.put("P_cname","Samith Dissanayake" );
        map.put("P_LastPaymentDay","01112018" );   //P_Month
        map.put("P_LastPayment","2000.00(12/11/2018)" ); 
        map.put("P_Month","112018");

        
        File file = new File("waterBilling.jrxml");

        BufferedInputStream is = new BufferedInputStream(new FileInputStream(file.getAbsolutePath()));
        JasperDesign jasperDesign=JRXmlLoader.load(file.getAbsolutePath());

        JasperReport jr = JasperCompileManager.compileReport(jasperDesign);

            // FILL THE REPORT
        JasperPrint JPrint=JasperFillManager.fillReport(jr, map);

        // PRINT REPORT TO PDF FILE.
        File outFile = new File("waterBilling.pdf");
        OutputStream output = new FileOutputStream(outFile);
        JasperExportManager.exportReportToPdfStream(JPrint, output);
        System.exit(0);
           // VIEW THE REPORT
        JasperViewer.viewReport(JPrint);
  }    
}
