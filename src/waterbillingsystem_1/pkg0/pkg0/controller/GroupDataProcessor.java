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
    
    public boolean putGroup(Group group){
        GroupDetailsDB groupDetailsDB = new GroupDetailsDB();
        return groupDetailsDB.putGroup(group);
    }
    
    public boolean updateGroup(Group group){
        GroupDetailsDB groupDetailsDB = new GroupDetailsDB();
        return groupDetailsDB.updateGroup(group);
    }
    
    public Group getGroupById(String gid) throws Exception{

        GroupDetailsDB groupDetailsDB=new GroupDetailsDB();
        return groupDetailsDB.getAGroup(gid);
    }
    
}
