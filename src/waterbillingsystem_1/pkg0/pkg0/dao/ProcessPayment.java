/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import waterbillingsystem_1.pkg0.pkg0.base.Payment;
import waterbillingsystem_1.pkg0.pkg0.database.DBConnection;
import waterbillingsystem_1.pkg0.pkg0.database.InsertUpdateDeleteClass;
import waterbillingsystem_1.pkg0.pkg0.database.RetrieveClass;
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
        
        payment.setNewOutStandingTotal(getOldTOAFromNIC(payment.getNic()) - payment.getAmount());
        
        String sql="update payment set amount='"+payment.getAmount()+"',"
                + "NewOutStandingTotal='"+payment.getNewOutStandingTotal()+"' where pyid='"+payment.getPyid()+"' ";
        
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        return insertUpdateDeleteClass.insertUpdateDeleteDB(sql) && updateCustomerTOA(payment);
    }    
    
    private boolean updateCustomerTOA(Payment payment){
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        return insertUpdateDeleteClass.insertUpdateDeleteDB("update Customer set TotalOutstandingAmount='"+payment.getNewOutStandingTotal()+"' "
                + " where nic='"+payment.getNic()+"'");
    }      
    
    public Payment getLatestPaymentByNIC(String nic) throws SQLException, Exception{
        RetrieveClass retrieveClass=new RetrieveClass();
        ResultSet rs = retrieveClass.getResultsFormDB("select * from Payment where nic='"+nic+"' and pyid=(select max(pyid) from Payment where nic='"+nic+"')" );
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
    
    private double getOldTOAFromNIC(String nic) throws Exception{
        
        RetrieveClass retrieveClass =new RetrieveClass();
        double oldOutStandingTotal=0.0;
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select oldOutStandingTotal from Payment where nic='"+nic+"'"
                    + " and pyid=(select max(pyid) from Payment where nic='"+nic+"')");
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
