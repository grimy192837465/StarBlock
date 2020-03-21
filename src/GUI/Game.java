/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Code.Currency;
import Code.User;
import Code.Update;
import Code.Winning;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author reece
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Currency currency = new Currency();
    Update update = new Update();
    String ID = null;
    double Balance = 0.0;
    double CurrentBet = 1.00;
    double IncramentNumber = 0.10;
    public int[] reels = new int[5];
    private final Random rand = new Random();
    Winning win = new Winning();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        LBLName = new javax.swing.JLabel();
        LBLBet = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        reel5 = new javax.swing.JLabel();
        reel4 = new javax.swing.JLabel();
        reel3 = new javax.swing.JLabel();
        reel2 = new javax.swing.JLabel();
        reel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LBLBalance = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BTNIncBet = new javax.swing.JButton();
        BTNDecBet = new javax.swing.JButton();
        BTNSpin = new javax.swing.JButton();
        BTNAuto = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuInfo = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel6.setText("StarBlock");

        LBLName.setText("Player: " +player.returnName());

        LBLBet.setText("Current Bet: " + currency.returnCurrency(CurrentBet));

        reel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/6.jpg"))); // NOI18N

        reel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4.jpg"))); // NOI18N

        reel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.jpg"))); // NOI18N

        reel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3.jpg"))); // NOI18N

        reel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/6.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reel1)
                .addGap(18, 18, 18)
                .addComponent(reel2)
                .addGap(18, 18, 18)
                .addComponent(reel3)
                .addGap(18, 18, 18)
                .addComponent(reel4)
                .addGap(18, 18, 18)
                .addComponent(reel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel8.setText(Update.version);

        LBLBalance.setText("Balance: "+currency.returnCurrency(player.returnBalance()));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(LBLBalance)
                .addGap(0, 38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LBLBalance)
        );

        BTNIncBet.setText("Increase Bet");
        BTNIncBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIncBetActionPerformed(evt);
            }
        });

        BTNDecBet.setText("Decrease Bet");
        BTNDecBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDecBetActionPerformed(evt);
            }
        });

        BTNSpin.setText("Spin!");
        BTNSpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSpinActionPerformed(evt);
            }
        });

        BTNAuto.setText("Auto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNDecBet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNIncBet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNSpin)
                    .addComponent(BTNAuto)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNIncBet)
                    .addComponent(BTNSpin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNDecBet)
                    .addComponent(BTNAuto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");

        mnuInfo.setText("Info");
        mnuInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInfoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuInfo);

        mnuExit.setText("Exit Game");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLName)
                            .addComponent(LBLBet)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBLName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBLBet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNSpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSpinActionPerformed
        // TODO add your handling code here:
        if (Balance >= CurrentBet) {
            BTNSpin.setEnabled(false);
            BTNAuto.setEnabled(false);
            BTNIncBet.setEnabled(false);
            BTNDecBet.setEnabled(false);
            Balance -= CurrentBet;
            updateBalance();
            spin();
        } else {
            JOptionPane.showMessageDialog(null, "Your balance is too low for this bet", "Insufficient Funds", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BTNSpinActionPerformed

    private void BTNIncBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIncBetActionPerformed
        // TODO add your handling code here:

        if (!currency.returnCurrency(CurrentBet).equals("£10.00")) {
            CurrentBet += IncramentNumber;
            updateBet();
        }

    }//GEN-LAST:event_BTNIncBetActionPerformed

    private void BTNDecBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDecBetActionPerformed
        // TODO add your handling code here:
        if (!currency.returnCurrency(CurrentBet).equals("£1.00")) {
            CurrentBet -= IncramentNumber;
            updateBet();

        }
    }//GEN-LAST:event_BTNDecBetActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        //Exit back to the Casino application. Ensure to pass the username, password and domain boolean back to the application.
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInfoActionPerformed
        new Info().setVisible(true);
    }//GEN-LAST:event_mnuInfoActionPerformed

    private void updateBet() {
        LBLBet.setText("Current Bet: " + currency.returnCurrency(CurrentBet));

    }

    private void updateBalance() {
        LBLBalance.setText("Balance: " + currency.returnCurrency(Balance));

    }
    User player = new User();

    public Game(String args[]) {
        player.setID(args[0]);
        player.setName(args[1]);
        player.setActive(Boolean.valueOf(args[2]));
        player.setBalance(Double.valueOf(args[3]));
        player.setAddress(args[4]);
        player.setPassword(args[5]);
        player.setPhoneNo(Integer.valueOf(args[6]));
        ID = player.returnID();
        Balance = player.returnBalance();
        try {
            if (update.check()) {
                update.available();
            } else {
                initComponents();
            }
        } catch (Exception ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void spin() {
        System.out.println("Spinning reels...");
        Thread t = new Thread() {
            @Override
            public void run() {
                int spinFor = rand.nextInt(15);
                while (spinFor <= 5) {
                    spinFor = rand.nextInt(15);
                }
                for (int i = 0; i < spinFor * 5; i++) {
                    if (i < spinFor) {
                        reels[0] += 1;
                    }
                    if (i < spinFor * 2 - 2) {
                        reels[1] += 1;
                    }
                    if (i < spinFor * 3 + 1) {
                        reels[2] += 1;
                    }
                    if (i < spinFor * 4 - 4) {
                        reels[3] += 1;
                    }
                    if (i < spinFor * 5 - 5) {
                        reels[4] += 1;
                    }
                    updateReels();
                    Sleep();
                }
                Balance += win.checkForWin(reels, CurrentBet);
                updateBalance();
                BTNSpin.setEnabled(true);
                BTNAuto.setEnabled(true);
                BTNIncBet.setEnabled(true);
                BTNDecBet.setEnabled(true);
            }
        };
        t.start();
    }

    private void updateReels() {
        for (int i = 0; i < 5; i++) {
            if (reels[i] > 7) {
                reels[i] = 1;
            }
        }
        reel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/" + reels[0] + ".jpg")));
        reel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/" + reels[1] + ".jpg")));
        reel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/" + reels[2] + ".jpg")));
        reel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/" + reels[3] + ".jpg")));
        reel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/" + reels[4] + ".jpg")));
    }

    private void Sleep() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Game(args).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAuto;
    private javax.swing.JButton BTNDecBet;
    private javax.swing.JButton BTNIncBet;
    private javax.swing.JButton BTNSpin;
    private javax.swing.JLabel LBLBalance;
    private javax.swing.JLabel LBLBet;
    private javax.swing.JLabel LBLName;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuInfo;
    private javax.swing.JLabel reel1;
    private javax.swing.JLabel reel2;
    private javax.swing.JLabel reel3;
    private javax.swing.JLabel reel4;
    private javax.swing.JLabel reel5;
    // End of variables declaration//GEN-END:variables
}
