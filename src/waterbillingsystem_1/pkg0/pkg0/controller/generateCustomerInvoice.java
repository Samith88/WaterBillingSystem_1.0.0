/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import waterbillingsystem_1.pkg0.pkg0.Validations;
import waterbillingsystem_1.pkg0.pkg0.base.Customer;
import waterbillingsystem_1.pkg0.pkg0.base.MonthlyBillDetails;
import waterbillingsystem_1.pkg0.pkg0.dao.CustomerDB;

/**
 *
 * @author UDISSSA1
 */
//jasperFile = "waterBilling.jrxml";
public class generateCustomerInvoice {
    
    public String generateJasperReport(String jasperFileString,String outFileString ,MonthlyBillDetails monthlyBillDetails) throws Exception{
    
        File jasperFile = new File(jasperFileString);
        CustomerDB customerDataDatabase=new CustomerDB();
        monthlyBillDetails.setCid(Validations.getCorrectCID(monthlyBillDetails.getCid()));
        Customer customer = customerDataDatabase.getCustomer(monthlyBillDetails.getCid());
                
        HashMap<String, Object> map = new HashMap<>();
        map.put("P_InvoiceNo",Validations.nullValidator(monthlyBillDetails.getInvoiceNo()) );
        map.put("P_cid",Validations.nullValidator(monthlyBillDetails.getCid()));
        map.put("P_nic", Validations.nullValidator(customer.getNic()));
        map.put("P_Group", Validations.nullValidator(monthlyBillDetails.getGroup()));
        map.put("P_OldMeter",monthlyBillDetails.getOldMeter()  );
        map.put("P_NewMeter",monthlyBillDetails.getNewMeter() );
        map.put("P_MonthlyConsumption",monthlyBillDetails.getMonthlyConsumption() );
        map.put("P_CurrentTotalAmount",monthlyBillDetails.getCurrentTotalAmount());
        map.put("P_FixedCharge",monthlyBillDetails.getFixedCharge() );
        map.put("P_Sramadhana",monthlyBillDetails.getSramadhana() );
        map.put("P_AbsentCharge",monthlyBillDetails.getAbsentCharge() );
        map.put("P_TotalMonthlyAmount",monthlyBillDetails.getTotalMonthlyAmount() );
        map.put("P_TotalOutstandingMonthly",monthlyBillDetails.getTotalOutstandingMonthly() );
        map.put("P_MonthlyUsageUnit",monthlyBillDetails.getMonthlyUsageUnit() );
        map.put("P_MeterNo",Validations.nullValidator(customer.getMeterNo()));
        map.put("P_cname",Validations.nullValidator(customer.getCname()) );
        map.put("P_LastPaymentDay",Validations.nullValidator(monthlyBillDetails.getLastPaymentDay()) ); 
        map.put("P_LastPayment",customer.getLastPayment()+" ("+Validations.nullValidator(customer.getLastPaymentDate())+")" ); 
        map.put("P_Month",Validations.nullValidator(monthlyBillDetails.getMonth()));     

        try{
        //BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(jasperFile.getAbsolutePath()));
        JasperDesign jasperDesign=JRXmlLoader.load(jasperFile.getAbsolutePath());

        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

        // FILL THE REPORT
        JasperPrint JPrint=JasperFillManager.fillReport(jasperReport, map);

        // PRINT REPORT TO PDF FILE.
        File outFile = new File(getDirectories(monthlyBillDetails.getInvoiceNo()),"Invoice_"+outFileString+".pdf");
        OutputStream outputStream = new FileOutputStream(outFile);
        JasperExportManager.exportReportToPdfStream(JPrint, outputStream);
        //System.exit(0);
        // VIEW THE REPORT
        //JasperViewer.viewReport(JPrint,false); 
        Desktop.getDesktop().open(new File( getDirectories(monthlyBillDetails.getInvoiceNo()) ));
        return "Invoice_"+outFileString+".pdf";
        }catch(FileNotFoundException | JRException ex)
        {return ex.getMessage();}
    }
    
    private String getDirectories(String InvoiceId){
    
        String ParentPath = "invoices";
        File directory=new File(ParentPath+"\\"+InvoiceId.substring(0, 4)
                +"\\"+InvoiceId.substring(4, 6)+"\\"+InvoiceId.substring(6, 9));
        directory.mkdirs();
        return directory.getAbsolutePath();
        
    }
}
