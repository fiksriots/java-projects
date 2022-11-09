/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import data.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ALAN
 */
public class pemesanan extends data{
    private String nama_pembeli;
    private ArrayList <datastok> pesan = new ArrayList();
    private int index;
    public void insert_index(int index){
        this.index=index;
    }
    public int get_index(){
        return index;
    }
    public String get_namaPembeli(){
        return nama_pembeli;
    }
    public pemesanan(){
        pesan = new ArrayList<datastok>();
    }
    public ArrayList <datastok> getpesan(){
        return pesan;
    }
    public String get_namaSales(){
        return nama;
    }
    public void insert_pesanan(String nama,String sales, String id,ArrayList pesanan){
        this.nama_pembeli=nama;
        this.pesan = pesanan;
        super.id=id;
        super.nama=sales;
    }
    
    public String getidreg(){
        return id;
    }
    public void remove(){
        pesan.clear();
    }
    public DefaultTableModel viewpesanan(){
        DefaultTableModel modelpesanan = new DefaultTableModel();
        Object [] kolom = {"nama barang","id barang","harga barang"};
        modelpesanan.setColumnIdentifiers(kolom);
        for(int i =0;i<pesan.size();i++){
            Object [] datapesan = new Object[3];
            datapesan[0]=pesan.get(i).getnama();
            datapesan[1]=pesan.get(i).getid();
            datapesan[2]=pesan.get(i).getharga();
            modelpesanan.addRow(datapesan);
        }
        return modelpesanan;
    }
    public void cetak(){
        for(int i=0;i<pesan.size();i++){
            System.out.println(pesan.get(i).getharga());
        }
    }
    public int hargatotal(){
        int harga=0;
        for(int i=0;i<pesan.size();i++){
            harga = harga+pesan.get(i).getharga();
        }
        return harga;
    }
}
