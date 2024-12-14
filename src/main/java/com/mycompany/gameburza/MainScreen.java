/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gameburza;
import java.util.LinkedList;

/**
 *
 * @author sean
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainScreen() {
        initComponents();
    }
    
    public void loadProducts(){
        
                    // Action Games
        GameBurza.games.add(new VideoGamePreviews("Grand Theft Auto V", 2013, "An open-world action-adventure game with heist missions.", "PS5, Xbox, Steam"));
        GameBurza.games.add(new VideoGamePreviews("DOOM Eternal", 2020, "A fast-paced first-person shooter battling demonic forces.", "PS5, Xbox, Steam"));

        // Adventure Games
        GameBurza.games.add(new VideoGamePreviews("The Legend of Zelda: Breath of the Wild", 2017, "An open-world action-adventure game in a vast, post-apocalyptic Hyrule.", "Nintendo eShop"));
        GameBurza.games.add(new VideoGamePreviews("Life is Strange", 2015, "A graphic adventure game that follows a young girl with time-manipulation powers.", "Steam"));

        // RPG Games
        GameBurza.games.add(new VideoGamePreviews("The Witcher 3: Wild Hunt", 2015, "An open-world RPG where Geralt of Rivia battles monsters and searches for his adopted daughter.", "Steam"));
        GameBurza.games.add(new VideoGamePreviews("Cyberpunk 2077", 2020, "An open-world RPG set in a dystopian future, featuring advanced technology and cybernetics.", "Steam"));

        // Simulation Games
        GameBurza.games.add(new VideoGamePreviews("The Sims 4", 2014, "A life simulation game where players create and control people in a virtual world.", "PS4, Xbox, Steam, Origin"));
        GameBurza.games.add(new VideoGamePreviews("Animal Crossing: New Horizons", 2020, "A social simulation game where players develop a deserted island and interact with animal villagers.", "Nintendo eShop"));

        // Strategy Games
        GameBurza.games.add(new VideoGamePreviews("Civilization VI", 2016, "A turn-based strategy game where players build and manage an empire through the ages.", "Steam"));
        GameBurza.games.add(new VideoGamePreviews("XCOM 2", 2016, "A turn-based tactics game where players lead resistance forces against an alien occupation.", "Steam"));

        // Sports Games
        GameBurza.games.add(new VideoGamePreviews("FIFA 24", 2023, "A football simulation game featuring real teams and leagues.", "Origin"));
        GameBurza.games.add(new VideoGamePreviews("NBA 2K24", 2023, "A basketball simulation game featuring NBA teams and players.", "Steam"));

        // Puzzle Games
        GameBurza.games.add(new VideoGamePreviews("Tetris Effect", 2018, "A puzzle game that combines classic Tetris gameplay with music and visual effects.", "Steam"));
        GameBurza.games.add(new VideoGamePreviews("Portal 2", 2011, "A first-person puzzle-platform game where players solve puzzles using a portal gun.", "Steam"));

        // Horror Games
        GameBurza.games.add(new VideoGamePreviews("Resident Evil Village", 2021, "A survival horror game where players battle through a village terrorized by monsters.", "Steam"));
        GameBurza.games.add(new VideoGamePreviews("Dead Space (Remake)", 2023, "A sci-fi survival horror game where players fight necromorphs aboard a stranded spaceship.", "Steam"));
        loadProductPaint();
    }
    
    public void loadProductPaint(){
        for(int i = 0; i < GameBurza.games.size(); i++){
            itemsPanel2.add(new ItemPanel(GameBurza.games.get(i).title));
        }
    }
    private void initializeCredits() {
    int[] availableDenominations = {10, 25, 20};
    
    // Adding Credit Items
    GameBurza.credits.add(new CreditItem("PlayStation Network (PSN) Wallet Top-up", availableDenominations, "PSN"));
    GameBurza.credits.add(new CreditItem("Steam Wallet Gift Card (Digital Code)", availableDenominations, "Steam"));
    GameBurza.credits.add(new CreditItem("Garena Shells Scratch Card", availableDenominations, "Garena"));
    GameBurza.credits.add(new CreditItem("Google Play Gift Card (Physical)", availableDenominations, "Google Play"));
    
    // Assuming you have a UI panel `itemsPanel2` to display the credit items
    drawCredits();
}
    
    private void drawCredits(){
        for (int i = 0; i < GameBurza.credits.size(); i++) {
        CreditItem credit = GameBurza.credits.get(i);
        // Display name, platform, and denominations in the items panel
        itemsPanel2.add(new ItemPanel(GameBurza.credits.get(i).getName()));
    }
    }
    
    private void initializeMerchandise() {
    // Adding Merch Items
    GameBurza.merch.add(new MerchItem("Overwatch D.Va Hoodie", "Sizes S, M, L, XL"));
    GameBurza.merch.add(new MerchItem("Assassin’s Creed Hidden Blade Replica Jacket", "Sizes S, M, L, XL"));
    
    // Adding Collectibles
    GameBurza.merch.add(new MerchItem("Resident Evil Umbrella Corporation Logo Keychain", "Material: Metal, Size: 5cm diameter"));
    GameBurza.merch.add(new MerchItem("Fallout Nuka-Cola Bottle Opener", "Material: Metal, Size: 10cm length"));

    // Call the method to display the merchandise items
    drawMerchandise();
}
    private void drawMerchandise() {
    // Assuming you have a UI panel `itemsPanel2` to display the merchandise items
    for (int i = 0; i < GameBurza.merch.size(); i++) {
        MerchItem merch = GameBurza.merch.get(i);
        // Display the merchandise name and other details in the items panel
        itemsPanel2.add(new ItemPanel(GameBurza.merch.get(i).getName()));
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

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        topMenuPanel = new javax.swing.JPanel();
        gameburzaLabel = new javax.swing.JLabel();
        cartButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        gamesButton = new javax.swing.JToggleButton();
        creditsButton = new javax.swing.JToggleButton();
        merchandiseButton = new javax.swing.JToggleButton();
        scrollPane = new javax.swing.JScrollPane();
        itemsPanel2 = new com.mycompany.gameburza.ItemsPanel();
        jPanel1 = new javax.swing.JPanel();

        jPopupMenu2.setPopupSize(new java.awt.Dimension(200, 100));

        jMenuItem1.setText("Logout");
        jPopupMenu2.add(jMenuItem1);

        jMenuItem2.setText("Settings");
        jPopupMenu2.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GameBurza");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));

        topMenuPanel.setBackground(new java.awt.Color(184, 30, 38));

        gameburzaLabel.setFont(new java.awt.Font("Nebula", 0, 24)); // NOI18N
        gameburzaLabel.setForeground(new java.awt.Color(255, 255, 255));
        gameburzaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gameburza50x50.png"))); // NOI18N
        gameburzaLabel.setText("GameBurza");

        cartButton.setBackground(new java.awt.Color(184, 30, 38));
        cartButton.setFont(new java.awt.Font("Nebula", 0, 18)); // NOI18N
        cartButton.setForeground(new java.awt.Color(255, 255, 255));
        cartButton.setText("Cart");
        cartButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cartButton.setIconTextGap(0);
        cartButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cartButton.setPreferredSize(new java.awt.Dimension(50, 50));
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        accountButton.setBackground(new java.awt.Color(184, 30, 38));
        accountButton.setFont(new java.awt.Font("Nebula", 0, 18)); // NOI18N
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setText("Account");
        accountButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        accountButton.setIconTextGap(0);
        accountButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        accountButton.setPreferredSize(new java.awt.Dimension(50, 50));
        accountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountButtonMouseClicked(evt);
            }
        });
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });

        gamesButton.setBackground(new java.awt.Color(184, 30, 38));
        gamesButton.setFont(new java.awt.Font("Nebula", 0, 14)); // NOI18N
        gamesButton.setForeground(new java.awt.Color(255, 255, 255));
        gamesButton.setText("GAMES");
        gamesButton.setBorder(null);
        gamesButton.setBorderPainted(false);
        gamesButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        gamesButton.setPreferredSize(new java.awt.Dimension(50, 50));
        gamesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gamesButtonMouseClicked(evt);
            }
        });
        gamesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesButtonActionPerformed(evt);
            }
        });

        creditsButton.setBackground(new java.awt.Color(184, 30, 38));
        creditsButton.setFont(new java.awt.Font("Nebula", 0, 14)); // NOI18N
        creditsButton.setForeground(new java.awt.Color(255, 255, 255));
        creditsButton.setText("CREDITS");
        creditsButton.setBorder(null);
        creditsButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        creditsButton.setPreferredSize(new java.awt.Dimension(50, 50));
        creditsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditsButtonMouseClicked(evt);
            }
        });
        creditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsButtonActionPerformed(evt);
            }
        });

        merchandiseButton.setBackground(new java.awt.Color(184, 30, 38));
        merchandiseButton.setFont(new java.awt.Font("Nebula", 0, 14)); // NOI18N
        merchandiseButton.setForeground(new java.awt.Color(255, 255, 255));
        merchandiseButton.setText("MERCH");
        merchandiseButton.setBorder(null);
        merchandiseButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        merchandiseButton.setPreferredSize(new java.awt.Dimension(50, 50));
        merchandiseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                merchandiseButtonMouseClicked(evt);
            }
        });
        merchandiseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merchandiseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topMenuPanelLayout = new javax.swing.GroupLayout(topMenuPanel);
        topMenuPanel.setLayout(topMenuPanelLayout);
        topMenuPanelLayout.setHorizontalGroup(
            topMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topMenuPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(gameburzaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(creditsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(merchandiseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324)
                .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        topMenuPanelLayout.setVerticalGroup(
            topMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameburzaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gamesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(merchandiseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gamesButton.setSelected(true);
        if (gamesButton.isSelected() == true){
            gamesButton.setSelected(false);
        }
        if (merchandiseButton.isSelected() == true){
            merchandiseButton.setSelected(false);
        }

        itemsPanel2.setMaximumSize(new java.awt.Dimension(300, 500));
        itemsPanel2.setMinimumSize(new java.awt.Dimension(300, 500));
        scrollPane.setViewportView(itemsPanel2);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(topMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        GameBurza.cartUI.setVisible(true);
    }//GEN-LAST:event_cartButtonActionPerformed

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountButtonActionPerformed

    private void accountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseClicked
        jPopupMenu2.show(accountButton, 0, 0);
    }//GEN-LAST:event_accountButtonMouseClicked

    private void gamesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesButtonActionPerformed
        if(gamesButton.isSelected() == true && (creditsButton.isSelected() == true || merchandiseButton.isSelected() == true)){
            creditsButton.setSelected(false);
            merchandiseButton.setSelected(false);
        }
        else{
            gamesButton.setSelected(true);
        }
        itemsPanel2.removeAll();
        loadProductPaint();  
        validate();
    }//GEN-LAST:event_gamesButtonActionPerformed

    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsButtonActionPerformed
        if(creditsButton.isSelected() == true && (gamesButton.isSelected() == true || merchandiseButton.isSelected() == true)){
            gamesButton.setSelected(false);
            merchandiseButton.setSelected(false);
        }
        itemsPanel2.removeAll();
        if(GameBurza.credits.size() == 0){
            initializeCredits();
        }
        else{
            drawCredits();
        }
        validate();
    }//GEN-LAST:event_creditsButtonActionPerformed

    private void merchandiseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merchandiseButtonActionPerformed
    // Ensure that if merchandise is selected, other buttons are deselected
    if (merchandiseButton.isSelected() == true && (gamesButton.isSelected() == true || creditsButton.isSelected() == true)) {
        gamesButton.setSelected(false);
        creditsButton.setSelected(false);
    }
    
    // Clear the items panel
    itemsPanel2.removeAll();
    
    // Initialize merchandise if it's not already initialized
    if (GameBurza.merch.size() == 0) {
        initializeMerchandise();
    } else {
        drawMerchandise();
    }
    
    // Revalidate and repaint the panel to ensure the changes are reflected
    validate();
    }//GEN-LAST:event_merchandiseButtonActionPerformed

    private void gamesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gamesButtonMouseClicked
        
    }//GEN-LAST:event_gamesButtonMouseClicked

    private void creditsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsButtonMouseClicked

    }//GEN-LAST:event_creditsButtonMouseClicked

    private void merchandiseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_merchandiseButtonMouseClicked

    }//GEN-LAST:event_merchandiseButtonMouseClicked
 
  
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JButton cartButton;
    private javax.swing.JToggleButton creditsButton;
    private javax.swing.JLabel gameburzaLabel;
    private javax.swing.JToggleButton gamesButton;
    private com.mycompany.gameburza.ItemsPanel itemsPanel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JToggleButton merchandiseButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPanel topMenuPanel;
    // End of variables declaration//GEN-END:variables
}
