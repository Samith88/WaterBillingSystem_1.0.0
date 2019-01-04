/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import waterbillingsystem_1.pkg0.pkg0.dao.GroupDetailsDB;
import waterbillingsystem_1.pkg0.pkg0.database.DBConnection;

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
}