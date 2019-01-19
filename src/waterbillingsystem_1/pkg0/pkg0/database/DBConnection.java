/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.sqlite.SQLiteConfig;

/**
 *
 * @author UDISSSA1
 */
public class DBConnection {
    public static Connection connection;
    
    public static Connection connect() throws Exception{
        connection = DriverManager.getConnection("jdbc:sqlite:waterbill.db");
        return connection;
    }

    public static void disconnect() throws Exception{
        connection.close();
    }
    
    public static Connection readConnect() throws SQLException{
        SQLiteConfig config = new SQLiteConfig();
        config.setReadOnly(true);
        connection = DriverManager.getConnection("jdbc:sqlite:waterbill.db",config.toProperties());
        return connection;
    }    
}
