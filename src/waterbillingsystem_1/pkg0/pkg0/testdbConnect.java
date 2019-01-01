/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0;

/**
 *
 * @author UDISSSA1
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;
 
/**
 *
 * @author sqlitetutorial.net
 */
public class testdbConnect {
     /**
     * Connect to a sample database
     */
    //private static final Logger log = Logger.getLogger("confLogger");
    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:waterbill.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            getLogger.getLog().debug("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                getLogger.getLog().debug(ex.toString());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }
}
