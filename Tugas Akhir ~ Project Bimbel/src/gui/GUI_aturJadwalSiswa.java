package gui;

import controller.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class GUI_aturJadwalSiswa extends komponen {
    SiswaController siswaC;
    AdminController adminC;
    MapelController mapelC;
    JadwalController jadwalC;
    BimbelController bimbelC;

    Object a;
    DefaultTableModel modelJadwal;
    JScrollPane scrollPaneJadwal = new JScrollPane();
    JTable tblJadwal = new JTable();

    DefaultTableModel tabel;
    JScrollPane scrollPane = new JScrollPane();
    JTable tbl = new JTable();

    public GUI_aturJadwalSiswa(SiswaController siswaC, AdminController adminC, MapelController mapelC, JadwalController jadwalC,BimbelController bimbelC){
        this.siswaC = siswaC;
        this.adminC = adminC;
        this.mapelC = mapelC;
        this.jadwalC = jadwalC;
        this.bimbelC = bimbelC;
        initComponent();
    }

    public void initComponent(){
        labelAturJadwa.setBounds(350,20,500,50);
        labelAturJadwa.setFont(new Font("Arial" ,Font.BOLD,25));
        labelAturJadwa.setForeground(new Color(20,1,188));

        nmSiswa.setBounds(10 , 75 , 100 , 30);
        nmSiswa.setFont(new Font("Arial" ,Font.BOLD,12));
        txtnmSiswa.setBounds(10 , 100 , 150 , 20);
        txtnmSiswa.setEnabled(false);
        add(nmSiswa);
        add(txtnmSiswa);

        labelUsername.setBounds(10 , 120 , 100 , 30);
        labelUsername.setFont(new Font("Arial" ,Font.BOLD,12));
        uname.setBounds(10 , 145 , 150 , 20);
        add(labelUsername);
        add(uname);
        uname.setEnabled(false);

        labelNamaMapel.setBounds(10 , 170 , 100 , 30);
        labelNamaMapel.setFont(new Font("Arial" ,Font.BOLD,12));
        txtNamaMapel.setBounds(10 , 195 , 150 , 20);
        add(labelNamaMapel);
        add(txtNamaMapel);
        txtNamaMapel.setEnabled(false);

        btnInsert.setBounds(10 , 220 , 100 , 30);
        btnCetak.setBounds(10 , 250 , 100 , 30);
        btnInsert.setEnabled(false);
//        btnCetak.setEnabled(false);
        add(btnInsert);

        //jadwal
        scrollPaneJadwal.setViewportView(tblJadwal);
        modelJadwal = (DefaultTableModel) tblJadwal.getModel();
        tblJadwal.setDefaultEditor(Object.class , null);
        modelJadwal.addColumn("Matapelajaran ");
        modelJadwal.addColumn("Hari");
        modelJadwal.addColumn("Jam");
        modelJadwal.addColumn("Guru");
        modelJadwal.addColumn("idMapel");
        scrollPaneJadwal.setBounds(220 , 75 , 430 , 200);
        add(scrollPaneJadwal);

        //siswa
        scrollPane.setViewportView(tbl);
        tabel = (DefaultTableModel) tbl.getModel();
        tbl.setDefaultEditor(Object.class, null);
        tabel.addColumn("Nama");
        tabel.addColumn("Username");
        tabel.addColumn("Password");
        scrollPane.setBounds(660 , 75 , 220 , 200);
        add(scrollPane);

        btnSelect.setBounds(660 , 280 , 220 , 30);
        add(btnSelect);
        btnSelectJadwal.setBounds(220 , 280 , 320 , 30);
        add(btnSelectJadwal);
        cekSiswa();
        cekJadwal();

        int z = 0;
        if(z == 0){
            cetakJadwal();
            cetakSiswa();
            z++;
        }

        btnSelect.setEnabled(false);
        btnSelectJadwal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MouseClickedJadwal((MouseEvent) a);
                btnSelect.setEnabled(true);
                btnSelectJadwal.setEnabled(false);
            }
        });

        btnSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MouseClickedSiswa((MouseEvent) a);
                btnInsert.setEnabled(true);
                btnSelectJadwal.setEnabled(false);
            }
        });

        btnCetak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI_bimbel(siswaC , adminC , mapelC , jadwalC , bimbelC).setVisible(true);
            }
        });

        //hidden password
        tbl.getColumnModel().getColumn(2).setMinWidth(0);
        tbl.getColumnModel().getColumn(2).setMaxWidth(0);
        tbl.getColumnModel().getColumn(2).setWidth(0);

        tblJadwal.getColumnModel().getColumn(4).setMinWidth(0);
        tblJadwal.getColumnModel().getColumn(4).setMaxWidth(0);
        tblJadwal.getColumnModel().getColumn(4).setWidth(0);

        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    btnSelectJadwal.setEnabled(true);
                    btnSelect.setEnabled(true);
                    btnCetak.setEnabled(true);
                    int id_jadwal = Integer.parseInt(txtid_Jadwal.getText());
                    int id_siswa = siswaC.cariSiswa(uname.getText() , passwd.getText());
                    bimbelC.tambahBimbel(jadwalC.getMapel()[id_jadwal] , jadwalC.getJadwal()[id_jadwal],siswaC.getSiswa()[id_siswa].getUsername());
                }catch (Exception ex){
                    err((MouseEvent) a);
                }
            }
        });

        add(btnCetak);
        add(txtid_Jadwal);
        add(txtid_mapel);
        add(passwd);
        add(labelAturJadwa);
        setSize(900,450);
        setLayout(null);
        setLocationRelativeTo(null);
    }
    public void cetakJadwal(){
        for (int b = 0; b < jadwalC.getId_jadwal(); b++) {
            Object[] obj = new Object[5];
            obj[0] = jadwalC.getMapel()[b].getNamaMapel();
            obj[1] = jadwalC.getJadwal()[b].getHari();
            obj[2] = jadwalC.getJadwal()[b].getJam();
            obj[3] = jadwalC.getJadwal()[b].getGuruBimbel();
            obj[4] = b;
            modelJadwal.addRow(obj);
        }
    }

    public void cekJadwal(){
        if(jadwalC.getId_jadwal() == 0){
            btnSelectJadwal.setEnabled(false);
        }
    }

    public void cekSiswa(){
        if(siswaC.getId_Siswa() == 0 ){
            btnSelect.setEnabled(false);
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

    public void MouseClickedJadwal(java.awt.event.MouseEvent evt){
        int selectedRow = tblJadwal.getSelectedRow();
        modelJadwal = (DefaultTableModel)tblJadwal.getModel();
        txtNamaMapel.setText(modelJadwal.getValueAt(selectedRow , 0).toString());
        txtid_Jadwal.setText(modelJadwal.getValueAt(selectedRow, 4).toString());
    }

    public void MouseClickedSiswa(java.awt.event.MouseEvent evt){
        int selectedRow = tbl.getSelectedRow();
        tabel = (DefaultTableModel)tbl.getModel();
        txtnmSiswa.setText(tabel.getValueAt(selectedRow , 0).toString());
        uname.setText(tabel.getValueAt(selectedRow , 1).toString());
        passwd.setText(tabel.getValueAt(selectedRow , 2).toString());
    }

}