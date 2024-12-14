/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gameburza;

import javax.swing.JOptionPane;

/**
 *
 * @author sean
 */
public class RegisterScreen extends javax.swing.JFrame {

    /**
     * Creates new form RegisterScreen
     */
    public RegisterScreen() {
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

        SignUpPanel = new javax.swing.JPanel();
        FirstNameField = new javax.swing.JTextField();
        GameBurzaLogo = new javax.swing.JLabel();
        BrandName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FIrstNameLabel = new javax.swing.JLabel();
        FIrstNameLabel1 = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        AgeLabel1 = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        ConditionsCheckBox = new javax.swing.JCheckBox();
        LastNameField = new javax.swing.JTextField();
        AgeField = new javax.swing.JTextField();
        AgreementSignUp = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        RegisterBackButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
        setPreferredSize(new java.awt.Dimension(515, 740));
        setResizable(false);
        setSize(new java.awt.Dimension(515, 730));

        SignUpPanel.setBackground(new java.awt.Color(184, 30, 38));
        SignUpPanel.setPreferredSize(new java.awt.Dimension(515, 700));

        FirstNameField.setBackground(new java.awt.Color(255, 153, 153));
        FirstNameField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        FirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameFieldActionPerformed(evt);
            }
        });

        GameBurzaLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBurzaLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BrandName.setFont(new java.awt.Font("Nebula", 0, 18)); // NOI18N
        BrandName.setForeground(new java.awt.Color(255, 255, 255));
        BrandName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BrandName.setText("GAmeburzA");
        BrandName.setVerifyInputWhenFocusTarget(false);
        BrandName.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Nebula", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGN UP");

        FIrstNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        FIrstNameLabel.setFont(new java.awt.Font("Nebula", 0, 12)); // NOI18N
        FIrstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        FIrstNameLabel.setText("FIRST NAME");
        FIrstNameLabel.setToolTipText("");

        FIrstNameLabel1.setBackground(new java.awt.Color(255, 255, 255));
        FIrstNameLabel1.setFont(new java.awt.Font("Nebula", 0, 12)); // NOI18N
        FIrstNameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        FIrstNameLabel1.setText("LAST NAME");
        FIrstNameLabel1.setToolTipText("");

        AgeLabel.setBackground(new java.awt.Color(255, 255, 255));
        AgeLabel.setFont(new java.awt.Font("Nebula", 0, 12)); // NOI18N
        AgeLabel.setForeground(new java.awt.Color(255, 255, 255));
        AgeLabel.setText("AGE");
        AgeLabel.setToolTipText("");

        EmailField.setBackground(new java.awt.Color(255, 153, 153));
        EmailField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        AgeLabel1.setBackground(new java.awt.Color(255, 255, 255));
        AgeLabel1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        AgeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        AgeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgeLabel1.setText("<html><div style='text-align:center;'>**Please note that buyers below legal age will be asked for their <br>\nparent's consent.**</div></html>");
        AgeLabel1.setToolTipText("");

        EmailLabel.setBackground(new java.awt.Color(255, 255, 255));
        EmailLabel.setFont(new java.awt.Font("Nebula", 0, 12)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("EMAIL");
        EmailLabel.setToolTipText("");

        PasswordLabel.setFont(new java.awt.Font("Nebula", 0, 12)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("PASSWORD");
        PasswordLabel.setToolTipText("");

        ConditionsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConditionsCheckBoxActionPerformed(evt);
            }
        });

        LastNameField.setBackground(new java.awt.Color(255, 153, 153));
        LastNameField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        LastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameFieldActionPerformed(evt);
            }
        });

        AgeField.setBackground(new java.awt.Color(255, 153, 153));
        AgeField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        AgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeFieldActionPerformed(evt);
            }
        });

        AgreementSignUp.setBackground(new java.awt.Color(255, 255, 255));
        AgreementSignUp.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        AgreementSignUp.setForeground(new java.awt.Color(255, 255, 255));
        AgreementSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgreementSignUp.setText("<html>By clicking on this checkbox, you agree to the <br>\n terms and conditions provided by the company.</html>");
        AgreementSignUp.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton1.setFont(new java.awt.Font("Nebula", 0, 12)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gameburza50x50_1.png"))); // NOI18N

        RegisterBackButton.setBackground(new java.awt.Color(184, 30, 38));
        RegisterBackButton.setFont(new java.awt.Font("Nebula", 0, 18)); // NOI18N
        RegisterBackButton.setForeground(new java.awt.Color(204, 204, 0));
        RegisterBackButton.setText("<---");
        RegisterBackButton.setBorderPainted(false);
        RegisterBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SignUpPanelLayout = new javax.swing.GroupLayout(SignUpPanel);
        SignUpPanel.setLayout(SignUpPanelLayout);
        SignUpPanelLayout.setHorizontalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPanelLayout.createSequentialGroup()
                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignUpPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(216, 216, 216))
                    .addGroup(SignUpPanelLayout.createSequentialGroup()
                        .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SignUpPanelLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(ConditionsCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AgreementSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SignUpPanelLayout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jButton1))
                            .addGroup(SignUpPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(SignUpPanelLayout.createSequentialGroup()
                                        .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(SignUpPanelLayout.createSequentialGroup()
                                                .addGap(147, 147, 147)
                                                .addComponent(GameBurzaLogo))
                                            .addComponent(RegisterBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BrandName))
                                    .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FirstNameField)
                                        .addComponent(FIrstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FIrstNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EmailField)
                                        .addComponent(AgeLabel1)
                                        .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LastNameField)
                                        .addComponent(AgeField)
                                        .addComponent(jPasswordField1)))))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        SignUpPanelLayout.setVerticalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPanelLayout.createSequentialGroup()
                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignUpPanelLayout.createSequentialGroup()
                        .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SignUpPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2))
                            .addGroup(SignUpPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(RegisterBackButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GameBurzaLogo)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BrandName)
                        .addGap(34, 34, 34)))
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FIrstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FIrstNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(AgeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AgeLabel1)
                .addGap(15, 15, 15)
                .addComponent(EmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConditionsCheckBox)
                    .addComponent(AgreementSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        if(!ConditionsCheckBox.isSelected()){
            jButton1.setEnabled(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SignUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameFieldActionPerformed
        System.out.println(FirstNameField.getText());
    }//GEN-LAST:event_FirstNameFieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void LastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameFieldActionPerformed

    private void AgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeFieldActionPerformed
        if(Integer.parseInt(AgeField.getText() ) < 18){
            JOptionPane.showMessageDialog(rootPane, "BAWAL ANG BATA DITO!");
        }
    }//GEN-LAST:event_AgeFieldActionPerformed

    private void ConditionsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConditionsCheckBoxActionPerformed
        if(ConditionsCheckBox.isSelected()){
            jButton1.setEnabled(true);
            return;
        }
        jButton1.setEnabled(false);
    }//GEN-LAST:event_ConditionsCheckBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RegisterBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBackButtonActionPerformed
        dispose();
        GameBurza.loginScreen.setVisible(true);
    }//GEN-LAST:event_RegisterBackButtonActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeField;
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JLabel AgeLabel1;
    private javax.swing.JLabel AgreementSignUp;
    private javax.swing.JLabel BrandName;
    private javax.swing.JCheckBox ConditionsCheckBox;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel FIrstNameLabel;
    private javax.swing.JLabel FIrstNameLabel1;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JLabel GameBurzaLogo;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JToggleButton RegisterBackButton;
    private javax.swing.JPanel SignUpPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
