/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import waterbillingsystem_1.pkg0.pkg0.base.Customer;
import waterbillingsystem_1.pkg0.pkg0.dao.CustomerDataDatabase;

/**
 *
 * @author UDISSSA1
 */
public class CustomerDataProcessor {
    
    public static boolean putCustomer(Customer customer){
        return CustomerDataDatabase.putCustomerData(customer);   
    }
    
}
