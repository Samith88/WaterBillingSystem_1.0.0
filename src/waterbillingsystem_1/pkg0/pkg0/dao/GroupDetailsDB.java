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
    
    public boolean putGroup(Group group){
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        return insertUpdateDeleteClass.insertUpdateDeleteDB("insert into [group](gid,gname,location,description) values ('"+group.getGid()+"',"
                + "'"+group.getGname()+"','"+group.getLocation()+"','"+group.getDescription()+"')");
    }
    
    public boolean updateGroup(Group group){
        
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        return insertUpdateDeleteClass.insertUpdateDeleteDB("update [group] set gname='"+group.getGname()+"', "
                + "location='"+group.getLocation()+"' ,description ='"+group.getLocation()+"'"
                + " where gid='"+group.getGid()+"';");
    }
    
    public List<Group> getGroup() throws Exception{
        RetrieveClass retrieveClass =new RetrieveClass();
        List<Group> groups=new ArrayList<>();  
        Group group=null;
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from [group]");
            while (rs.next()) {
                group =new Group();
		group.setGid(rs.getString("gid"));
                group.setGname(rs.getString("gname"));
                group.setLocation(rs.getString("location"));
                group.setDescription(rs.getString("description"));
                
                groups.add(group);
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return groups;        
    }
      
    
    public Group getAGroup(String groupId) throws Exception{
        RetrieveClass retrieveClass =new RetrieveClass();  
        Group group=new Group();
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from [group] where gid='"+groupId+"'");
            while (rs.next()) {
		group.setGid(rs.getString("gid"));
                group.setGname(rs.getString("gname"));
                group.setLocation(rs.getString("location"));
                group.setDescription(rs.getString("description"));
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return group;        
    }

    public List<String> getGroupAString() throws Exception{
        RetrieveClass retrieveClass =new RetrieveClass();
        List<String> groupIds=new ArrayList<>();  
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select gid,gname from [group]");
            while (rs.next()) {
                groupIds.add(rs.getInt("gid")+"-"+rs.getString("gname"));
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }     
        return groupIds;        
    }  
}
