/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Rayhan_07023
 */
public class JAdmin {
    JFrame frame = new JFrame ("Admin");
    JButton tambah = new JButton ("Tambah Buku");
    JButton lihat = new JButton ("Tampilkan Peminjam");
    
    public JAdmin (){
        tambah.setBounds(50, 50, 300, 30);
        
        frame.add(tambah);
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        
        lihat.setBounds(50, 100, 300, 30);
        
        frame.add(lihat);
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
