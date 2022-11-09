/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proses;
import data.pemesanan;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ALAN
 */
public class modeltransaksi {
    private final ArrayList<pemesanan> transaksi = new ArrayList();
    
    public void insert(String nama,String sales,String id,ArrayList temp,int index){
        pemesanan sal = new pemesanan();
        sal.insert_pesanan(nama,sales,id,temp);
        sal.insert_index(index);
        transaksi.add(sal);
    }
    
    public ArrayList<pemesanan> getTransaksi(){
        return transaksi;
    }
    
    public DefaultTableModel viewhistory(){
        DefaultTableModel history = new DefaultTableModel();
        Object[] kolom = {"nama pembeli","sales","id transaksi","nama barang","id barang","harga barang"};
        history.setColumnIdentifiers(kolom);
        for(int i=0;i<transaksi.size();i++){
            Object [] data= new Object[6];
            data[0]=transaksi.get(i).get_namaPembeli();
            data[1]=transaksi.get(i).get_namaSales();
            data[2]=transaksi.get(i).getidreg();
            data[3]="nama barang";
            data[4]="id barang";
            data[5]="harga barang";
            history.addRow(data);
            for(int j=0;j<transaksi.get(i).get_index();j++){
                Object []data2 = new Object[6];
                data2[3]=transaksi.get(i).getpesan().get(j).getnama();
                data2[4]=transaksi.get(i).getpesan().get(j).getid();
                data2[5]=transaksi.get(i).getpesan().get(j).getharga();
                history.addRow(data2);
            }
        }
        return history;
    }
    public void cetak(){
        for(int i=0;i<transaksi.size();i++){
            System.out.println(transaksi.get(i).getidreg());
            for(int j=0;j<transaksi.get(i).get_index();j++){
                System.out.println(transaksi.get(i).getpesan().get(j).getnama());
                System.out.println(transaksi.get(i).getpesan().get(j).getid());
                System.out.println(transaksi.get(i).getpesan().get(j).getharga());
            }
        }
    }
}
