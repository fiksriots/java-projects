/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author Rayhan_07023
 */
public class JMenuAdmin implements ActionListener{
    JFrame frame = new JFrame ("Menu Admin");
    JButton regis = new JButton ("Tambah Buku");
    JButton login = new JButton ("Lihat Peminjam");
    JButton keluar = new JButton ("Keluar");
    
    
    
    public JMenuAdmin (){
        frame.setSize(550, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        regis.setBounds(50, 280, 100, 30);
        
        frame.add(regis);
        
        
        login.setBounds(200, 280, 100, 30);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new Jview().setVisible(true);
                
            }
        });
        
        keluar.setBounds(310, 280, 100, 130);
        keluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new JAwal();
            }
        });
        frame.add(keluar);
        
        frame.add(login);
        regis.addActionListener((ActionListener) this);
        //login.addActionListener((ActionListener) this);
    }
      @Override
      public void actionPerformed(ActionEvent e) {
          frame.dispose();
          JTambahBuku regis = new JTambahBuku();
      }
    }