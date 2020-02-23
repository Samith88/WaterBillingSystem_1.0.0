/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.database;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.sqlite.SQLiteConfig;
import waterbillingsystem_1.pkg0.pkg0.VariableStorage;

/**
 *
 * @author UDISSSA1
 */
public class DBConnection {
    public static Connection connection;
    
    public static Connection connect() throws Exception{
        waterbillingsystem_1.pkg0.pkg0.controller.FileEncryptor.decryptFile();
        connection = DriverManager.getConnection("jdbc:sqlite:"+VariableStorage.getDbFile());
        return connection;
    }

    public static void disconnect() throws Exception{
        connection.close();
        waterbillingsystem_1.pkg0.pkg0.controller.FileEncryptor.encryptFile();
    }
    
    public static Connection readConnect() throws SQLException, GeneralSecurityException, IOException{
        SQLiteConfig config = new SQLiteConfig();
        config.setReadOnly(true);
        waterbillingsystem_1.pkg0.pkg0.controller.FileEncryptor.decryptFile();
        connection = DriverManager.getConnection("jdbc:sqlite:"+VariableStorage.getDbFile(),config.toProperties());
        return connection;
    }    
}
