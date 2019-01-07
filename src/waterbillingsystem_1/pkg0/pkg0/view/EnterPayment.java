/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.view;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import waterbillingsystem_1.pkg0.pkg0.DateDetails;
import waterbillingsystem_1.pkg0.pkg0.JOptionPaneCustom;
import waterbillingsystem_1.pkg0.pkg0.base.Payment;
import waterbillingsystem_1.pkg0.pkg0.controller.CustomerDataProcessor;
import waterbillingsystem_1.pkg0.pkg0.controller.FillGUIComponents;
import waterbillingsystem_1.pkg0.pkg0.controller.PaymentProcessor;

/**
 *
 * @author UDISSSA1
 */
public class EnterPayment extends javax.swing.JFrame {

    /**
     * Creates new form EnterPayment
     */
    HashMap<String, String> customerHash = new HashMap<>();
    public EnterPayment() throws Exception {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);     
        CustomerDataProcessor customerDataProcessor=new CustomerDataProcessor();
        customerHash = customerDataProcessor.getCustomerCIDNNIC();        
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
        cmdNIC = new javax.swing.JComboBox<>();
        txtPaymentNIC = new javax.swing.JTextField();
        PDLblCID = new javax.swing.JLabel();
        txtPaymentCID = new javax.swing.JTextField();
        txtPaymentAmount = new javax.swing.JTextField();
        PDLbAmount = new javax.swing.JLabel();
        PDLbMonth = new javax.swing.JLabel();
        cmbMonth = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();
        btnPDClear = new javax.swing.JButton();
        btnPDEnter = new javax.swing.JButton();
        btnPDEnterAnother = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PDLabelMain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PDLabelMain.setText("Payment Data Form");

        PDLblNIC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PDLblNIC.setText("Customer NIC");

        cmdNIC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select NIC" }));
        cmdNIC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmdNICItemStateChanged(evt);
            }
        });

        txtPaymentNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaymentNICKeyTyped(evt);
            }
        });

        PDLblCID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PDLblCID.setText("Customer Id");

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
        btnPDClear.setText(" Clear Bill Data");
        btnPDClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDClearActionPerformed(evt);
            }
        });

        btnPDEnter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPDEnter.setText("Enter Bill");
        btnPDEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDEnterActionPerformed(evt);
            }
        });

        btnPDEnterAnother.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPDEnterAnother.setText("Another Bill");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PDLbMonth)
                        .addGap(79, 79, 79)
                        .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnPDClear)
                                .addGap(66, 66, 66)
                                .addComponent(btnPDEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnPDEnterAnother, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(PDLabelMain)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PDLblNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PDLblCID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PDLbAmount))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPaymentAmount)
                                    .addComponent(txtPaymentCID)
                                    .addComponent(txtPaymentNIC)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmdNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(PDLabelMain)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PDLblNIC)
                    .addComponent(txtPaymentNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(cmdNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PDLblCID)
                    .addComponent(txtPaymentCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PDLbAmount)
                    .addComponent(txtPaymentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PDLbMonth)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPDClear)
                    .addComponent(btnPDEnterAnother)
                    .addComponent(btnPDEnter))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPDEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDEnterActionPerformed
        // TODO add your handling code here:
        Payment payment=new Payment();
        payment.setCid(txtPaymentCID.getText());
        payment.setCid(txtPaymentNIC.getText());
        payment.setAmount(Double.parseDouble(txtPaymentAmount.getText()));
        payment.setDate(DateDetails.getDateDate());
        
        PaymentProcessor PaymentProcessor=new PaymentProcessor();
        try {
            PaymentProcessor.putPayment(payment);
            JOptionPaneCustom.infoBox("Payment data inserted successfully", "Payment Data Insertion");
            Logger.getLogger(EnterPayment.class.getName()).log(Level.SEVERE, null, "Payment data inserted successfully :"+payment.getPyid() );
        } catch (Exception ex) {
            JOptionPaneCustom.errorBox("Payment data inserted error :"+ex.getMessage(), "Payment Data Insertion");
            Logger.getLogger(EnterPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPDEnterActionPerformed

    private void btnPDClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDClearActionPerformed
        // TODO add your handling code here:
        txtPaymentNIC.setText("");
        txtPaymentCID.setText("");
        txtPaymentAmount.setText("");
        cmbMonth.setSelectedIndex(0);
        cmbYear.setSelectedIndex(0);
        cmdNIC.setSelectedItem("Select NIC");
    }//GEN-LAST:event_btnPDClearActionPerformed

    private void txtPaymentNICKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentNICKeyTyped

        FillGUIComponents.setNumberOnlyTextBox(evt);
        FillGUIComponents fillGUIComponents=new FillGUIComponents();
        try {
            fillGUIComponents.LoadCustomerData(customerHash,txtPaymentNIC.getText(), cmdNIC);
        } catch (Exception ex) {
            Logger.getLogger(EnterBillData.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_txtPaymentNICKeyTyped

    private void txtPaymentCIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentCIDKeyTyped
        FillGUIComponents.setNumberOnlyTextBox(evt);
    }//GEN-LAST:event_txtPaymentCIDKeyTyped

    private void txtPaymentAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentAmountKeyTyped
        FillGUIComponents.setNumberOnlyTextBox(evt);
    }//GEN-LAST:event_txtPaymentAmountKeyTyped

    private void cmdNICItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmdNICItemStateChanged
        // TODO add your handling code here:
        try{
            if(cmdNIC.getSelectedItem().toString().length()== 10)
            txtPaymentCID.setText(customerHash.get(cmdNIC.getSelectedItem().toString()));    
        }catch(Exception ex){ex.toString();}          
    }//GEN-LAST:event_cmdNICItemStateChanged

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
    private javax.swing.JLabel PDLblCID;
    private javax.swing.JLabel PDLblNIC;
    private javax.swing.JButton btnPDClear;
    private javax.swing.JButton btnPDEnter;
    private javax.swing.JButton btnPDEnterAnother;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JComboBox<String> cmdNIC;
    private javax.swing.JTextField txtPaymentAmount;
    private javax.swing.JTextField txtPaymentCID;
    private javax.swing.JTextField txtPaymentNIC;
    // End of variables declaration//GEN-END:variables
}
