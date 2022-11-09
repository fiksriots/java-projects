/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ZEIDAR
 */
public class BayarFrame extends JFrame{
    ModelVoucher mVoucher=new ModelVoucher();
    public BayarFrame(){
        JFrame  bayarFrame=new JFrame("PEMBAYARAN");
        bayarFrame.setSize(550, 800);
        bayarFrame.getContentPane().setBackground(Color.black);
        bayarFrame.setLocationRelativeTo(null);
        bayarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //bayarFrame.setTitle("PEMBAYARAN");
        bayarFrame.setLayout(null);
        
        
        JLabel labelBayar=new JLabel("Pembayaran");
        labelBayar.setFont(new Font("Consolas",Font.BOLD,24));
        labelBayar.setBackground(Color.black);
        labelBayar.setForeground(Color.white);
        labelBayar.setBounds(230, 40, 150, 30);
        bayarFrame.add(labelBayar);
        
        
        JLabel labelVoucher=new JLabel("Voucher");
        labelVoucher.setFont(new Font("Consolas",Font.PLAIN,14));
        labelVoucher.setBackground(Color.black);
        labelVoucher.setForeground(Color.white);
        labelVoucher.setBounds(25, 100, 100, 30);
        bayarFrame.add(labelVoucher);
        
        
        JTextField textVoucher=new JTextField();
        textVoucher.setFont(new Font("Consolas",Font.PLAIN,14));
        textVoucher.setBackground(Color.black);
        textVoucher.setForeground(Color.white);
        textVoucher.setBounds(25, 130, 120, 30);
        bayarFrame.add(textVoucher);
        
        
        JLabel labeltgl=new JLabel("Tanggal");
        labeltgl.setFont(new Font("Consolas",Font.PLAIN,14));
        labeltgl.setBackground(Color.black);
        labeltgl.setForeground(Color.white);
        labeltgl.setBounds(25, 170, 120, 30);
        bayarFrame.add(labeltgl);
        
        
        JTextField textTgl=new JTextField();
        textTgl.setFont(new Font("Consolas",Font.PLAIN,14));
        textTgl.setBackground(Color.black);
        textTgl.setForeground(Color.white);
        textTgl.setBounds(25, 220, 120, 30);
        bayarFrame.add(textTgl);
        
        
        JLabel labelJam=new JLabel("Total Jam");
        labelJam.setFont(new Font("Consolas",Font.PLAIN,14));
        labelJam.setBackground(Color.black);
        labelJam.setForeground(Color.white);
        labelJam.setBounds(25, 260, 120, 30);
        bayarFrame.add(labelJam);
        
        
        
        JTextField textJam=new JTextField();
        textJam.setFont(new Font("Consolas",Font.PLAIN,14));
        textJam.setBackground(Color.black);
        textJam.setForeground(Color.white);
        textJam.setBounds(25, 300, 120, 30);
        bayarFrame.add(textJam);
        
        
        JLabel labelGuest=new JLabel("Nama Guest");
        labelGuest.setFont(new Font("Consolas",Font.PLAIN,14));
        labelGuest.setBackground(Color.black);
        labelGuest.setForeground(Color.white);
        labelGuest.setBounds(25, 340, 120, 30);
        bayarFrame.add(labelGuest);
        
        
        
        JTextField textGuest=new JTextField();
        textGuest.setFont(new Font("Consolas",Font.PLAIN,14));
        textGuest.setBackground(Color.black);
        textGuest.setForeground(Color.white);
        textGuest.setBounds(25, 380, 120, 30);
        bayarFrame.add(textGuest);
        
        
        
        JLabel labelAdm=new JLabel("Admin");
        labelAdm.setFont(new Font("Consolas",Font.PLAIN,14));
        labelAdm.setBackground(Color.black);
        labelAdm.setForeground(Color.white);
        labelAdm.setBounds(25, 410, 120, 30);
        bayarFrame.add(labelAdm);
        
        
        
        JTextField textAdm=new JTextField();
        textAdm.setFont(new Font("Consolas",Font.PLAIN,14));
        textAdm.setBackground(Color.black);
        textAdm.setForeground(Color.white);
        textAdm.setBounds(25, 440, 120, 30);
        bayarFrame.add(textAdm);
        
        
        
        
        JButton printButton=new JButton("Print");
        printButton.setFont(new Font("Consolas",Font.PLAIN,14));
        printButton.setBackground(Color.black);
        printButton.setForeground(Color.white);
        printButton.setBounds(25, 450, 120, 30);
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 if(textVoucher.getText().equals("")||textTgl.getText().equals("")||textJam.getText().equals("")|| textGuest.getText().equals("") || textAdm.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data salah");
                }
                else{
                   mVoucher.insert(textVoucher, textTgl, textJam, textGuest);
                    JOptionPane.showMessageDialog(null, "Data berhasil diinput");
                }
                
            }
        });
        bayarFrame.add(printButton);
        
        
        
        JButton backButton=new JButton("<=");
        backButton.setBackground(Color.red);
        backButton.setForeground(Color.white);
        backButton.setBounds(450,450 , 50, 50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                KasirFrame kasir=new KasirFrame();
                bayarFrame.dispose();
            }
        });
        bayarFrame.add(backButton);
        
        
        bayarFrame.setVisible(true);
        
        
       
    }
}
