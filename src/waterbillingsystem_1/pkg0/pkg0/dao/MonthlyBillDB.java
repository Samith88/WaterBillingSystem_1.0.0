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

        return insertUpdateDeleteClass.insertUpdateDeleteDB("insert into MonthlyBillDetails(InvoiceNo,cid,nic,[Group],OldMeter,"
                + "NewMeter,MonthlyConsumption,"
                + "CurrentTotalAmount,FixedCharge,Sramadhana,AbsentCharge,TotalMonthlyAmount,Month,"
                + "TotalOutstandingMonthly,MonthlyUsageUnit,LastPaymentDay) values('"+monthlyBillDetails.getInvoiceNo()+"','"+monthlyBillDetails.getCid()+"',"
                + "'"+monthlyBillDetails.getNic()+"','"+monthlyBillDetails.getGroup()+"','"+monthlyBillDetails.getOldMeter()+"',"
                + "'"+monthlyBillDetails.getNewMeter()+"',"
                + ",'"+monthlyBillDetails.getMonthlyConsumption()+"','"+monthlyBillDetails.getCurrentTotalAmount()+"',"
                + "'"+monthlyBillDetails.getFixedCharge()+"','"+monthlyBillDetails.getSramadhana()+"',"
                + "'"+monthlyBillDetails.getAbsentCharge()+"','"+monthlyBillDetails.getTotalMonthlyAmount()+"',"
                + "'"+monthlyBillDetails.getMonth()+"','"+monthlyBillDetails.getTotalOutstandingMonthly()+"'"
                + "'"+monthlyBillDetails.getMonthlyUsageUnit()+"','"+monthlyBillDetails.getLastPaymentDay()+"')");
    }
    
    public BillData getBilldata(){
    
        
        return null;
    }
    
    
    public MonthlyBillDetails getMonthlyBillDetailsByInvoiceNo(String InvoiceNo) throws Exception{
        
        MonthlyBillDetails monthlyBillDetails=new MonthlyBillDetails();
        RetrieveClass retrieveClass=new RetrieveClass();
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from MonthlyBillDetails where InvoiceNo='"+InvoiceNo+"'");
            while (rs.next()) {
                monthlyBillDetails.setInvoiceNo(InvoiceNo);
                monthlyBillDetails.setCid(rs.getString("cid"));
                monthlyBillDetails.setNic(rs.getString("nic"));
                monthlyBillDetails.setGroup(rs.getString("Group"));
                monthlyBillDetails.setOldMeter(rs.getInt("OldMeter"));
                monthlyBillDetails.setNewMeter(rs.getInt("NewMeter"));
                monthlyBillDetails.setMonthlyConsumption(rs.getDouble("MonthlyConsumption"));
                monthlyBillDetails.setCurrentTotalAmount(rs.getDouble("CurrentTotalAmount"));
                monthlyBillDetails.setFixedCharge(rs.getDouble("FixedCharge"));
                monthlyBillDetails.setSramadhana(rs.getDouble("Sramadhana"));
                monthlyBillDetails.setAbsentCharge(rs.getDouble("AbsentCharge"));
                monthlyBillDetails.setTotalMonthlyAmount(rs.getDouble("TotalMonthlyAmount"));
                monthlyBillDetails.setMonth(rs.getString("Month"));
                monthlyBillDetails.setTotalOutstandingMonthly(rs.getDouble("TotalOutstandingMonthly"));
                monthlyBillDetails.setMonthlyUsageUnit(rs.getInt("MonthlyUsageUnit"));
                monthlyBillDetails.setLastPaymentDay(rs.getString("LastPaymentDay"));
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }      
        return monthlyBillDetails;
    }
    
    public boolean updateCustomerWithBill(MonthlyBillDetails monthlyBillDetails) throws Exception{
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        return insertUpdateDeleteClass.insertUpdateDeleteDB("update customer set preMeter='"+monthlyBillDetails.getOldMeter()+"' "
                + ",currentMeter='"+monthlyBillDetails.getNewMeter()+"'"
                + ",TotalOutstandingAmount='"+monthlyBillDetails.getTotalOutstandingMonthly()+"' ");
    }
}
