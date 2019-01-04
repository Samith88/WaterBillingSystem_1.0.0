/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import waterbillingsystem_1.pkg0.pkg0.JOptionPaneCustom;
import waterbillingsystem_1.pkg0.pkg0.base.Customer;
import waterbillingsystem_1.pkg0.pkg0.controller.CustomerDataProcessor;
import waterbillingsystem_1.pkg0.pkg0.controller.FillGUIComponents;
import waterbillingsystem_1.pkg0.pkg0.logging.getLogger;

/**
 *
 * @author UDISSSA1
 */
public class EnterCustomer extends javax.swing.JFrame {

    /**
     * Creates new form EnterCustomer
     */
    public EnterCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        CDFLabelMain = new javax.swing.JLabel();
        CDFLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCustomername = new javax.swing.JTextArea();
        CDFLabel3 = new javax.swing.JLabel();
        txtCustomerNIC = new javax.swing.JTextField();
        CDFLabel4 = new javax.swing.JLabel();
        CDFLabel5 = new javax.swing.JLabel();
        txtCustomerAd1 = new javax.swing.JTextField();
        CDFLabel6 = new javax.swing.JLabel();
        CDFLabel7 = new javax.swing.JLabel();
        txtCustomerAd2 = new javax.swing.JTextField();
        txtCustomerAd3 = new javax.swing.JTextField();
        CDFLabel8 = new javax.swing.JLabel();
        txtCustomerNo = new javax.swing.JTextField();
        cmbGroupId = new javax.swing.JComboBox<>();
        btnCDFClear = new javax.swing.JButton();
        btnCDFEnter = new javax.swing.JButton();
        btnCDFEnterAnother = new javax.swing.JButton();
        lblCDFMeterNo = new javax.swing.JLabel();
        txtCustomerMno = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        CDFLabelMain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CDFLabelMain.setText("Customer Details Form");

        CDFLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CDFLabel2.setText("Customer Name");

        txtCustomername.setColumns(20);
        txtCustomername.setRows(5);
        jScrollPane1.setViewportView(txtCustomername);

        CDFLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CDFLabel3.setText("Customer NIC");

        CDFLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CDFLabel4.setText("Customer Group");

        CDFLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CDFLabel5.setText("Customer Address line 1");

        CDFLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CDFLabel6.setText("Customer Address line 2");

        CDFLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CDFLabel7.setText("Customer Address line 3");

        CDFLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CDFLabel8.setText("Customer No");

        cmbGroupId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "group-1", "group-2", "group-3", "group-4" }));

        btnCDFClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCDFClear.setText(" Clear Data");

        btnCDFEnter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCDFEnter.setText("Enter Customer");
        btnCDFEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDFEnterActionPerformed(evt);
            }
        });

        btnCDFEnterAnother.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCDFEnterAnother.setText("Another Customer");

        lblCDFMeterNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCDFMeterNo.setText("Meter No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CDFLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(CDFLabelMain)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCDFMeterNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCustomerMno, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CDFLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(txtCustomerAd3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CDFLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCustomerAd2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CDFLabel4)
                                    .addComponent(CDFLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCustomerNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(cmbGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(CDFLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCustomerAd1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CDFLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnCDFClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCDFEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(btnCDFEnterAnother)))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(CDFLabelMain)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CDFLabel2)
                        .addGap(63, 63, 63)
                        .addComponent(CDFLabel3)
                        .addGap(19, 19, 19)
                        .addComponent(CDFLabel4)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCustomerNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCustomerAd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CDFLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CDFLabel6)
                    .addComponent(txtCustomerAd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CDFLabel7)
                    .addComponent(txtCustomerAd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CDFLabel8)
                    .addComponent(txtCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCDFMeterNo)
                    .addComponent(txtCustomerMno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCDFClear)
                    .addComponent(btnCDFEnter)
                    .addComponent(btnCDFEnterAnother))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCDFEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDFEnterActionPerformed
        // TODO add your handling code here:
        Customer customer=new Customer();
        
        customer.setCid(Integer.parseInt(txtCustomerNo.getText()) );
        customer.setNic(txtCustomerNIC.getText() );
        customer.setGid(Integer.parseInt(cmbGroupId.getSelectedItem().toString().split("-")[1]));
        customer.setAddress_1(txtCustomerAd1.getText());
        customer.setAddress_2(txtCustomerAd2.getText());
        customer.setAddress_3(txtCustomerAd3.getText());
        customer.setCname(txtCustomername.getText());
        customer.setMeterNo(Integer.parseInt(txtCustomerMno.getText()));
        
        if(CustomerDataProcessor.putCustomer(customer))
        {
            JOptionPaneCustom.infoBox("Customer data inserted successfully", "Bill Data Insertion");
            getLogger.getLog().debug("Customer data inserted :"+customer.getNic());
        }
    }//GEN-LAST:event_btnCDFEnterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            FillGUIComponents fillGUIComponents=new FillGUIComponents();
            // TODO add your handling code here:
            fillGUIComponents.FillcmbGroupId(cmbGroupId);
        } catch (SQLException ex) {
            Logger.getLogger(EnterCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(EnterCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     * @throws java.lang.InstantiationException
     */
    public static void main(String args[]) throws InstantiationException {
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
        } catch (ClassNotFoundException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EnterCustomer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CDFLabel2;
    private javax.swing.JLabel CDFLabel3;
    private javax.swing.JLabel CDFLabel4;
    private javax.swing.JLabel CDFLabel5;
    private javax.swing.JLabel CDFLabel6;
    private javax.swing.JLabel CDFLabel7;
    private javax.swing.JLabel CDFLabel8;
    private javax.swing.JLabel CDFLabelMain;
    private javax.swing.JButton btnCDFClear;
    private javax.swing.JButton btnCDFEnter;
    private javax.swing.JButton btnCDFEnterAnother;
    private javax.swing.JComboBox<String> cmbGroupId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCDFMeterNo;
    private javax.swing.JTextField txtCustomerAd1;
    private javax.swing.JTextField txtCustomerAd2;
    private javax.swing.JTextField txtCustomerAd3;
    private javax.swing.JTextField txtCustomerMno;
    private javax.swing.JTextField txtCustomerNIC;
    private javax.swing.JTextField txtCustomerNo;
    private javax.swing.JTextArea txtCustomername;
    // End of variables declaration//GEN-END:variables
}
