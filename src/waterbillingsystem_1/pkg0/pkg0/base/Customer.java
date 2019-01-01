/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.base;

/**
 *
 * @author UDISSSA1
 */
public class Customer {

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getAddress_3() {
        return address_3;
    }

    public void setAddress_3(String address_3) {
        this.address_3 = address_3;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getPreMeter() {
        return preMeter;
    }

    public void setPreMeter(int preMeter) {
        this.preMeter = preMeter;
    }

    public int getCurrentMeter() {
        return currentMeter;
    }

    public void setCurrentMeter(int currentMeter) {
        this.currentMeter = currentMeter;
    }

    public double getTotalOutstandingAmount() {
        return TotalOutstandingAmount;
    }

    public void setTotalOutstandingAmount(double TotalOutstandingAmount) {
        this.TotalOutstandingAmount = TotalOutstandingAmount;
    }

    public int getMeterNo() {
        return MeterNo;
    }

    public void setMeterNo(int MeterNo) {
        this.MeterNo = MeterNo;
    }

    public double getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(double lastPayment) {
        this.lastPayment = lastPayment;
    }
    
    private int  cid;
    private String  nic;
    private String  address_1;
    private String  address_2;
    private String  address_3;
    private int  gid;
    private int  preMeter ;
    private int  currentMeter;
    private double  TotalOutstandingAmount ;
    private int  MeterNo ;
    private double lastPayment;

    
}
