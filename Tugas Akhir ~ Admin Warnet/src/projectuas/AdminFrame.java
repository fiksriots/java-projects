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
import projectuas.controller.AdminController;
import projectuas.model.Admin;

/**
 *
 * @author ZEIDAR
 */
public class AdminFrame {
        AdminController adm=new AdminController();
    public AdminFrame() {
        JFrame frameAdmin = new JFrame();
        frameAdmin.setSize(400, 800);
        frameAdmin.getContentPane().setBackground(Color.black);
        frameAdmin.setLocationRelativeTo(null);
        frameAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameAdmin.setTitle("ADMIN");
        frameAdmin.setLayout(null);

        
        JLabel labelAdmin = new JLabel("Admin");
        labelAdmin.setFont(new Font("Consolas", Font.BOLD, 24));
        labelAdmin.setBackground(Color.black);
        labelAdmin.setForeground(Color.white);
        labelAdmin.setBounds(160, 0, 100, 100);
        frameAdmin.add(labelAdmin);

        
        JLabel labelUser = new JLabel("Username");
        labelUser.setFont(new Font("Consolas", Font.PLAIN, 14));
        labelUser.setBackground(Color.black);
        labelUser.setForeground(Color.white);
        labelUser.setBounds(25, 100, 100, 30);
        frameAdmin.add(labelUser);

        
        JTextField textUser = new JTextField();
        textUser.setBackground(Color.black);
        textUser.setFont(new Font("Consolas", Font.PLAIN, 14));
        textUser.setForeground(Color.white);
        textUser.setBounds(25, 140, 120, 30);
        frameAdmin.add(textUser);

        
        JLabel labelPass = new JLabel("Password");
         labelPass.setBackground(Color.black);
        labelPass.setFont(new Font("Consolas", Font.PLAIN, 14));
        labelPass.setForeground(Color.white);
        labelPass.setBounds(25, 180, 100, 30);
        frameAdmin.add(labelPass);

        
        JPasswordField textPass = new JPasswordField();
        textPass.setBackground(Color.black);
        textPass.setFont(new Font("Consolas", Font.PLAIN, 14));
        textPass.setForeground(Color.white);
        textPass.setBounds(25, 210, 120, 30);
        frameAdmin.add(textPass);
        
        
        JLabel labelNoTelp=new JLabel("No Telp");
        labelNoTelp.setFont(new Font("Consolas",Font.PLAIN,14));
        labelNoTelp.setBackground(Color.black);
        labelNoTelp.setForeground(Color.white);
        labelNoTelp.setBounds(25, 240, 120, 30);
        frameAdmin.add(labelNoTelp);
        
        
        JTextField textNoTelp=new JTextField();
        textNoTelp.setFont(new Font("Consolas",Font.PLAIN,14));
        textNoTelp.setBackground(Color.black);
        textNoTelp.setForeground(Color.white);
        textNoTelp.setBounds(25,270,120, 30);
        frameAdmin.add(textNoTelp);
        
        
        JLabel labelAl=new JLabel("Alamat");
        labelAl.setFont(new Font("Consolas",Font.PLAIN,14));
        labelAl.setBackground(Color.black);
        labelAl.setForeground(Color.white);
        labelAl.setBounds(25, 300, 120, 30);
        frameAdmin.add(labelAl);
        
        
        JTextField textAl=new JTextField();
        textAl.setFont(new Font("Consolas",Font.PLAIN,14));
        textAl.setBackground(Color.black);
        textAl.setForeground(Color.white);
        textAl.setBounds(25, 330, 120, 30);
        frameAdmin.add(textAl);

        
        JButton buttonIn = new JButton("Input");
        buttonIn.setFont(new Font("Consolas", Font.PLAIN, 14));
        buttonIn.setBackground(Color.black);
        buttonIn.setForeground(Color.white);
        buttonIn.setBounds(25, 500, 180, 30);
        buttonIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if(textUser.getText().equals("")||textPass.getText().equals("")||textNoTelp.getText().equals("")||textAl.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data salah");
                }
                else{
                    adm.addKasir(textUser, textPass);
                    JOptionPane.showMessageDialog(null, "Data berhasil diinput");
                }
                
            }
        });
        frameAdmin.add(buttonIn);
        
        
        JButton backButton=new JButton("<=");
        backButton.setBackground(Color.red);
        backButton.setForeground(Color.white);
        backButton.setBounds(300,500,50,50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MainFrame main=new MainFrame();
                frameAdmin.dispose();
            }
        });
        frameAdmin.add(backButton);

        frameAdmin.setVisible(true);

    }
//    public void adminLogin(String username,String password){
//        AdminController admin=new AdminController();
//        Admin adminModel=admin.getLogin(username, password);
//        if(adminModel==null){
//            JOptionPane.showMessageDialog(null, "Data Salah");
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Data berhasil di Inputkan");
//        }
//    }
}
