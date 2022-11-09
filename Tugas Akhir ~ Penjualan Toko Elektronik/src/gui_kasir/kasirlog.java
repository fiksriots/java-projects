/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_kasir;
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
public class kasirlog {
    JFrame login_kasir;
    JTextField textkasir;
    JButton checkkasir,backkasir;
    public kasirlog(){
        login_kasir = new JFrame();
        login_kasir.setSize(400,250);
        login_kasir.getContentPane().setBackground(Color.BLACK);
        login_kasir.setLayout(null);
        
        JLabel namasales = new JLabel("nama kasir");
        namasales.setBounds(150,30,100,30);
        namasales.setForeground(Color.WHITE);
        login_kasir.add(namasales);
        
        textkasir = new JTextField();
        textkasir.setBounds(50,100,300,30);
        login_kasir.add(textkasir);
        
        checkkasir = new JButton("check");
        checkkasir.setBounds(50,150,100,30);
        checkkasir.setBackground(Color.GREEN);
        login_kasir.add(checkkasir);
        
        backkasir = new JButton("back");
        backkasir.setBounds(200,150,100,30);
        backkasir.setBackground(Color.red);
        login_kasir.add(backkasir);
        
        login_kasir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login_kasir.setLocationRelativeTo(null);
        login_kasir.setVisible(true);
        checkkasir.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                String nama = textkasir.getText();
                boolean ketemu = false;
                int size = allobject.data_admin.getPanjang();
                for(int i=0;i<size;i++){
                    if (nama.contains(allobject.data_admin.getstaf().get(i).getNamaKasir())){
                        allobject.kasir_nama=nama;
                        ketemu = true;
                    }
                }
                    if (ketemu == true){
                        kasir kas = new kasir();
                        login_kasir.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null,"nama tidak terdaftar","information",JOptionPane.INFORMATION_MESSAGE);
                    }
            }
        });
        backkasir.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                login_kasir.dispose();
            }
        });
    }
}
