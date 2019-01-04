/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.dao;

/**
 *
 * @author UDISSSA1
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import waterbillingsystem_1.pkg0.pkg0.base.UnitPrice;
import waterbillingsystem_1.pkg0.pkg0.database.DBConnection;
import waterbillingsystem_1.pkg0.pkg0.database.InsertUpdateDeleteClass;
import waterbillingsystem_1.pkg0.pkg0.database.RetrieveClass;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class UnitPricesDB {
    
    public static List<UnitPrice> getUnitPricesFromDB() throws Exception{
        RetrieveClass retrieveClass =new RetrieveClass();
        List<UnitPrice> unitprices=new ArrayList<>();
        try{
            ResultSet rs  = retrieveClass.getResultsFormDB("select * from unit_price");
            while (rs.next()) {
                UnitPrice unitPrice=new UnitPrice();
                unitPrice.setUid(rs.getString("uid"));
                unitPrice.setLower(rs.getInt("lower"));
                unitPrice.setUpper(rs.getInt("upper"));
                unitPrice.setPrice(rs.getDouble("price"));
                //rs.getInt("id") +  "\t" + rs.getString("name") + "\t" +rs.getDouble("capacity"));
                unitprices.add(unitPrice);
            }
            DBConnection.disconnect();
        } catch (SQLException e) {
            getLogger.getLog().debug(e.toString());
        }
        return unitprices;
    }
    
    public boolean putUnitPrices(UnitPrice unitPrice){
    
        String sql="insert into UnitPrice(uid,lower,upper,price) values ('"+unitPrice.getUid()+"',"
                + "'"+unitPrice.getLower()+"','"+unitPrice.getUpper()+"','"+unitPrice.getPrice()+"')";
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        return insertUpdateDeleteClass.insertUpdateDeleteDB(sql);
    }
}
