package gui;
import controller.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_admin extends komponen {
    SiswaController siswaC ;
    AdminController adminC ;
    MapelController mapelC;
    JadwalController jadwalC;
    BimbelController bimbelC;

    DefaultTableModel tabel;
    JScrollPane scrollPane = new JScrollPane();
    JTable tbl = new JTable();
    public GUI_admin(SiswaController siswaC , AdminController adminC , MapelController mapelC , JadwalController jadwalC ,BimbelController bimbelC){
        this.adminC = adminC;
        this.siswaC = siswaC;
        this.mapelC = mapelC;
        this.jadwalC = jadwalC;
        this.bimbelC = bimbelC;
        initComponent();
    }

    public void initComponent(){

        ujiCetak();

        labelAdmin.setBounds(300,30,500,60);
        labelAdmin.setFont(new Font("Consolas" ,Font.BOLD,45));
        labelAdmin.setForeground(new Color(20,1,188));

        daftar.setBounds(20 , 150 , 120 , 30);
        btnJadwal.setBounds(20 , 180 , 121 , 30);
        btnMapel.setBounds(140 , 150 ,140 ,30);
        btnAturjadwal.setBounds(140 , 180 , 140 ,30);

        btnCetak.setFont(new Font("Arial" , Font.BOLD,15));
        btnCetak.setBounds(400 , 450 , 150 , 30 );
        btnLogout.setFont(new Font("Arial" , Font.BOLD,15));
        btnLogout.setBounds(800 , 490 , 100 , 30);

        scrollPane.setViewportView(tbl);
        tabel = (DefaultTableModel) tbl.getModel();
        tbl.setDefaultEditor(Object.class, null);
        tabel.addColumn("Nama");
        tabel.addColumn("Username");
        tabel.addColumn("Password");
        int z = 0;
        if(z == 0){
            cetakSiswa();
            z++;
        }
        btnCetak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i =siswaC.getId_Siswa()-1;
                    Object[] obj = new Object[3];
                    obj[0] = siswaC.getSiswa()[i].getNama();
                    obj[1] = siswaC.getSiswa()[i].getUsername();
                    obj[2] = siswaC.getSiswa()[i].getPassword();
                    tabel.addRow(obj);
                    i++;

                btnCetak.setEnabled(false);
            }
        });

        scrollPane.setBounds(400 , 150 , 500 , 300);
        add(scrollPane);

        daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI_daftarSiswa(siswaC ,adminC , mapelC , jadwalC , bimbelC).setVisible(true);
                btnCetak.setEnabled(true);
            }
        });

        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new GUI_login(siswaC , adminC , mapelC , jadwalC,bimbelC).setVisible(true);
            }
        });

        btnMapel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI_mapel(siswaC , adminC , mapelC , jadwalC ,bimbelC).setVisible(true);
            }
        });

        btnJadwal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI_jadwal(siswaC,adminC,mapelC,jadwalC ,bimbelC).setVisible(true);
            }
        });

        btnAturjadwal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI_aturJadwalSiswa(siswaC , adminC , mapelC , jadwalC , bimbelC).setVisible(true);
            }
        });


        setSize(930,590);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(labelAdmin);
        add(btnCetak);
        add(daftar);
        add(btnLogout);
        add(btnMapel);
        add(btnJadwal);
        add(btnAturjadwal);
    }

    public void ujiCetak(){
        if(siswaC.getId_Siswa() == 0){
            btnCetak.setEnabled(false);
        }else{
            btnCetak.setEnabled(true);
        }
    }
    public void cetakSiswa() {
        for (int b = 0; b < siswaC.getId_Siswa(); b++) {
            Object[] obj = new Object[3];
            obj[0] = siswaC.getSiswa()[b].getNama();
            obj[1] = siswaC.getSiswa()[b].getUsername();
            obj[2] = siswaC.getSiswa()[b].getPassword();
            tabel.addRow(obj);
        }
    }
}
