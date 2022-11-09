/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_admin;
import gui_kasir.kasirlog;
import gui_sales.saleslog;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author ALAN
 */
public class login extends JFrame {
    public login(){
        JFrame login = new JFrame("Halaman Login");
        login.setSize(310,340);
        login.getContentPane().setForeground(Color.BLACK);
        JButton admin = new JButton("ADMIN");
        admin.setBounds(0,0,300,100);
        admin.setFont(new Font("Times New Roman",Font.BOLD,40));
        admin.setBackground(Color.orange);
        login.add(admin);
        
        JButton sales = new JButton("SALES");
        sales.setBounds(0,101,300,100);
        sales.setBackground(Color.green);
        sales.setFont(new Font("Times New Roman",Font.BOLD,40));
        login.add(sales);
        
        JButton kasir = new JButton("KASIR");
        kasir.setBounds(0,201,300,100);
        kasir.setBackground(Color.YELLOW);
        kasir.setFont(new Font("Times New Roman",Font.BOLD,40));
        login.add(kasir);
        login.setLayout(null);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        admin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                adminlog logadmin = new adminlog();
            }
        });
        sales.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                saleslog logsales = new saleslog();
            }
        });
        kasir.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                kasirlog logkasir = new kasirlog();
            }
        });
    }
}
