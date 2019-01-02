/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import waterbillingsystem_1.pkg0.pkg0.base.Customer;
import waterbillingsystem_1.pkg0.pkg0.database.DBConnection;
import waterbillingsystem_1.pkg0.pkg0.database.InsertUpdateDeleteClass;
import waterbillingsystem_1.pkg0.pkg0.database.RetrieveClass;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class CustomerDataDatabase {
    
    public static Customer getCustomer(String nic) throws Exception{
        
        RetrieveClass retrieveClass =new RetrieveClass();
        Customer customer = new Customer();
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from customer where nic='"+nic+"'");
            while (rs.next()) {
                customer.setCid(rs.getInt("cid"));
                customer.setNic(rs.getString("nic"));
                customer.setAddress_1(rs.getString("address_1"));
                customer.setAddress_2(rs.getString("address_2"));
                customer.setAddress_3(rs.getString("address_3"));
                customer.setGid(rs.getInt("gid"));
                customer.setPreMeter(rs.getInt("preMeter"));
                customer.setCurrentMeter(rs.getInt("currentMeter"));
                customer.setTotalOutstandingAmount(rs.getDouble("TotalOutstandingAmount"));
                customer.setMeterNo(rs.getInt("MeterNo"));
                customer.setLastPayment(rs.getDouble("lastPayment"));
                customer.setCname(rs.getString("cname"));
                //rs.getInt("id") +  "\t" + rs.getString("name") + "\t" +rs.getDouble("capacity"));
            }
            DBConnection.readDisconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return customer;
    }
    
    public static int getCIDFromNIC(String nic) throws Exception{
        
        RetrieveClass retrieveClass =new RetrieveClass();
        int cid=0;
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from customer where nic='"+nic+"'");
            while (rs.next()) {
                cid= rs.getInt("cid");
            }
            DBConnection.readDisconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return cid;
    }    
    
    public static String getGroupFromNIC(String nic) throws Exception{
        
        RetrieveClass retrieveClass =new RetrieveClass();
        String gname="";
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select g.gname as groupName from customer c, group g where "
                    + "c.nic='"+nic+"' and g.gid = c.gid");
            while (rs.next()) {
                gname= rs.getString("groupName");
            }
            DBConnection.readDisconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return gname;
    }      
    
    public static boolean putCustomerData(Customer customer){
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        return insertUpdateDeleteClass.insertUpdateDeleteDB("insert into Customer(cid,nic,address_1,address_2,address_3,gid,MeterNo,cname) values ("
                + "'"+customer.getCid()+"','"+customer.getNic()+"','"+customer.getAddress_1()+"',"
                + "'"+customer.getAddress_2()+"','"+customer.getAddress_3()+"','"+customer.getGid()+"',"
                + "'"+customer.getMeterNo()+"','"+customer.getCname()+"')");
    }
}
