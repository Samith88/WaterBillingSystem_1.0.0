/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import waterbillingsystem_1.pkg0.pkg0.base.Customer;
import waterbillingsystem_1.pkg0.pkg0.base.MonthlyBillDetails;
import waterbillingsystem_1.pkg0.pkg0.dao.CustomerDataDatabase;

/**
 *
 * @author UDISSSA1
 */
//jasperFile = "waterBilling.jrxml";
public class generateCustomerInvoice {
    
    public String generateJasperReport(String jasperFileString,String outFileString ,MonthlyBillDetails monthlyBillDetails) throws Exception{
    
        File jasperFile = new File(jasperFileString);
        CustomerDataDatabase customerDataDatabase=new CustomerDataDatabase();
        Customer customer = customerDataDatabase.getCustomer(monthlyBillDetails.getNic());
                
        HashMap<String, Object> map = new HashMap<>();
        map.put("P_InvoiceNo",monthlyBillDetails.getInvoiceNo());
        map.put("P_cid",monthlyBillDetails.getCid());
        map.put("P_nic", monthlyBillDetails.getNic());
        map.put("P_Group", monthlyBillDetails.getGroup());
        map.put("P_OldMeter",monthlyBillDetails.getOldMeter() );
        map.put("P_NewMeter",monthlyBillDetails.getNewMeter() );
        map.put("P_MonthlyConsumption",monthlyBillDetails.getMonthlyConsumption() );
        map.put("P_CurrentTotalAmount",monthlyBillDetails.getCurrentTotalAmount());
        map.put("P_FixedCharge",monthlyBillDetails.getFixedCharge() );
        map.put("P_Sramadhana",monthlyBillDetails.getSramadhana() );
        map.put("P_AbsentCharge",monthlyBillDetails.getAbsentCharge() );
        map.put("P_TotalMonthlyAmount",monthlyBillDetails.getTotalMonthlyAmount() );
        map.put("P_TotalOutstandingMonthly",monthlyBillDetails.getTotalOutstandingMonthly() );
        map.put("P_MonthlyUsageUnit",monthlyBillDetails.getMonthlyUsageUnit() );
        map.put("P_MeterNo",customer.getMeterNo());
        map.put("P_cname",customer.getCname() );
        map.put("P_LastPaymentDay",monthlyBillDetails.getLastPaymentDay() ); 
        map.put("P_LastPayment",customer.getLastPayment()+" ("+customer.getLastPaymentDate()+")" ); 
        map.put("P_Month",monthlyBillDetails.getMonth());     

        //BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(jasperFile.getAbsolutePath()));
        JasperDesign jasperDesign=JRXmlLoader.load(jasperFile.getAbsolutePath());

        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

        // FILL THE REPORT
        JasperPrint JPrint=JasperFillManager.fillReport(jasperReport, map);

        // PRINT REPORT TO PDF FILE.
        File outFile = new File("Invoice_"+outFileString+".pdf");
        OutputStream outputStream = new FileOutputStream(outFile);
        JasperExportManager.exportReportToPdfStream(JPrint, outputStream);
        //System.exit(0);
        // VIEW THE REPORT
        //JasperViewer.viewReport(JPrint,false);      
        return "Invoice_"+outFileString+".pdf";
    }
    
}
