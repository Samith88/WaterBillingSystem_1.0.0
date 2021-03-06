/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import java.util.HashMap;
import waterbillingsystem_1.pkg0.pkg0.base.Customer;
import waterbillingsystem_1.pkg0.pkg0.dao.CustomerDB;

/**
 *
 * @author UDISSSA1
 */
public class CustomerDataProcessor {
    
    public static boolean putCustomer(Customer customer){
        CustomerDB customerDataDatabase=new CustomerDB();
        return customerDataDatabase.putCustomerData(customer);   
    }
    public static boolean updateCustomer(Customer customer){
        CustomerDB customerDataDatabase=new CustomerDB();
        return customerDataDatabase.updateCustomerData(customer);   
    }    
    public HashMap<String, String> getCustomerCIDNName() throws Exception{
        
        CustomerDB customerDataDatabase=new CustomerDB();
        return customerDataDatabase.getAllCustomers();
    }    
    
    public Customer getCustomer(String cid) throws Exception{
        CustomerDB customerDataDatabase=new CustomerDB();
        return customerDataDatabase.getCustomer(cid);
    }
    
    public double getTOAOfCustomer(String cid) throws Exception{
        CustomerDB customerDataDatabase=new CustomerDB();
        return customerDataDatabase.getTOAFromCID(cid);
    }    
    
    public int getCurentMeterFromCID(String cid) throws Exception {
    
        CustomerDB customerDataDatabase=new CustomerDB();
        return customerDataDatabase.getCurentMeterFromCID(cid);
    }
    public boolean isCIDExist(String cid) throws Exception{
        CustomerDB customerDataDatabase=new CustomerDB();
        return customerDataDatabase.isCIDExist(cid);
        
    }

    public String getNextCID() throws Exception{
        CustomerDB customerDataDatabase=new CustomerDB();
        return customerDataDatabase.getNextCID();
        
    }    
    
}
