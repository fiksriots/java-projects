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
public class ModelMember {

    private Member[] data_cetakmem = new Member[100];
    private int index = 0;

    public void insert(String id, String judul, String pengarang) {
        data_cetakmem[index] = new Member(id, judul, pengarang);
        index++;
    }

    public void ambil(String judul) {
        int index_ketemu = cariIndexData(judul);
        if (index_ketemu != -1) {
            for (int i = index_ketemu; i < index; i++) {
                if (judul.equals(data_cetakmem[i].getJudul())) {
                    for (int j = i; j < index; j++) {
                        if (j != index - 1) {
                            data_cetakmem[j].setId(data_cetakmem[j+1].getId());
                            data_cetakmem[j].setJudul(data_cetakmem[j+1].getJudul());
                            data_cetakmem[j].setPengarang(data_cetakmem[j+1].getPengarang());
                        }
                    }
                    index--;
                }
            }
        }

    }

    public int cariIndexData(String judul) {
        boolean ketemu = false;
        int index = 0;
        for (int i = 0; i < this.index; i++) {
            if (judul.equals(data_cetakmem[i].getJudul())) {
                ketemu = true;
                index = i;
            } else if (ketemu == false && false && i == this.index - 1) {
                index = -1;
            }
        }
        return index;
    }

    public DefaultTableModel viewTabel() {
        DefaultTableModel model_member = new DefaultTableModel();
        model_member.addColumn("Judul Buku");
        model_member.addColumn("Pengarang");
        model_member.addColumn("ID Buku");

        for (int i = 0; i < index; i++) {
            Object[] temp = new Object[3];
            temp[0] = Objek.data_member.data_cetakmem[i].getJudul();
            temp[1] = Objek.data_member.data_cetakmem[i].getPengarang();
            temp[2] = Objek.data_member.data_cetakmem[i].getId();
            model_member.addRow(temp);
        }

        return model_member;
    }

}
