/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import waterbillingsystem_1.pkg0.pkg0.dao.GroupDetailsDB;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author UDISSSA1
 */
public class FillGUIComponents {
    
    public javax.swing.JComboBox LoadCombobox(List<String> itemList,javax.swing.JComboBox comboBox){   
        comboBox.removeAllItems();
        itemList.forEach((item) -> {
            comboBox.addItem(item);
        });
        return comboBox;
    }
    
    public void FillcmbGroupId(javax.swing.JComboBox comboBox) throws SQLException, Exception{
        
        GroupDetailsDB groupDetailsDB=new GroupDetailsDB();
        List<String> groupList = groupDetailsDB.getGroupAString();
        LoadCombobox(groupList,comboBox);
    }
    
    public static void setNumberOnlyTextBox(java.awt.event.KeyEvent evt){
        char enter = evt.getKeyChar();
        if(Character.isDigit(enter) || (enter=='.') ){
        } else {
            evt.consume();
        } 
    }
    public static void setNumberOnlyTextBoxNIC(java.awt.event.KeyEvent evt){
        char enter = evt.getKeyChar();
        if(Character.isDigit(enter) || (enter=='.') || (enter=='V') || (enter=='v')){
        } else {
            evt.consume();
        } 
    }    
    
    public void LoadCustomerData(HashMap<String, String> customerHash ,String cid,javax.swing.JComboBox comboBox) throws Exception{
    
        comboBox.removeAllItems();
        
        Set set = customerHash.entrySet();
        Iterator iterator = set.iterator();
        
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            if(mentry.getKey().toString().contains(cid))
                comboBox.addItem(mentry.getKey());
        } 
    }
    public void updateCmb(javax.swing.JComboBox comboBox,String selected) throws SQLException, Exception{
        
        GroupDetailsDB groupDetailsDB=new GroupDetailsDB();
        List<String> groupList = groupDetailsDB.getGroupAString();
        groupList.stream().filter((element) -> (element.contains(selected))).forEachOrdered((element) -> {
            comboBox.setSelectedItem(element);
        });
    }    
}
