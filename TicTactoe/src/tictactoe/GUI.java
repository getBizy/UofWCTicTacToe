/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.*;

/**
 *
 * @author orion
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    //When it is true, X is the next move; 
    //When it is false, O is the next move.
    private boolean isPressed = false; 
    
    public GUI() {
        initComponents();
        setUserName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        gameborad = new javax.swing.JPanel();
        firstLine = new javax.swing.JPanel();
        zeroZero = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        zeroOne = new javax.swing.JButton();
        zeroTwo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        secondLine = new javax.swing.JPanel();
        oneZero = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        oneOne = new javax.swing.JButton();
        oneTwo = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        thridLine = new javax.swing.JPanel();
        twoZero = new javax.swing.JButton();
        twoOne = new javax.swing.JButton();
        twoTwo = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        humanScoreLabel = new javax.swing.JLabel();
        aiScoreLabel = new javax.swing.JLabel();
        aiNameBox = new javax.swing.JLabel();
        userNameBox = new javax.swing.JLabel();
        clearCountBt = new javax.swing.JButton();
        changeUserNameBt = new javax.swing.JButton();
        restartBt = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        zeroZero.setMaximumSize(new java.awt.Dimension(60, 60));
        zeroZero.setMinimumSize(new java.awt.Dimension(60, 60));
        zeroZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroZeroActionPerformed(evt);
            }
        });

        zeroOne.setMaximumSize(new java.awt.Dimension(60, 60));
        zeroOne.setMinimumSize(new java.awt.Dimension(60, 60));
        zeroOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroOneActionPerformed(evt);
            }
        });

        zeroTwo.setMaximumSize(new java.awt.Dimension(60, 60));
        zeroTwo.setMinimumSize(new java.awt.Dimension(60, 60));
        zeroTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroTwoActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout firstLineLayout = new javax.swing.GroupLayout(firstLine);
        firstLine.setLayout(firstLineLayout);
        firstLineLayout.setHorizontalGroup(
            firstLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstLineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(firstLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(firstLineLayout.createSequentialGroup()
                        .addComponent(zeroZero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(zeroOne, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(zeroTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        firstLineLayout.setVerticalGroup(
            firstLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstLineLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(firstLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zeroZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zeroOne, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(zeroTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        oneZero.setMaximumSize(new java.awt.Dimension(60, 60));
        oneZero.setMinimumSize(new java.awt.Dimension(60, 60));
        oneZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneZeroActionPerformed(evt);
            }
        });

        oneOne.setMaximumSize(new java.awt.Dimension(60, 60));
        oneOne.setMinimumSize(new java.awt.Dimension(60, 60));
        oneOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneOneActionPerformed(evt);
            }
        });

        oneTwo.setMaximumSize(new java.awt.Dimension(60, 60));
        oneTwo.setMinimumSize(new java.awt.Dimension(60, 60));
        oneTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneTwoActionPerformed(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout secondLineLayout = new javax.swing.GroupLayout(secondLine);
        secondLine.setLayout(secondLineLayout);
        secondLineLayout.setHorizontalGroup(
            secondLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondLineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(secondLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3)
                    .addGroup(secondLineLayout.createSequentialGroup()
                        .addComponent(oneZero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(oneOne, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(oneTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        secondLineLayout.setVerticalGroup(
            secondLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondLineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(secondLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oneZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oneOne, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(oneTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        twoZero.setMaximumSize(new java.awt.Dimension(60, 60));
        twoZero.setMinimumSize(new java.awt.Dimension(60, 60));
        twoZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoZeroActionPerformed(evt);
            }
        });

        twoOne.setMaximumSize(new java.awt.Dimension(60, 60));
        twoOne.setMinimumSize(new java.awt.Dimension(60, 60));
        twoOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoOneActionPerformed(evt);
            }
        });

        twoTwo.setMaximumSize(new java.awt.Dimension(60, 60));
        twoTwo.setMinimumSize(new java.awt.Dimension(60, 60));
        twoTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoTwoActionPerformed(evt);
            }
        });

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout thridLineLayout = new javax.swing.GroupLayout(thridLine);
        thridLine.setLayout(thridLineLayout);
        thridLineLayout.setHorizontalGroup(
            thridLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thridLineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(twoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(twoOne, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(twoTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        thridLineLayout.setVerticalGroup(
            thridLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thridLineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(thridLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(twoZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twoOne, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(twoTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator8)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout gameboradLayout = new javax.swing.GroupLayout(gameborad);
        gameborad.setLayout(gameboradLayout);
        gameboradLayout.setHorizontalGroup(
            gameboradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameboradLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameboradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(thridLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        gameboradLayout.setVerticalGroup(
            gameboradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameboradLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(firstLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(secondLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(thridLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        humanScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        humanScoreLabel.setText("0");

        aiScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aiScoreLabel.setText("0");

        aiNameBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aiNameBox.setText("P C");

        userNameBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameBox.setText("HUMAN");

        clearCountBt.setText("Clear Score");
        clearCountBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCountBtActionPerformed(evt);
            }
        });

        changeUserNameBt.setText("Change User Name");
        changeUserNameBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeUserNameBtActionPerformed(evt);
            }
        });

        restartBt.setText("Restart");
        restartBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(humanScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aiScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(userNameBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aiNameBox)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clearCountBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(changeUserNameBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(restartBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aiNameBox)
                    .addComponent(userNameBox))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aiScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(humanScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(restartBt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(clearCountBt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(changeUserNameBt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(gameborad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(gameborad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zeroZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroZeroActionPerformed
        // TODO add your handling code here:
        markX(zeroZero);
    }//GEN-LAST:event_zeroZeroActionPerformed

    private void zeroOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroOneActionPerformed
        // TODO add your handling code here:
        markX(zeroOne);
        //oneZero.setText("O");
    }//GEN-LAST:event_zeroOneActionPerformed

    private void zeroTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroTwoActionPerformed
        // TODO add your handling code here:
        markX(zeroTwo);
    }//GEN-LAST:event_zeroTwoActionPerformed

    private void oneZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneZeroActionPerformed
        // TODO add your handling code here:
        markX(oneZero);
    }//GEN-LAST:event_oneZeroActionPerformed

    private void oneOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneOneActionPerformed
        // TODO add your handling code here:
        markX(oneOne);
    }//GEN-LAST:event_oneOneActionPerformed

    private void oneTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneTwoActionPerformed
        // TODO add your handling code here:
        markX(oneTwo);
    }//GEN-LAST:event_oneTwoActionPerformed

    private void twoZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoZeroActionPerformed
        // TODO add your handling code here:
        markX(twoZero);
    }//GEN-LAST:event_twoZeroActionPerformed

    private void twoOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoOneActionPerformed
        // TODO add your handling code here:
        markX(twoOne);
    }//GEN-LAST:event_twoOneActionPerformed

    private void twoTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoTwoActionPerformed
        // TODO add your handling code here:
        markX(twoTwo);
    }//GEN-LAST:event_twoTwoActionPerformed

    private void clearCountBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCountBtActionPerformed
        // Clear coutings
        clearCouting();
    }//GEN-LAST:event_clearCountBtActionPerformed

    private void changeUserNameBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeUserNameBtActionPerformed
        // Clear Coutings and User Name and Restart 
        setUserName();
        clearCouting();
    }//GEN-LAST:event_changeUserNameBtActionPerformed

    private void restartBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBtActionPerformed
        //Reset all the text of all buttons
        zeroZero.setText("");
        zeroOne.setText("");
        zeroTwo.setText("");
        oneZero.setText("");
        oneOne.setText("");
        oneTwo.setText("");
        twoZero.setText("");
        twoOne.setText("");
        twoTwo.setText("");
    }//GEN-LAST:event_restartBtActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new GUI().setVisible(true);
            }
        });
    }
    
    private void markX(JButton n){
        /*if (n.getText() == "") {
            n.setText(isPressed? "X" : "O");
            isPressed = !isPressed;
        }*/
        n.setText("O");
    }
    
    private void setUserName() {
        String u = JOptionPane.showInputDialog(null, "Enter user name please");
        userNameBox.setText(u);
    }
    
    private void clearCouting(){
        aiScoreLabel.setText("0");
        humanScoreLabel.setText("0");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aiNameBox;
    private javax.swing.JLabel aiScoreLabel;
    private javax.swing.JButton changeUserNameBt;
    private javax.swing.JButton clearCountBt;
    private javax.swing.JPanel firstLine;
    private javax.swing.JPanel gameborad;
    private javax.swing.JLabel humanScoreLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton oneOne;
    private javax.swing.JButton oneTwo;
    private javax.swing.JButton oneZero;
    private javax.swing.JButton restartBt;
    private javax.swing.JPanel secondLine;
    private javax.swing.JPanel thridLine;
    private javax.swing.JButton twoOne;
    private javax.swing.JButton twoTwo;
    private javax.swing.JButton twoZero;
    private javax.swing.JLabel userNameBox;
    private javax.swing.JButton zeroOne;
    private javax.swing.JButton zeroTwo;
    private javax.swing.JButton zeroZero;
    // End of variables declaration//GEN-END:variables
}
