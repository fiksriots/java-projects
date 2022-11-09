package gui;
import controller.*;
import gui.komponen;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class GUI_Siswa extends komponen {
    SiswaController siswaC;
    AdminController adminC;
    MapelController mapelC;
    JadwalController jadwalC;
    BimbelController bimbelC;

    String username , password;

    Object a;
    DefaultTableModel modelBimbel;
    JScrollPane scrollPanelBimbel = new JScrollPane();
    JTable tblBimbel = new JTable();

    public GUI_Siswa(SiswaController siswaC , AdminController adminC ,MapelController mapelC , JadwalController jadwalC , BimbelController bimbelC , String username , String password){
        this.siswaC = siswaC;
        this.adminC = adminC;
        this.mapelC = mapelC;
        this.jadwalC = jadwalC;
        this.bimbelC = bimbelC;
        this.username = username;
        this.password = password;
        initComponent();
    }

    public void initComponent(){
        labelSiswa.setBounds(300,30,500,60);
        labelSiswa.setFont(new Font("Consolas" , Font.BOLD,45));
        labelSiswa.setForeground(new Color(20,1,188));

        scrollPanelBimbel.setViewportView(tblBimbel);
        modelBimbel = (DefaultTableModel) tblBimbel.getModel();
        tblBimbel.setDefaultEditor(Object.class , null);
        modelBimbel.addColumn("Matapelajaran ");
        modelBimbel.addColumn("Hari");
        modelBimbel.addColumn("Jam");
        modelBimbel.addColumn("Guru");
        modelBimbel.addColumn("Username");
        modelBimbel.addColumn("idMapel");
        scrollPanelBimbel.setBounds(50 , 75 , 500 , 400);
        cetakStruk.setBounds(570 , 75 , 300 , 400);
        add(cetakStruk);
        tblBimbel.getColumnModel().getColumn(5).setMinWidth(0);
        tblBimbel.getColumnModel().getColumn(5).setMaxWidth(0);
        tblBimbel.getColumnModel().getColumn(5).setWidth(0);
        add(scrollPanelBimbel);

        btnLogout.setFont(new Font("Arial" , Font.BOLD,15));
        btnLogout.setBounds(770 , 490 , 100 , 30);
        btnSelect.setBounds(50 , 476 ,200 , 30);
        add(btnSelect);
        add(btnLogout);

        btnPrint.setFont(new Font("Arial" , Font.BOLD,15));
        btnPrint.setBounds(600 , 490 , 150 , 30);
        add(btnPrint);

        btnSelect.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                MouseClicked((MouseEvent) a);
            }
        });

        btnPrint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cetakStruk();
            }
        });

        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new GUI_login(siswaC , adminC , mapelC , jadwalC,bimbelC).setVisible(true);
            }
        });
        int z = 0 ;
        if(z==0){
            cetak();
            z++;
        }
        add(labelSiswa);
        setSize(930,590);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void cetak(){
        for (int b = 0; b < bimbelC.getIndexBimbel(); b++) {
            if(username.equals(bimbelC.getBimbel()[b].getUsernameSiswa())) {
                Object[] obj = new Object[6];
                obj[0] = bimbelC.getMapel()[b].getNamaMapel();
                obj[1] = bimbelC.getJadwal()[b].getHari();
                obj[2] = bimbelC.getJadwal()[b].getJam();
                obj[3] = bimbelC.getJadwal()[b].getGuruBimbel();
                obj[4] = bimbelC.getBimbel()[b].getUsernameSiswa();
                obj[5] = b;
                modelBimbel.addRow(obj);
            }
        }
    }

    public void cetakStruk(){
        int cariSiswa = siswaC.cariSiswa(username,password);
        cetakStruk.setText("---------- Jadwal Bimbel --------\n" +
                        siswaC.getSiswa()[cariSiswa].getNama()+"\n  " +
                        "----------------------------------------------- \n" +
                        "Nama Mapel: " +txtNamaMapel.getText()+"\n" +
                        "Hari : " + txtHari.getText()+"\n" +
                        "Jam : " +txtJam.getText()+ "kg\n" +
                        "Guru : " +txtGuru.getText()+ "\n" +
                        "------------------------------------------------\n" +
                        "------------------------------------------------\n");
    }

    public void MouseClicked(java.awt.event.MouseEvent evt){
        int selectedRow = tblBimbel.getSelectedRow();
        modelBimbel = (DefaultTableModel)tblBimbel.getModel();
        txtNamaMapel.setText(modelBimbel.getValueAt(selectedRow , 0).toString());
        txtHari.setText(modelBimbel.getValueAt(selectedRow , 1).toString());
        txtJam.setText(modelBimbel.getValueAt(selectedRow , 2).toString());
        txtGuru.setText(modelBimbel.getValueAt(selectedRow , 3).toString());
    }
}
