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
import waterbillingsystem_1.pkg0.pkg0.DateDetails;
import waterbillingsystem_1.pkg0.pkg0.JOptionPaneCustom;
import waterbillingsystem_1.pkg0.pkg0.base.Payment;
import waterbillingsystem_1.pkg0.pkg0.controller.CustomerDataProcessor;
import waterbillingsystem_1.pkg0.pkg0.controller.FillGUIComponents;
import waterbillingsystem_1.pkg0.pkg0.controller.PaymentProcessor;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class EnterPayment extends javax.swing.JFrame {

    /**
     * Creates new form EnterPayment
     */
    HashMap<String, String> customerHash = new HashMap<>();
    boolean dataInserted;
    boolean dataUpdate;  
    private String pyid="";
    Payment currentPayment=new Payment();    
    
    public EnterPayment() throws Exception {
        
        File imageFile = new File("images\\page.png");
        BufferedImage myImage = ImageIO.read(imageFile);
        this.setContentPane(new ImagePanel(myImage));        
        initComponents();
        ImageIcon img = new ImageIcon("images\\WaterDrop.png");
        this.setIconImage(img.getImage());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);     
        CustomerDataProcessor customerDataProcessor=new CustomerDataProcessor();
        customerHash = customerDataProcessor.getCustomerCIDNName();        
        dataInserted =false;
        dataUpdate=false;
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PDLabelMain = new javax.swing.JLabel();
        PDLblNIC = new javax.swing.JLabel();
        cmdCID = new javax.swing.JComboBox<>();
        txtPaymentCID = new javax.swing.JTextField();
        txtPaymentAmount = new javax.swing.JTextField();
        PDLbAmount = new javax.swing.JLabel();
        PDLbMonth = new javax.swing.JLabel();
        cmbMonth = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();
        btnPDClear = new javax.swing.JButton();
        btnPDEnter = new javax.swing.JButton();
        btnPDEnterAnother = new javax.swing.JButton();
        btnPDUpdate = new javax.swing.JButton();
        btnCDHome = new javax.swing.JButton();
        PDLblFname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pananwala Water Billing System");
        setResizable(false);

        PDLabelMain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PDLabelMain.setText("Payment Data Form");

        PDLblNIC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PDLblNIC.setText("Customer CID");

        cmdCID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select CID" }));
        cmdCID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmdCIDItemStateChanged(evt);
            }
        });

        txtPaymentCID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaymentCIDKeyTyped(evt);
            }
        });

        txtPaymentAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaymentAmountKeyTyped(evt);
            }
        });

        PDLbAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PDLbAmount.setText("Payment Amount");

        PDLbMonth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PDLbMonth.setText("Billing Month");

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01-January", "02-February", "03-March", "04-April", "05-May", "06-June", "07-July", "08-August", "09-September", "10-Octomber", "11-November", "12-December" }));

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

        btnPDClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPDClear.setText(" Clear Data");
        btnPDClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDClearActionPerformed(evt);
            }
        });

        btnPDEnter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPDEnter.setText("Enter Payment");
        btnPDEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDEnterActionPerformed(evt);
            }
        });

        btnPDEnterAnother.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPDEnterAnother.setText("Another Payment");
        btnPDEnterAnother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDEnterAnotherActionPerformed(evt);
            }
        });

        btnPDUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnPDUpdate.setBorder(null);
        btnPDUpdate.setBorderPainted(false);
        btnPDUpdate.setContentAreaFilled(false);
        btnPDUpdate.setFocusPainted(false);
        btnPDUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDUpdateActionPerformed(evt);
            }
        });

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

        PDLblFname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PDLblFname.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPDUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCDHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(PDLabelMain)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PDLblNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PDLbAmount)
                                    .addComponent(btnPDClear))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPDEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                        .addComponent(btnPDEnterAnother))
                                    .addComponent(txtPaymentCID)
                                    .addComponent(txtPaymentAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmdCID, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PDLblFname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PDLbMonth)
                                .addGap(79, 79, 79)
                                .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 79, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnCDHome)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPDUpdate)
                            .addComponent(PDLabelMain))
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PDLblNIC)
                    .addComponent(txtPaymentCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PDLblFname))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PDLbMonth)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PDLbAmount)
                    .addComponent(txtPaymentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPDClear)
                    .addComponent(btnPDEnter)
                    .addComponent(btnPDEnterAnother))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPDEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDEnterActionPerformed
        // TODO add your handling code here:
        String errorMessage = validateData();
        if(0 < validateData().length())
            JOptionPaneCustom.errorBox(errorMessage, "Bill Data Insertion");
        else
            try {
                whenEnterDataButtonClicked();
        } catch (Exception ex) {
            Logger.getLogger(EnterPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPDEnterActionPerformed

    private void whenEnterDataButtonClicked() throws Exception{
        Payment payment=new Payment();
        CustomerDataProcessor customerDataProcessor=new CustomerDataProcessor();
        payment.setCid(customerDataProcessor.getCorrectCID(cmdCID.getSelectedItem().toString()));
        payment.setAmount(Double.parseDouble(txtPaymentAmount.getText()));
        payment.setDate(DateDetails.getDateYear()+"/"+DateDetails.getDateMonth()+"/"+DateDetails.getDateDate());
        
        if(dataUpdate && !dataInserted)
        {
            payment.setPyid(pyid);            
            UpdatePaymentsData(payment);
        }
        else if(!dataInserted)
        {
            InsertPaymentsData(payment);
        }  
        
    }
    private void InsertPaymentsData(Payment payment){
 
        PaymentProcessor PaymentProcessor=new PaymentProcessor();
        try {
            PaymentProcessor.putPayment(payment);
            JOptionPaneCustom.infoBox("Payment data inserted successfully", "Payment Data Insertion");            
            Logger.getLogger(EnterPayment.class.getName()).log(Level.SEVERE, null, "Payment data inserted successfully :"+payment.getPyid() );
            dataInserted = true;   
            ClearComponents();
        } catch (Exception ex) {
            JOptionPaneCustom.errorBox("Payment data inserted error :"+ex.getMessage(), "Payment Data Insertion");
            Logger.getLogger(EnterPayment.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
    
    private void UpdatePaymentsData(Payment payment) throws Exception{
        
        PaymentProcessor PaymentProcessor=new PaymentProcessor();
        if(PaymentProcessor.updatePeymentCustomer(payment))
        {
            JOptionPaneCustom.infoBox("Payment data updated successfully", "Payment Data updating");
            getLogger.getLog().debug("Payment data inserted :"+payment.getPyid());
            dataInserted = true;
            ClearComponents();  
            dataUpdate=false;
            btnPDEnter.setText("Enter Payment");
            cmdCID.enable();
            txtPaymentCID.enable();
        }
        else 
            JOptionPaneCustom.errorBox("Payment data update failed", "Payment Data Insertion");          
    }
    
    private String validateData(){
    
        String errorMessage = "";
        if(cmdCID.getSelectedItem().toString().equals("Select CID")) {
            errorMessage += "Please enter a correct Customer Id ";
        }
        
        if(txtPaymentAmount.getText().length()==0 && !dataUpdate)
            errorMessage += "Please enter a valid amount ";
 
        return errorMessage;
    }
    
    private void btnPDClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDClearActionPerformed
        // TODO add your handling code here:
        PaymentProcessor paymentProcessor=new PaymentProcessor();
        if(dataUpdate && !dataInserted)
        {
            if(JOptionPane.showConfirmDialog(this,"Do you want to delete this bill data ?")==JOptionPane.YES_OPTION)
            {
            //delete payment
            if(currentPayment.getPyid() != null)
                try {
                    if(paymentProcessor.deletePayment(currentPayment))
                    {
                        JOptionPaneCustom.infoBox("Payment :"+currentPayment.getPyid()+" was deleted", "Payment Data deletion");
                        currentPayment = null;
                        dataInserted = true;
                        ClearComponents();
                        dataUpdate=false;
                        btnPDEnter.setText("Enter Payment");
                        btnPDClear.setText("Clear Data");
                        cmdCID.enable();
                        txtPaymentCID.enable();
                    }
                    else
                        JOptionPaneCustom.errorBox("Error in payment data deletion", "Payment Data deletion");
            } catch (Exception ex) {
                Logger.getLogger(EnterPayment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(!dataInserted)
        {
            ClearComponents();
        }         
    }//GEN-LAST:event_btnPDClearActionPerformed

    private void ClearComponents(){
        txtPaymentCID.setText("");
        txtPaymentCID.setText("");
        txtPaymentAmount.setText("");
        cmbMonth.setSelectedIndex(0);
        cmbYear.setSelectedIndex(0);
        cmdCID.setSelectedItem("Select CID");        
    }
    private void txtPaymentCIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentCIDKeyTyped

        FillGUIComponents.setNumberOnlyTextBox(evt);
        FillGUIComponents fillGUIComponents=new FillGUIComponents();
        try {
            fillGUIComponents.LoadCustomerData(customerHash,txtPaymentCID.getText(), cmdCID);
        } catch (Exception ex) {
            Logger.getLogger(EnterBillData.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_txtPaymentCIDKeyTyped

    private void txtPaymentAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentAmountKeyTyped
        FillGUIComponents.setNumberOnlyTextBox(evt);
    }//GEN-LAST:event_txtPaymentAmountKeyTyped

    private void cmdCIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmdCIDItemStateChanged
        // TODO add your handling code here:
        try{
            
            PDLblFname.setText(customerHash.get(cmdCID.getSelectedItem().toString()));
        }catch(Exception ex){ex.toString();}          
    }//GEN-LAST:event_cmdCIDItemStateChanged

    private void btnPDEnterAnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDEnterAnotherActionPerformed
        if(dataInserted)
        {
            ClearComponents();
            dataInserted = false;
        }
        else
            JOptionPaneCustom.errorBox("Current Insertion not completed", "Payment Data Insertion");
        
    }//GEN-LAST:event_btnPDEnterAnotherActionPerformed

    private void btnPDUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDUpdateActionPerformed
        // TODO add your handling code here:
        if (!dataUpdate)
            dataUpdate = true;
        
        String errorMessage = validateData();
        if(0 < errorMessage.length())
            JOptionPaneCustom.errorBox(errorMessage, "Payment Data Insertion");   
        else
            whenUpdateButtonClicked();
    }//GEN-LAST:event_btnPDUpdateActionPerformed

    private void whenUpdateButtonClicked(){
        
        PaymentProcessor paymentProcessor=new PaymentProcessor();
        try {
            CustomerDataProcessor customerDataProcessor=new CustomerDataProcessor();
            Payment payment = paymentProcessor.getCustomerPaymentByCID(customerDataProcessor.getCorrectCID(txtPaymentCID.getText()));
            
            for(int i=0;i<cmbMonth.getItemCount();i++) 
            {
                if(cmbMonth.getItemAt(i).contains(payment.getPyid().substring(4, 6)))
                    cmbMonth.setSelectedItem(cmbMonth.getItemAt(i));
            }    
            
            for(int i=0;i<cmbYear.getItemCount();i++) 
            {
                if(cmbYear.getItemAt(i).contains(payment.getPyid().substring(0, 4)))
                    cmbYear.setSelectedItem(cmbYear.getItemAt(i));
            }        
            txtPaymentAmount.setText(String.valueOf(payment.getAmount()) );
            
            cmdCID.disable();
            txtPaymentCID.disable();
            
            btnPDEnter.setText("Update Payment");
            btnPDClear.setText("Delete Payment");
            dataInserted=false;
            dataUpdate = true;
            
            pyid = payment.getPyid();
            this.currentPayment = payment;
            
        } catch (Exception ex) {
            JOptionPaneCustom.errorBox("NIC not found", "Payment Data Updating");
            Logger.getLogger(EnterCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
    }
    
    private void btnCDHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDHomeActionPerformed
        // TODO add your handling code here:
        MainPage mainPage = null;
        try {
            mainPage = new MainPage();
        } catch (IOException ex) {
            Logger.getLogger(EnterPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainPage.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCDHomeActionPerformed

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
            java.util.logging.Logger.getLogger(EnterPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new EnterPayment().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(EnterPayment.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PDLabelMain;
    private javax.swing.JLabel PDLbAmount;
    private javax.swing.JLabel PDLbMonth;
    private javax.swing.JLabel PDLblFname;
    private javax.swing.JLabel PDLblNIC;
    private javax.swing.JButton btnCDHome;
    private javax.swing.JButton btnPDClear;
    private javax.swing.JButton btnPDEnter;
    private javax.swing.JButton btnPDEnterAnother;
    private javax.swing.JButton btnPDUpdate;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JComboBox<String> cmdCID;
    private javax.swing.JTextField txtPaymentAmount;
    private javax.swing.JTextField txtPaymentCID;
    // End of variables declaration//GEN-END:variables
}
