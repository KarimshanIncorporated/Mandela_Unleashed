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
    LOSER lose = new LOSER();
    MandelaMain m = new MandelaMain();
    public static Audio mus = new Audio();
    public int chapter = 1;
    private int tLine = 0;
    private int choice = 0;
    private int ender = 0;

//Creates new form GameGUI
    public GameGUI() {
        initComponents();
        jTextArea1.setText(one.print(tLine));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/prologuepic.jpg")));
        mus.setName("Chapter_1.mp3");
        mus.playAudio();
    }

    public void typeNext() {
        jTextArea1.setText("");
        if(chapter == 1) {
            if(one.isChoice(tLine)){
                jTextArea1.setText("You must make a choice!\n");
                jTextArea1.append(one.print(tLine));
            }
            else if(one.isBadEnd(tLine)){
                mus.STOP();
                mus.setName("loss_screen.mp3");
                mus.playAudio();
                setVisible(false);
                m.initializeLOSER(lose);
            }
            else if(one.isEnd(tLine)) {
                jTextArea1.setText(one.print(tLine));
                chapter++;
                tLine = 0;
            }
            else{
                tLine++;
                jTextArea1.setText(one.print(tLine));
                if(tLine == 17) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/a1.jpg")));
                }
                if(tLine == 25) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/611-6.jpg")));
                }
            }
        }
        else if(chapter == 2) {
            if(two.isChoice(tLine)){
                jTextArea1.setText("You must make a choice!\n");
                jTextArea1.append(two.print(tLine));
            }
            else if(two.isBadEnd(tLine)){
                mus.STOP();
                mus.setName("loss_screen.mp3");
                mus.playAudio();
                setVisible(false);
                m.initializeLOSER(lose);
            }
            else if(two.isEnd(tLine)) {
                jTextArea1.setText(two.print(tLine));
                chapter++;
                tLine = 0;
            }
            else if(tLine == 0) {
                    mus.STOP();
                    mus.setName("Chapter_2.mp3");
                    mus.playAudio();
                    jTextArea1.setText(two.print(tLine));
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/farm_raid.jpg")));
                    tLine++;
                }
            else{
                tLine++;
                jTextArea1.setText(two.print(tLine));
                if(tLine == 5) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/prisons_black_inmates.jpg")));
                }
                if(tLine == 14) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/apn22976-640.jpg")));
                }
            }
        }
        else if(chapter == 3) {
            if(three.isChoice(tLine)){
                jTextArea1.setText("You must make a choice!\n");
                jTextArea1.append(three.print(tLine));
            }
            else if(three.isBadEnd(tLine)){
                mus.STOP();
                mus.setName("loss_screen.mp3");
                mus.playAudio();
                setVisible(false);
                m.initializeLOSER(lose);
            }
            else if(three.isEnd(tLine)) {
                System.exit(0);
            }
            else if(tLine == 0) {
                    mus.STOP();
                    mus.setName("Chapter_3.mp3");
                    mus.playAudio();
                     jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/pres_mand.jpg")));
                     jTextArea1.setText(three.print(tLine));
                     tLine++;
                }
            else{
                tLine++;
                jTextArea1.setText(three.print(tLine));
                if(tLine == 8) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/w3-mandela-a-20131210.jpg")));
                }
                if(tLine == 12) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/springboks-vs-allblacks-2-springbokrugby.jpg")));
                }
                if(tLine == 16) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Beautiful Table Bay in Cape Town, South Africa.jpg")));
                }
            }
        }
    }
    public void typeChoice() {
        jTextArea1.setText("");
        
            if(chapter == 1) {
                if(one.isChoice(tLine)) {
                    if(tLine == 3){
                        if(choice == 1) {
                            tLine = 4;
                            jTextArea1.setText(one.print(tLine));
                            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/firstchoicepic.jpg")));
                        }
                        if(choice == 2) {
                            tLine = 26;
                            jTextArea1.setText(one.print(tLine));
                        }
                        if(choice == 3) {
                            jTextArea1.setText("You cannot make this decision. Pick again.\n");
                            jTextArea1.append(one.print(tLine));
                        }
                    }
                    else if(tLine == 6) {
                        if(choice == 1) {
                            tLine = 27;
                            jTextArea1.setText(one.print(tLine));
                        }
                        if(choice == 2) {
                            tLine = 7;
                            jTextArea1.setText(one.print(tLine));
                        }
                        if(choice == 3) {
                            jTextArea1.setText("You cannot make this decision. Pick again.\n");
                            jTextArea1.append(one.print(tLine));
                        }
                    }
                    else if(tLine == 9) {
                        if(choice == 1) {
                            tLine = 28;
                            jTextArea1.setText(one.print(tLine));
                        }
                        if(choice == 2) {
                            tLine = 10;
                            jTextArea1.setText(one.print(tLine));
                        }
                        if(choice == 3) {
                            jTextArea1.setText("You cannot make this decision. Pick again.\n");
                            jTextArea1.append(one.print(tLine));
                        }
                    }
                    else if(tLine == 14){
                        if(choice == 1) {
                            tLine = 29;
                            jTextArea1.setText(one.print(tLine));
                        }
                        if(choice == 2) {
                            tLine = 33;
                            jTextArea1.setText(one.print(tLine));
                        }
                        if(choice == 3) {
                            tLine = 15;
                            jTextArea1.setText(one.print(tLine));
                        }
                    }
                    else if(tLine == 21){
                        if(choice == 1) {
                            tLine = 22;
                            jTextArea1.setText(one.print(tLine));
                        }
                        if(choice == 2) {
                            tLine = 34;
                            jTextArea1.setText(one.print(tLine));
                        }
                        if(choice == 3) {
                            jTextArea1.setText("You cannot make this decision. Pick again.\n");
                            jTextArea1.append(one.print(tLine));
                        }
                    }
                }
                else {
                    jTextArea1.setText("You cannot make a choice here. Press next.\n");
                    jTextArea1.append(one.print(tLine));
                }
            }
            if(chapter == 2) {
                if(two.isChoice(tLine)) {
                    if(tLine == 3){
                        if(choice == 1) {
                            tLine = 4;
                            jTextArea1.append(two.print(tLine));
                        }
                        if(choice == 2) {
                            tLine = 17;
                            jTextArea1.append(two.print(tLine));
                        }
                        if(choice == 3) {
                            jTextArea1.setText("You cannot make this decision. Pick again.\n");
                            jTextArea1.append(two.print(tLine));
                        }
                    }
                    else if(tLine == 9) {
                        if(choice == 1) {
                            tLine = 10;
                            jTextArea1.append(two.print(tLine));
                        }
                        if(choice == 2) {
                            tLine = 18;
                            jTextArea1.append(two.print(tLine));
                        }
                        if(choice == 3) {
                            jTextArea1.setText("You cannot make this decision. Pick again.\n");
                            jTextArea1.append(two.print(tLine));
                        }
                    }
                    else if(tLine == 14) {
                        if(choice == 1) {
                            tLine = 20;
                            jTextArea1.append(two.print(tLine));
                        }
                        if(choice == 2) {
                            tLine = 15;
                            jTextArea1.append(two.print(tLine));
                        }
                        if(choice == 3) {
                            jTextArea1.append(two.print(tLine));
                        }
                    }
                }
                else {
                    jTextArea1.setText("You cannot make a choice here. Press next. \n");
                    jTextArea1.append(two.print(tLine));
                }
            }
            if(chapter == 3) {
                if(three.isChoice(tLine)) {
                    if(tLine == 2){
                        if(choice == 1) {
                            tLine = 17;
                            jTextArea1.append(three.print(tLine));
                        }
                        if(choice == 2) {
                            tLine = 3;
                            jTextArea1.append(three.print(tLine));
                        }
                        if(choice == 3) {
                            jTextArea1.setText("You cannot make this decision. Pick again.\n");
                            jTextArea1.append(three.print(tLine));
                        }
                    }
                    else if(tLine == 6) {
                        if(choice == 1) {
                            tLine =  7;
                            jTextArea1.append(three.print(tLine));
                        }
                        if(choice == 2) {
                            tLine = 18;
                            jTextArea1.append(three.print(tLine));
                        }
                        if(choice == 3) {
                            jTextArea1.setText("You cannot make this decision. Pick again.\n");
                            jTextArea1.append(three.print(tLine));
                        }
                    }
                    else if(tLine == 12) {
                        if(choice == 1) {
                            tLine = 13;
                            jTextArea1.append(three.print(tLine));
                        }
                        if(choice == 2) {
                            tLine = 19;
                            jTextArea1.append(three.print(tLine));
                        }
                        if(choice == 3) {
                            jTextArea1.setText("You cannot make this decision. Pick again.\n");
                            jTextArea1.append(three.print(tLine));
                        }
                    }
                }
                else {
                    jTextArea1.setText("You cannot make a choice here. Press next.\n");
                    jTextArea1.append(three.print(tLine));
                }
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
        jLabel3 = new javax.swing.JLabel();
        if(chapter == 1)
        Choice2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/guerillaMandela.png")));
        if(chapter == 2)
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/jailMandela.png"))); // NOI18N

        if(chapter == 3)
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/NelsonMandela.png"))); // NOI18N

        Choice2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        Choice2.setText("Choice 2");
        Choice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Choice2MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));

        Next.setText("Next");
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setLineWrap(true);
        jTextArea1.setEditable(false);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Choice1)
                        .addGap(75, 75, 75)
                        .addComponent(Choice2)
                        .addGap(70, 70, 70)
                        .addComponent(Choice3)
                        .addGap(18, 233, Short.MAX_VALUE)
                        .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}//end class GameGUI
