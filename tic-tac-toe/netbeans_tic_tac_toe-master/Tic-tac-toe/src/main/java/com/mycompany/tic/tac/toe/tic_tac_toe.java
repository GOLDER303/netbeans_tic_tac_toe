/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tic.tac.toe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class tic_tac_toe extends javax.swing.JFrame {
    
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    
    
    /**
     * Creates new form tic_tac_toe
     */
    public tic_tac_toe() {
        initComponents();
    }

    
    private void punkty()
    {
        graczxwynik.setText(String.valueOf(xCount));
        graczowynik.setText(String.valueOf(oCount));
    }
    
    
    private void wybor_gracza()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    private void WygranieGry()
    {
        String b1 = pole_pierwsze.getText();
        String b2 = pole_drugie.getText();
        String b3 = pole_trzecie.getText();
        
        String b4 = pole_czwarte.getText();
        String b5 = pole_piate.getText();
        String b6 = pole_szoste.getText();
        
        String b7 = pole_siodme.getText();
        String b8 = pole_osme.getText();
        String b9 = pole_dziewiate.getText();
        
        //GRACZ X
        
        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Gracz X wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_pierwsze.setBackground(Color.ORANGE);
            pole_drugie.setBackground(Color.ORANGE);
            pole_trzecie.setBackground(Color.ORANGE);
        }
        if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Gracz X wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_czwarte.setBackground(Color.ORANGE);
            pole_piate.setBackground(Color.ORANGE);
            pole_szoste.setBackground(Color.ORANGE);
        }
        if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Gracz X wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_siodme.setBackground(Color.ORANGE);
            pole_osme.setBackground(Color.ORANGE);
            pole_dziewiate.setBackground(Color.ORANGE);
        }
        if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Gracz X wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_pierwsze.setBackground(Color.ORANGE);
            pole_czwarte.setBackground(Color.ORANGE);
            pole_siodme.setBackground(Color.ORANGE);
        }
        if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Gracz X wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_drugie.setBackground(Color.ORANGE);
            pole_piate.setBackground(Color.ORANGE);
            pole_osme.setBackground(Color.ORANGE);
        }
        if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Gracz X wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_trzecie.setBackground(Color.ORANGE);
            pole_szoste.setBackground(Color.ORANGE);
            pole_dziewiate.setBackground(Color.ORANGE);
        }
        if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Gracz X wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_pierwsze.setBackground(Color.ORANGE);
            pole_piate.setBackground(Color.ORANGE);
            pole_dziewiate.setBackground(Color.ORANGE);
        }
        if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Gracz X wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_trzecie.setBackground(Color.ORANGE);
            pole_piate.setBackground(Color.ORANGE);
            pole_siodme.setBackground(Color.ORANGE);
        }
        //GRACZ O
        
        if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Gracz O wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_pierwsze.setBackground(Color.ORANGE);
            pole_drugie.setBackground(Color.ORANGE);
            pole_trzecie.setBackground(Color.ORANGE);
        }
        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Gracz O wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_czwarte.setBackground(Color.ORANGE);
            pole_piate.setBackground(Color.ORANGE);
            pole_szoste.setBackground(Color.ORANGE);
        }
        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Gracz O wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_siodme.setBackground(Color.ORANGE);
            pole_osme.setBackground(Color.ORANGE);
            pole_dziewiate.setBackground(Color.ORANGE);
        }
        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Gracz O wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_pierwsze.setBackground(Color.ORANGE);
            pole_czwarte.setBackground(Color.ORANGE);
            pole_siodme.setBackground(Color.ORANGE);
        }
        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Gracz O wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_drugie.setBackground(Color.ORANGE);
            pole_piate.setBackground(Color.ORANGE);
            pole_osme.setBackground(Color.ORANGE);
        }
        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Gracz O wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_trzecie.setBackground(Color.ORANGE);
            pole_szoste.setBackground(Color.ORANGE);
            pole_dziewiate.setBackground(Color.ORANGE);
        }
        if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Gracz O wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_pierwsze.setBackground(Color.ORANGE);
            pole_piate.setBackground(Color.ORANGE);
            pole_dziewiate.setBackground(Color.ORANGE);
        }
        if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Gracz O wygral", "Kolko krzyzyk", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            WygranieGry();
            
            pole_trzecie.setBackground(Color.ORANGE);
            pole_piate.setBackground(Color.ORANGE);
            pole_siodme.setBackground(Color.ORANGE);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pole_drugie = new javax.swing.JButton();
        pole_trzecie = new javax.swing.JButton();
        pole_pierwsze = new javax.swing.JButton();
        pole_szoste = new javax.swing.JButton();
        pole_piate = new javax.swing.JButton();
        pole_czwarte = new javax.swing.JButton();
        pole_dziewiate = new javax.swing.JButton();
        pole_osme = new javax.swing.JButton();
        pole_siodme = new javax.swing.JButton();
        wyjscie = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        graczo = new javax.swing.JLabel();
        graczx = new javax.swing.JLabel();
        graczxwynik = new javax.swing.JLabel();
        graczowynik = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic tac toe");

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Kółko i krzyżyk");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(390, 390, 390))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pole_drugie.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pole_drugie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pole_drugieActionPerformed(evt);
            }
        });

        pole_trzecie.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pole_trzecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pole_trzecieActionPerformed(evt);
            }
        });

        pole_pierwsze.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pole_pierwsze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pole_pierwszeActionPerformed(evt);
            }
        });

        pole_szoste.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pole_szoste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pole_szosteActionPerformed(evt);
            }
        });

        pole_piate.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pole_piate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pole_piateActionPerformed(evt);
            }
        });

        pole_czwarte.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pole_czwarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pole_czwarteActionPerformed(evt);
            }
        });

        pole_dziewiate.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pole_dziewiate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pole_dziewiateActionPerformed(evt);
            }
        });

        pole_osme.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pole_osme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pole_osmeActionPerformed(evt);
            }
        });

        pole_siodme.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pole_siodme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pole_siodmeActionPerformed(evt);
            }
        });

        wyjscie.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        wyjscie.setText("Wyjście");
        wyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyjscieActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        graczo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        graczo.setText("Gracz O:");

        graczx.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        graczx.setText("Gracz X:");

        graczxwynik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        graczxwynik.setText("xxxxxxxxxx");

        graczowynik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        graczowynik.setText("xxxxxxxxxx");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(graczx)
                    .addComponent(graczo))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graczowynik)
                    .addComponent(graczxwynik))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graczx)
                    .addComponent(graczxwynik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graczo)
                    .addComponent(graczowynik))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pole_siodme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pole_osme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pole_dziewiate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pole_czwarte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pole_piate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pole_szoste, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pole_pierwsze, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pole_drugie, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pole_trzecie, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(wyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pole_drugie, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pole_trzecie, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pole_pierwsze, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pole_piate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pole_szoste, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pole_czwarte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pole_osme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pole_dziewiate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pole_siodme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pole_pierwszeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pole_pierwszeActionPerformed
        // TODO add your handling code here:
        
        pole_pierwsze.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            pole_pierwsze.setForeground(Color.red);
        }
        else
        {
            pole_pierwsze.setForeground(Color.blue);
        }
        
        wybor_gracza();
        WygranieGry();
    }//GEN-LAST:event_pole_pierwszeActionPerformed

    private void pole_drugieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pole_drugieActionPerformed
        // TODO add your handling code here:
        pole_drugie.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            pole_drugie.setForeground(Color.red);
        }
        else
        {
            pole_drugie.setForeground(Color.blue);
        }
        
        wybor_gracza();
        WygranieGry();
    }//GEN-LAST:event_pole_drugieActionPerformed

    private void wyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyjscieActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Wyjscie");
        
        if(JOptionPane.showConfirmDialog(frame, "Nacisnij jesli chcesz wyjsc",
                "kolko krzyzyk", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_wyjscieActionPerformed

    private void pole_trzecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pole_trzecieActionPerformed
        // TODO add your handling code here:
        pole_trzecie.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            pole_trzecie.setForeground(Color.red);
        }
        else
        {
            pole_trzecie.setForeground(Color.blue);
        }
        
        wybor_gracza();
        WygranieGry();
    }//GEN-LAST:event_pole_trzecieActionPerformed

    private void pole_czwarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pole_czwarteActionPerformed
        // TODO add your handling code here:
        pole_czwarte.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            pole_czwarte.setForeground(Color.red);
        }
        else
        {
            pole_czwarte.setForeground(Color.blue);
        }
        
        wybor_gracza();
        WygranieGry();
    }//GEN-LAST:event_pole_czwarteActionPerformed

    private void pole_piateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pole_piateActionPerformed
        // TODO add your handling code here:
        pole_piate.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            pole_piate.setForeground(Color.red);
        }
        else
        {
            pole_piate.setForeground(Color.blue);
        }
        
        wybor_gracza();
        WygranieGry();
    }//GEN-LAST:event_pole_piateActionPerformed

    private void pole_szosteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pole_szosteActionPerformed
        // TODO add your handling code here:
        pole_szoste.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            pole_szoste.setForeground(Color.red);
        }
        else
        {
            pole_szoste.setForeground(Color.blue);
        }
        
        wybor_gracza();
        WygranieGry();
    }//GEN-LAST:event_pole_szosteActionPerformed

    private void pole_siodmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pole_siodmeActionPerformed
        // TODO add your handling code here:
        pole_siodme.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            pole_siodme.setForeground(Color.red);
        }
        else
        {
            pole_siodme.setForeground(Color.blue);
        }
        
        wybor_gracza();
        WygranieGry();
    }//GEN-LAST:event_pole_siodmeActionPerformed

    private void pole_osmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pole_osmeActionPerformed
        // TODO add your handling code here:
        pole_osme.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            pole_osme.setForeground(Color.red);
        }
        else
        {
            pole_osme.setForeground(Color.blue);
        }
        
        wybor_gracza();
        WygranieGry();
    }//GEN-LAST:event_pole_osmeActionPerformed

    private void pole_dziewiateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pole_dziewiateActionPerformed
        // TODO add your handling code here:
        pole_dziewiate.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            pole_dziewiate.setForeground(Color.red);
        }
        else
        {
            pole_dziewiate.setForeground(Color.blue);
        }
        
        wybor_gracza();
        WygranieGry();
    }//GEN-LAST:event_pole_dziewiateActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        
        pole_pierwsze.setText(null);
        pole_drugie.setText(null);
        pole_trzecie.setText(null);
        
        pole_czwarte.setText(null);
        pole_piate.setText(null);
        pole_szoste.setText(null);
        
        pole_siodme.setText(null);
        pole_osme.setText(null);
        pole_dziewiate.setText(null);
        
        pole_pierwsze.setBackground(Color.LIGHT_GRAY);
        pole_drugie.setBackground(Color.LIGHT_GRAY);
        pole_trzecie.setBackground(Color.LIGHT_GRAY);
        
        pole_czwarte.setBackground(Color.LIGHT_GRAY);
        pole_piate.setBackground(Color.LIGHT_GRAY);
        pole_szoste.setBackground(Color.LIGHT_GRAY);
        
        pole_siodme.setBackground(Color.LIGHT_GRAY);
        pole_osme.setBackground(Color.LIGHT_GRAY);
        pole_dziewiate.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic_tac_toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel graczo;
    private javax.swing.JLabel graczowynik;
    private javax.swing.JLabel graczx;
    private javax.swing.JLabel graczxwynik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pole_czwarte;
    private javax.swing.JButton pole_drugie;
    private javax.swing.JButton pole_dziewiate;
    private javax.swing.JButton pole_osme;
    private javax.swing.JButton pole_piate;
    private javax.swing.JButton pole_pierwsze;
    private javax.swing.JButton pole_siodme;
    private javax.swing.JButton pole_szoste;
    private javax.swing.JButton pole_trzecie;
    private javax.swing.JButton reset;
    private javax.swing.JButton wyjscie;
    // End of variables declaration//GEN-END:variables
}
