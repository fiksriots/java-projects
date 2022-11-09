/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.gui;

//import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.TableColumn;
import uas.ArrayList;
import uas.gui.JAwal;

/**
 *
 * @author Alexander Pratama
 */
public class JRegister extends JFrame{
    ArrayList adm=new ArrayList();
    public JRegister(){
        JFrame frameAdmin=new JFrame();
        frameAdmin.setTitle("Input Data Admin");
        frameAdmin.setSize(370, 410);
        frameAdmin.setLocationRelativeTo(null);
        frameAdmin.setLayout(null);
        frameAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        JLabel nama=new JLabel("Nama");
        JLabel email=new JLabel("Email");
        JLabel password=new JLabel("Password");
        JLabel nohp=new JLabel("No Hp");
        JTextField tnama=new JTextField();
        JTextField temail=new JTextField();
        JPasswordField tpass=new JPasswordField();
        JTextField tno=new JTextField();
        JButton back=new JButton("Back");
        JButton ok=new JButton("Insert");
        
        nama.setBounds(20, 20, 100, 30);
        nama.setFont(new Font("Arial",Font.BOLD,14));
        frameAdmin.add(nama);
        
        tnama.setBounds(20, 60, 300, 30);
        tnama.setFont(new Font("Arial",Font.PLAIN,14));
        frameAdmin.add(tnama);
        
        email.setBounds(20, 90, 100, 30);
        email.setFont(new Font("Arial",Font.BOLD,14));
        frameAdmin.add(email);
        
        temail.setBounds(20, 130, 300, 30);
        temail.setFont(new Font("Arial",Font.PLAIN,14));
        frameAdmin.add(temail);
        
        password.setBounds(20, 160, 100, 30);
        password.setFont(new Font("Arial",Font.BOLD,14));
        frameAdmin.add(password);
        
        tpass.setBounds(20, 200, 300, 30);
        tpass.setFont(new Font("Arial",Font.PLAIN,14));
        frameAdmin.add(tpass);
        
        nohp.setBounds(20, 230, 100, 30);
        nohp.setFont(new Font("Arial",Font.BOLD,14));
        frameAdmin.add(nohp);
        
        tno.setBounds(20, 270, 300, 30);
        tno.setFont(new Font("Arial",Font.PLAIN,14));
        frameAdmin.add(tno);
        
        back.setBounds(20, 310, 90, 30);
        back.setFont(new Font("Arial",Font.BOLD,14));
        frameAdmin.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ex) {
                JAwal le=new JAwal();
                frameAdmin.dispose();
            }
        });
        
        ok.setBounds(230, 310, 90, 30);
        ok.setFont(new Font("Arial", Font.BOLD, 14));
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if(tnama.getText().equals("")||tpass.getText().equals("")||tno.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data salah");
                }
                else{
                    adm.addMember(temail, tpass);
                    JOptionPane.showMessageDialog(null, "Data berhasil diinput");
                }
                
            }
        });
        frameAdmin.add(ok);
        
       
        
              
        frameAdmin.setVisible(true);
    }
}
