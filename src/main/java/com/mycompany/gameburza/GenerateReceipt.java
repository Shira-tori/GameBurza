/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gameburza;

/**
 *
 * @author Jhan Steven Cruz
 */
public class GenerateReceipt extends javax.swing.JFrame {

    /**
     * Creates new form GenerateReceipt
     */
    public GenerateReceipt() {
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

        jDialog1 = new javax.swing.JDialog();
        ReceiptPanel = new javax.swing.JPanel();
        GameBurzaLogo = new javax.swing.JLabel();
        BrandName = new javax.swing.JLabel();
        TrailingLines1 = new javax.swing.JLabel();
        CompanyQuote = new javax.swing.JLabel();
        OrderNumber = new javax.swing.JLabel();
        CompanyAddress = new javax.swing.JLabel();
        TrailingLines2 = new javax.swing.JLabel();
        ItemLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        TotalAmountLabel = new javax.swing.JLabel();
        TrailingLines3 = new javax.swing.JLabel();
        TotalToPayLabel = new javax.swing.JLabel();
        PaymentMethodLabel = new javax.swing.JLabel();
        TrailingLines4 = new javax.swing.JLabel();
        ThankYouLabel = new javax.swing.JLabel();
        ContactLabel = new javax.swing.JLabel();
        TotalToPay = new javax.swing.JLabel();
        PaymentMethod = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ReceiptPanel.setBackground(new java.awt.Color(251, 247, 245));

        GameBurzaLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBurzaLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jhan Steven Cruz\\Downloads\\gameburzalogoreal.png")); // NOI18N
        GameBurzaLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BrandName.setFont(new java.awt.Font("Nebula", 0, 12)); // NOI18N
        BrandName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BrandName.setText("GAMEBURZA");
        BrandName.setVerifyInputWhenFocusTarget(false);
        BrandName.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        TrailingLines1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TrailingLines1.setText("-------------------------------------------");

        CompanyQuote.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        CompanyQuote.setText("CLICK IT, PLAY IT, OWN IT!");
        CompanyQuote.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        CompanyQuote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        OrderNumber.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        OrderNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OrderNumber.setText("Order No.: 000000");
        OrderNumber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OrderNumber.setInheritsPopupMenu(false);

        CompanyAddress.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        CompanyAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CompanyAddress.setText("<html><div style='text-align:center;'>704 Boni Avenue,<br>Barangay Malamig,<br>Mandaluyong City,<br>Metro Manila, Philippines<br></div></html>");

        TrailingLines2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TrailingLines2.setText("-------------------------------------------");

        ItemLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        ItemLabel.setText("Item");

        QuantityLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        QuantityLabel.setText("QTY");

        PriceLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        PriceLabel.setText("Price");

        TotalAmountLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        TotalAmountLabel.setText("Total");

        TrailingLines3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TrailingLines3.setText("-------------------------------------------");

        TotalToPayLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        TotalToPayLabel.setText("Total Amount");

        PaymentMethodLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        PaymentMethodLabel.setText("Payment Method");

        TrailingLines4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TrailingLines4.setText("-------------------------------------------");

        ThankYouLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        ThankYouLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThankYouLabel.setText("THANK YOU FOR YOUR PURCHASE!");
        ThankYouLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ContactLabel.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        ContactLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContactLabel.setText("<html>Got Questions?<br>\n Email: lolomolumolobo<br>\n@rocketmail.com</html>");
        ContactLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TotalToPay.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        PaymentMethod.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ReceiptPanelLayout = new javax.swing.GroupLayout(ReceiptPanel);
        ReceiptPanel.setLayout(ReceiptPanelLayout);
        ReceiptPanelLayout.setHorizontalGroup(
            ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReceiptPanelLayout.createSequentialGroup()
                .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReceiptPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TrailingLines1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(TrailingLines2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TrailingLines3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TrailingLines4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ThankYouLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ContactLabel)
                            .addGroup(ReceiptPanelLayout.createSequentialGroup()
                                .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PaymentMethodLabel)
                                    .addComponent(TotalToPayLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TotalToPay, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(PaymentMethod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(ReceiptPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CompanyQuote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OrderNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CompanyAddress))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReceiptPanelLayout.createSequentialGroup()
                                .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ReceiptPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(ItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2))
                                .addGap(10, 10, 10)
                                .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ReceiptPanelLayout.createSequentialGroup()
                                        .addComponent(QuantityLabel)
                                        .addGap(14, 14, 14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReceiptPanelLayout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)))
                                .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TotalAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(ReceiptPanelLayout.createSequentialGroup()
                        .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReceiptPanelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ReceiptPanelLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(GameBurzaLogo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ReceiptPanelLayout.setVerticalGroup(
            ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReceiptPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(GameBurzaLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BrandName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TrailingLines1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompanyQuote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompanyAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TrailingLines2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemLabel)
                    .addComponent(TotalAmountLabel)
                    .addComponent(PriceLabel)
                    .addComponent(QuantityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TrailingLines3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TotalToPayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TotalToPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PaymentMethodLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaymentMethod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TrailingLines4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThankYouLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(ReceiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReceiptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GenerateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BrandName;
    private javax.swing.JLabel CompanyAddress;
    private javax.swing.JLabel CompanyQuote;
    private javax.swing.JLabel ContactLabel;
    private javax.swing.JLabel GameBurzaLogo;
    private javax.swing.JLabel ItemLabel;
    private javax.swing.JLabel OrderNumber;
    private javax.swing.JLabel PaymentMethod;
    private javax.swing.JLabel PaymentMethodLabel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JPanel ReceiptPanel;
    private javax.swing.JLabel ThankYouLabel;
    private javax.swing.JLabel TotalAmountLabel;
    private javax.swing.JLabel TotalToPay;
    private javax.swing.JLabel TotalToPayLabel;
    private javax.swing.JLabel TrailingLines1;
    private javax.swing.JLabel TrailingLines2;
    private javax.swing.JLabel TrailingLines3;
    private javax.swing.JLabel TrailingLines4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
