/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import java.sql.SQLException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import waterbillingsystem_1.pkg0.pkg0.ReportBase.CustomerInitialPayment;
import waterbillingsystem_1.pkg0.pkg0.ReportBase.OverallMonthlyBilling;
import waterbillingsystem_1.pkg0.pkg0.ReportBase.OverallMonthlyPayment;
import waterbillingsystem_1.pkg0.pkg0.ReportBase.PaymentsCustomer;
import waterbillingsystem_1.pkg0.pkg0.ReportBase.TotalInitialPayment;
import waterbillingsystem_1.pkg0.pkg0.dao.ReportingDBData;
import waterbillingsystem_1.pkg0.pkg0.database.DBConnection;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class ReportingProcessor {
    
    public OverallMonthlyBilling getOverallMonthlyBilling(String month) throws Exception {
    
        ReportingDBData reportingDBData=new ReportingDBData();
        return reportingDBData.getOverallMonthlyBilling(month);
    }
    
    public OverallMonthlyPayment getOverallMonthlyPayment(String month) throws Exception{
    
        ReportingDBData reportingDBData=new ReportingDBData();
        return reportingDBData.getOverallMonthlyPayment(month);
    }
    
    public CustomerInitialPayment getCustomerInitialPayment(String cid) throws Exception{
    
        ReportingDBData reportingDBData=new ReportingDBData();
        return reportingDBData.getCustomerInitialPayment(cid);
    }
    
    public PaymentsCustomer getPaymentsCustomer(String month,String cid) throws Exception {
    
        ReportingDBData reportingDBData=new ReportingDBData();
        return reportingDBData.getPaymentsCustomer(month, cid);
    }
    
    public TotalInitialPayment getTotalInitialPayment(String month) throws Exception{
    
        ReportingDBData reportingDBData=new ReportingDBData();
        return reportingDBData.getTotalInitialPayment(month);
    }
    
    public void generateCustomReports(String JasperSourceFile) throws SQLException, Exception{
        try {
            JasperReport sourceFile = JasperCompileManager.compileReport(JasperSourceFile);
            
            JasperPrint print = JasperFillManager.fillReport(sourceFile, new HashMap(), DBConnection.readConnect());
			
            JasperViewer.viewReport(print,false);           
	
        } catch (JRException e) {
            getLogger.getLog().debug(e.toString());
        } finally {
            DBConnection.disconnect();
        }    
        
    }
    
}
