/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Rayhan_07023
 */
public class JAwal implements ActionListener{
    JFrame frame = new JFrame ("Menu Awal");
    JButton regis = new JButton ("Register");
    JButton login = new JButton ("Login");
    
    
    
    public JAwal (){
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        regis.setBounds(50, 150, 100, 30);
        
        frame.add(regis);
        
        login.setBounds(200, 150, 100, 30);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
               JLogin l = new JLogin();
          frame.setLocationRelativeTo(null);
            }
        });
        
        frame.add(login);
        regis.addActionListener((ActionListener) this);
        //login.addActionListener((ActionListener) this);
    }
      @Override
      public void actionPerformed(ActionEvent e) {
          frame.dispose();
          JRegister regis = new JRegister();
      }
    }