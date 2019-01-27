/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import waterbillingsystem_1.pkg0.pkg0.codeBase.CustomerInitialPayment;
import waterbillingsystem_1.pkg0.pkg0.codeBase.OverallMonthlyBilling;
import waterbillingsystem_1.pkg0.pkg0.codeBase.OverallMonthlyPayment;
import waterbillingsystem_1.pkg0.pkg0.codeBase.PaymentsCustomer;
import waterbillingsystem_1.pkg0.pkg0.codeBase.TotalInitialPayment;
import waterbillingsystem_1.pkg0.pkg0.dao.ReportingDBData;

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
    
}
