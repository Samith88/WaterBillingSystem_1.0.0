/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.controller;

import waterbillingsystem_1.pkg0.pkg0.base.Group;
import waterbillingsystem_1.pkg0.pkg0.dao.GroupDetailsDB;

/**
 *
 * @author UDISSSA1
 */
public class GroupDataProcessor {
    
    public void putGroup(Group group){
        GroupDetailsDB groupDetailsDB = new GroupDetailsDB();
        groupDetailsDB.putGroup(group);
    }
    
}
