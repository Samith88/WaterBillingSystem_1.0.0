/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import waterbillingsystem_1.pkg0.pkg0.base.Customer;
import waterbillingsystem_1.pkg0.pkg0.database.DBConnection;
import waterbillingsystem_1.pkg0.pkg0.database.InsertUpdateDeleteClass;
import waterbillingsystem_1.pkg0.pkg0.database.RetrieveData;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class CustomerDB {
    
    public Customer getCustomer(String cid) throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        Customer customer = new Customer();
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from customer where cid='"+cid+"'");
            while (rs.next()) {
                customer.setCid(rs.getString("cid"));
                customer.setNic(rs.getString("nic"));
                customer.setAddress_1(rs.getString("address_1"));
                customer.setAddress_2(rs.getString("address_2"));
                customer.setAddress_3(rs.getString("address_3"));
                customer.setGid(rs.getString("gid"));
                customer.setPreMeter(rs.getInt("preMeter"));
                customer.setCurrentMeter(rs.getInt("currentMeter"));
                customer.setTotalOutstandingAmount(rs.getDouble("TotalOutstandingAmount"));
                customer.setMeterNo(rs.getString("MeterNo"));
                customer.setLastPayment(rs.getDouble("lastPayment"));
                customer.setCname(rs.getString("cname"));
                customer.setCFirstName(rs.getString("CFirstName"));
                customer.setLastPaymentDate(rs.getString("lastPaymentDate"));
                customer.setInitialFeeTotal(rs.getString("InitialFeeTotal"));
                customer.setInitialReceived(rs.getString("InitialReceived"));
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return customer;
    }
    
    public HashMap<String, String> getAllCustomers() throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        HashMap<String, String> customerHash = new HashMap<>();
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select CFirstName,cid from customer");
            while (rs.next()) {
                customerHash.put( rs.getString("CFirstName"),rs.getString("cid"));
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return customerHash;
    }    
    
    public boolean isCIDExist(String cid) throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        String cidcount="";
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select count(cid) as cidcount from customer where cid='"+cid+"'");
            while (rs.next()) {
                cidcount= rs.getString("cidcount");
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return Integer.parseInt(cidcount)>0;
    }    
    
    public String getNextCID() throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        String cidcount="";
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select max(cid) as cidcount from customer");
            while (rs.next()) {
                cidcount= rs.getString("cidcount");
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return String.valueOf(Integer.parseInt(cidcount)+1) ;
    } 
    
    public int getCurentMeterFromCID(String cid) throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        int currentMeter=0;
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select currentMeter from customer where cid='"+cid+"'");
            while (rs.next()) {
                currentMeter= rs.getInt("currentMeter");
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return currentMeter;
    }     
    
    public double getTOAFromCID(String cid) throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        double TOA=0.0;
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select TotalOutstandingAmount from customer where cid='"+cid+"'");
            while (rs.next()) {
                TOA= rs.getDouble("TotalOutstandingAmount");
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return TOA;
    }       
    
    public static String getCustomerGroupIdFromCID(String cid) throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        String gid="";
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select gid from customer where nic='"+cid+"' ");
            while (rs.next()) {
                gid= rs.getString("gid");
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return gid;
    }      
    
    public static double getCustomerTotalOSTCID(String cid) throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        double TotalOutstandingAmount=0.0;
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select TotalOutstandingAmount from customer where cid='"+cid+"' ");
            while (rs.next()) {
                TotalOutstandingAmount= rs.getDouble("TotalOutstandingAmount");
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return TotalOutstandingAmount;
    }     
    
    public boolean putCustomerData(Customer customer){
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        return insertUpdateDeleteClass.insertUpdateDeleteDB("insert into Customer(cid,nic,address_1,address_2,"
                + "address_3,gid,MeterNo,cname,currentMeter,TotalOutstandingAmount,CFirstName,lastPayment,InitialFeeTotal,InitialReceived) "
                + "values ("
                + "'"+customer.getCid()+"','"+customer.getNic()+"','"+customer.getAddress_1()+"',"
                + "'"+customer.getAddress_2()+"','"+customer.getAddress_3()+"','"+customer.getGid()+"',"
                + "'"+customer.getMeterNo()+"','"+customer.getCname()+"','"+customer.getCurrentMeter()+"'"
                + ",'"+customer.getTotalOutstandingAmount()+"','"+customer.getCFirstName()+"','"+customer.getLastPayment()+"',"
                + " '"+customer.getInitialFeeTotal()+"', '"+customer.getInitialReceived()+"'  )");
    }
    
    public boolean updateCustomerData(Customer customer){
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        return insertUpdateDeleteClass.insertUpdateDeleteDB("update Customer set nic='"+customer.getNic()+"',address_1='"+customer.getAddress_1()+"',"
                + "address_2='"+customer.getAddress_2()+"',address_3='"+customer.getAddress_3()+"',gid= '"+customer.getGid()+"',"
                + "MeterNo='"+customer.getMeterNo()+"',cname='"+customer.getCname()+"',currentMeter='"+customer.getCurrentMeter()+"',"
                + "TotalOutstandingAmount='"+customer.getTotalOutstandingAmount()+"',CFirstName='"+customer.getCFirstName()+"',"
                + "lastPayment='"+customer.getLastPayment()+"',InitialFeeTotal='"+customer.getInitialFeeTotal()+"'"
                + ",InitialReceived='"+customer.getInitialReceived()+"'  where cid='"+customer.getCid()+"'");
    }  
    
    public double[] getCustomerInitialPayment(String cid) throws Exception{
        
        RetrieveData retrieveClass =new RetrieveData();
        double initialPayments[] = new double[2];
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select InitialFeeTotal,InitialReceived from customer where cid='"+cid+"'");
            while (rs.next()) {
                initialPayments[0] = rs.getDouble("InitialFeeTotal");
                initialPayments[1] = rs.getDouble("InitialReceived");
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return initialPayments;
    }   
    public boolean updateCustomerInitialPayment(double[] initialPayments,String cid){
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        return insertUpdateDeleteClass.insertUpdateDeleteDB("update customer set InitialFeeTotal='"+initialPayments[0]+"',"
                + "InitialReceived='"+initialPayments[1]+"'  where cid='"+cid+"' ");
    }
        
    
    
}
