package gui;

import controller.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class GUI_login extends komponen {
    private Object a;
    SiswaController siswaC;
    AdminController adminC;
    MapelController mapelC;
    JadwalController jadwalC;
    BimbelController bimbelC;
    public GUI_login(SiswaController siswaC , AdminController adminC , MapelController mapelC , JadwalController jadwalC ,BimbelController bimbelC){
        this.adminC = adminC;
        this.siswaC = siswaC;
        this.mapelC = mapelC;
        this.jadwalC = jadwalC;
        this.bimbelC = bimbelC;
        initComponent();
    }

    public void initComponent(){
        labelLogin.setBounds(300,30,500,60);
        labelLogin.setFont(new Font("Consolas" ,Font.BOLD,45));
        labelLogin.setForeground(new Color(20,1,188));

        labelUsername.setBounds(250,150,200,60);
        labelUsername.setFont(new Font("Consolas" , Font.BOLD,20));
        uname.setBounds(250 , 190 , 300 , 30);
        uname.setFont(new Font("Consolas" , Font.BOLD,15));

        labelPassword.setBounds(250,220,200,60);
        labelPassword.setFont(new Font("Consolas" , Font.BOLD,20));
        passwd.setBounds(250 , 260 , 300 , 30);
        passwd.setFont(new Font("Consolas" , Font.BOLD,15));

        login.setBounds(250 , 290 , 100 , 30);


        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(uname.getText().equals("") || passwd.getText().equals("")){
                    unamePwdKosong((MouseEvent) a);
                }else if(uname.getText().equals("admin") && passwd.getText().equals("admin")){
                    adminC.tambahAdmin("admin" , "admin" , "admin","admin","admin","admin","admin","admin");
                    adminMasuk((MouseEvent) a);
                    dispose();
                    new GUI_admin(siswaC , adminC , mapelC , jadwalC,bimbelC).setVisible(true);
                }else{
                    int ujiLogin = siswaC.cariSiswa(uname.getText() , passwd.getText());
                    if(ujiLogin == -1 ){
                        dataKosong((MouseEvent) a);
                    }else if(ujiLogin == -5){
                        pwdUsrSalah((MouseEvent) a);
                    }else{
                        loginSukses((MouseEvent) a);
                        new GUI_Siswa(siswaC , adminC , mapelC , jadwalC , bimbelC , uname.getText() , passwd.getText()).setVisible(true);
                    }
                }
            }
        });


        add(labelLogin);
        add(labelUsername);
        add(uname);
        add(passwd);
        add(labelPassword);
        add(login);
        setSize(800,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void unamePwdKosong(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Mohon Isi Username Atau Password");
    }
    public void loginSukses(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Selamat Datang " + siswaC.getSiswa()[siswaC.cariSiswa(uname.getText() , passwd.getText())].getNama());
    }
    public void pwdUsrSalah(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Username atau Password anda salah ! ");
    }
    public void adminMasuk(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Selamat Datang " + adminC.getAdmin()[0].getNama());
    }
}
