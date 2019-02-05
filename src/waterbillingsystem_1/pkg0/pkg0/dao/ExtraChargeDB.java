/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import waterbillingsystem_1.pkg0.pkg0.base.ExtraCharges;
import waterbillingsystem_1.pkg0.pkg0.base.UnitPrice;
import waterbillingsystem_1.pkg0.pkg0.database.DBConnection;
import waterbillingsystem_1.pkg0.pkg0.database.InsertUpdateDeleteClass;
import waterbillingsystem_1.pkg0.pkg0.database.RetrieveClass;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class ExtraChargeDB {
    
    public ExtraCharges getExtraCharges() throws Exception{
    
        RetrieveClass retrieveClass =new RetrieveClass();
        ExtraCharges extraCharges=new ExtraCharges();
        
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from ExtraCharges");
            while (rs.next()) {
                extraCharges.setAbsentCharge(rs.getDouble("AbsentCharge"));
                extraCharges.setSramadhanaCharge(rs.getDouble("SramadhanaCharge"));
                extraCharges.setFixedCharge(rs.getDouble("FixedCharge"));
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }        
        return extraCharges;
    }
    
    public boolean updateUnitPrice(ExtraCharges extraCharges){
    
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        
        return insertUpdateDeleteClass.insertUpdateDeleteDB("update ExtraCharges set "
        + "SramadhanaCharge='"+extraCharges.getSramadhanaCharge()+"',AbsentCharge='"+extraCharges.getAbsentCharge()+"',"
        + "FixedCharge='"+extraCharges.getFixedCharge()+"';");
    }    
        
    
}
