/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_sales;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import proses.allobject;
import proses.modeladmin;
/**
 *
 * @author ALAN
 */
public class saleslog {
    JFrame login_sales;
    JTextField textsales;
    JButton checksales,backsales;
    public saleslog(){
        login_sales = new JFrame();
        login_sales.setSize(400,250);
        login_sales.getContentPane().setBackground(Color.BLACK);
        login_sales.setLayout(null);
        
        JLabel namasales = new JLabel("nama sales");
        namasales.setBounds(150,30,100,30);
        namasales.setForeground(Color.WHITE);
        login_sales.add(namasales);
        
        textsales = new JTextField();
        textsales.setBounds(50,100,300,30);
        login_sales.add(textsales);
        
        checksales = new JButton("check");
        checksales.setBounds(50,150,100,30);
        checksales.setBackground(Color.GREEN);
        login_sales.add(checksales);
        
        backsales = new JButton("back");
        backsales.setBounds(200,150,100,30);
        backsales.setBackground(Color.red);
        login_sales.add(backsales);
        
        login_sales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login_sales.setLocationRelativeTo(null);
        login_sales.setVisible(true);
        checksales.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                String nama = textsales.getText();
                boolean ketemu = false;
                int size = allobject.data_admin.getPanjang();
                for(int i=0;i<size;i++){
                    if(nama.contains(allobject.data_admin.getstaf().get(i).getNamaSales())){
                        allobject.sales_nama=nama;
                        ketemu = true;
                    }
                }
                if(ketemu == true){
                    sales sal = new sales();
                    login_sales.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"nama tidak terdaftar","information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        backsales.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                login_sales.dispose();
            }
        });
    }
}
