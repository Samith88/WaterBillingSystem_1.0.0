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
public class InitialPayment {

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public double getTotalInitialPayment() {
        return totalInitialPayment;
    }

    public void setTotalInitialPayment(double totalInitialPayment) {
        this.totalInitialPayment = totalInitialPayment;
    }

    public double getNewlyReceivedPyament() {
        return newlyReceivedPyament;
    }

    public void setNewlyReceivedPyament(double newlyReceivedPyament) {
        this.newlyReceivedPyament = newlyReceivedPyament;
    }

    public double getRemainingInitialPayment() {
        return remainingInitialPayment;
    }

    public void setRemainingInitialPayment(double remainingInitialPayment) {
        this.remainingInitialPayment = remainingInitialPayment;
    }
    
    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    } 
    
    private String cid;
    private double totalInitialPayment;
    private double newlyReceivedPyament;
    private double remainingInitialPayment;
    private String Date;
   
}
