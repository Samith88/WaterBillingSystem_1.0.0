/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.dao;

import waterbillingsystem_1.pkg0.pkg0.base.BillData;
import waterbillingsystem_1.pkg0.pkg0.base.MonthlyBillDetails;
import waterbillingsystem_1.pkg0.pkg0.database.InsertUpdateDeleteClass;

/**
 *
 * @author UDISSSA1
 */
public class MonthlyBillToDB {
    
    public boolean putBillData(BillData billData){
        
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 
        return insertUpdateDeleteClass.insertUpdateDeleteDB("insert into BillData (mbid,cid,nic,NewMeter,Sramadhana,"
                + "AbsentCharge,Month,OldMeter) values "
                + "('"+billData.getMbid()+"','"+billData.getCid()+"','"+billData.getNic()+"','"+billData.getNewMeter()+"'"
                + ",'"+billData.isSramadhana()+"','"+billData.isAbsentCharge()+"','"+billData.getMonth()+"'"
                + ",'"+billData.getOldMeter()+"')");    
    }
    
    public boolean putMonthlyBillDetails(MonthlyBillDetails monthlyBillDetails){
        
        InsertUpdateDeleteClass insertUpdateDeleteClass =new InsertUpdateDeleteClass(); 

        return insertUpdateDeleteClass.insertUpdateDeleteDB("insert into MonthlyBillDetails(InvoiceNo,cid,nic,Group,OldMeter,"
                + "NewMeter,MonthlyConsumption,"
                + "CurrentTotalAmount,FixedCharge,Sramadhana,AbsentCharge,TotalMonthlyAmount,Month,"
                + "TotalOutstandingMonthly) values('"+monthlyBillDetails.getInvoiceNo()+"','"+monthlyBillDetails.getCid()+"',"
                + "'"+monthlyBillDetails.getNic()+"','"+monthlyBillDetails.getGroup()+"','"+monthlyBillDetails.getOldMeter()+"',"
                + "'"+monthlyBillDetails.getNewMeter()+"',"
                + ",'"+monthlyBillDetails.getMonthlyConsumption()+"','"+monthlyBillDetails.getCurrentTotalAmount()+"',"
                + "'"+monthlyBillDetails.getFixedCharge()+"','"+monthlyBillDetails.getSramadhana()+"',"
                + "'"+monthlyBillDetails.getAbsentCharge()+"','"+monthlyBillDetails.getTotalMonthlyAmount()+"',"
                + "'"+monthlyBillDetails.getMonth()+"','"+monthlyBillDetails.getTotalOutstandingMonthly()+"')");
    }
    
}
