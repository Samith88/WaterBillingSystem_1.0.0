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
public class VariableStorage {

    public static double getSramadhanaCharge() {
        return SramadhanaCharge;
    }

    public static void setSramadhanaCharge(double SramadhanaCharge) {
        VariableStorage.SramadhanaCharge = SramadhanaCharge;
    }

    public static double getAbsentCharge() {
        return AbsentCharge;
    }

    public static void setAbsentCharge(double AbsentCharge) {
        VariableStorage.AbsentCharge = AbsentCharge;
    }

    public static double getFixedCharge() {
        return FixedCharge;
    }
    public static String getInvoiceReport() {
        return InvoiceReport;
    }

    public static String getCustomerReport() {
        return CustomerReport;
    }

    public static String getGroupReport() {
        return GroupReport;
    }
    public static void setFixedCharge(double FixedCharge) {
        VariableStorage.FixedCharge = FixedCharge;
    }
    public static String getBackupGroundImage() {
        return BackupGroundImage;
    }

    public static String getImageIcon() {
        return ImageIcon;
    }

    public static String getMainBackupGroundImage() {
        return MainBackupGroundImage;
    }

    public static String getCalBackupGroundImage() {
        return CalBackupGroundImage;
    }    
    
    public static String getBackupFolder() {
        return dbBackupFolder;
    }
    
    public static String getDbFile() {
        return dbFile;
    }
    
    public static String getFileKey() {
        return FileKey;
    }
    public static String getDbBackupFolder() {
        return dbBackupFolder;
    }
    public static boolean isGetBackup() {
        return getBackup;
    }


    public static String getKeyFactory() {
        return keyFactory;
    }
    
    public static void setGetBackup(boolean getBackup) {
        VariableStorage.getBackup = getBackup;
    }

    public static String getEmptyString() {
        return emptyString;
    }

    public static String getTempFile() {
        return TempFile;
    }

    public static String getDbFileName() {
        return dbFileName;
    }
    
    private  static double SramadhanaCharge;
    private  static double AbsentCharge;
    private  static double FixedCharge;

    private static boolean getBackup = true;
    
    private static final String MainBackupGroundImage = "images\\wallpaper.png";
    private static final String CalBackupGroundImage = "images\\calbg.jpg";
    private static final String InvoiceReport = "reports\\waterBilling.jrxml";
    private static final String CustomerReport = "reports\\CustomerReports.jrxml";
    private static final String GroupReport = "reports\\groupReport.jrxml";
    private static final String BackupGroundImage = "images\\page.png";
    private static final String ImageIcon = "images\\WaterDrop.png";
    private static final String FileKey = "t0d!050r0#qf0090";
    private static final String keyFactory = "PBEWithMD5AndTripleDES";

    private final static String dbFile = "db\\waterbill.db";
    private final static String dbFileName = "waterbill.db";
    private final static String dbBackupFolder = "db\\backups";
    private final static String emptyString = "	...";
    private final static String TempFile = "TempFile.txt";



       
}
