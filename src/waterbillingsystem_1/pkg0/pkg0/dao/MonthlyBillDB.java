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
        return insertUpdateDeleteClass.insertUpdateDeleteDB("insert into MonthlyBillDetails(InvoiceNo,cid,nic,GroupId,OldMeter,"
            + "NewMeter,MonthlyConsumption,"
            + "CurrentTotalAmount,FixedCharge,Sramadhana,AbsentCharge,TotalMonthlyAmount,Month,"
            + "TotalOutstandingMonthly,MonthlyUsageUnit,LastPaymentDay) values('"+monthlyBillDetails.getInvoiceNo()+"','"+monthlyBillDetails.getCid()+"',"
            + "'"+monthlyBillDetails.getNic()+"','"+monthlyBillDetails.getGroup()+"','"+monthlyBillDetails.getOldMeter()+"',"
            + "'"+monthlyBillDetails.getNewMeter()+"'"
            + ",'"+monthlyBillDetails.getMonthlyConsumption()+"','"+monthlyBillDetails.getCurrentTotalAmount()+"',"
            + "'"+monthlyBillDetails.getFixedCharge()+"','"+monthlyBillDetails.getSramadhana()+"',"
            + "'"+monthlyBillDetails.getAbsentCharge()+"','"+monthlyBillDetails.getTotalMonthlyAmount()+"',"
            + "'"+monthlyBillDetails.getMonth()+"','"+monthlyBillDetails.getTotalOutstandingMonthly()+"',"
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
                monthlyBillDetails.setGroup(rs.getString("GroupId"));
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
    
    public MonthlyBillDetails getLatestMonthlyBillDetailsByNIC(BillData billData) throws Exception{
        
        MonthlyBillDetails monthlyBillDetails=new MonthlyBillDetails();
        RetrieveClass retrieveClass=new RetrieveClass();
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from MonthlyBillDetails where nic='"+billData.getNic()+"' "
                    + "and InvoiceNo=(select max(InvoiceNo) from MonthlyBillDetails where nic='"+billData.getNic()+"' ");
            while (rs.next()) {
                monthlyBillDetails.setInvoiceNo(rs.getString("InvoiceNo"));
                monthlyBillDetails.setCid(rs.getString("cid"));
                monthlyBillDetails.setNic(rs.getString("nic"));
                monthlyBillDetails.setGroup(rs.getString("GroupId"));
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
    
    public boolean updateCustomerWithBill(MonthlyBillDetails monthlyBillDetails,String event) throws Exception{
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        switch (event) {
            case "insert":
                return insertUpdateDeleteClass.insertUpdateDeleteDB( "update customer set preMeter='"+monthlyBillDetails.getOldMeter()+"' "
                        + ",currentMeter='"+monthlyBillDetails.getNewMeter()+"'"
                                + ",TotalOutstandingAmount='"+monthlyBillDetails.getTotalOutstandingMonthly()+"' "
                                        + "where nic='"+monthlyBillDetails.getNic()+"' ");
            case "update":
                return insertUpdateDeleteClass.insertUpdateDeleteDB( "update customer set "
                        + "currentMeter='"+monthlyBillDetails.getNewMeter()+"'"
                                + ",TotalOutstandingAmount='"+monthlyBillDetails.getTotalOutstandingMonthly()+"' "
                                        + " where nic='"+monthlyBillDetails.getNic()+"' ");
            default:
                return false;
        }
    }
    
    
    
    public boolean deleteBillDataByBDId(String MBId) throws Exception{
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        return insertUpdateDeleteClass.insertUpdateDeleteDB("delete from BillData where mbid = '"+MBId+"' ");
    }    
    
    public boolean updateBillData(BillData billData){
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        String sql = "update BillData set NewMeter='"+billData.getNewMeter()+"',"
                + "Sramadhana='"+billData.isSramadhana()+"',"
                + "AbsentCharge='"+billData.isAbsentCharge()+"',MonthlyUsageUnit='"+billData.getMonthlyUsageUnit()+"'  "
                + "where mbid=(select max(mbid) from BillData where nic='"+billData.getNic()+"') ";
        return insertUpdateDeleteClass.insertUpdateDeleteDB(sql);
    }
    
    public boolean updateMonthlyBillDetails(MonthlyBillDetails monthlyBillDetails){
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        String sql = "update MonthlyBillDetails set NewMeter='"+monthlyBillDetails.getNewMeter()+"',"
                + "MonthlyConsumption='"+monthlyBillDetails.getMonthlyConsumption()+"',"
                + "FixedCharge='"+monthlyBillDetails.getFixedCharge()+"',Sramadhana='"+monthlyBillDetails.getSramadhana()+"',"
                + "AbsentCharge='"+monthlyBillDetails.getAbsentCharge()+"',TotalMonthlyAmount='"+monthlyBillDetails.getTotalMonthlyAmount()+"',"
                + "MonthlyUsageUnit='"+monthlyBillDetails.getMonthlyUsageUnit()+"',TotalOutstandingMonthly='"+monthlyBillDetails.getTotalOutstandingMonthly()+"' "
                + "where InvoiceNo=(select max(InvoiceNo) from MonthlyBillDetails where nic='"+monthlyBillDetails.getNic()+"') ";
        return insertUpdateDeleteClass.insertUpdateDeleteDB(sql);
                //+ "where InvoiceNo='"+monthlyBillDetails.getInvoiceNo()+"'; ");
    }
    
    public BillData getLatestMBIdFromNic(String nic) throws Exception{
    
        RetrieveClass retrieveClass=new RetrieveClass();
        BillData billData=new BillData();
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from BillData where nic='"+nic+"' "
                    + "and mbid=(select max(mbid) from BillData where nic='"+nic+"')");
            while (rs.next()) {
                billData.setMbid(rs.getString("mbid"));
                billData.setCid(rs.getString("cid"));
                billData.setNic(rs.getString("nic"));
                billData.setNewMeter(rs.getInt("NewMeter"));
                billData.setSramadhana(rs.getInt("Sramadhana"));
                billData.setAbsentCharge(rs.getInt("AbsentCharge"));
                billData.setMonth(rs.getString("Month"));
                billData.setOldMeter(rs.getInt("OldMeter"));
                billData.setMonthlyUsageUnit(rs.getInt("MonthlyUsageUnit"));
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }         
        return billData;
    }
    public boolean deleteBillData(BillData currentBillData) throws Exception{

        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        if(insertUpdateDeleteClass.insertUpdateDeleteDB("delete from BillData where mbid='"+currentBillData.getMbid()+"' "))
            if(insertUpdateDeleteClass.insertUpdateDeleteDB("delete from MonthlyBillDetails where InvoiceNo='"+currentBillData.getMbid()+"' "))
                if(updateCustomerWhenDeleteBill(currentBillData))
                    return true;
        return false;
        
    }
    
    public boolean updateCustomerWhenDeleteBill(BillData currentBillData) throws Exception{
    
        MonthlyBillDetails monthlyBillDetails=getLatestMonthlyBillDetailsByNIC(currentBillData);
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        String sql="update customer set preMeter='"+monthlyBillDetails.getOldMeter()+"',currentMeter='"+monthlyBillDetails.getNewMeter()+"'"
                + ", TotalOutstandingAmount='"+monthlyBillDetails.getTotalOutstandingMonthly()+"' "
                + "where nic= '"+currentBillData.getNic()+"' ";
        return insertUpdateDeleteClass.insertUpdateDeleteDB(sql);
    }
}
