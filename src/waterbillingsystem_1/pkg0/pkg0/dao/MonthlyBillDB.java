/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import waterbillingsystem_1.pkg0.pkg0.base.BillData;
import waterbillingsystem_1.pkg0.pkg0.base.MonthlyBillDetails;
import waterbillingsystem_1.pkg0.pkg0.database.DBConnection;
import waterbillingsystem_1.pkg0.pkg0.database.InsertUpdateDeleteClass;
import waterbillingsystem_1.pkg0.pkg0.database.RetrieveClass;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class MonthlyBillDB {
    
    public boolean putBillData(BillData billData){
        
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        return insertUpdateDeleteClass.insertUpdateDeleteDB("insert into BillData (mbid,cid,nic,NewMeter,Sramadhana,"
                + "AbsentCharge,Month,OldMeter,MonthlyUsageUnit) values "
                + "('"+billData.getMbid()+"','"+billData.getCid()+"','"+billData.getNic()+"','"+billData.getNewMeter()+"'"
                + ",'"+billData.isSramadhana()+"','"+billData.isAbsentCharge()+"','"+billData.getMonth()+"'"
                + ",'"+billData.getOldMeter()+"','"+billData.getMonthlyUsageUnit()+"')");    
    }
    
    public boolean putMonthlyBillDetails(MonthlyBillDetails monthlyBillDetails){
        
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 

        return insertUpdateDeleteClass.insertUpdateDeleteDB("insert into MonthlyBillDetails(InvoiceNo,cid,nic,Group,OldMeter,"
                + "NewMeter,MonthlyConsumption,"
                + "CurrentTotalAmount,FixedCharge,Sramadhana,AbsentCharge,TotalMonthlyAmount,Month,"
                + "TotalOutstandingMonthly,MonthlyUsageUnit) values('"+monthlyBillDetails.getInvoiceNo()+"','"+monthlyBillDetails.getCid()+"',"
                + "'"+monthlyBillDetails.getNic()+"','"+monthlyBillDetails.getGroup()+"','"+monthlyBillDetails.getOldMeter()+"',"
                + "'"+monthlyBillDetails.getNewMeter()+"',"
                + ",'"+monthlyBillDetails.getMonthlyConsumption()+"','"+monthlyBillDetails.getCurrentTotalAmount()+"',"
                + "'"+monthlyBillDetails.getFixedCharge()+"','"+monthlyBillDetails.getSramadhana()+"',"
                + "'"+monthlyBillDetails.getAbsentCharge()+"','"+monthlyBillDetails.getTotalMonthlyAmount()+"',"
                + "'"+monthlyBillDetails.getMonth()+"','"+monthlyBillDetails.getTotalOutstandingMonthly()+"'"
                + "'"+monthlyBillDetails.getMonthlyUsageUnit()+"')");
    }
    
    public BillData getBilldata(){
    
        
        return null;
    }
    
    
    public MonthlyBillDetails getMonthlyBillDetailsByInvoiceNo(String InvoiceNo) throws Exception{
        
        MonthlyBillDetails monthlyBillDetails=new MonthlyBillDetails();
        RetrieveClass retrieveClass=new RetrieveClass();
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from MonthlyBillDetails where nic='"+InvoiceNo+"'");
            while (rs.next()) {
                //cid= rs.getString("cid");
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }          
        
        return monthlyBillDetails;
    }
}
