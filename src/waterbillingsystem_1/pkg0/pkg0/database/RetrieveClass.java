/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class RetrieveClass {
    
    public ResultSet getResultsFormDB(String sql) throws Exception{
        ResultSet result = null;
        try {
            result = DBConnection.readConnect().createStatement().executeQuery(sql);
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }
        return result;
    }
    
}
