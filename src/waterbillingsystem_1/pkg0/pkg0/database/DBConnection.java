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
    public static Connection readConnection;
    
    public static Connection connect() throws Exception{
        String url = "jdbc:sqlite:waterbill.db";
        connection = DriverManager.getConnection(url);
        return connection;
    }

    public static void disconnect() throws Exception{
        connection.close();
    }
    
    public static void readDisconnect1() throws SQLException{
        readConnection.close();
    }
    
    public static Connection readConnect1() throws SQLException{
        SQLiteConfig config = new SQLiteConfig();
        config.setReadOnly(true);
        readConnection = DriverManager.getConnection("jdbc:sqlite:sample.db",config.toProperties());
        return readConnection;
    }    
}
