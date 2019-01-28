/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import waterbillingsystem_1.pkg0.pkg0.base.InitialPayment;
import waterbillingsystem_1.pkg0.pkg0.database.DBConnection;
import waterbillingsystem_1.pkg0.pkg0.database.InsertUpdateDeleteClass;
import waterbillingsystem_1.pkg0.pkg0.database.RetrieveClass;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class InitialPaymentDB {
    
    public boolean putInitialPayment(InitialPayment initialPayment){
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        return insertUpdateDeleteClass.insertUpdateDeleteDB("insert into InitialPayment(cid,totalInitialPayment"
                + ",newlyReceivedPyament,remainingInitialPayment,Date)"
                + "values ('"+initialPayment.getCid()+"',"
                + "'"+initialPayment.getTotalInitialPayment()+"','"+initialPayment.getNewlyReceivedPyament()+"',"
                + "'"+initialPayment.getRemainingInitialPayment()+"','"+initialPayment.getDate()+"')");
    }    
    
    public InitialPayment getAInitialPaymentDB(String cid) throws Exception{
        RetrieveClass retrieveClass =new RetrieveClass();
        InitialPayment initialPayment=new InitialPayment();        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from InitialPayment where cid='"+cid+"' and"
                    + " Date = (select max(Date) from InitialPayment where cid='"+cid+"') ");
            while (rs.next()) {
                initialPayment.setCid(rs.getString("cid"));
                initialPayment.setTotalInitialPayment(rs.getDouble("totalInitialPayment"));
                initialPayment.setNewlyReceivedPyament(rs.getDouble("newlyReceivedPyament"));
                initialPayment.setRemainingInitialPayment(rs.getDouble("remainingInitialPayment"));
                initialPayment.setDate(rs.getString("Date"));
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }
        return initialPayment;
    }       
    
    public boolean updateUnitPrice(InitialPayment initialPayment){
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        return insertUpdateDeleteClass.insertUpdateDeleteDB("update InitialPayment set "
        + "totalInitialPayment='"+initialPayment.getTotalInitialPayment()+"',"
        + "newlyReceivedPyament='"+initialPayment.getNewlyReceivedPyament()+"',"
        + "remainingInitialPayment='"+initialPayment.getRemainingInitialPayment()+"' "
        + "where cid='"+initialPayment.getCid()+"', Date = (select max(Date) from InitialPayment where cid='"+initialPayment.getCid()+"') ");
    }        
    
}