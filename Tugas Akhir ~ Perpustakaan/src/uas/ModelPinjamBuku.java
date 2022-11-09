/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rayhan_07023
 */
public class ModelPinjamBuku {

    public PinjamBuku[] data_pinjam = new PinjamBuku[100];
    private int index = 0;

    public void insert(String namabuku, String member, String pengarang, String idbuku) {
        data_pinjam[index] = new PinjamBuku(namabuku, member, pengarang,idbuku);
        index++;
    }

    

    public DefaultTableModel viewTabel() {
        DefaultTableModel model_pinjam = new DefaultTableModel();
        model_pinjam.addColumn("Nama Buku");
        model_pinjam.addColumn("Nama Member");
        model_pinjam.addColumn("Pengarang");
        model_pinjam.addColumn("ID Buku");

        for (int i = 0; i < index; i++) {
            Object[] temp = new Object[4];
            temp[0] = data_pinjam[i].namabuku;
            temp[1] = data_pinjam[i].member;
            temp[2] = data_pinjam[i].pengarang;
            temp[3] = data_pinjam[i].idbuku;
            model_pinjam.addRow(temp);
        }

        return model_pinjam;
    }
}
