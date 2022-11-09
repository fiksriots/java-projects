/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuas.view;

import projectuas.model.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 *
 * @author ZEIDAR
 */
public class PelangganFrame extends JFrame {
    public PelangganFrame(){
        
        JFrame framePelanggan=new JFrame();
        framePelanggan.setSize(400,400);
        framePelanggan.getContentPane().setBackground(Color.black);
        framePelanggan.setLocationRelativeTo(null);
        framePelanggan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePelanggan.setTitle("PELANGGAN");
        framePelanggan.setLayout(null);
        
        
        JLabel labelPelanggan=new JLabel("LOGIN");
        labelPelanggan.setFont(new Font("Consolas",Font.BOLD,24));
        labelPelanggan.setBackground(Color.black);
        labelPelanggan.setForeground(Color.white);
        labelPelanggan.setBounds(160, 0, 100, 50);
        framePelanggan.add(labelPelanggan);
        
        
        JLabel labelVoucher=new JLabel("Kode Voucher");
        labelVoucher.setFont(new Font("Consolas",Font.PLAIN,14));
        labelVoucher.setBackground(Color.black);
        labelVoucher.setForeground(Color.white);
        labelVoucher.setBounds(25, 100, 100, 30);
        framePelanggan.add(labelVoucher);
        
        
        JTextField textVoucher=new JTextField();
        textVoucher.setFont(new Font("Consolas",Font.PLAIN,14));
        textVoucher.setBackground(Color.black);
        textVoucher.setForeground(Color.white);
        textVoucher.setBounds(25, 130, 100, 30);
        framePelanggan.add(textVoucher);
        
        
       JButton buttonLogin=new JButton("Login");
       buttonLogin.setFont(new Font("Consolas",Font.PLAIN,14));
       buttonLogin.setBackground(Color.black);
       buttonLogin.setForeground(Color.white);
       buttonLogin.setBounds(25, 170, 100, 40);
       buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String voucher = textVoucher.getText();
                int indextemu=0;
                boolean ketemu = false;
                for (int i = 0; i < AllObject.voucher.index; i++) {
                    if (voucher.equals(AllObject.voucher.dataVoucher[i].getVoucher())) {
                        ketemu = true;
                        indextemu=i;
                    }

                }
                if (ketemu) {
                    JOptionPane.showMessageDialog(null,"Voucher: "+AllObject.voucher.dataVoucher[indextemu].getVoucher()+
                            "\nTotal Jam: "+AllObject.voucher.dataVoucher[indextemu].getJam()+"\nTanggal: "+AllObject.voucher.dataVoucher[indextemu].getTgl()
                    +"\nNama Guest: "+AllObject.voucher.dataVoucher[indextemu].getNamaGuest());
                    
                } 
                else if(!ketemu){
                    JOptionPane.showMessageDialog(null, "Kode Voucher Salah");
                }
            }
        });
       framePelanggan.add(buttonLogin);
       
       
       
       JButton backButton=new JButton("<=");
       backButton.setBackground(Color.red);
       backButton.setForeground(Color.white);
       backButton.setBounds(300, 170, 50, 50);
       backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            MainFrame main=new MainFrame();
            framePelanggan.dispose();
            }
        });
       framePelanggan.add(backButton);
       
        
        
        
        framePelanggan.setVisible(true);
    }
}
