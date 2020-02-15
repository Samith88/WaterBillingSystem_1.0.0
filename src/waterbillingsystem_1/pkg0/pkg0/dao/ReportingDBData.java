/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.dao;

import java.sql.ResultSet;
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
import waterbillingsystem_1.pkg0.pkg0.database.DBConnection;
import waterbillingsystem_1.pkg0.pkg0.database.RetrieveData;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;
/**
 *
 * @author UDISSSA1
 */
public class ReportingDBData {
    
    public OverallMonthlyBilling getOverallMonthlyBilling(String month) throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        OverallMonthlyBilling overallMonthlyBilling=new OverallMonthlyBilling();        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select sum(Sramadhana) as SramadhanaTotal, sum(AbsentCharge) as AbsentChargeTotal, "
                    + "sum(FixedCharge) as FixedChargeTotal,sum(MonthlyConsumption) as totalIncomeFromUnitConsumption,"
                    + "sum(TotalMonthlyAmount) TotalMonthlyAmountTotal from MonthlyBillDetails "
                    + "where Month='"+month+"' ");
            while (rs.next()) {
                overallMonthlyBilling.setTotalIncomeShramadhana(rs.getDouble("SramadhanaTotal"));
                overallMonthlyBilling.setTotalIncomePanelty(rs.getDouble("AbsentChargeTotal"));
                overallMonthlyBilling.setTotalIncomeFixedCharge(rs.getDouble("FixedChargeTotal"));
                overallMonthlyBilling.setTotalIncomeFromUnitConsumption(rs.getDouble("totalIncomeFromUnitConsumption"));
                overallMonthlyBilling.setTotalIncomeFromBill(rs.getDouble("TotalMonthlyAmountTotal"));
                overallMonthlyBilling.setBillingMonth(month);
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }
        return overallMonthlyBilling;        
    }
    
    public CustomerInitialPayment getCustomerInitialPayment(String cid) throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        CustomerInitialPayment customerInitialPayment=new CustomerInitialPayment();        
        try{
            String sql="select  InitialFeeTotal,InitialReceived from Customer where cid='"+cid+"';";
            ResultSet rs  = retrieveClass.getResultsFormDB(sql);
            while (rs.next()) {
                customerInitialPayment.setInitialPaymentAmt(rs.getDouble("InitialFeeTotal"));
                customerInitialPayment.setInitialPaymentAmtReceived(rs.getDouble("InitialReceived"));
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }
        return customerInitialPayment;        
    }  
    
    public OverallMonthlyPayment getOverallMonthlyPayment(String month) throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        OverallMonthlyPayment overallMonthlyPayment=new OverallMonthlyPayment();        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select  sum(amount) as TotalMonthlyPayments , "
                    + "count(amount) as monthlyPaymentCount from payment where substr(Date,0,7) = '"+month+"'; ");
            while (rs.next()) {
                overallMonthlyPayment.setOverallMonthlyPayments(rs.getDouble("TotalMonthlyPayments"));
                overallMonthlyPayment.setMonthlyPaymentCount(rs.getInt("monthlyPaymentCount"));
                overallMonthlyPayment.setBillingMonth(month);
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }
        return overallMonthlyPayment;        
    }    
    
    
    public PaymentsCustomer getPaymentsCustomer(String month,String cid) throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        PaymentsCustomer paymentsCustomer=new PaymentsCustomer();        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select sum(amount) as CustomerPaymentMonthAmt "
                    + " , NewOutStandingTotal from  payment where substr(Date,0,7)='"+month+"' and cid='"+cid+"' ");
            while (rs.next()) {
                paymentsCustomer.setCustomerPaymentMonthAmt(rs.getDouble("CustomerPaymentMonthAmt"));
                paymentsCustomer.setCustomerPaymentMonthPendingAmt(rs.getDouble("NewOutStandingTotal"));
                paymentsCustomer.setBillingMonth(month);
                paymentsCustomer.setPaymentCID(cid);
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }
        return paymentsCustomer;        
    }    
    
    public TotalInitialPayment getTotalInitialPayment(String month) throws Exception{
    
        RetrieveData retrieveClass =new RetrieveData();
        TotalInitialPayment totalInitialPayment=new TotalInitialPayment();
        
            try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select sum(newlyReceivedPyament) as InitialTotalPaymentRecivedMonthly "
                    + " , count(newlyReceivedPyament) as InitialPaymentRecivedMonthlyCount from  InitialPayment where substr(Date,0,7)='"+month+"' ");
            while (rs.next()) {
                totalInitialPayment.setInitialPaymentRecivedCountMonthly(rs.getInt("InitialPaymentRecivedMonthlyCount"));
                totalInitialPayment.setInitialTotalPaymentRecivedMonthly(rs.getDouble("InitialTotalPaymentRecivedMonthly"));

            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }    
        return totalInitialPayment;
    }

    public void generateCustomReports(String JasperSourceFile) throws SQLException, Exception {
        try {
            JasperReport sourceFile = JasperCompileManager.compileReport(JasperSourceFile);
            JasperPrint print = JasperFillManager.fillReport(sourceFile, new HashMap(), DBConnection.readConnect());
            JasperViewer.viewReport(print, false);
        } catch (JRException e) {
            getLogger.getLog().debug(e.toString());
        } finally {
            DBConnection.disconnect();
        }
    }
    
}
