/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import waterbillingsystem_1.pkg0.pkg0.base.Payment;
import waterbillingsystem_1.pkg0.pkg0.database.DBConnection;
import waterbillingsystem_1.pkg0.pkg0.database.InsertUpdateDeleteClass;
import waterbillingsystem_1.pkg0.pkg0.database.RetrieveData;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class ProcessPayment {
    
    public boolean insertPayment(Payment payment){
        
        String sql="insert into payment(pyid,cid,nic,amount,Date,oldOutStandingTotal,NewOutStandingTotal) "
                + "values ('"+payment.getPyid()+"','"+payment.getCid()+"','"+payment.getNic()+"','"+payment.getAmount()+"',"
                + "'"+payment.getDate()+"',"
                + "'"+payment.getOldOutStandingTotal()+"','"+payment.getNewOutStandingTotal()+"')";
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        return insertUpdateDeleteClass.insertUpdateDeleteDB(sql);
    }
    
    public boolean updatePayment(Payment payment) throws Exception{
        
        payment.setNewOutStandingTotal(getOldTOAFromCID(payment.getCid()) - payment.getAmount());
        
        String sql="update payment set amount='"+payment.getAmount()+"',"
                + "NewOutStandingTotal='"+payment.getNewOutStandingTotal()+"' where pyid='"+payment.getPyid()+"' ";
        
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        return insertUpdateDeleteClass.insertUpdateDeleteDB(sql) && updateCustomerTOA(payment);
    } 
    
    public boolean deletePayment(Payment payment) throws Exception{
        
        String sql="delete from payment where pyid='"+payment.getPyid()+"' ";
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        if(insertUpdateDeleteClass.insertUpdateDeleteDB(sql))
            return updateCustomerTOAWhenDelete(payment);
        return false;
    }
    
    private boolean updateCustomerTOA(Payment payment){
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        return insertUpdateDeleteClass.insertUpdateDeleteDB("update Customer set TotalOutstandingAmount='"+payment.getNewOutStandingTotal()+"' "
                + ",lastPayment='"+payment.getAmount()+"',lastPaymentDate='"+payment.getDate()+"' "
                + " where cid='"+payment.getCid()+"'");
    }      
    
    private boolean updateCustomerTOAWhenDelete(Payment payment) throws Exception{
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        CustomerDB CustomerDataDatabase=new CustomerDB();
        double newTOA = CustomerDataDatabase.getTOAFromCID(payment.getCid()) + payment.getAmount();
        Payment latestPayment = getLatestPaymentByCID(payment.getCid());
        try{
            return insertUpdateDeleteClass.insertUpdateDeleteDB("update Customer set TotalOutstandingAmount='"+newTOA+"' ,"
                + "lastPayment='"+latestPayment.getAmount()+"', lastPaymentDate='"+latestPayment.getDate()+"' "
                + " where nic='"+payment.getNic()+"'");     
        }
        catch (Exception ex) {
                Logger.getLogger(ProcessPayment.class.getName()).log(Level.SEVERE, null, ex);
            return false;   
        }        
        
    } 
    
    public Payment getLatestPaymentByCID(String cid) throws SQLException, Exception{
        RetrieveData retrieveClass=new RetrieveData();
        ResultSet rs = retrieveClass.getResultsFormDB("select * from Payment where cid='"+cid+"' "
                + "and pyid=(select max(pyid) from Payment where cid='"+cid+"')" );
        //select * from Payment where nic='883512847v' and pyid=(select max(pyid) from Payment where nic='883512847v');
        Payment payment=new Payment();
        while(rs.next()){
            payment.setPyid(rs.getString("pyid"));
            payment.setCid(rs.getString("cid"));
            payment.setNic(rs.getString("nic"));
            payment.setAmount(rs.getDouble("amount"));
            payment.setDate(rs.getString("Date"));
            payment.setOldOutStandingTotal(rs.getDouble("oldOutStandingTotal"));
            payment.setNewOutStandingTotal(rs.getDouble("NewOutStandingTotal"));
        }
        DBConnection.disconnect();
        return payment;
    }
    
    public boolean updateCustomerWithPayment(Payment payment) throws Exception{
        
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        return insertUpdateDeleteClass.insertUpdateDeleteDB("update customer set lastPayment='"+payment.getAmount()+"',lastPaymentDate='"+payment.getDate()+"',"
                + "TotalOutstandingAmount='"+payment.getNewOutStandingTotal()+"' where nic='"+payment.getNic()+"'");
    
    }
    
    private double getOldTOAFromCID(String cid) throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        double oldOutStandingTotal=0.0;
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select oldOutStandingTotal from Payment where cid='"+cid+"'"
                    + " and pyid=(select max(pyid) from Payment where cid='"+cid+"')");
            while (rs.next()) {
                oldOutStandingTotal= rs.getDouble("oldOutStandingTotal");
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return oldOutStandingTotal;
    }    
    
}
