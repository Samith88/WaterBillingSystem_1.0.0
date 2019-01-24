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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
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

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
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

    public String getMeterNo() {
        return MeterNo;
    }

    public void setMeterNo(String MeterNo) {
        this.MeterNo = MeterNo;
    }

    public double getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(double lastPayment) {
        this.lastPayment = lastPayment;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }    
    public String getCFirstName() {
        return CFirstName;
    }

    public void setCFirstName(String CFirstName) {
        this.CFirstName = CFirstName;
    }

    public String getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(String lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }    
    
    public String getInitialFeeTotal() {
        return InitialFeeTotal;
    }

    public void setInitialFeeTotal(String InitialFeeTotal) {
        this.InitialFeeTotal = InitialFeeTotal;
    }

    public String getInitialReceived() {
        return InitialReceived;
    }

    public void setInitialReceived(String InitialReceived) {
        this.InitialReceived = InitialReceived;
    }
    
    private String  cid;
    private String  nic;
    private String  address_1;
    private String  address_2;
    private String  address_3;
    private String  gid;
    private int  preMeter ;
    private int  currentMeter;
    private double  TotalOutstandingAmount ;
    private String  MeterNo ;
    private double lastPayment;
    private String cname;
    private String CFirstName;
    private String lastPaymentDate;
    private String InitialFeeTotal;
    private String InitialReceived;

}
