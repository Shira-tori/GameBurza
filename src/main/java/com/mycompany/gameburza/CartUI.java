/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gameburza;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhan Steven Cruz
 */
public class CartUI extends javax.swing.JFrame {

    /**
     * Creates new form CartUI
     */
    
    public DefaultTableModel tblModel;
    private float total = 0;
    
    public CartUI() {
        initComponents();
        tblModel = (DefaultTableModel)jTable1.getModel();
    }
    
    public void initCart(){
        for(int i = 0; i < GameBurza.cart.size(); i++){
            total += GameBurza.cart.get(i).price;
        }
        TotalCartLabel1.setText(String.valueOf(total));
        
        
        tblModel.setRowCount(0);
        for(int i = 0; i < GameBurza.cart.size(); i++){
            tblModel.addRow(new String[]{GameBurza.cart.get(i).title, String.valueOf(GameBurza.cart.get(i).price)});
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CartUIPanel = new javax.swing.JPanel();
        CartLowerUIPanel = new javax.swing.JPanel();
        TotalCartLabel = new javax.swing.JLabel();
        TotalCartLabel1 = new javax.swing.JLabel();
        CheckOutButton = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CartUpperUiPanel = new javax.swing.JPanel();
        CartLabel = new javax.swing.JLabel();
        ItemsLabel = new javax.swing.JLabel();
        DeleteProductButton = new javax.swing.JButton();
        CartUIHomeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(184, 30, 38));
        setResizable(false);

        CartLowerUIPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TotalCartLabel.setFont(new java.awt.Font("Nebula", 0, 18)); // NOI18N
        TotalCartLabel.setText("Total:");

        TotalCartLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TotalCartLabel1.setText("0");

        CheckOutButton.setBackground(new java.awt.Color(184, 30, 38));
        CheckOutButton.setFont(new java.awt.Font("Nebula", 0, 18)); // NOI18N
        CheckOutButton.setForeground(new java.awt.Color(255, 255, 255));
        CheckOutButton.setText("CHECK OUT");
        CheckOutButton.setBorderPainted(false);
        CheckOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CartLowerUIPanelLayout = new javax.swing.GroupLayout(CartLowerUIPanel);
        CartLowerUIPanel.setLayout(CartLowerUIPanelLayout);
        CartLowerUIPanelLayout.setHorizontalGroup(
            CartLowerUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartLowerUIPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TotalCartLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TotalCartLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CartLowerUIPanelLayout.setVerticalGroup(
            CartLowerUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartLowerUIPanelLayout.createSequentialGroup()
                .addGroup(CartLowerUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CheckOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(TotalCartLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TotalCartLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Products", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPanel.setViewportView(jTable1);

        javax.swing.GroupLayout CartUIPanelLayout = new javax.swing.GroupLayout(CartUIPanel);
        CartUIPanel.setLayout(CartUIPanelLayout);
        CartUIPanelLayout.setHorizontalGroup(
            CartUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartUIPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(CartUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CartLowerUIPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPanel)))
        );
        CartUIPanelLayout.setVerticalGroup(
            CartUIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartUIPanelLayout.createSequentialGroup()
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CartLowerUIPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CartUpperUiPanel.setBackground(new java.awt.Color(184, 30, 38));

        CartLabel.setBackground(new java.awt.Color(255, 255, 255));
        CartLabel.setFont(new java.awt.Font("Nebula", 0, 18)); // NOI18N
        CartLabel.setForeground(new java.awt.Color(255, 255, 255));
        CartLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CartLabel.setText("Shopping Cart");
        CartLabel.setToolTipText("");

        ItemsLabel.setFont(new java.awt.Font("Nebula", 0, 18)); // NOI18N
        ItemsLabel.setForeground(new java.awt.Color(255, 255, 255));
        ItemsLabel.setText("(NO. of Items)");

        DeleteProductButton.setBackground(new java.awt.Color(180, 30, 38));
        DeleteProductButton.setFont(new java.awt.Font("Nebula", 0, 18)); // NOI18N
        DeleteProductButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteProductButton.setText("DELETE");
        DeleteProductButton.setBorderPainted(false);
        DeleteProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProductButtonActionPerformed(evt);
            }
        });

        CartUIHomeButton.setBackground(new java.awt.Color(184, 30, 38));
        CartUIHomeButton.setFont(new java.awt.Font("Nebula", 0, 18)); // NOI18N
        CartUIHomeButton.setForeground(new java.awt.Color(255, 255, 255));
        CartUIHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gameburza50x50_1.png"))); // NOI18N
        CartUIHomeButton.setText("GAMEBURZA");
        CartUIHomeButton.setBorder(null);
        CartUIHomeButton.setBorderPainted(false);
        CartUIHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartUIHomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CartUpperUiPanelLayout = new javax.swing.GroupLayout(CartUpperUiPanel);
        CartUpperUiPanel.setLayout(CartUpperUiPanelLayout);
        CartUpperUiPanelLayout.setHorizontalGroup(
            CartUpperUiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartUpperUiPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(CartUIHomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(CartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemsLabel)
                .addGap(132, 132, 132)
                .addComponent(DeleteProductButton)
                .addGap(30, 30, 30))
        );
        CartUpperUiPanelLayout.setVerticalGroup(
            CartUpperUiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartUpperUiPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(CartUpperUiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemsLabel)
                    .addComponent(DeleteProductButton)
                    .addComponent(CartUIHomeButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CartUpperUiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CartUIPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CartUpperUiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CartUIPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutButtonActionPerformed
        GameBurza.receipt.setVisible(true);
        GameBurza.receipt.initTable();
        GameBurza.receipt.GrandTotalLabel.setText(String.valueOf(this.total));
    }//GEN-LAST:event_CheckOutButtonActionPerformed

    private void DeleteProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProductButtonActionPerformed
        if(jTable1.getSelectedRowCount() == 1){
            GameBurza.cart.remove(jTable1.getSelectedRow());
            tblModel.removeRow(jTable1.getSelectedRow());
            this.total = 0;
            for(int i = 0; i < GameBurza.cart.size(); i++){
                this.total += GameBurza.cart.get(i).price;
            }
            TotalCartLabel1.setText(String.valueOf(this.total));
        }
        else{
            JOptionPane.showMessageDialog(this, "Select only one product.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_DeleteProductButtonActionPerformed

    private void CartUIHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartUIHomeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CartUIHomeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CartUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CartLabel;
    private javax.swing.JPanel CartLowerUIPanel;
    private javax.swing.JButton CartUIHomeButton;
    private javax.swing.JPanel CartUIPanel;
    private javax.swing.JPanel CartUpperUiPanel;
    private javax.swing.JButton CheckOutButton;
    private javax.swing.JButton DeleteProductButton;
    private javax.swing.JLabel ItemsLabel;
    private javax.swing.JLabel TotalCartLabel;
    private javax.swing.JLabel TotalCartLabel1;
    public javax.swing.JTable jTable1;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables
}
