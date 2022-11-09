/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuas.controller;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import projectuas.model.*;
import javax.swing.table.*;
import projectuas.model.AbstrakVoucher;

/**
 *
 * @author ZEIDAR
 */
public class KasirController extends AbstrakVoucher {

    static public Kasir[] dataKasir = new Kasir[100];
    static private int index = 0;
    Kasir ksr;

    static public void insert(String username, String password, String noTelp, String alamat) {
        dataKasir[index] = new Kasir(username, password, noTelp, alamat);
        index++;

    }

    public int getIndex() {
        return index;
    }

    @Override
    public DefaultTableModel viewTabel() {
        DefaultTableModel modelKasir = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int a, int b) {
                return false;
            }

        };
        modelKasir.addColumn("Username ");
        modelKasir.addColumn("Password ");
        modelKasir.addColumn("No Telp ");
        modelKasir.addColumn("Alamat ");

        for (int i = 0; i < index; i++) {
            Object[] temp = new Object[4];
            temp[0] = dataKasir[i].getUsername();
            temp[1] = dataKasir[i].getPassword();
            temp[2] = dataKasir[i].getNoTelp();
            temp[3] = dataKasir[i].getAlamat();
            modelKasir.addRow(temp);
        }
        return modelKasir;
    }

    public Kasir cariObjek(String username) {
        Kasir temp = null;
        for (int i = 0; i < index; i++) {
            if (username.equals(dataKasir[i].getUsername())) {
                temp = dataKasir[i];
            }
        }
        return temp;
    }

}
