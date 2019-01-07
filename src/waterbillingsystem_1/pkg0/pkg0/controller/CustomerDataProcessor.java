/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import java.util.HashMap;
import waterbillingsystem_1.pkg0.pkg0.base.Customer;
import waterbillingsystem_1.pkg0.pkg0.dao.CustomerDataDatabase;

/**
 *
 * @author UDISSSA1
 */
public class CustomerDataProcessor {
    
    public static boolean putCustomer(Customer customer){
        CustomerDataDatabase customerDataDatabase=new CustomerDataDatabase();
        return customerDataDatabase.putCustomerData(customer);   
    }
    public HashMap<String, String> getCustomerCIDNNIC() throws Exception{
        
        CustomerDataDatabase customerDataDatabase=new CustomerDataDatabase();
        return customerDataDatabase.getAllCustomers();
    }    
    
}
