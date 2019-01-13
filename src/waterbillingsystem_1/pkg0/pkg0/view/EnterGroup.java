/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import waterbillingsystem_1.pkg0.pkg0.JOptionPaneCustom;
import waterbillingsystem_1.pkg0.pkg0.base.Group;
import waterbillingsystem_1.pkg0.pkg0.controller.FillGUIComponents;
import waterbillingsystem_1.pkg0.pkg0.controller.GroupDataProcessor;

/**
 *
 * @author UDISSSA1
 */
public class EnterGroup extends javax.swing.JFrame {

    /**
     * Creates new form EnterGroup
     */
    boolean dataInserted;
    boolean dataUpdate;
    public EnterGroup() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        dataInserted =false;
        dataUpdate = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GDLabelMain = new javax.swing.JLabel();
        GDLblGID = new javax.swing.JLabel();
        txtGroupId = new javax.swing.JTextField();
        GDLblGName = new javax.swing.JLabel();
        txtGroupName = new javax.swing.JTextField();
        txtGroupLoc = new javax.swing.JTextField();
        GDLbLoc = new javax.swing.JLabel();
        GDLbDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGroupDesc = new javax.swing.JTextArea();
        btnGDClear = new javax.swing.JButton();
        btnGDEnter = new javax.swing.JButton();
        btnGDEnterAnother = new javax.swing.JButton();
        btnCDHome1 = new javax.swing.JButton();
        btnGDUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GDLabelMain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GDLabelMain.setText("Group Data Form");

        GDLblGID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GDLblGID.setText("Group Id");

        txtGroupId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGroupIdKeyTyped(evt);
            }
        });

        GDLblGName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GDLblGName.setText("Group Name");

        GDLbLoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GDLbLoc.setText("Location");

        GDLbDesc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GDLbDesc.setText("Description");

        txtGroupDesc.setColumns(20);
        txtGroupDesc.setRows(5);
        jScrollPane1.setViewportView(txtGroupDesc);

        btnGDClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGDClear.setText(" Clear Data");
        btnGDClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGDClearActionPerformed(evt);
            }
        });

        btnGDEnter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGDEnter.setText("Enter Group");
        btnGDEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGDEnterActionPerformed(evt);
            }
        });

        btnGDEnterAnother.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGDEnterAnother.setText("Another Group");
        btnGDEnterAnother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGDEnterAnotherActionPerformed(evt);
            }
        });

        btnCDHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_button.png"))); // NOI18N
        btnCDHome1.setBorder(null);
        btnCDHome1.setBorderPainted(false);
        btnCDHome1.setContentAreaFilled(false);
        btnCDHome1.setFocusPainted(false);
        btnCDHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDHome1ActionPerformed(evt);
            }
        });

        btnGDUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnGDUpdate.setBorder(null);
        btnGDUpdate.setBorderPainted(false);
        btnGDUpdate.setContentAreaFilled(false);
        btnGDUpdate.setFocusPainted(false);
        btnGDUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGDUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCDHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGDUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GDLabelMain)
                        .addGap(223, 223, 223))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GDLblGID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GDLblGName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GDLbLoc)
                                    .addComponent(GDLbDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGroupLoc)
                                    .addComponent(txtGroupName)
                                    .addComponent(txtGroupId)
                                    .addComponent(jScrollPane1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGDClear, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addGap(51, 51, 51)
                                .addComponent(btnGDEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btnGDEnterAnother)))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCDHome1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GDLabelMain)
                    .addComponent(btnGDUpdate))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GDLblGID)
                    .addComponent(txtGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GDLblGName)
                    .addComponent(txtGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GDLbLoc)
                    .addComponent(txtGroupLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GDLbDesc)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGDClear)
                    .addComponent(btnGDEnterAnother)
                    .addComponent(btnGDEnter))
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGDEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGDEnterActionPerformed

        String errorMessage = validateData();
        if (0 < errorMessage.length())
            JOptionPaneCustom.infoBox(errorMessage, "Group Data Insertion");
        else
            EnterData();
    }//GEN-LAST:event_btnGDEnterActionPerformed

    private void EnterData(){
    
        Group group = new Group();
        
        group.setGid(txtGroupId.getText());
        group.setGname(txtGroupName.getText());
        group.setLocation(txtGroupLoc.getText());
        group.setDescription(txtGroupDesc.getText());
        
        if(dataUpdate && !dataInserted)
        {
            UpdateGroup(group);
        }
        else if(!dataInserted)
        {
            InsertGroup(group);
        }          
    }
    
    private String validateData(){
    
        String errorMessage = "";
        if(txtGroupId.getText().length()==0)
            errorMessage += "Enter a valid group Id";
        if(txtGroupName.getText().length()==0)
            errorMessage += "Enter a valid group name";
        
        return errorMessage;
    }
    
    private void InsertGroup(Group group){

        GroupDataProcessor groupDataProcessor=new GroupDataProcessor();
        if(groupDataProcessor.putGroup(group))
        {
            JOptionPaneCustom.infoBox("Group data inserted successfully", "Group Data Insertion");
            dataInserted = true; 
            ClearComponents();             
        }
        else
            JOptionPaneCustom.errorBox("Group data insertion error", "Group Data Insertion");        
        
    }
    
    private void UpdateGroup(Group group){

        GroupDataProcessor groupDataProcessor=new GroupDataProcessor();
        if(groupDataProcessor.updateGroup(group))
        {
            JOptionPaneCustom.infoBox("Group data inserted successfully", "Group Data Insertion");
            dataInserted = true;  
            ClearComponents();  
            dataUpdate=false;
            btnGDEnter.setText("Enter Group");    
            txtGroupId.enable();
        }
        else
            JOptionPaneCustom.errorBox("Group data insertion error", "Group Data Insertion");        
        
    }    
    private void btnGDClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGDClearActionPerformed
        // TODO add your handling code here:
        ClearComponents();
    }//GEN-LAST:event_btnGDClearActionPerformed

    private void ClearComponents(){
    
        txtGroupId.setText("");
        txtGroupName.setText("");
        txtGroupLoc.setText("");
        txtGroupDesc.setText("");        
    }
    private void txtGroupIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGroupIdKeyTyped

        FillGUIComponents.setNumberOnlyTextBox(evt);
    }//GEN-LAST:event_txtGroupIdKeyTyped

    private void btnCDHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDHome1ActionPerformed
        // TODO add your handling code here:
        MainPage mainPage=new MainPage();
        mainPage.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCDHome1ActionPerformed

    private void btnGDEnterAnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGDEnterAnotherActionPerformed
        // TODO add your handling code here:
        if(dataInserted)
        {
            ClearComponents();
            dataInserted = false;
        }
        else
            JOptionPaneCustom.errorBox("Current insertion not completed", "Group Data Insertion");        
    }//GEN-LAST:event_btnGDEnterAnotherActionPerformed

    private void btnGDUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGDUpdateActionPerformed
        // TODO add your handling code here:
        if (!dataUpdate)
            dataUpdate = true;
        
        GroupDataProcessor groupDataProcessor=new GroupDataProcessor();
        try {
            Group group = groupDataProcessor.getGroupById(txtGroupId.getText());
            
            txtGroupId.disable();
            txtGroupName.setText(group.getGname());
            txtGroupLoc.setText(group.getLocation());
            txtGroupDesc.setText(group.getDescription());
            
            btnGDEnter.setText("Update Customer");
            dataInserted=false;
            dataUpdate = true;
            
        } catch (Exception ex) {
            Logger.getLogger(EnterGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGDUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(EnterGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EnterGroup().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GDLabelMain;
    private javax.swing.JLabel GDLbDesc;
    private javax.swing.JLabel GDLbLoc;
    private javax.swing.JLabel GDLblGID;
    private javax.swing.JLabel GDLblGName;
    private javax.swing.JButton btnCDHome1;
    private javax.swing.JButton btnGDClear;
    private javax.swing.JButton btnGDEnter;
    private javax.swing.JButton btnGDEnterAnother;
    private javax.swing.JButton btnGDUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtGroupDesc;
    private javax.swing.JTextField txtGroupId;
    private javax.swing.JTextField txtGroupLoc;
    private javax.swing.JTextField txtGroupName;
    // End of variables declaration//GEN-END:variables
}
