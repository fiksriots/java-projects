/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06943_praktikummod6;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

/**
 *
 * @author Moch Ilham
 */
public class Balok extends Komponen {
    
    public Balok() {
        blk.setBounds(85, 20, 500, 40);
        blk.setFont(new Font("Consolas", Font.BOLD, 30));
        blk.setForeground(Color.white);
        pnjng.setBounds(20, 75, 200, 30);
        pnjng.setFont(new Font("Consolas", Font.BOLD, 14));
        lbr.setBounds(20, 125, 200, 30);
        lbr.setFont(new Font("Consolas", Font.BOLD, 14));
        tnggi.setBounds(20, 175, 200, 30);
        tnggi.setFont(new Font("Consolas", Font.BOLD, 14));
        panjang.setBounds(20, 100, 200, 30);
        panjang.setFont(new Font("Consolas", Font.BOLD, 14));
        lebar.setBounds(20, 150, 200, 30);
        lebar.setFont(new Font("Consolas", Font.BOLD, 14));
        tinggi.setBounds(20, 200, 200, 30);
        tinggi.setFont(new Font("Consolas", Font.BOLD, 14));
        hasil.setBounds(20, 250, 200, 30);
        hasil.setFont(new Font("Consolas", Font.BOLD, 15));
        back.setBounds(20, 300, 75, 25);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                } catch (Exception ex) {
                    
                }
            }
        });
        calculate.setBounds(125, 300, 90, 25);
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    hasil.setText("Volume : " + Volume());
                } catch (Exception ex) {
                    
                }
            }
        });
        add(blk);
        add(pnjng);
        add(lbr);
        add(tnggi);
        add(panjang);
        add(lebar);
        add(tinggi);
        add(back);
        add(calculate);
        add(hasil);
        setSize(275, 375);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBackground(Color.BLACK);
        setVisible(true);
    }
    
    private double Volume(){
        double Volume;
        Volume = Integer.parseInt(panjang.getText()) * Integer.parseInt(lebar.getText()) * Integer.parseInt(tinggi.getText());
        return Volume;
    }
}
