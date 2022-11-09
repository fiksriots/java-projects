/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_admin;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author ALAN
 */
public class barang_staf {
    JFrame pilih;
    JButton staf,barang,back;
    public barang_staf(){
        pilih = new JFrame();
        pilih.setSize(400,450);
        pilih.setLayout(null);
        pilih.getContentPane().setForeground(Color.BLACK);
        barang = new JButton("BARANG");
        barang.setBounds(0,0,400,180);
        barang.setBackground(Color.yellow);
        barang.setFont(new Font("Times New Roman",Font.BOLD,40));
        pilih.add(barang);
        
        staf = new JButton("STAF");
        staf.setBounds(0,181,400,180);
        staf.setBackground(Color.yellow);
        staf.setFont(new Font("Times New Roman",Font.BOLD,40));
        pilih.add(staf);
        
        back = new JButton("BACK");
        back.setBounds(0,362,400,50);
        back.setBackground(Color.RED);
        back.setFont(new Font("Times New Roman",Font.BOLD,20));
        pilih.add(back);
        
        barang.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                adminbarang admmin_barang = new adminbarang();
            }
        });
        staf.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                adminstaf admin_staf = new adminstaf();
            }
        });
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                pilih.dispose();            }
        });
        
        pilih.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pilih.setLocationRelativeTo(null);
        pilih.setVisible(true);
    }
}
