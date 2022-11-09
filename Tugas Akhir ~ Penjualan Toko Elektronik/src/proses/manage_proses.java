/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proses;

import data.datastaf;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALAN
 */
public abstract interface manage_proses {
    public abstract void insert(String sales,String kasir);
    public abstract void delete_staf(int no);
    public abstract void update(int no,String sales,String kasir);
    public abstract void insert(String nama,String id,int harga);
    public abstract void delete(int no);
    public abstract void update(int no,String nama,String id,int harga);
    public abstract datastaf carisales(String nama);
    public abstract datastaf carikasir(String nama);
    public abstract DefaultTableModel viewTabelStaf();
    public abstract DefaultTableModel viewTabelBarang();
}
