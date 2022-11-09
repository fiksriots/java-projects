/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proses;
import data.datastaf;
import data.datastok;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ALAN
 */
public class modeladmin implements manage_proses{
    private final ArrayList <datastaf> staf = new ArrayList();
    private final ArrayList <datastok> brg = new ArrayList();
    private int panjang = staf.size();
    private int panjang1 = brg.size();
    
    public ArrayList <datastaf> getstaf(){
        return staf;
    }
    public int getPanjang(){
        return panjang;
    }
    
    @Override
    public void insert(String sales,String kasir){
        staf.add(new datastaf(sales,kasir));
    }
    @Override
    public void delete_staf(int no){
        staf.remove(no);
    }
    @Override
    public void update(int no,String sales,String kasir){
        staf.set(no , new datastaf(sales,kasir));
    }
    
    @Override
    public void insert(String nama,String id,int harga){
        brg.add(new datastok(nama,id,harga));
    }
    @Override
    public void delete(int no){
            brg.remove(no);
    }
    @Override
    public void update(int no,String nama,String id,int harga){
        brg.set(no, new datastok(nama,id,harga));
    }
    
    @Override
    public datastaf carisales(String nama){
        datastaf ketemu_sales = null;
        for(int i=0;i<staf.size();i++){
            if(nama.equals(staf.get(i).getNamaSales())){
                ketemu_sales=staf.get(i);
            }
        }
        return ketemu_sales;
    }
    
    @Override
     public datastaf carikasir(String nama){
        datastaf ketemu_kasir = null;
        for(int i=0;i<staf.size();i++){
            if(nama.equals(staf.get(i).getNamaKasir())){
                ketemu_kasir = staf.get(i);
            }
        }
        return ketemu_kasir;
    }
    
    @Override
    public DefaultTableModel viewTabelStaf(){
        DefaultTableModel modelstaf = new DefaultTableModel();
        Object[] kolom = {"nama sales","nama kasir"};
        modelstaf.setColumnIdentifiers(kolom);
        panjang = staf.size();
        for(int i=0;i<panjang;i++){
            Object [] datastaf = new Object[2];
            datastaf[0]=staf.get(i).getNamaSales();
            datastaf[1]=staf.get(i).getNamaKasir();
            modelstaf.addRow(datastaf);
        }
        return modelstaf;
    }
    
    @Override
    public DefaultTableModel viewTabelBarang(){
        DefaultTableModel modeladmin = new DefaultTableModel();
        Object[] kolom = {"nama barang","id barang","harga barang"};
        modeladmin.setColumnIdentifiers(kolom);
        panjang1 = brg.size();
        for (int i=0 ;i<panjang1;i++){
            Object[] data = new Object[3];
            data[0]=brg.get(i).getnama();
            data[1]=brg.get(i).getid();
            data[2]=brg.get(i).getharga();
            modeladmin.addRow(data);
        }
        return modeladmin;
    }
}
