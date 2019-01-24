/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbillingsystem_1.pkg0.pkg0.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author UDISSSA1
 */
public class ViewReports extends javax.swing.JFrame {

    /**
     * Creates new form ViewReports
     */
    public ViewReports() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("images\\WaterDrop.png");
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

        ReportjTabbedPane = new javax.swing.JTabbedPane();
        PanelOverallBilling = new javax.swing.JPanel();
        CDFLabelMain = new javax.swing.JLabel();
        RDLblMonth = new javax.swing.JLabel();
        cmbRDMonth = new javax.swing.JComboBox<>();
        cmdRDYear = new javax.swing.JComboBox<>();
        btnCDFClear = new javax.swing.JButton();
        RDLblSramadanaAns = new javax.swing.JLabel();
        RDLblSramadana1 = new javax.swing.JLabel();
        RDLblAbAns = new javax.swing.JLabel();
        RDLblAb = new javax.swing.JLabel();
        RDLblFixedAns = new javax.swing.JLabel();
        RDLblFixed = new javax.swing.JLabel();
        RDLblTotalBillAns = new javax.swing.JLabel();
        RDLblTotalBill = new javax.swing.JLabel();
        PanelCusPayments = new javax.swing.JPanel();
        RDLblPayCountAns = new javax.swing.JLabel();
        RDLblPayCount = new javax.swing.JLabel();
        RDLblTPaymentsAns = new javax.swing.JLabel();
        RDLblTPayments = new javax.swing.JLabel();
        CBDLblMonth = new javax.swing.JLabel();
        cmbCBDMonth = new javax.swing.JComboBox<>();
        cmdCBDYear = new javax.swing.JComboBox<>();
        btnCDFClear1 = new javax.swing.JButton();
        RDLblFixedAns1 = new javax.swing.JLabel();
        RDLblFixed1 = new javax.swing.JLabel();
        RDLblTotalBillAns1 = new javax.swing.JLabel();
        RDLblTotalBill1 = new javax.swing.JLabel();
        CDFLabelMainCBP = new javax.swing.JLabel();
        CBDLblMonth1 = new javax.swing.JLabel();
        cmbCBDMonth1 = new javax.swing.JComboBox<>();
        cmdCBDYear1 = new javax.swing.JComboBox<>();
        btnCDFClear3 = new javax.swing.JButton();
        CBDLblMonth2 = new javax.swing.JLabel();
        txtCBDCID = new javax.swing.JTextField();
        PanelIniPayments = new javax.swing.JPanel();
        RDLblSramadanaAns2 = new javax.swing.JLabel();
        RDLblTotalBill2 = new javax.swing.JLabel();
        RDLblSramadana3 = new javax.swing.JLabel();
        RDLblAbAns2 = new javax.swing.JLabel();
        RDLblAb2 = new javax.swing.JLabel();
        RDLblMonth2 = new javax.swing.JLabel();
        cmbRDMonth2 = new javax.swing.JComboBox<>();
        cmdRDYear2 = new javax.swing.JComboBox<>();
        btnCDFClear2 = new javax.swing.JButton();
        RDLblFixedAns2 = new javax.swing.JLabel();
        RDLblFixed2 = new javax.swing.JLabel();
        RDLblTotalBillAns2 = new javax.swing.JLabel();
        CDFLabelMainCBP1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ReportjTabbedPane.setPreferredSize(new java.awt.Dimension(611, 562));

        CDFLabelMain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CDFLabelMain.setText("Overall Billing Data");

        RDLblMonth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblMonth.setText("Billing Month");

        cmbRDMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01-January", "02-February", "03-March", "04-April", "05-May", "06-June", "07-July", "08-August", "09-September", "10-Octomber", "11-November", "12-December" }));

        cmdRDYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

        btnCDFClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCDFClear.setText("Generate Data");
        btnCDFClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDFClearActionPerformed(evt);
            }
        });

        RDLblSramadanaAns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblSramadanaAns.setText("Rs.");

        RDLblSramadana1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblSramadana1.setText("Total Income From Shramadhana");

        RDLblAbAns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblAbAns.setText("Rs.");

        RDLblAb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblAb.setText("Total Income From Absent Penalty");
        RDLblAb.setToolTipText("");

        RDLblFixedAns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblFixedAns.setText("Rs.");

        RDLblFixed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblFixed.setText("Total Income From Fixed Monthly Charge");
        RDLblFixed.setToolTipText("");

        RDLblTotalBillAns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblTotalBillAns.setText("Rs.");

        RDLblTotalBill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblTotalBill.setText("Total Monthly Income From Bills");
        RDLblTotalBill.setToolTipText("");

        javax.swing.GroupLayout PanelOverallBillingLayout = new javax.swing.GroupLayout(PanelOverallBilling);
        PanelOverallBilling.setLayout(PanelOverallBillingLayout);
        PanelOverallBillingLayout.setHorizontalGroup(
            PanelOverallBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOverallBillingLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(PanelOverallBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelOverallBillingLayout.createSequentialGroup()
                        .addComponent(RDLblTotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RDLblTotalBillAns, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOverallBillingLayout.createSequentialGroup()
                        .addGroup(PanelOverallBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RDLblSramadana1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RDLblFixed, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelOverallBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RDLblFixedAns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RDLblSramadanaAns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOverallBillingLayout.createSequentialGroup()
                        .addComponent(RDLblAb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RDLblAbAns, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOverallBillingLayout.createSequentialGroup()
                        .addGroup(PanelOverallBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CDFLabelMain)
                            .addGroup(PanelOverallBillingLayout.createSequentialGroup()
                                .addComponent(RDLblMonth)
                                .addGap(40, 40, 40)
                                .addComponent(cmbRDMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdRDYear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addComponent(btnCDFClear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        PanelOverallBillingLayout.setVerticalGroup(
            PanelOverallBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOverallBillingLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(CDFLabelMain)
                .addGap(35, 35, 35)
                .addGroup(PanelOverallBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRDMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdRDYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCDFClear)
                    .addComponent(RDLblMonth))
                .addGap(51, 51, 51)
                .addGroup(PanelOverallBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RDLblSramadanaAns)
                    .addComponent(RDLblSramadana1))
                .addGap(36, 36, 36)
                .addGroup(PanelOverallBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RDLblAb)
                    .addComponent(RDLblAbAns))
                .addGap(41, 41, 41)
                .addGroup(PanelOverallBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RDLblFixed)
                    .addComponent(RDLblFixedAns))
                .addGap(41, 41, 41)
                .addGroup(PanelOverallBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RDLblTotalBill)
                    .addComponent(RDLblTotalBillAns))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        ReportjTabbedPane.addTab("Overall Billing  ", PanelOverallBilling);

        RDLblPayCountAns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblPayCountAns.setText("Rs.");

        RDLblPayCount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblPayCount.setText("Total Numer of Payments For The Month");

        RDLblTPaymentsAns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblTPaymentsAns.setText("Rs.");

        RDLblTPayments.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblTPayments.setText("Total Income From Payments");
        RDLblTPayments.setToolTipText("");

        CBDLblMonth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBDLblMonth.setText("Billing Month");

        cmbCBDMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01-January", "02-February", "03-March", "04-April", "05-May", "06-June", "07-July", "08-August", "09-September", "10-Octomber", "11-November", "12-December" }));

        cmdCBDYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

        btnCDFClear1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCDFClear1.setText("Generate Data");
        btnCDFClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDFClear1ActionPerformed(evt);
            }
        });

        RDLblFixedAns1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblFixedAns1.setText("Rs.");

        RDLblFixed1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblFixed1.setText("Total Income From Fixed Monthly Charge");
        RDLblFixed1.setToolTipText("");

        RDLblTotalBillAns1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblTotalBillAns1.setText("Rs.");

        RDLblTotalBill1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblTotalBill1.setText("Total Monthly Income From Bills");
        RDLblTotalBill1.setToolTipText("");

        CDFLabelMainCBP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CDFLabelMainCBP.setText("Customer Bill Payments");

        CBDLblMonth1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBDLblMonth1.setText("Billing Month");

        cmbCBDMonth1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01-January", "02-February", "03-March", "04-April", "05-May", "06-June", "07-July", "08-August", "09-September", "10-Octomber", "11-November", "12-December" }));

        cmdCBDYear1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

        btnCDFClear3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCDFClear3.setText("Generate Data");
        btnCDFClear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDFClear3ActionPerformed(evt);
            }
        });

        CBDLblMonth2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBDLblMonth2.setText("Customer Id");

        javax.swing.GroupLayout PanelCusPaymentsLayout = new javax.swing.GroupLayout(PanelCusPayments);
        PanelCusPayments.setLayout(PanelCusPaymentsLayout);
        PanelCusPaymentsLayout.setHorizontalGroup(
            PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCusPaymentsLayout.createSequentialGroup()
                .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCusPaymentsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RDLblPayCountAns, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCusPaymentsLayout.createSequentialGroup()
                        .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCusPaymentsLayout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(CDFLabelMainCBP))
                            .addGroup(PanelCusPaymentsLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelCusPaymentsLayout.createSequentialGroup()
                                        .addGap(309, 309, 309)
                                        .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RDLblFixedAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RDLblTotalBillAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PanelCusPaymentsLayout.createSequentialGroup()
                                        .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CBDLblMonth1)
                                            .addComponent(CBDLblMonth2))
                                        .addGap(40, 40, 40)
                                        .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbCBDMonth1, 0, 116, Short.MAX_VALUE)
                                            .addComponent(txtCBDCID))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmdCBDYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnCDFClear3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelCusPaymentsLayout.createSequentialGroup()
                                        .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(RDLblTPayments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(RDLblPayCount, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)
                                        .addComponent(RDLblTPaymentsAns, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(RDLblFixed1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RDLblTotalBill1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCusPaymentsLayout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(CBDLblMonth)
                    .addGap(40, 40, 40)
                    .addComponent(cmbCBDMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cmdCBDYear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)
                    .addComponent(btnCDFClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE)))
        );
        PanelCusPaymentsLayout.setVerticalGroup(
            PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCusPaymentsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(CDFLabelMainCBP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RDLblPayCount)
                    .addComponent(RDLblPayCountAns))
                .addGap(18, 18, 18)
                .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RDLblTPayments)
                    .addComponent(RDLblTPaymentsAns))
                .addGap(44, 44, 44)
                .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCBDMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdCBDYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCDFClear3)
                    .addComponent(CBDLblMonth1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBDLblMonth2)
                    .addComponent(txtCBDCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RDLblFixed1)
                    .addComponent(RDLblFixedAns1))
                .addGap(18, 18, 18)
                .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RDLblTotalBill1)
                    .addComponent(RDLblTotalBillAns1))
                .addGap(76, 76, 76))
            .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCusPaymentsLayout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addGroup(PanelCusPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCBDMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdCBDYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCDFClear1)
                        .addComponent(CBDLblMonth))
                    .addContainerGap(335, Short.MAX_VALUE)))
        );

        ReportjTabbedPane.addTab("Customer Payments  ", PanelCusPayments);

        RDLblSramadanaAns2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblSramadanaAns2.setText("Rs.");

        RDLblTotalBill2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblTotalBill2.setText("Total Monthly Income From Bills");
        RDLblTotalBill2.setToolTipText("");

        RDLblSramadana3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblSramadana3.setText("Total Income From Initial Payments");

        RDLblAbAns2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblAbAns2.setText("Rs.");

        RDLblAb2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblAb2.setText("Total Income From Initial Payments");
        RDLblAb2.setToolTipText("");

        RDLblMonth2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblMonth2.setText("Billing Month");

        cmbRDMonth2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01-January", "02-February", "03-March", "04-April", "05-May", "06-June", "07-July", "08-August", "09-September", "10-Octomber", "11-November", "12-December" }));

        cmdRDYear2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

        btnCDFClear2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCDFClear2.setText("Generate Data");
        btnCDFClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDFClear2ActionPerformed(evt);
            }
        });

        RDLblFixedAns2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblFixedAns2.setText("Rs.");

        RDLblFixed2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblFixed2.setText("Total Income From Fixed Monthly Charge");
        RDLblFixed2.setToolTipText("");

        RDLblTotalBillAns2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RDLblTotalBillAns2.setText("Rs.");

        CDFLabelMainCBP1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CDFLabelMainCBP1.setText("Customer Initial Payments");

        javax.swing.GroupLayout PanelIniPaymentsLayout = new javax.swing.GroupLayout(PanelIniPayments);
        PanelIniPayments.setLayout(PanelIniPaymentsLayout);
        PanelIniPaymentsLayout.setHorizontalGroup(
            PanelIniPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIniPaymentsLayout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(CDFLabelMainCBP1)
                .addGap(179, 179, 179))
            .addGroup(PanelIniPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelIniPaymentsLayout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addGroup(PanelIniPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelIniPaymentsLayout.createSequentialGroup()
                            .addComponent(RDLblTotalBill2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RDLblTotalBillAns2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelIniPaymentsLayout.createSequentialGroup()
                            .addGroup(PanelIniPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(RDLblSramadana3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RDLblFixed2, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelIniPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RDLblFixedAns2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RDLblSramadanaAns2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIniPaymentsLayout.createSequentialGroup()
                            .addComponent(RDLblAb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RDLblAbAns2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelIniPaymentsLayout.createSequentialGroup()
                            .addComponent(RDLblMonth2)
                            .addGap(40, 40, 40)
                            .addComponent(cmbRDMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmdRDYear2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(btnCDFClear2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(66, 66, 66)))
        );
        PanelIniPaymentsLayout.setVerticalGroup(
            PanelIniPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIniPaymentsLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(CDFLabelMainCBP1)
                .addContainerGap(406, Short.MAX_VALUE))
            .addGroup(PanelIniPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelIniPaymentsLayout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addGroup(PanelIniPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbRDMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdRDYear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCDFClear2)
                        .addComponent(RDLblMonth2))
                    .addGap(51, 51, 51)
                    .addGroup(PanelIniPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RDLblSramadanaAns2)
                        .addComponent(RDLblSramadana3))
                    .addGap(36, 36, 36)
                    .addGroup(PanelIniPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RDLblAb2)
                        .addComponent(RDLblAbAns2))
                    .addGap(41, 41, 41)
                    .addGroup(PanelIniPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RDLblFixed2)
                        .addComponent(RDLblFixedAns2))
                    .addGap(41, 41, 41)
                    .addGroup(PanelIniPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RDLblTotalBill2)
                        .addComponent(RDLblTotalBillAns2))
                    .addContainerGap(106, Short.MAX_VALUE)))
        );

        ReportjTabbedPane.addTab("Initial Payments  ", PanelIniPayments);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReportjTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReportjTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        ReportjTabbedPane.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCDFClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDFClearActionPerformed


    }//GEN-LAST:event_btnCDFClearActionPerformed

    private void btnCDFClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDFClear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCDFClear1ActionPerformed

    private void btnCDFClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDFClear2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCDFClear2ActionPerformed

    private void btnCDFClear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDFClear3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCDFClear3ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewReports().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CBDLblMonth;
    private javax.swing.JLabel CBDLblMonth1;
    private javax.swing.JLabel CBDLblMonth2;
    private javax.swing.JLabel CDFLabelMain;
    private javax.swing.JLabel CDFLabelMainCBP;
    private javax.swing.JLabel CDFLabelMainCBP1;
    private javax.swing.JPanel PanelCusPayments;
    private javax.swing.JPanel PanelIniPayments;
    private javax.swing.JPanel PanelOverallBilling;
    private javax.swing.JLabel RDLblAb;
    private javax.swing.JLabel RDLblAb2;
    private javax.swing.JLabel RDLblAbAns;
    private javax.swing.JLabel RDLblAbAns2;
    private javax.swing.JLabel RDLblFixed;
    private javax.swing.JLabel RDLblFixed1;
    private javax.swing.JLabel RDLblFixed2;
    private javax.swing.JLabel RDLblFixedAns;
    private javax.swing.JLabel RDLblFixedAns1;
    private javax.swing.JLabel RDLblFixedAns2;
    private javax.swing.JLabel RDLblMonth;
    private javax.swing.JLabel RDLblMonth2;
    private javax.swing.JLabel RDLblPayCount;
    private javax.swing.JLabel RDLblPayCountAns;
    private javax.swing.JLabel RDLblSramadana1;
    private javax.swing.JLabel RDLblSramadana3;
    private javax.swing.JLabel RDLblSramadanaAns;
    private javax.swing.JLabel RDLblSramadanaAns2;
    private javax.swing.JLabel RDLblTPayments;
    private javax.swing.JLabel RDLblTPaymentsAns;
    private javax.swing.JLabel RDLblTotalBill;
    private javax.swing.JLabel RDLblTotalBill1;
    private javax.swing.JLabel RDLblTotalBill2;
    private javax.swing.JLabel RDLblTotalBillAns;
    private javax.swing.JLabel RDLblTotalBillAns1;
    private javax.swing.JLabel RDLblTotalBillAns2;
    private javax.swing.JTabbedPane ReportjTabbedPane;
    private javax.swing.JButton btnCDFClear;
    private javax.swing.JButton btnCDFClear1;
    private javax.swing.JButton btnCDFClear2;
    private javax.swing.JButton btnCDFClear3;
    private javax.swing.JComboBox<String> cmbCBDMonth;
    private javax.swing.JComboBox<String> cmbCBDMonth1;
    private javax.swing.JComboBox<String> cmbRDMonth;
    private javax.swing.JComboBox<String> cmbRDMonth2;
    private javax.swing.JComboBox<String> cmdCBDYear;
    private javax.swing.JComboBox<String> cmdCBDYear1;
    private javax.swing.JComboBox<String> cmdRDYear;
    private javax.swing.JComboBox<String> cmdRDYear2;
    private javax.swing.JTextField txtCBDCID;
    // End of variables declaration//GEN-END:variables
}
