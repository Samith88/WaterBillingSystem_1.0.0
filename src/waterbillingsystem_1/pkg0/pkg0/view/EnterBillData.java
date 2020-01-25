/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import waterbillingsystem_1.pkg0.pkg0.JOptionPaneCustom;
import waterbillingsystem_1.pkg0.pkg0.Validations;
import waterbillingsystem_1.pkg0.pkg0.VariableStorage;
import waterbillingsystem_1.pkg0.pkg0.base.BillData;
import waterbillingsystem_1.pkg0.pkg0.controller.BillDataProcessor;
import waterbillingsystem_1.pkg0.pkg0.controller.CustomerDataProcessor;
import waterbillingsystem_1.pkg0.pkg0.controller.FillGUIComponents;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class EnterBillData extends javax.swing.JFrame {

    /**
     * Creates new form EnterBillData
     */
    HashMap<String, String> customerHash = new HashMap<>();
    boolean dataInserted;
    boolean dataUpdate;     
    BillData currentBillData = new BillData();
    
    public EnterBillData() throws Exception {
        
        File imageFile = new File(VariableStorage.getBackupGroundImage());
        BufferedImage myImage = ImageIO.read(imageFile);
        this.setContentPane(new ImagePanel(myImage));
        
        initComponents();
        CustomerDataProcessor customerDataProcessor=new CustomerDataProcessor();
        customerHash = customerDataProcessor.getCustomerCIDNName();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);     
        dataInserted =false;
        dataUpdate=false;        
        ImageIcon img = new ImageIcon(VariableStorage.getImageIcon());
        this.setIconImage(img.getImage());        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        CDFLabelMain = new javax.swing.JLabel();
        cmbCustomerCID = new javax.swing.JComboBox<>();
        BDLblCFName = new javax.swing.JLabel();
        txtCustomerFName = new javax.swing.JTextField();
        BDLblUnits = new javax.swing.JLabel();
        radioUnits = new javax.swing.JRadioButton();
        radioMeter = new javax.swing.JRadioButton();
        txtBDUnitUsage = new javax.swing.JTextField();
        ckBoxSramadhana = new javax.swing.JCheckBox();
        ckBoxAbsentFee = new javax.swing.JCheckBox();
        BDLblUnits1 = new javax.swing.JLabel();
        cmbMonth = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();
        btnBDClear = new javax.swing.JButton();
        btnBDEnter = new javax.swing.JButton();
        btnBDEnterAnother = new javax.swing.JButton();
        BDLblFN = new javax.swing.JLabel();
        btnCDHome = new javax.swing.JButton();
        PDlblWarning = new javax.swing.JLabel();
        btnCDUpdate = new javax.swing.JButton();
        BDLblFname = new javax.swing.JLabel();
        BDLblFName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pananwala Water Billing System");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        CDFLabelMain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CDFLabelMain.setText("Bill Data Form");

        cmbCustomerCID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select CID" }));
        cmbCustomerCID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCustomerCIDItemStateChanged(evt);
            }
        });

        BDLblCFName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BDLblCFName.setText("Customer First Name");

        txtCustomerFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerFNameKeyTyped(evt);
            }
        });

        BDLblUnits.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BDLblUnits.setText("Monthly Unit Usage");

        buttonGroup1.add(radioUnits);
        radioUnits.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioUnits.setText("Monthly unit usage");

        buttonGroup1.add(radioMeter);
        radioMeter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioMeter.setText("Current units in meter");

        txtBDUnitUsage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBDUnitUsageKeyTyped(evt);
            }
        });

        ckBoxSramadhana.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ckBoxSramadhana.setText("  Sramadhana Fee");

        ckBoxAbsentFee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ckBoxAbsentFee.setText("  Absent Charge");

        BDLblUnits1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BDLblUnits1.setText("Billing Month");

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01-January", "02-February", "03-March", "04-April", "05-May", "06-June", "07-July", "08-August", "09-September", "10-Octomber", "11-November", "12-December" }));

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

        btnBDClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBDClear.setText(" Clear Bill Data");
        btnBDClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBDClearActionPerformed(evt);
            }
        });

        btnBDEnter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBDEnter.setText("Enter Bill");
        btnBDEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBDEnterActionPerformed(evt);
            }
        });

        btnBDEnterAnother.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBDEnterAnother.setText("Another Bill");
        btnBDEnterAnother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBDEnterAnotherActionPerformed(evt);
            }
        });

        BDLblFN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnCDHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_button.png"))); // NOI18N
        btnCDHome.setBorder(null);
        btnCDHome.setBorderPainted(false);
        btnCDHome.setContentAreaFilled(false);
        btnCDHome.setFocusPainted(false);
        btnCDHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDHomeActionPerformed(evt);
            }
        });

        PDlblWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PDlblWarning.setForeground(new java.awt.Color(255, 0, 0));
        PDlblWarning.setText("Please make sure you have entered monthly units correctly.");

        btnCDUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnCDUpdate.setBorder(null);
        btnCDUpdate.setBorderPainted(false);
        btnCDUpdate.setContentAreaFilled(false);
        btnCDUpdate.setFocusPainted(false);
        btnCDUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDUpdateActionPerformed(evt);
            }
        });

        BDLblFname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        BDLblFName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BDLblFName.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCDHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckBoxAbsentFee)
                                    .addComponent(ckBoxSramadhana)))
                            .addComponent(PDlblWarning)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BDLblCFName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCustomerFName)))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(cmbCustomerCID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BDLblFN, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BDLblFname, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BDLblFName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBDClear)
                                .addGap(66, 66, 66)
                                .addComponent(btnBDEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBDEnterAnother, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BDLblUnits)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioUnits)
                                        .addGap(27, 27, 27)
                                        .addComponent(radioMeter)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtBDUnitUsage)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCDUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(113, 113, 113)
                                        .addComponent(CDFLabelMain))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BDLblUnits1)
                                        .addGap(79, 79, 79)
                                        .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCDHome)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CDFLabelMain)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCustomerCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BDLblFN)
                            .addComponent(BDLblFname)
                            .addComponent(BDLblFName)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCDUpdate)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCustomerFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BDLblCFName))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BDLblUnits)
                            .addComponent(txtBDUnitUsage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMeter)
                    .addComponent(radioUnits))
                .addGap(14, 14, 14)
                .addComponent(ckBoxSramadhana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckBoxAbsentFee)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BDLblUnits1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBDEnterAnother)
                    .addComponent(btnBDEnter)
                    .addComponent(btnBDClear))
                .addGap(55, 55, 55)
                .addComponent(PDlblWarning)
                .addGap(25, 25, 25))
        );

        radioMeter.getAccessibleContext().setAccessibleParent(radioMeter);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBDEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBDEnterActionPerformed

        String errorMessage = null;
        try {
            errorMessage = ValidateData();
        } catch (Exception ex) {
            Logger.getLogger(EnterBillData.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(0 < errorMessage.length())
            JOptionPaneCustom.errorBox(errorMessage, "Bill Data Insertion");
        else
            try {
                whenEnterButtonClicked();
        } catch (Exception ex) {
            Logger.getLogger(EnterBillData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBDEnterActionPerformed

    private void whenEnterButtonClicked() throws Exception{
    
        BillData billData=new BillData();
        
        //billData.setNic(cmbCustomerCID.getSelectedItem().toString());
        billData.setCid(Validations.getCorrectCID(cmbCustomerCID.getSelectedItem().toString()));
        
        if(radioUnits.isSelected())
        {
            billData.setMonthlyUsageUnit(Integer.parseInt(txtBDUnitUsage.getText()));
            billData.setNewMeter(0);
        }
        if(radioMeter.isSelected())
        {
            billData.setNewMeter(Integer.parseInt(txtBDUnitUsage.getText()));
            billData.setMonthlyUsageUnit(0);
        }
        if(ckBoxSramadhana.isSelected())
            billData.setSramadhana(1);
        else
            billData.setSramadhana(0);
        
        if(ckBoxAbsentFee.isSelected())
            billData.setAbsentCharge(1);
        else
            billData.setAbsentCharge(0);
        
        billData.setMonth(cmbYear.getSelectedItem().toString()+cmbMonth.getSelectedItem().toString().split("-")[0]);
        
        if(dataUpdate && !dataInserted)
        {
            UpdateBillData(billData);
        }
        else if(!dataInserted)
        {
            InsertBillData(billData);
        }          
    }
    
    private void UpdateBillData(BillData billData) throws Exception{
        boolean billDataUpdated = false;
        boolean MonthlyBillDetailsUpdated = false;
        
        BillDataProcessor BillDataProcessor=new BillDataProcessor();
        
        BillData oldBillData =  BillDataProcessor.getLatestMBIdFromCID(billData.getCid());
        billData.setMbid(oldBillData.getMbid());
        billData.setMonth(oldBillData.getMonth());

        if(BillDataProcessor.updateBillData(billData))
        {
            java.util.logging.Logger.getLogger(EnterBillData.class.getName()).log(java.util.logging.Level.SEVERE, null, billData.getMbid()+": Successfully data updated");
            billDataUpdated =true;
        }
        else
        {
            billDataUpdated =false;
            JOptionPaneCustom.errorBox("Bill data update error in initial bill data update", "Bill Data update");
        }
        BillDataProcessor billDataProcessor=new BillDataProcessor();
        
        try {
            if(billDataUpdated)
            {
                if(!billDataProcessor.updateMonthlyBillDetails(billData))
                    MonthlyBillDetailsUpdated =false;   
                else {
                    java.util.logging.Logger.getLogger(EnterBillData.class.getName()).log(java.util.logging.Level.SEVERE, null, billData.getMbid()+": with MonthlyBillDetails successfully data updated");
                    MonthlyBillDetailsUpdated =true;
                }
            }
            else
            {
                JOptionPaneCustom.errorBox("Monthly Bill Detail can't be proceed since initial bill data update failed", "Monthly Bill Details update");
                java.util.logging.Logger.getLogger(EnterBillData.class.getName()).log(java.util.logging.Level.SEVERE, null, "Monthly Bill Detail cann't be proceed since initial bill data update failed.");
            }
            
            } catch (Exception ex) {
            Logger.getLogger(EnterBillData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPaneCustom.errorBox("Monthly Bill Details update error: " +ex.getMessage(), "Monthly Bill Details update");
        }
        //For return status of the update
        if(MonthlyBillDetailsUpdated && billDataUpdated)
        {
            JOptionPaneCustom.infoBox("Bill data updated successfully", "Bill Data update");
            getLogger.getLog().debug("Bill data updated successfully for id: "+billDataProcessor.getBillId(billData.getCid(),billData.getMonth().substring(0, 4),billData.getMonth().substring(4, 6)));
            dataUpdate = false;
            dataInserted =true;
            ClearComponents();
        }   
        else if(billDataUpdated && !MonthlyBillDetailsUpdated)
        {
            JOptionPaneCustom.errorBox("Error in MonthlyBillDetails updating", "MonthlyBillDetails Data update");
            getLogger.getLog().debug("Error in MonthlyBillDetails updating in bill data id: "+billDataProcessor.getBillId(billData.getCid(),billData.getMonth().substring(0, 4),billData.getMonth().substring(4, 6)));
            
            BillDataProcessor.updateBillData(oldBillData);
            getLogger.getLog().debug("Bill data reverted due to Monthly Bill Details insertion failed, bill data id: "+oldBillData.getMbid());
        }
        else
        {
            JOptionPaneCustom.errorBox("Error in all bill data updating", "Bill Data update");
        }
    }
    
    private String ValidateMeterReading() throws Exception{
    
        CustomerDataProcessor customerDataProcessor=new CustomerDataProcessor();
        int oldMeter = customerDataProcessor.getCurentMeterFromCID(cmbCustomerCID.getSelectedItem().toString());
        if(radioMeter.isSelected())
            if(Integer.parseInt(txtBDUnitUsage.getText()) < oldMeter)
                return "New Meter value should be greater than old meter value. Old meter:"+oldMeter;
            else
                return "";
        return "";
    }
    private String ValidateData() throws Exception{
    
        String errorString = "";

        if(cmbCustomerCID.getItemCount()!=0)
        {
            if(cmbCustomerCID.getSelectedItem().toString().equals("Select CID") || cmbCustomerCID.getSelectedItem().toString().equals(""))
                errorString += "Please enter a correct Customer Id <br>";
        }
        else
            errorString += "Please enter a correct Customer Id <br>";
        
        if((!radioUnits.isSelected() && !radioMeter.isSelected()) && !dataUpdate)
            errorString += "Please select type of meter units <br>";
        try{
        if(txtBDUnitUsage.getText().length()==0 && !dataUpdate)
            errorString += "Monthly Unit Usage not entered <br>";   
        }catch(Exception ex){
            errorString += "Monthly Unit Usage not entered <br>";
            Logger.getLogger(EnterBillData.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(errorString.length()==0)
            errorString +=ValidateMeterReading();
        
        return errorString;
    }
    
    private void whenUpdateButtonClicked(){
        
        BillDataProcessor billDataProcessor=new BillDataProcessor();
        try {
            BillData billData = billDataProcessor.getLatestMBIdFromCID(Validations.getCorrectCID(cmbCustomerCID.getSelectedItem().toString()));
            
            txtCustomerFName.setText(billData.getCid());
            
            if(billData.getMonthlyUsageUnit()==0)
            {
                txtBDUnitUsage.setText(String.valueOf(billData.getNewMeter()) );
                radioMeter.setSelected(true);
            }
            else if(billData.getNewMeter()==0)
            {
                txtBDUnitUsage.setText(String.valueOf(billData.getMonthlyUsageUnit()));
                radioUnits.setSelected(true);
            }
                
            if(billData.isSramadhana()==1)
                ckBoxSramadhana.setSelected(true);
            
            if(billData.isAbsentCharge()==1)
                ckBoxAbsentFee.setSelected(true);            
            
            for(int i=0;i<cmbMonth.getItemCount();i++) 
            {
                if(cmbMonth.getItemAt(i).contains(billData.getMbid().substring(4, 6)))
                    cmbMonth.setSelectedItem(cmbMonth.getItemAt(i));
            }    
            
            for(int i=0;i<cmbYear.getItemCount();i++) 
            {
                if(cmbYear.getItemAt(i).contains(billData.getMbid().substring(0, 4)))
                    cmbYear.setSelectedItem(cmbYear.getItemAt(i));
            }            
            
            btnBDEnter.setText("Update BillData");
            btnBDClear.setText("Delete BillData");
            dataInserted=false;
            dataUpdate = true;
            
            this.currentBillData = billData;
            
        } catch (Exception ex) {
            JOptionPaneCustom.errorBox("CID not found", "Customer Data Updating");
            Logger.getLogger(EnterCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
    }    
    
    private void InsertBillData(BillData billData) throws Exception{
        boolean billDataEntered = false;
        boolean MonthlyBillDetailsEntered = false;

        BillDataProcessor BillDataProcessor=new BillDataProcessor();
        if(BillDataProcessor.putBillData(billData))
        {
            java.util.logging.Logger.getLogger(EnterBillData.class.getName()).log(java.util.logging.Level.SEVERE, null, billData.getMbid()+": Successfully data inserted");
            billDataEntered =true;
        }
        else
        {
            billDataEntered =false;
            JOptionPaneCustom.errorBox("Bill data insertion error :"+billData.getMbid(), "Bill Data Insertion");
            Logger.getLogger(EnterBillData.class.getName()).log(Level.SEVERE, null, "Bill data insertion error :"+billData.getMbid());
        }
        BillDataProcessor billDataProcessor=new BillDataProcessor();
        
        try {
            if(!billDataProcessor.setMonthlyBillDetails(billData))
                MonthlyBillDetailsEntered =false;   
            else {
                java.util.logging.Logger.getLogger(EnterBillData.class.getName()).log(java.util.logging.Level.SEVERE, null, billData.getMbid()+": with MonthlyBillDetails successfully data inserted");
                MonthlyBillDetailsEntered =true;
            }
                } catch (Exception ex) {
            Logger.getLogger(EnterBillData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPaneCustom.errorBox("Bill data inserted error: " +ex.getMessage(), "Bill Data Insertion");
        }
        if(MonthlyBillDetailsEntered && billDataEntered)
        {
            JOptionPaneCustom.infoBox("Bill data inserted successfully", "Bill Data Insertion");
            getLogger.getLog().debug("Bill data inserted successfully for id: "+billDataProcessor.getBillId(billData.getCid(),billData.getMonth().substring(0, 4),billData.getMonth().substring(4, 6)));
            dataInserted = true;
            ClearComponents();
        }   
        else if(billDataEntered && !MonthlyBillDetailsEntered)
        {
            JOptionPaneCustom.errorBox("Error in MonthlyBillDetails Entering", "MonthlyBillDetails Data Insertion");
            getLogger.getLog().debug("Error in MonthlyBillDetails Entering in bill data id: "+billDataProcessor.getBillId(billData.getCid(),billData.getMonth().substring(0, 4),billData.getMonth().substring(4, 6)));
            
            billDataProcessor.DeleteMonthlyBillDBByMBId(billDataProcessor.getBillId(billData.getCid(),billData.getMonth().substring(0, 4),billData.getMonth().substring(4, 6)));
            getLogger.getLog().debug("MonthlyBillDetails deleted, bill data id: "+billDataProcessor.getBillId(billData.getCid(),billData.getMonth().substring(0, 4),billData.getMonth().substring(4, 6)));
        }
        else
        {
            JOptionPaneCustom.errorBox("Error in bill data Entering", "Bill Data Insertion");
        }
    }
    private void ClearComponents(){
        txtCustomerFName.setText("");
        txtBDUnitUsage.setText("");
        if(radioUnits.isSelected() || radioMeter.isSelected())
            buttonGroup1.clearSelection();
        ckBoxSramadhana.setSelected(false);
        ckBoxAbsentFee.setSelected(false);
        cmbMonth.setSelectedIndex(0);
        cmbYear.setSelectedIndex(0);    
    }
    
    private void btnBDClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBDClearActionPerformed

        BillDataProcessor billDataProcessor=new BillDataProcessor();
         
        if(dataUpdate && !dataInserted)
        {
            if(JOptionPane.showConfirmDialog(this,"Do you want to delete this bill data ?")==JOptionPane.YES_OPTION)
            {
            //delete bill data
                if(currentBillData.getMbid() != null)
                    try {
                        if(billDataProcessor.deleteBillData(currentBillData))
                        {
                            JOptionPaneCustom.infoBox("Bill :"+currentBillData.getMbid()+" was deleted", "Bill Data deletion");
                            currentBillData = null;
                            dataInserted = true;
                            ClearComponents();
                            dataUpdate=false;
                            btnBDEnter.setText("Enter BillData");
                            btnBDClear.setText("Clear Data");
                            cmbCustomerCID.enable();
                        }
                        else
                            JOptionPaneCustom.errorBox("Bill data deletion error", "Bill Data deletion");
                } catch (Exception ex) {
                Logger.getLogger(EnterPayment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(!dataInserted)
            ClearComponents(); 
        else
            JOptionPaneCustom.errorBox("Current Insertion Not Completed", "Bill Data deletion");   
        
    }//GEN-LAST:event_btnBDClearActionPerformed

    private void txtCustomerFNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerFNameKeyTyped

        //FillGUIComponents.setNumberOnlyTextBox(evt);
        if(txtCustomerFName.getText().length()>=2)
        {
            FillGUIComponents fillGUIComponents=new FillGUIComponents();
            try {
                fillGUIComponents.LoadCustomerData(customerHash,txtCustomerFName.getText(), cmbCustomerCID);
            } catch (Exception ex) {
                Logger.getLogger(EnterBillData.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
    }//GEN-LAST:event_txtCustomerFNameKeyTyped

    private void txtBDUnitUsageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBDUnitUsageKeyTyped
        // TODO add your handling code here:
        FillGUIComponents.setNumberOnlyTextBox(evt);
    }//GEN-LAST:event_txtBDUnitUsageKeyTyped

    private void btnCDHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDHomeActionPerformed
        // TODO add your handling code here:
        MainPage mainPage = null;
        try {
            mainPage = new MainPage();
        } catch (IOException ex) {
            Logger.getLogger(EnterBillData.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainPage.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCDHomeActionPerformed

    private void cmbCustomerCIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCustomerCIDItemStateChanged
        FillGUIComponents fillGUIComponents=new FillGUIComponents();
        try{    
            BDLblFName.setText("");
            fillGUIComponents.LoadFName(customerHash ,cmbCustomerCID.getSelectedItem().toString(),BDLblFName);
        }catch(Exception ex){ex.toString();}
    }//GEN-LAST:event_cmbCustomerCIDItemStateChanged

    private void btnBDEnterAnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBDEnterAnotherActionPerformed
        // TODO add your handling code here:
        if(dataInserted)
        {
            ClearComponents();
            dataInserted = false;
        }
        else
            JOptionPaneCustom.errorBox("Current insertion not completed", "Bill Data Insertion");
            
    }//GEN-LAST:event_btnBDEnterAnotherActionPerformed

    private void btnCDUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDUpdateActionPerformed
        if (!dataUpdate && !dataInserted)
            dataUpdate = true;
        String errorMessage = null;
        try {
            errorMessage = ValidateData();
        } catch (Exception ex) {
            Logger.getLogger(EnterBillData.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(0 < errorMessage.length())
            JOptionPaneCustom.errorBox(errorMessage, "Bill Data update");
        else
            whenUpdateButtonClicked();
    }//GEN-LAST:event_btnCDUpdateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        FillGUIComponents fillGUIComponents=new FillGUIComponents();
        fillGUIComponents.setCMBDates(cmbYear, cmbMonth);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterBillData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new EnterBillData().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(EnterBillData.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BDLblCFName;
    private javax.swing.JLabel BDLblFN;
    private javax.swing.JLabel BDLblFName;
    private javax.swing.JLabel BDLblFname;
    private javax.swing.JLabel BDLblUnits;
    private javax.swing.JLabel BDLblUnits1;
    private javax.swing.JLabel CDFLabelMain;
    private javax.swing.JLabel PDlblWarning;
    private javax.swing.JButton btnBDClear;
    private javax.swing.JButton btnBDEnter;
    private javax.swing.JButton btnBDEnterAnother;
    private javax.swing.JButton btnCDHome;
    private javax.swing.JButton btnCDUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ckBoxAbsentFee;
    private javax.swing.JCheckBox ckBoxSramadhana;
    private javax.swing.JComboBox<String> cmbCustomerCID;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JRadioButton radioMeter;
    private javax.swing.JRadioButton radioUnits;
    private javax.swing.JTextField txtBDUnitUsage;
    private javax.swing.JTextField txtCustomerFName;
    // End of variables declaration//GEN-END:variables
}
