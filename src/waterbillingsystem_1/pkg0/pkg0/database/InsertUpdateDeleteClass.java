/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class InsertUpdateDeleteClass {

    public boolean insertUpdateDeleteDB(String sql){
        boolean result = false;
        try {
            Connection connection = DBConnection.connect();

            int res;
            try (PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql)) {
                res = statement.executeUpdate();
                getLogger.getLog().debug(sql);
            }
            if(res>0){
                result = true;
            }
            DBConnection.disconnect();
        } catch (Exception e) {
            getLogger.getLog().debug(e.toString());
        }
        return result;
    }
}
