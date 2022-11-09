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
public class MainFrame extends JFrame{

public MainFrame(){

    JFrame mainFrame=new JFrame();
    mainFrame.setSize(600, 650);
    mainFrame.getContentPane().setBackground(Color.black);
     mainFrame.setLocationRelativeTo(null);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setTitle("Menu Utama");
    mainFrame.setLayout(null);
    
    
    JButton buttonAdmin=new JButton("ADMIN");
    buttonAdmin.setFont(new Font("Consolas",Font.BOLD,24));
    buttonAdmin.setBackground(Color.black);
    buttonAdmin.setForeground(Color.white);
    buttonAdmin.setBounds(0, 0, 600, 200);
    buttonAdmin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           AdminFrame admin=new AdminFrame();
           mainFrame.dispose();
        }
    });
    mainFrame.add(buttonAdmin);
    
    
    JButton buttonKasir=new JButton("KASIR");
    buttonKasir.setFont(new Font("Consolas",Font.BOLD,24));
    buttonKasir.setBackground(Color.black);
    buttonKasir.setForeground(Color.white);
    buttonKasir.setBounds(0, 200, 600, 200);
    buttonKasir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            KasirFrame kasir=new KasirFrame();
            mainFrame.dispose();
        }
    });
    mainFrame.add(buttonKasir);
    
  
    JButton buttonPelanggan=new JButton("PELANGGAN");
    buttonPelanggan.setFont(new Font("Consolas",Font.BOLD,24));
    buttonPelanggan.setBackground(Color.black);
    buttonPelanggan.setForeground(Color.white);
    buttonPelanggan.setBounds(0, 400, 600, 200);
    buttonPelanggan.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            PelangganFrame plgFrame=new PelangganFrame();
            mainFrame.dispose();
        }
    });
    mainFrame.add(buttonPelanggan);
    
    mainFrame.setVisible(true);
    
            
   

    
}
}
