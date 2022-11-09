package gui;
import controller.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class GUI_mapel extends komponen {
    SiswaController siswaC;
    AdminController adminC;
    MapelController mapelC;
    JadwalController jadwalC;
    BimbelController bimbelC;

    Object a;
    DefaultTableModel tabel;
    JScrollPane scrollPane = new JScrollPane();
    JTable tbl = new JTable();
    private int ujiSelect = 0;

    public GUI_mapel(SiswaController siswaC , AdminController adminC , MapelController mapelC , JadwalController jadwalC,BimbelController bimbelC) {
        this.siswaC = siswaC;
        this.adminC = adminC;
        this.mapelC = mapelC;
        this.jadwalC = jadwalC;
        this.bimbelC = bimbelC;
        initComponent();
    }

    public void initComponent(){
        txtid_mapel.setBounds(10 , 10 ,10 ,10);

        labelNamaMapel.setBounds(20, 20,100 , 25);
        labelNamaMapel.setFont(new Font("Arial", Font.BOLD ,13));
        txtNamaMapel.setBounds(120 , 25 , 150 , 20);

        labelKodeMapel.setBounds(20, 60,100 , 25);
        labelKodeMapel.setFont(new Font("Arial", Font.BOLD ,13));
        txtKodeMapel.setBounds(120 , 60 , 150 , 20);

        btnInsert.setBounds(120 , 90 , 100 , 25);

        scrollPane.setViewportView(tbl);
        tabel = (DefaultTableModel) tbl.getModel();
        tbl.setDefaultEditor(Object.class , null);
        tabel.addColumn("Id");
        tabel.addColumn("Nama Matapelajaran ");
        tabel.addColumn("Kode");
        //cetakDataYang ada
        int z = 0;
        if(z == 0){
            cetakMapel();
            z++;
        }
        //=====
        btnUpdate.setEnabled(false);
        if(mapelC.getIdMapel() == 0) {
            btnSelect.setEnabled(false);
        }
        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(txtNamaMapel.getText().equals("") || txtKodeMapel.getText().equals("")){
                        throw new Exception();
                    }else{
                        mapelC.tambahMapel(txtNamaMapel.getText() , txtKodeMapel.getText());
                            Object[] obj = new Object[3];
                            obj[0] = mapelC.getIdMapel() -1;
                            obj[1] = mapelC.getMapel()[mapelC.getIdMapel()-1].getNamaMapel();
                            obj[2] = mapelC.getMapel()[mapelC.getIdMapel()-1].getKodeMapel();
                            tabel.addRow(obj);

                        new GUI_admin(siswaC , adminC , mapelC , jadwalC ,bimbelC);
                        clear();
                        btnUpdate.setEnabled(true);
                        btnSelect.setEnabled(true);
                    }

                }catch (Exception ex){
                    IsiSemua((MouseEvent) a);
                }
            }
        });

        scrollPane.setBounds(300 , 25 , 300 , 200);
        add(scrollPane);

        btnSelect.setBounds(300 , 235 , 100 , 25);
        btnSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(mapelC.getIdMapel() ==0){
                        throw new Exception();
                    }else{
                        jTableMouseClicked((MouseEvent) a);
                        ujiSelect = 1;
                        btnInsert.setEnabled(false);
                        btnUpdate.setEnabled(true);
                    }
                }catch (Exception ex){
                    dataKosong((MouseEvent) a);
                }
            }
        });

        btnUpdate.setBounds(410 , 235 , 130 , 25);
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(ujiSelect == 0){
                        throw new Exception();
                    }else{
                        btnUpdate.setEnabled(false);
                        int  id = Integer.parseInt(txtid_mapel.getText());
                        mapelC.updateMapel(id , txtNamaMapel.getText() , txtKodeMapel.getText());
                        ujiSelect =1;
                        txtNamaMapel.setText("");
                        txtKodeMapel.setText("");
                        tabel.setRowCount(0);
                        cetakMapel();
                        btnInsert.setEnabled(true);
                        new GUI_admin(siswaC , adminC , mapelC , jadwalC,bimbelC);
                    }
                }catch (Exception ex){
                    blmSelect((MouseEvent) a);
                }
            }
        });

        add(labelNamaMapel);
        add(txtNamaMapel);
        add(labelKodeMapel);
        add(txtKodeMapel);
        add(btnInsert);
        add(btnSelect);
        add(btnUpdate);
        setSize(700,350);
        setLayout(null);
        setLocationRelativeTo(null);
    }

    public void clear(){
        txtKodeMapel.setText("");
        txtNamaMapel.setText("");
    }

    public void jTableMouseClicked(java.awt.event.MouseEvent evt){
        int selectedRow = tbl.getSelectedRow();
        tabel = (DefaultTableModel)tbl.getModel();
        txtid_mapel.setText(tabel.getValueAt(selectedRow , 0).toString());
        txtNamaMapel.setText(tabel.getValueAt(selectedRow , 1).toString());
        txtKodeMapel.setText(tabel.getValueAt(selectedRow , 2).toString());
    }
    public void cetakMapel(){
        for (int b = 0; b < mapelC.getIdMapel(); b++) {
            Object[] obj = new Object[3];
            obj[0] = b;
            obj[1] = mapelC.getMapel()[b].getNamaMapel();
            obj[2] = mapelC.getMapel()[b].getKodeMapel();
            tabel.addRow(obj);
        }
    }
    public void blmSelect(java.awt.event.MouseEvent evt){
        JOptionPane.showMessageDialog(null, "Tolong pilih data !!");
    }
}
