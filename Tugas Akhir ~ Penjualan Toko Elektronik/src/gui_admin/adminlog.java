/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_admin;

import data.datastaf;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author ALAN
 */
public class adminlog {
    datastaf ad;
    JFrame login_admin;
    JButton check,back;
    JLabel nama,pass;
    JTextField namatext;
    JPasswordField passw;
    public adminlog(){
      login_admin = new JFrame("login admin");
      login_admin.setSize(400, 250);
      login_admin.getContentPane().setBackground(Color.BLACK);
      login_admin.setLayout(null);
      
      nama = new JLabel("nama");
      nama.setBounds(20,20,50,30);
      nama.setForeground(Color.WHITE);
      login_admin.add(nama);
      
      namatext = new JTextField();
      namatext.setBounds(100,20,200,30);
      login_admin.add(namatext);
      
      pass = new JLabel("password");
      pass.setBounds(20,70,80,30);
      pass.setForeground(Color.WHITE);
      login_admin.add(pass);
      
      passw = new JPasswordField();
      passw.setBounds(100,70,200,30);
      login_admin.add(passw);
      
      check = new JButton("check");
      check.setBounds(100,150,100,30);
      check.setBackground(Color.GREEN);
      login_admin.add(check);
      
      back = new JButton("back");
      back.setBounds(201,150,100,30);
      back.setBackground(Color.red);
      login_admin.add(back);
      
      login_admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      login_admin.setLocationRelativeTo(null);
      login_admin.setVisible(true);
      check.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                if(passw.getText().contains("admin")&&namatext.getText().contains("admin")){
                    barang_staf bs = new barang_staf();
                    login_admin.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"maaf anda salah input","information",JOptionPane.INFORMATION_MESSAGE);
                    passw.setText(null);
                    namatext.setText(null);
                }
            }
        });
      back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                login_admin.dispose();
            }
        });
    }
}
