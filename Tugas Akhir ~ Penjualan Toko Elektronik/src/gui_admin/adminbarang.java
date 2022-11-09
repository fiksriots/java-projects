/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_admin;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import proses.allobject;
/**
 *
 * @author ALAN
 */
public class adminbarang {
    allobject objek = new allobject();
    JFrame admin_barang;
    JTextField textnama,textid,textharga;
    JButton insert,update,delete,kembali;
    
    public adminbarang(){
        
        admin_barang = new JFrame("barang");
        admin_barang.setSize(400,580);
        admin_barang.getContentPane().setBackground(Color.YELLOW);
        JLabel nama = new JLabel("nama barang");
        nama.setBounds(30,30,100,50);
        JLabel id = new JLabel("id barang");
        id.setBounds(30,80,100,50);
        JLabel harga = new JLabel("harga");
        harga.setBounds(30,130,100,50);
        admin_barang.add(harga);
        admin_barang.add(nama);
        admin_barang.add(id);
        
        textnama = new JTextField();
        textnama.setBounds(150,40,200,30);
        admin_barang.add(textnama);
        
        textid = new JTextField();
        textid.setBounds(150,90,200,30);
        admin_barang.add(textid);
        
        textharga = new JTextField();
        textharga.setBounds(150,140,200,30);
        admin_barang.add(textharga);
        
        insert = new JButton("insert");
        insert.setBounds(30,210,80,20);
        insert.setBackground(Color.GREEN);
        admin_barang.add(insert);
        
        update = new JButton("update");
        update.setBounds(150,210,80,20);
        update.setBackground(Color.GREEN);
        admin_barang.add(update);
        
        delete = new JButton("delete");
        delete.setBounds(270,210,80,20);
        delete.setBackground(Color.GREEN);
        admin_barang.add(delete);
        
        JTable admin = new JTable();
        JScrollPane Scrolladmin = new JScrollPane(admin);
        Scrolladmin.setBounds(30,240,330,250);
        admin_barang.add(Scrolladmin);
        admin.setModel(allobject.data_admin.viewTabelBarang());
        
        admin_barang.setLocationRelativeTo(null);
        admin_barang.setLayout(null);
        admin_barang.setVisible(true);
        admin_barang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        kembali = new JButton("back");
        kembali.setBounds(30,500,100,30);
        kembali.setBackground(Color.RED);
        admin_barang.add(kembali);
        
        kembali.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                admin_barang.setVisible(false);
            }
        });
        insert.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                String nama = textnama.getText();
                String id = textid.getText();
                int harga = Integer.parseInt(textharga.getText());
                allobject.data_admin.insert(nama, id, harga);
                admin.setModel(allobject.data_admin.viewTabelBarang());
                kosong();
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,"harga harus angka","information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
     
        delete.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
              int i = admin.getSelectedRow();
              allobject.data_admin.delete(i);
              admin.setModel(allobject.data_admin.viewTabelBarang());

            }
        });
        update.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                String nama = textnama.getText();
                String id = textid.getText();
                int harga = Integer.parseInt(textharga.getText());
                int i = admin.getSelectedRow();
                allobject.data_admin.update(i, nama, id, harga);
                admin.setModel(allobject.data_admin.viewTabelBarang());
                kosong();
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,"harga harus angka","information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
    public void kosong(){
        textnama.setText("");
        textid.setText("");
        textharga.setText("");
    }
}
