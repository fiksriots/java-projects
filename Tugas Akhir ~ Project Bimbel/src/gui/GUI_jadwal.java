package gui;

import controller.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class GUI_jadwal extends komponen {
    SiswaController siswaC;
    AdminController adminC;
    MapelController mapelC;
    JadwalController jadwalC;
    BimbelController bimbelC;

    Object a;
    DefaultTableModel modelMapel;
    DefaultTableModel modelJadwal;
    JScrollPane scrollPaneMapel = new JScrollPane();
    JScrollPane scrollPaneJadwal = new JScrollPane();
    JTable tblMapel = new JTable();
    JTable tblJadwal = new JTable();

    public GUI_jadwal(SiswaController siswaC, AdminController adminC, MapelController mapelC, JadwalController jadwalC,BimbelController bimbelC) {
        this.siswaC = siswaC;
        this.adminC = adminC;
        this.mapelC = mapelC;
        this.jadwalC = jadwalC;
        this.bimbelC = bimbelC;
        initComponent();
    }

    public void initComponent(){
        labelJudulJadwal.setBounds(300,20,500,50);
        labelJudulJadwal.setFont(new Font("Arial" ,Font.BOLD,25));
        labelJudulJadwal.setForeground(new Color(20,1,188));

        labelNamaMapel.setBounds(10 , 75 , 100 , 30);
        labelNamaMapel.setFont(new Font("Arial" ,Font.BOLD,12));
        txtNamaMapel.setBounds(10 , 100 , 150 , 20);

        labelHari.setBounds(10 , 120 , 100 , 30);
        labelHari.setFont(new Font("Arial" ,Font.BOLD,12));
        txtHari.setBounds(10 , 145 , 150 , 20);

        labelJam.setBounds(10 , 170 , 100 , 30);
        labelJam.setFont(new Font("Arial" ,Font.BOLD,12));
        txtJam.setBounds(10 , 195 , 150 , 20);

        labelGuru.setBounds(10 , 220 , 100 , 30);
        labelGuru.setFont(new Font("Arial" ,Font.BOLD,12));
        txtGuru.setBounds(10 , 245 , 150 , 20);

        btnInsert.setBounds(10 , 270 , 100 , 30);
        btnInsert.setEnabled(false);


        //mapel
        txtNamaMapel.setEnabled(false);
        scrollPaneMapel.setViewportView(tblMapel);
        modelMapel = (DefaultTableModel) tblMapel.getModel();
        tblMapel.setDefaultEditor(Object.class , null);
        modelMapel.addColumn("Id");
        modelMapel.addColumn("Matapelajaran ");
        modelMapel.addColumn("Kode");
        tblMapel.getColumnModel().getColumn(0).setMinWidth(0);
        tblMapel.getColumnModel().getColumn(0).setMaxWidth(0);
        tblMapel.getColumnModel().getColumn(0).setWidth(0);

        btnSelect.setBounds(660 , 280 , 220 , 30);
        if(mapelC.getIdMapel() == 0){
            btnSelect.setEnabled(false);
        }
        btnSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTableMouseClicked((MouseEvent) a);
                btnInsert.setEnabled(true);
            }
        });
        scrollPaneMapel.setBounds(660 , 75 , 220 , 200);
        add(scrollPaneMapel);

        //jadwal
        scrollPaneJadwal.setViewportView(tblJadwal);
        modelJadwal = (DefaultTableModel) tblJadwal.getModel();
        tblJadwal.setDefaultEditor(Object.class , null);
        modelJadwal.addColumn("Matapelajaran ");
        modelJadwal.addColumn("Hari");
        modelJadwal.addColumn("Jam");
        modelJadwal.addColumn("Guru");

        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(txtGuru.equals("") || txtHari.getText().equals("")|| txtJam.getText().equals("")){
                        throw new Exception();
                    }else{
                        int id = Integer.parseInt(txtid_mapel.getText());
                        jadwalC.tambahJadwal(txtHari.getText() , txtJam.getText() , txtGuru.getText() ,mapelC.getMapel()[id]);

                        Object[] obj = new Object[4];
                        obj[0] = jadwalC.getMapel()[jadwalC.getId_jadwal()-1].getNamaMapel();
                        obj[1] = jadwalC.getJadwal()[jadwalC.getId_jadwal()-1].getHari();
                        obj[2] = jadwalC.getJadwal()[jadwalC.getId_jadwal()-1].getJam();
                        obj[3] = jadwalC.getJadwal()[jadwalC.getId_jadwal()-1].getGuruBimbel();
                        modelJadwal.addRow(obj);
                        new GUI_admin(siswaC , adminC , mapelC , jadwalC,bimbelC);
                        btnInsert.setEnabled(false);
                    }

                }catch (Exception ex){
                    IsiSemua((MouseEvent) a);
                }
            }
        });

        scrollPaneJadwal.setBounds(220 , 75 , 430 , 200);
        add(scrollPaneJadwal);
        //cetakDataAwal
        int z=0;
        if(z==0){
            cetakMapel();
            cetakJadwal();
            z++;
        }
        add(btnSelect);
        add(btnInsert);
        add(labelGuru);
        add(txtGuru);
        add(labelJam);
        add(txtJam);
        add(labelHari);
        add(txtHari);
        add(labelJudulJadwal);
        add(labelNamaMapel);
        add(txtNamaMapel);
        setSize(900,450);
        setLayout(null);
        setLocationRelativeTo(null);
    }

    public void cetakMapel(){
        for (int b = 0; b < mapelC.getIdMapel(); b++) {
            Object[] obj = new Object[3];
            obj[0] = b;
            obj[1] = mapelC.getMapel()[b].getNamaMapel();
            obj[2] = mapelC.getMapel()[b].getKodeMapel();
            modelMapel.addRow(obj);
        }
    }
    public void cetakJadwal(){
        for (int b = 0; b < jadwalC.getId_jadwal(); b++) {
            Object[] obj = new Object[4];
            obj[0] = jadwalC.getMapel()[b].getNamaMapel();
            obj[1] = jadwalC.getJadwal()[b].getHari();
            obj[2] = jadwalC.getJadwal()[b].getJam();
            obj[3] = jadwalC.getJadwal()[b].getGuruBimbel();
            modelJadwal.addRow(obj);
        }
    }

    public void jTableMouseClicked(java.awt.event.MouseEvent evt){
        int selectedRow = tblMapel.getSelectedRow();
        modelMapel = (DefaultTableModel)tblMapel.getModel();
        txtid_mapel.setText(modelMapel.getValueAt(selectedRow , 0).toString());
        txtNamaMapel.setText(modelMapel.getValueAt(selectedRow , 1).toString());
    }
}
