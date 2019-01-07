/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.view;

import javax.swing.JFrame;
import waterbillingsystem_1.pkg0.pkg0.JOptionPaneCustom;
import waterbillingsystem_1.pkg0.pkg0.base.UnitPrice;
import waterbillingsystem_1.pkg0.pkg0.controller.FillGUIComponents;
import waterbillingsystem_1.pkg0.pkg0.controller.UnitPriceProcessor;

/**
 *
 * @author UDISSSA1
 */
public class EnterUnitPrice extends javax.swing.JFrame {

    /**
     * Creates new form EnterUnitPrices
     */
    boolean dataInserted;    
    public EnterUnitPrice() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);   
        dataInserted =false;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UDLabelMain = new javax.swing.JLabel();
        btnGDEnter = new javax.swing.JButton();
        UDLblUPId = new javax.swing.JLabel();
        btnGDEnterAnother = new javax.swing.JButton();
        txUnitPriceId = new javax.swing.JTextField();
        UDLblLower = new javax.swing.JLabel();
        txUnitPriceLower = new javax.swing.JTextField();
        txUnitPriceUpper = new javax.swing.JTextField();
        UDLbLUpper = new javax.swing.JLabel();
        UDLbPrice = new javax.swing.JLabel();
        btnGDClear = new javax.swing.JButton();
        txUnitPrice = new javax.swing.JTextField();
        btnCDHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UDLabelMain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UDLabelMain.setText("Unit Data Form");

        btnGDEnter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGDEnter.setText("Enter Bill");
        btnGDEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGDEnterActionPerformed(evt);
            }
        });

        UDLblUPId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UDLblUPId.setText("Unit Price Id");

        btnGDEnterAnother.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGDEnterAnother.setText("Another Bill");
        btnGDEnterAnother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGDEnterAnotherActionPerformed(evt);
            }
        });

        txUnitPriceId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txUnitPriceIdKeyTyped(evt);
            }
        });

        UDLblLower.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UDLblLower.setText("Unit Lower Value");

        txUnitPriceLower.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txUnitPriceLowerKeyTyped(evt);
            }
        });

        txUnitPriceUpper.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txUnitPriceUpperKeyTyped(evt);
            }
        });

        UDLbLUpper.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UDLbLUpper.setText("Unit Upper Value");

        UDLbPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UDLbPrice.setText("Unit Price");

        btnGDClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGDClear.setText(" Clear Bill Data");
        btnGDClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGDClearActionPerformed(evt);
            }
        });

        txUnitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txUnitPriceKeyTyped(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGDClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(66, 66, 66)
                        .addComponent(btnGDEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnGDEnterAnother, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UDLblUPId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UDLblLower, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UDLbLUpper)
                            .addComponent(UDLbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txUnitPriceUpper)
                            .addComponent(txUnitPriceLower)
                            .addComponent(txUnitPriceId)
                            .addComponent(txUnitPrice))))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(UDLabelMain)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCDHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnCDHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UDLabelMain)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UDLblUPId)
                    .addComponent(txUnitPriceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UDLblLower)
                    .addComponent(txUnitPriceLower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UDLbLUpper)
                    .addComponent(txUnitPriceUpper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UDLbPrice)
                    .addComponent(txUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGDClear)
                    .addComponent(btnGDEnterAnother)
                    .addComponent(btnGDEnter))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGDEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGDEnterActionPerformed

        UnitPrice unitPrice = new UnitPrice();

        unitPrice.setUid(txUnitPriceId.getText());
        unitPrice.setLower(Integer.parseInt(txUnitPriceLower.getText()));
        unitPrice.setUpper(Integer.parseInt(txUnitPriceUpper.getText()));
        unitPrice.setPrice(Double.parseDouble(txUnitPrice.getText()));

        UnitPriceProcessor unitPriceProcessor=new UnitPriceProcessor();
        if(unitPriceProcessor.putUnitPrice(unitPrice))
        {
            JOptionPaneCustom.infoBox("Unit Price insertion successfully", "Unit Price Insertion");
            dataInserted = true;        
        }
        else
            JOptionPaneCustom.errorBox("Unit Price insertion error", "Unit Price Insertion");
    }//GEN-LAST:event_btnGDEnterActionPerformed

    private void btnGDClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGDClearActionPerformed
        ClearComponents();
    }//GEN-LAST:event_btnGDClearActionPerformed

    private void ClearComponents(){
        txUnitPriceId.setText("");
        txUnitPriceLower.setText("");
        txUnitPriceUpper.setText("");
        txUnitPrice.setText("");    
    }
    private void txUnitPriceIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txUnitPriceIdKeyTyped

        FillGUIComponents.setNumberOnlyTextBox(evt);
    }//GEN-LAST:event_txUnitPriceIdKeyTyped

    private void txUnitPriceLowerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txUnitPriceLowerKeyTyped

        FillGUIComponents.setNumberOnlyTextBox(evt);
    }//GEN-LAST:event_txUnitPriceLowerKeyTyped

    private void txUnitPriceUpperKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txUnitPriceUpperKeyTyped

        FillGUIComponents.setNumberOnlyTextBox(evt);
    }//GEN-LAST:event_txUnitPriceUpperKeyTyped

    private void txUnitPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txUnitPriceKeyTyped

        FillGUIComponents.setNumberOnlyTextBox(evt);
    }//GEN-LAST:event_txUnitPriceKeyTyped

    private void btnCDHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDHomeActionPerformed
        // TODO add your handling code here:
        MainPage mainPage=new MainPage();
        mainPage.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCDHomeActionPerformed

    private void btnGDEnterAnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGDEnterAnotherActionPerformed
        if(dataInserted)
        {
            ClearComponents();
            dataInserted = false;
        }
        else
            JOptionPaneCustom.errorBox("Current insertion not completed", "Customer Data Insertion");
        
    }//GEN-LAST:event_btnGDEnterAnotherActionPerformed

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
            java.util.logging.Logger.getLogger(EnterUnitPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EnterUnitPrice().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UDLabelMain;
    private javax.swing.JLabel UDLbLUpper;
    private javax.swing.JLabel UDLbPrice;
    private javax.swing.JLabel UDLblLower;
    private javax.swing.JLabel UDLblUPId;
    private javax.swing.JButton btnCDHome;
    private javax.swing.JButton btnGDClear;
    private javax.swing.JButton btnGDEnter;
    private javax.swing.JButton btnGDEnterAnother;
    private javax.swing.JTextField txUnitPrice;
    private javax.swing.JTextField txUnitPriceId;
    private javax.swing.JTextField txUnitPriceLower;
    private javax.swing.JTextField txUnitPriceUpper;
    // End of variables declaration//GEN-END:variables
}
