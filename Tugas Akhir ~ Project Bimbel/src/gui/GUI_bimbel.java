package gui;

import controller.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class GUI_bimbel extends  komponen {

    SiswaController siswaC;
    AdminController adminC;
    MapelController mapelC;
    JadwalController jadwalC;
    BimbelController bimbelC;

    Object a;
    DefaultTableModel modelBimbel;
    JScrollPane scrollPaneBimbel = new JScrollPane();
    JTable tblBimbel = new JTable();

    public GUI_bimbel(SiswaController siswaC , AdminController adminC ,MapelController mapelC , JadwalController jadwalC , BimbelController bimbelC){
        this.siswaC = siswaC;
        this.adminC = adminC;
        this.mapelC = mapelC;
        this.jadwalC = jadwalC;
        this.bimbelC = bimbelC;
        initComponent();
    }

    public void initComponent(){

        labelSiswa.setBounds(300 , 20 , 200 , 50);
        labelSiswa.setFont(new Font("Arial" , Font.BOLD,25));
        labelSiswa.setForeground(new Color(20,1,188));
        add(labelSiswa);

        scrollPaneBimbel.setViewportView(tblBimbel);
        modelBimbel = (DefaultTableModel) tblBimbel.getModel();
        tblBimbel.setDefaultEditor(Object.class , null);
        modelBimbel.addColumn("Matapelajaran ");
        modelBimbel.addColumn("Hari");
        modelBimbel.addColumn("Jam");
        modelBimbel.addColumn("Guru");
        modelBimbel.addColumn("Username");
        modelBimbel.addColumn("idBimbel");
        scrollPaneBimbel.setBounds(220 , 75 , 430 , 200);
        add(scrollPaneBimbel);
        //hidden id_bimbel
        tblBimbel.getColumnModel().getColumn(5).setMinWidth(0);
        tblBimbel.getColumnModel().getColumn(5).setMaxWidth(0);
        tblBimbel.getColumnModel().getColumn(5).setWidth(0);

        int z=0;
        if(z==0){
            cetakBimbel();
            z++;
        }

        setSize(800,350);
        setLayout(null);
        setLocationRelativeTo(null);
    }

    public void cetakBimbel(){
        for (int b = 0; b < bimbelC.getIndexBimbel(); b++) {
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
