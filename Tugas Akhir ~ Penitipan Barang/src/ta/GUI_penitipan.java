/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class GUI_penitipan extends komponen {
    PenitipanController penitipan;

    DefaultTableModel modelPenitip;
    JScrollPane sp_penitip = new JScrollPane();
    JTable tblPenitip = new JTable();

    Object a;

    public GUI_penitipan(PenitipanController penitipan){
        this.penitipan = penitipan;
        initComponent();
    }

    public void initComponent(){
        labelJudul.setBounds(350 , 30 , 300 , 50);
        labelJudul.setFont(new Font("Arial" , Font.BOLD,25));
        add(labelJudul);

        labelNama.setBounds(10 , 100 , 100 , 30);
        labelNama.setFont(new Font("Arial" , Font.BOLD, 15));
        add(labelNama);
        String [] jenisBarang = {"Helm" , "Jaket" , "Tas"};
        JComboBox comboJenis = new JComboBox(jenisBarang);
        comboJenis.setBounds(110, 102, 100, 25);
        add(comboJenis);

        labelLamaPenitipan.setBounds(10 , 154 , 150 , 30);
        labelLamaPenitipan.setFont(new Font("Arial" , Font.BOLD, 15));
        add(labelLamaPenitipan);
        txtLamaPenitipan.setBounds(130 , 156 , 100 , 25 );
        add(txtLamaPenitipan);

        labelUrut.setBounds(10 , 300 , 150 , 30);
        labelUrut.setFont(new Font("Arial" , Font.BOLD, 15));
        add(labelUrut);
        txtAmbilUrut.setBounds(70 , 302 , 40 , 25 );
        add(txtAmbilUrut);
        txtAmbilUrut.setEnabled(false);

        labelTelat.setBounds(10 , 327 , 150 , 30);
        labelTelat.setFont(new Font("Arial" , Font.BOLD, 15));
        add(labelTelat);
        txtTelat.setBounds(120 , 329 , 40 , 25 );
        add(txtTelat);

        sp_penitip.setViewportView(tblPenitip);
        modelPenitip = (DefaultTableModel) tblPenitip.getModel();
        tblPenitip.setDefaultEditor(Object.class , null);
        modelPenitip.addColumn("Jenis Barang ");
        modelPenitip.addColumn("Lama Nitip");
        modelPenitip.addColumn("No Urut");
        sp_penitip.setBounds(500 , 100 , 400 , 200);
        add(sp_penitip);

        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jenisB = (String) comboJenis.getSelectedItem();
                penitipan.tambahPenitipan(txtLamaPenitipan.getText(),jenisB,txtHari.getText());
                Object[] obj = new Object[3];
                obj[0] = penitipan.getPenitipan()[penitipan.getIndexP()-1].getJenisBarang();
                obj[1] = penitipan.getPenitipan()[penitipan.getIndexP()-1].getJmlHari();
                obj[2] = penitipan.getIndexP()-1;
                modelPenitip.addRow(obj);
            }
        });
        btnInsert.setBounds(130 , 181 , 100 , 25 );
        add(btnInsert);

        btnSelect.setBounds(500 , 305 , 100 , 30);
        add(btnSelect);
        btnSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MouseClickedUrut((MouseEvent) a);
            }
        });

        int z =0;
        if(z==0){
            cetakData();
            z++;
        }

        btnTotal.setBounds(10 , 354 , 100 , 40 );
        add(btnTotal);
        btnTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalHarga((MouseEvent) a);
            }
        });

        setSize(930,590);
        setLayout(null);
        setLocationRelativeTo(null);
    }

    public void cetakData(){
        for (int b = 0; b < penitipan.getIndexP(); b++) {
            Object[] obj = new Object[3];
            obj[0] = penitipan.getPenitipan()[b].getJenisBarang();
            obj[1] = penitipan.getPenitipan()[b].getJmlHari();
            obj[2] = b;
            modelPenitip.addRow(obj);
        }
    }
    public void MouseClickedUrut(java.awt.event.MouseEvent evt){
        int selectedRow = tblPenitip.getSelectedRow();
        modelPenitip = (DefaultTableModel)tblPenitip.getModel();
        txtAmbilUrut.setText(modelPenitip.getValueAt(selectedRow , 2).toString());
    }

    public void totalHarga(java.awt.event.MouseEvent evt) {
        int noUrut = Integer.parseInt(txtAmbilUrut.getText());
        String jenis = penitipan.getPenitipan()[noUrut].getJenisBarang();
        float harga = penitipan.hitungHarga(jenis , Integer.parseInt(txtTelat.getText()) , Integer.parseInt(txtLamaPenitipan.getText()));
        JOptionPane.showMessageDialog(null, "Total Harga" + harga);
    }
}
