/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuas.controller;

import javax.swing.table.DefaultTableModel;
import projectuas.model.*;

/**
 *
 * @author ZEIDAR
 */
public class VoucherController {
    public Voucher[] dataVoucher = new Voucher[100];
    public Kasir kasir;
    public int index = 0;
    
    public void insert(String voucher, String tgl, String jam, String namaGuest) {
        dataVoucher[index] = new Voucher(voucher, tgl, jam, namaGuest);
        index++;
    }
    
    public DefaultTableModel viewTable1(){
        DefaultTableModel tabelvoucher=new DefaultTableModel();
        tabelvoucher.addColumn("Voucher");
        tabelvoucher.addColumn("Tanggal");
        tabelvoucher.addColumn("Total Jam");
        tabelvoucher.addColumn("Nama Guest");
        tabelvoucher.addColumn("Nama Kasir");
        
        for(int i=0; i<index; i++){
            Object[] temp1=new Object[5];
            temp1[0]=dataVoucher[i].getVoucher();
            temp1[1]=dataVoucher[i].getTgl();
            temp1[2]=dataVoucher[i].getJam();
            temp1[3]=dataVoucher[i].getNamaGuest();
            temp1[4]=dataVoucher[i].getNamaKasir();
            tabelvoucher.addRow(temp1);
        }
        return tabelvoucher;
    }
//    public modelVoucher(){
//        
//    }
}
