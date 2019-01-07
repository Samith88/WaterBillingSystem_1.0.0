/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author UDISSSA1
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainPage() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCustomerD = new javax.swing.JButton();
        btnGroupD = new javax.swing.JButton();
        btnBillD = new javax.swing.JButton();
        btnPaymentD = new javax.swing.JButton();
        btnInvoice = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCustomerD.setText("Customer Details");
        btnCustomerD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerDActionPerformed(evt);
            }
        });

        btnGroupD.setText("Group Data");
        btnGroupD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroupDActionPerformed(evt);
            }
        });

        btnBillD.setText("Bill Data");
        btnBillD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillDActionPerformed(evt);
            }
        });

        btnPaymentD.setText("Payments Data");
        btnPaymentD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentDActionPerformed(evt);
            }
        });

        btnInvoice.setText("GenearateInvoces");
        btnInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCustomerD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGroupD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBillD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPaymentD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInvoice, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(btnCustomerD)
                .addGap(36, 36, 36)
                .addComponent(btnGroupD)
                .addGap(26, 26, 26)
                .addComponent(btnBillD)
                .addGap(29, 29, 29)
                .addComponent(btnPaymentD)
                .addGap(35, 35, 35)
                .addComponent(btnInvoice)
                .addGap(115, 115, 115))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBillDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillDActionPerformed
        // TODO add your handling code here:
        EnterBillData enterBillData = null;
        try {
            enterBillData = new EnterBillData();
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        enterBillData.setVisible(true); 
        this.setVisible(false);
        this.dispose();          
    }//GEN-LAST:event_btnBillDActionPerformed

    private void btnCustomerDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerDActionPerformed
        // TODO add your handling code here:
        EnterCustomer enterCustomer=new EnterCustomer();
        enterCustomer.setVisible(true);        
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCustomerDActionPerformed

    private void btnGroupDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroupDActionPerformed
        // TODO add your handling code here:
        EnterGroup enterGroup=new EnterGroup();
        enterGroup.setVisible(true); 
        this.setVisible(false);
        this.dispose();        
    }//GEN-LAST:event_btnGroupDActionPerformed

    private void btnPaymentDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentDActionPerformed
        // TODO add your handling code here:
        EnterPayment enterPayment=new EnterPayment();
        enterPayment.setVisible(true); 
        this.setVisible(false);
        this.dispose();         
    }//GEN-LAST:event_btnPaymentDActionPerformed

    private void btnInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoiceActionPerformed
        // TODO add your handling code here:
        GenerateInvoice generateInvoice=new GenerateInvoice();
        generateInvoice.setVisible(true); 
        this.setVisible(false);
        this.dispose();               
        
    }//GEN-LAST:event_btnInvoiceActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBillD;
    private javax.swing.JButton btnCustomerD;
    private javax.swing.JButton btnGroupD;
    private javax.swing.JButton btnInvoice;
    private javax.swing.JButton btnPaymentD;
    // End of variables declaration//GEN-END:variables
}