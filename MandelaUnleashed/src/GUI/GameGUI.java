/*
MANDELA UNLEASHED
Johnny Hoang, Aryan Sefidi
*/
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import PlotLibrary.*;

public class GameGUI extends javax.swing.JFrame {
    ChapterOne one = new ChapterOne();
    ChapterTwo two = new ChapterTwo();
    ChapterThree three = new ChapterThree();
    private int chapter = 1;
    private int tLine = 0;
    private int choice = 0;
    //Creates new form GameGUI
    public GameGUI() {
        initComponents();
    }

    public void typeNext() {
        textArea1.setText("");
        if(chapter == 1) {
            
        }
        if(chapter == 2) {
            
        }
        if(chapter == 3) {
            
        }
        
    }
    public void typeChoice() {
        textArea1.setText("");
        if(one.isChoice(tLine)) {   
            if(chapter == 1) {
                
            }
            if(chapter == 2) {
                
            }
            if(chapter == 3) {
                
            }
        }
        else {
            textArea1.setText("");
            textArea1.append(one.print(tLine));
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

        Choice3 = new javax.swing.JButton();
        Choice1 = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        jLabel3 = new javax.swing.JLabel();
        Choice2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        Choice3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        Choice3.setText("Choice 3");
        Choice3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Choice3MouseClicked(evt);
            }
        });

        Choice1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        Choice1.setText("Choice 1");
        Choice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Choice1MouseClicked(evt);
            }
        });

        textArea1.setEditable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/NelsonMandela.png"))); // NOI18N

        Choice2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        Choice2.setText("Choice 2");
        Choice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Choice2MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");

        Next.setText("Next");
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Choice1)
                        .addGap(75, 75, 75)
                        .addComponent(Choice2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Choice3))
                    .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Choice1)
                    .addComponent(Choice2)
                    .addComponent(Choice3)
                    .addComponent(Next))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Choice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Choice1MouseClicked
        choice = 1;
        typeChoice();
    }//GEN-LAST:event_Choice1MouseClicked

    private void Choice2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Choice2MouseClicked
        choice = 2;
        typeChoice();
    }//GEN-LAST:event_Choice2MouseClicked

    private void Choice3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Choice3MouseClicked
        choice = 3;
        typeChoice();
    }//GEN-LAST:event_Choice3MouseClicked

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        typeNext();
    }//GEN-LAST:event_NextMouseClicked

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
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Choice1;
    private javax.swing.JButton Choice2;
    private javax.swing.JButton Choice3;
    private javax.swing.JButton Next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}//end class GameGUI
