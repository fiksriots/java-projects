/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import uas.*;

/**
 *
 * @author Alexander Pratama
 */
public class JLogin extends JFrame {

    public JLogin() {
        JFrame frameLogin = new JFrame();
        frameLogin.setTitle("Login Admin");
        frameLogin.setSize(370, 300);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setLayout(null);
        frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel Lemail = new JLabel("Email");
        JLabel Lpassword = new JLabel("Password");
        JTextField temail = new JTextField();
        JPasswordField tpass = new JPasswordField();
        JButton back = new JButton("Back");
        JButton login = new JButton("Login");

        Lemail.setBounds(20, 20, 100, 30);
        Lemail.setFont(new Font("Arial", Font.BOLD, 14));
        frameLogin.add(Lemail);

        temail.setBounds(20, 60, 300, 30);
        temail.setFont(new Font("Arial", Font.PLAIN, 14));
        frameLogin.add(temail);

        Lpassword.setBounds(20, 90, 100, 30);
        Lpassword.setFont(new Font("Arial", Font.BOLD, 14));
        frameLogin.add(Lpassword);

        tpass.setBounds(20, 130, 300, 30);
        tpass.setFont(new Font("Arial", Font.PLAIN, 14));
        frameLogin.add(tpass);

        back.setBounds(20, 180, 90, 30);
        back.setFont(new Font("Arial", Font.BOLD, 14));
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ex) {
                JAwal le = new JAwal();
                frameLogin.dispose();
            }
        });
        frameLogin.add(back);

        login.setBounds(230, 180, 90, 30);
        login.setFont(new Font("Arial", Font.BOLD, 14));
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String email = temail.getText();
                String pass = tpass.getText();
                boolean ketemu1 = false;
                boolean ketemu2 = false;
                for (int i = 0; i < ArrayList.index; i++) {
                    if (email.equals(ArrayList.email[i]) && pass.equals(ArrayList.pass[i])) {
                        ketemu1 = true;
                    }
                }
                if (email.equals(Admin.nama) && pass.equals(Admin.password)) {
                    ketemu2 = true;
                }
                if (ketemu1 == true) {
                    Objek.a = temail.getText();
                    JPinjamBuku awl = new JPinjamBuku();
                    frameLogin.dispose();
                } else if (ketemu2 == true) {
                    JMenuAdmin awl = new JMenuAdmin();
                    frameLogin.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Nama/password salah");

                }
            }
        }
        );
        frameLogin.add(login);

        frameLogin.setVisible(
                true);
    }
}
