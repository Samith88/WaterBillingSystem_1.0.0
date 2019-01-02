/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import waterbillingsystem_1.pkg0.pkg0.base.Group;
import waterbillingsystem_1.pkg0.pkg0.database.DBConnection;
import waterbillingsystem_1.pkg0.pkg0.database.InsertUpdateDeleteClass;
import waterbillingsystem_1.pkg0.pkg0.database.RetrieveClass;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;
/**
 *
 * @author UDISSSA1
 */
public class GroupDetailsDB {
    
    public static boolean putGroup(Group group){
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        return insertUpdateDeleteClass.insertUpdateDeleteDB("insert into group(gid,gname,location,description) values ('"+group.getGid()+"',"
                + "'"+group.getGname()+"','"+group.getLocation()+"','"+group.getDescription()+"')");
    }
    
    public List<Group> getGroup(){
        RetrieveClass retrieveClass =new RetrieveClass();
        List<Group> groups=new ArrayList<Group>();  
        Group group=null;
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from group");
            while (rs.next()) {
                group =new Group();
		group.setGid(rs.getInt("gid"));
                group.setGname(rs.getString("groupName"));
                group.setLocation(rs.getString("location"));
                group.setDescription(rs.getString("description"));
                
                groups.add(group);
            }
            DBConnection.readDisconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return groups;        
    }
      
    
    public Group getAGroup(int groupId){
        RetrieveClass retrieveClass =new RetrieveClass();  
        Group group=new Group();
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from group where gid='"+groupId+"'");
            while (rs.next()) {
		group.setGid(rs.getInt("gid"));
                group.setGname(rs.getString("groupName"));
                group.setLocation(rs.getString("location"));
                group.setDescription(rs.getString("description"));
            }
            DBConnection.readDisconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return group;        
    }

    public static List<String> getGroupAString(){
        RetrieveClass retrieveClass =new RetrieveClass();
        List<String> groupIds=new ArrayList<String>();  
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select gid,gname from group");
            while (rs.next()) {
                groupIds.add(rs.getString(0)+"-"+rs.getString(1));
            }
            DBConnection.readDisconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return groupIds;        
    }  
}
