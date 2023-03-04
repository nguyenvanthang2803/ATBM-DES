/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atbm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */

public class main extends javax.swing.JFrame{

    /**
     * Creates new form main
     */
    public main() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JEncrypt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JKey = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnEnCrypt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JDecrypt = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JPlainText = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        JTimeEn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTimeDe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("MÃ HÓA DES");

        JEncrypt.setColumns(20);
        JEncrypt.setRows(5);
        JEncrypt.setWrapStyleWord(true);
        jScrollPane1.setViewportView(JEncrypt);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Bản Rõ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Khóa (8 ký tự ASCII)");

        JKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JKeyActionPerformed(evt);
            }
        });

        jButton1.setText("Chọn File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEnCrypt.setText("Mã Hóa");
        btnEnCrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnCryptActionPerformed(evt);
            }
        });

        JDecrypt.setColumns(20);
        JDecrypt.setRows(5);
        jScrollPane2.setViewportView(JDecrypt);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Bản Mã");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("Hướng dẫn :Yêu cầu nhập đúng đủ thông tin, bản rõ không được là tiếng việt và khóa phải đủ 8 ký tự ASCII");

        jButton2.setText("Giải Mã");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JPlainText.setColumns(20);
        JPlainText.setRows(5);
        jScrollPane3.setViewportView(JPlainText);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Văn Bản Giải Mã");

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        JTimeEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTimeEnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Thời gian mã hóa");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Thời gian giải mã hóa");

        JTimeDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTimeDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEnCrypt)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(140, 140, 140)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8)
                                            .addComponent(jScrollPane3)
                                            .addComponent(JTimeDe)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(106, 106, 106))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)
                                    .addComponent(JKey, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTimeEn, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnEnCrypt)
                                .addGap(147, 147, 147))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTimeEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTimeDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JKeyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter textFile = new FileNameExtensionFilter("Chon file","txt");
        filechooser.setFileFilter(textFile);
        filechooser.setMultiSelectionEnabled(false);
         String oriText = "";
        int x = filechooser.showDialog(this, "chon file");
        if ( x == JFileChooser.APPROVE_OPTION){
            File file = filechooser.getSelectedFile();
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));
                String line = reader.readLine();
                while (line != null) {
                oriText+=line+" ";
                System.out.println(line);
                line = reader.readLine();

            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                reader.close();
                // file.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        }
        JEncrypt.setText(oriText);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEnCryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnCryptActionPerformed
        // TODO add your handling code here:
        boolean checkInput = false;
        String oriText = JEncrypt.getText();
        String keyInput = JKey.getText();
        if (oriText==""||keyInput=="" || keyInput.length()!=8){
            JOptionPane.showMessageDialog(this, "Yêu cầu nhập đúng đủ thông tin, bản rõ không được là tiếng việt và khóa phải đủ 8 ký tự ASCII");
        }else {
        final long startTime = System.currentTimeMillis();
        System.out.println(oriText);
        if (oriText.contains("\n")){
            oriText=oriText.replaceAll("\n", " ");
        }
        while (oriText.contains("  ")){
        oriText = oriText.replaceAll("  "," ");
        }
        System.out.println(oriText);
        
        byte[] keys = keyInput.getBytes(StandardCharsets.UTF_8); // chuyển chuỗi String sang Byte
        byte[] test = oriText.getBytes(StandardCharsets.UTF_8); // Chuổi chuyễn String sang Byte
        int phanbu = 8 - test.length%8;
        //System.out.println("Key:  " + hexToAscii(hex(keys)));
        String result = hex(encryptCBC(test, keys,phanbu));// Mã Hóa
//        System.out.println("Ban ro duoi dang Hex :  " + hex(test));
//        System.out.println("Van Ban ma hoa duoi dang hex:  " + result);
//        System.out.println("Van ban ma hoa ASCII: " + hexToAscii(result));
        JDecrypt.setText(hexToAscii(result));
        final long endTime = System.currentTimeMillis();
        JTimeEn.setText(String.valueOf(endTime-startTime));
        }
    }//GEN-LAST:event_btnEnCryptActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        final long startTime = System.currentTimeMillis();
        String result = convertStringToHex(JDecrypt.getText());
        byte [] kqBytes = parseBytes(result);
        String keyInput = JKey.getText();
        byte[] keys = keyInput.getBytes(StandardCharsets.UTF_8);
        String decResult = hex(decryptCBC(kqBytes,keys));

        JPlainText.setText(hexToUtf8(decResult));
        final long endTime = System.currentTimeMillis();
        JTimeDe.setText(String.valueOf(endTime-startTime));
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JEncrypt.setText("");
        JDecrypt.setText("");
        JKey.setText("");
        JPlainText.setText("");
        JTimeDe.setText("");
        JTimeEn.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JTimeEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTimeEnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTimeEnActionPerformed

    private void JTimeDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTimeDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTimeDeActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    private static long IV;

    public static long getIv() {
        return IV;
    }

    public static void setIv(long iv) {
        IV = iv;
    }

    /** Input permutation */
    private static final byte[] IP = {
            58, 50, 42, 34, 26, 18, 10, 2,
            60, 52, 44, 36, 28, 20, 12, 4,
            62, 54, 46, 38, 30, 22, 14, 6,
            64, 56, 48, 40, 32, 24, 16, 8,
            57, 49, 41, 33, 25, 17, 9, 1,
            59, 51, 43, 35, 27, 19, 11, 3,
            61, 53, 45, 37, 29, 21, 13, 5,
            63, 55, 47, 39, 31, 23, 15, 7
    };
    /** Final permutation */
    private static final byte[] FP = {
            40, 8, 48, 16, 56, 24, 64, 32,
            39, 7, 47, 15, 55, 23, 63, 31,
            38, 6, 46, 14, 54, 22, 62, 30,
            37, 5, 45, 13, 53, 21, 61, 29,
            36, 4, 44, 12, 52, 20, 60, 28,
            35, 3, 43, 11, 51, 19, 59, 27,
            34, 2, 42, 10, 50, 18, 58, 26,
            33, 1, 41, 9, 49, 17, 57, 25
    };
    /**Expansion Permutation, expand from 32 bit to 48 bit*/
    private static final byte[] E = {
            32, 1, 2, 3, 4, 5,
            4, 5, 6, 7, 8, 9,
            8, 9, 10, 11, 12, 13,
            12, 13, 14, 15, 16, 17,
            16, 17, 18, 19, 20, 21,
            20, 21, 22, 23, 24, 25,
            24, 25, 26, 27, 28, 29,
            28, 29, 30, 31, 32, 1
    };
    /** S-Box */
    private static final byte[][] S = {{
            14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7,
            0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8,
            4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0,
            15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13
    }, {
            15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10,
            3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5,
            0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15,
            13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9
    }, {
            10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8,
            13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1,
            13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7,
            1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12
    }, {
            7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15,
            13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9,
            10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4,
            3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14
    }, {
            2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9,
            14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6,
            4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14,
            11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3
    }, {
            12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11,
            10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8,
            9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6,
            4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13
    }, {
            4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1,
            13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6,
            1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2,
            6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12
    }, {
            13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7,
            1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2,
            7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8,
            2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11
    }};
    /**Permutation, result from The Feistel will use it to make Right for next round */
    private static final byte[] P = {
            16, 7, 20, 21,
            29, 12, 28, 17,
            1, 15, 23, 26,
            5, 18, 31, 10,
            2, 8, 24, 14,
            32, 27, 3, 9,
            19, 13, 30, 6,
            22, 11, 4, 25
    };
    /** PC1 make key from 64bit to 56bit */
    private static final byte[] PC1 = {
            57, 49, 41, 33, 25, 17, 9,
            1, 58, 50, 42, 34, 26, 18,
            10, 2, 59, 51, 43, 35, 27,
            19, 11, 3, 60, 52, 44, 36,
            63, 55, 47, 39, 31, 23, 15,
            7, 62, 54, 46, 38, 30, 22,
            14, 6, 61, 53, 45, 37, 29,
            21, 13, 5, 28, 20, 12, 4
    };
    /**
         * PC2 Permutation.  The subkey generation process applies this
         * permutation to transform its running 56-bit keystuff value into
         * the final set of 16 48-bit subkeys.
         */
    private static final byte[] PC2 = {
            14, 17, 11, 24, 1, 5,
            3, 28, 15, 6, 21, 10,
            23, 19, 12, 4, 26, 8,
            16, 7, 27, 20, 13, 2,
            41, 52, 31, 37, 47, 55,
            30, 40, 51, 45, 33, 48,
            44, 49, 39, 56, 34, 53,
            46, 42, 50, 36, 29, 32
    };
    /**cyclic shift rotate bit left for each of 16steps */
    private static final byte[]     rotations = {
            1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1
    };
    private static long IP(long src) {
        return permute(IP, 64, src);
    } // 64-bit output

    private static long FP(long src) {
        return permute(FP, 64, src);
    } // 64-bit output

    private static long E(int src) {
        return permute(E, 32, src & 0xFFFFFFFFL);
    } // 48-bit output

    private static int P(int src) {
        return (int) permute(P, 32, src & 0xFFFFFFFFL);
    } // 32-bit output

    private static long PC1(long src) {
        return permute(PC1, 64, src);
    } // 56-bit output

    private static long PC2(long src) {
        return permute(PC2, 56, src);
    } // 48-bit output



  
    // hàm hoán vị kết quả trả về phụ thuộc vào độ dài của bảng table
    private static long permute(byte[] table, int srcWidth, long src) {
        long dst = 0;
        for (int i = 0; i < table.length; i++) {
            int srcPos = srcWidth - table[i];
            long a = src >> srcPos & 0x01;
            long b = dst << 1;
            //dst = (dst << 1) | (src >> srcPos & 0x01);
            dst = a | b;
        }
        return dst;
    }
  
    // Hàm S box
    private static byte S(int boxNumber, byte src) {
        // The first aindex based on the following bit shuffle:
        // abcdef => afbcde
       // src = (byte) (src & 0x20 | ((src & 0x01) << 4) | ((src & 0x1E) >> 1));
        int a  = src &0x20; // 0010000
        int b = (src & 0x01 ) <<4; // 000000001 >> 4 => 0001000
        int c = ((src & 0x1E) >> 1);  // 00001110 >>1 => 00000111
        src = (byte)(a|b|c);
        return S[boxNumber - 1][src];
    }

 

    // Hàm trả về một dãy long 64 bit từ mảng 'ba' bắt đầu từ offset, nếu không đủ thì thêm 0 để đủ 64 bit
    private static long getLongFromBytes(byte[] ba, int offset) {
        long l = 0;
        for (int i = 0; i < 8; i++) {
            byte value;
            if ((offset + i) < ba.length) {
                // and last bits determine which 16-value row to
                // reference, so we transform the 6-bit input into an
                // absolute
                value = ba[offset + i];
            } else {
                value = 0;
            }
            l = l << 8 | (value & 0xFFL);
        }
        return l;
    }
    //Hàm đẩy dãy long l vào mảng 'ba' theo vị trí offset
    private static void getBytesFromLongE(byte[] ba, int offset, long l) {
        for (int i = 7; i > -1; i--) {
            if ((offset + i) < ba.length) {
                ba[offset + i] = (byte) (l & 0xFF);
                l = l >> 8;
            } else {
                continue;
            }
        }
    }
        //Hàm đẩy dãy long l vào mảng 'ba' theo vị trí offset
        private static void getBytesFromLongD(byte[] ba, int offset, long l) {
            for (int i = 7; i > -1; i--) {
                if ((offset + i) < ba.length) {
                    ba[offset + i] = (byte) (l & 0xFF);
                    l = l >> 8;
                } else {
                    l = l >> 8;
                    continue;
                }
            }
        }
   
        //Hàm Feistel
    private static int feistel(int r, /* 48 bits */ long subkey) {
        // 1. expansion
        long e = E(r);
        // 2. key mixing
        long x = e ^ subkey;
        // 3. substitution
            int dst = 0;
        for (int i = 0; i < 8; i++) {
            dst >>>= 4;
            int s = S(8 - i, (byte) (x & 0x3F)); // 00111111
            s = s<<28;
            dst = dst | s;
            //dst |= s << 28;
            x >>= 6;
        }
        // 4. permutation
        return P(dst);
    }
    
    //hàm sinh 16 khóa 48 bit từ khóa 64 bit đầu vào
    private static long[] createSubkeys(/* 64 bits */ long key) {
        long subkeys[] = new long[16];

        // perform the PC1 permutation
        key = PC1(key);

        // split into 28-bit left and right (c and d) pairs.
        int c = (int) (key >> 28);
        int d = (int) (key & 0x0FFFFFFF);

        // for each of the 16 needed subkeys, perform a bit
        // rotation on each 28-bit keystuff half, then join
        // the halves together and permute to generate the
        // subkey.
        for (int i = 0; i < 16; i++) {
            // rotate the 28-bit values
            if (rotations[i] == 1) {
                // rotate by 1 bit
                c = ((c << 1) & 0x0FFFFFFF) | (c >> 27);
                d = ((d << 1) & 0x0FFFFFFF) | (d >> 27);
            } else {
                // rotate by 2 bits
                c = ((c << 2) & 0x0FFFFFFF) | (c >> 26);
                d = ((d << 2) & 0x0FFFFFFF) | (d >> 26);
            }

            // join the two keystuff halves together.
            long cd = (c & 0xFFFFFFFFL) << 28 | (d & 0xFFFFFFFFL);

            // perform the PC2 permutation
            subkeys[i] = PC2(cd);
        }

        return subkeys; /* 48-bit values */
    }
   
    //Khối mã hóa, mã hóa khối đầu vào theo từng khối 8byte, nếu không đủ 8byte thì thêm 0 vào chuối, và thêm một khối 8byte ở cuỗi để mã hóa chiều dài của khối
    public static byte[] encryptCBC(byte[] message, byte[] key,int phanbu) {
        int i;
        long cipherBlock;
        byte[] ciphertext = new byte[message.length+phanbu+8];
        long k = getLongFromBytes(key, 0);
        long previousCipherBlock = IV;
        long length = message.length;

        for (i = 0; i < message.length+phanbu; i += 8) {
            // get the message block to be encrypted (8bytes = 64bits)
            long messageBlock = getLongFromBytes(message, i);

            // XOR message block with previous cipherblock and encrypt
            // First previousCiphertext = Initial Vector (IV)
            cipherBlock = encryptBlock(messageBlock ^ previousCipherBlock, k);

            // Store the cipherBlock in the correct position in ciphertext
            getBytesFromLongE(ciphertext, i, cipherBlock);

            // Update previousCipherBlock
            previousCipherBlock = cipherBlock;
        }
            cipherBlock = encryptBlock(length,k);
            getBytesFromLongE(ciphertext,i,cipherBlock);
        return ciphertext;
    }
   
       //Hàm mã hóa
    public static long encryptBlock(long m, /* 64 bits */ long key) {
        // generate the 16 subkeys
        long subkeys[] = createSubkeys(key);

        // perform the initial permutation
        long ip = IP(m);

        // split the 32-bit value into 16-bit left and right halves.
        int l = (int) (ip >> 32);
        int r = (int) (ip & 0xFFFFFFFFL);

        // perform 16 rounds
        for (int i = 0; i < 16; i++) {
            int previous_l = l;
            // the right half becomes the new left half.
            l = r;
            // the Feistel function is applied to the old left half
            // and the resulting value is stored in the right half.
            r = previous_l ^ feistel(r, subkeys[i]);
        }

        // reverse the two 32-bit segments (left to right; right to left)
        long rl = (r & 0xFFFFFFFFL) << 32 | (l & 0xFFFFFFFFL);

        // apply the final permutation
        long fp = FP(rl);

        // return the ciphertext
        return fp;
    }
    //Hàm xác định giá trị binary của từng ký tự ascii
    private static int charToNibble(char c) {
        if (c >= '0' && c <= '9') {
            return (c - '0');
        } else if (c >= 'a' && c <= 'f') {
            return (10 + c - 'a');
        } else if (c >= 'A' && c <= 'F') {
            return (10 + c - 'A');
        } else {
            return 0;
        }
    }
    // Hàm chuyển từ String sang Byte
    private static byte[] parseBytes(String s) {
        s = s.replace(" ", "");
        int a = s.length();
        if (s.length() % 2 > 0) {
            s = s + '0';
        }
        byte[] ba = new byte[s.length() / 2];

        int m =s.length();
        for (int i = 0; i < s.length(); i += 2) {
            //ba[i / 2] = (byte) (charToNibble(s.charAt(i)) << 4 | charToNibble(s.charAt(i + 1)));
            int c =  charToNibble(s.charAt(i));
            c=  c << 4;
            int d = charToNibble((s.charAt(i+1)));
            ba[i / 2] = (byte) (c|d);
        }
        return ba;
    }
    //Hàm chuyển dãy byte đầu vào sang một chuỗi Hex
    private static String hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(String.format("%02X ", bytes[i]));
        }
        return sb.toString();
    }
       //Hàm chuyển chuỗi String đầu vào sang chuỗi String hex
     public static String convertStringToHex(String str) {
        char[] chars = str.toCharArray();
        StringBuilder hex = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            hex.append(String.format("%02X ", (int) chars[i]));
        }
        return hex.toString();
    }
     // hàm giải mã hóa
    public static long decryptBlock(long c, /* 64 bits */ long key) {
        // generate the 16 subkeys
        long[] subkeys = createSubkeys(key);

        // perform the initial permutation
        long ip = IP(c);

        // split the 32-bit value into 16-bit left and right halves.
        int l = (int) (ip >> 32);
        int r = (int) (ip & 0xFFFFFFFFL);

        // perform 16 rounds
        // NOTE: reverse order of subkeys used!
        for (int i = 15; i > -1; i--) {
            int previous_l = l;
            // the right half becomes the new left half.
            l = r;
            // the Feistel function is applied to the old left half
            // and the resulting value is stored in the right half.
            r = previous_l ^ feistel(r, subkeys[i]);
        }

        // reverse the two 32-bit segments (left to right; right to left)
        long rl = (r & 0xFFFFFFFFL) << 32 | (l & 0xFFFFFFFFL);

        // apply the final permutation
        long fp = FP(rl);

        // return the message
        return fp;
    }
   
    //Khối giải mã hóa, đầu tiên sẽ mà hõa 8byte cuối cùng để lấy ra được chiều dài thực của khối mã hóa
    public static byte[] decryptCBC(byte[] ciphertext, byte[] key) {
        long k = getLongFromBytes(key, 0);
        long lengthBlock = getLongFromBytes(ciphertext,ciphertext.length-8);
        long length = decryptBlock(lengthBlock,k);
        byte[] message = new byte[(int)length];

        long previousCipherBlock = IV;

        for (int i = 0; i < ciphertext.length; i += 8) {
            // get the cipher block to be decrypted (8bytes = 64bits)
            long cipherBlock = getLongFromBytes(ciphertext, i);

            // Decrypt the cipher block and XOR with previousCipherBlock
            // First previousCiphertext = Initial Vector (IV)
            long messageBlock = decryptBlock(cipherBlock, k);
            messageBlock = messageBlock ^ previousCipherBlock;

            // Store the messageBlock in the correct position in message
            getBytesFromLongD(message, i, messageBlock);

            // Update previousCipherBlock
           // previousCipherBlock = cipherBlock;
             previousCipherBlock = cipherBlock;
        }

        return message;
    }
  
    //Hàm chuyển chuỗi hex sang các ký tự Ascii
    private static String hexToAscii(String hexStr) {
        hexStr = hexStr.replace(" ", "");
        StringBuilder output = new StringBuilder("");

        for (int i = 0; i < hexStr.length(); i += 2) {
            String str = hexStr.substring(i, i + 2);
            output.append((char) Integer.parseInt(str,16));
        }

        return output.toString();
    }
    //Hàm chuyển chuỗi hex sang các ký tự tiếng việt
    public static String hexToUtf8(String hexStr) {
        hexStr = hexStr.replace(" ", "");
        byte[] bytes = new byte[hexStr.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer.parseInt(hexStr.substring(2 * i, 2 * i + 2), 16);
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JDecrypt;
    private javax.swing.JTextArea JEncrypt;
    private javax.swing.JTextField JKey;
    private javax.swing.JTextArea JPlainText;
    private javax.swing.JTextField JTimeDe;
    private javax.swing.JTextField JTimeEn;
    private javax.swing.JButton btnEnCrypt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
