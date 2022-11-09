/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_sales;
import data.datastok;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import proses.allobject;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import proses.modeladmin;
import java.util.ArrayList;
/**
 *
 * @author ALAN
 */
public class sales extends JFrame {
    modeladmin admin = new modeladmin();
    public sales(){
    JFrame sales = new JFrame("sales");
    sales.setSize(1400,700);
    sales.getContentPane().setBackground(Color.YELLOW);
    sales.setVisible(true);
    sales.setLayout(null);
    sales.setLocationRelativeTo(null);
    
    JLabel judul = new JLabel("===PEMESANAN===");
    judul.setBounds(500,30,400,40);
    judul.setFont(new Font("Times New Roman",Font.BOLD,40));
    sales.add(judul);
    
    JLabel nama = new JLabel("nama barang");
    nama.setBounds(450,110,100,50);
    sales.add(nama);
    
    JLabel nama_barang = new JLabel("id barang");
    nama_barang.setBounds(450,150,100,50);
    sales.add(nama_barang);
    
    JLabel harga_barang = new JLabel("harga barang");
    harga_barang.setBounds(450,190,100,50);
    sales.add(harga_barang);
    
    JLabel pembeli = new JLabel("Nama pembeli");
    pembeli.setBounds(30,110,100,50);
    sales.add(pembeli);
    
    JLabel regis = new JLabel("ID Transaksi");
    regis.setBounds(30,150,100,50);
    sales.add(regis);
    
    JLabel Sales = new JLabel("sales");
    Sales.setBounds(30,190,100,50);
    sales.add(Sales);
    
    JLabel stok = new JLabel("Stok Barang");
    stok.setBounds(30,250,300,50);
    stok.setFont(new Font("Times New Roman",Font.BOLD,30));
    sales.add(stok);
    
    JLabel pemesanan = new JLabel("Pemesanan");
    pemesanan.setBounds(450,250,300,50);
    pemesanan.setFont(new Font("Times New Roman",Font.BOLD,30));
    sales.add(pemesanan);
    
    JLabel transaksi = new JLabel("Transaksi");
    transaksi.setBounds(800,130,300,50);
    transaksi.setFont(new Font("Times New Roman",Font.BOLD,30));
    sales.add(transaksi);
    
    JTextField textnama = new JTextField();
    textnama.setBounds(550,130,200,20);
    sales.add(textnama);
    
    JTextField textnamabrg = new JTextField();
    textnamabrg.setBounds(550,170,200,20);
    sales.add(textnamabrg);
    
    JTextField texthargabrg = new JTextField();
    texthargabrg.setBounds(550,210,200,20);
    sales.add(texthargabrg);
    
    JTextField id_regis = new JTextField();
    id_regis.setBounds(140,170,200,20);
    sales.add(id_regis);
    
    JTextField text_pembeli = new JTextField();
    text_pembeli.setBounds(140,130,200,20);
    sales.add(text_pembeli);
    
    JTextField nama_sales = new JTextField();
    nama_sales.setBounds(140,210,200,20);
    sales.add(nama_sales);
    nama_sales.setText(allobject.data_admin.carisales(allobject.sales_nama).getNamaSales());
    
    id_regis.addKeyListener(new KeyAdapter(){
        @Override
        public void keyTyped(KeyEvent key){
            if(!Character.isDigit(key.getKeyChar())){
                key.consume();
                JOptionPane.showMessageDialog(null, "hanya angka");
            }
        }
    });
    
    
        JTable admin = new JTable();
        JScrollPane Scrolladmin = new JScrollPane(admin);
        Scrolladmin.setBounds(30,320,330,250);
        sales.add(Scrolladmin);
        admin.setModel(allobject.data_admin.viewTabelBarang());
        
        JTable beli = new JTable();
        JScrollPane Scrollbeli = new JScrollPane(beli);
        Scrollbeli.setBounds(450,320,330,250);
        sales.add(Scrollbeli);
        beli.setModel(allobject.pesanan.viewpesanan());
        
        JTable history_tabel = new JTable();
        JScrollPane Scrollhistory = new JScrollPane(history_tabel);
        Scrollhistory.setBounds(800,200,500,350);
        sales.add(Scrollhistory);
        history_tabel.setModel(allobject.trans.viewhistory());
        
        
    
    JButton add = new JButton("add");
    add.setBounds(450,600,100,30);
    add.setBackground(Color.GREEN);
    sales.add(add);
    
    JButton cetak = new JButton("cetak");
    cetak.setBounds(670,600,100,30);
    cetak.setBackground(Color.GREEN);
    sales.add(cetak);
    
    JButton back = new JButton("back");
    back.setBounds(30,600,100,30);
    back.setBackground(Color.red);
    sales.add(back);
    
    JButton clear = new JButton("clear");
    clear.setBounds(560,600,100,30);
    sales.add(clear);
            
    ArrayList <datastok> temp = new ArrayList<datastok>();
    add.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                
                String nama = textnama.getText();
                String id = textnamabrg.getText();
                int harga = Integer.parseInt(texthargabrg.getText());
//                int i = admin.getSelectedRow();
//                allobject.data_admin.delete(i);
                temp.add(new datastok(nama,id,harga));
                allobject.pesanan.insert_pesanan(text_pembeli.getText(),nama_sales.getText(),id_regis.getText(), temp);
                admin.setModel(allobject.data_admin.viewTabelBarang());
                beli.setModel(allobject.pesanan.viewpesanan());
            }
        });
    cetak.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                String cetak = "====== toko elektrronik ======\n"
                        + "nama pembeli  = "+textnama.getText()+"\n"
                        + "total biaya   = "+allobject.pesanan.hargatotal()+"\n"
                        + "ID registrasi = "+id_regis.getText()+"\n"
                        + "==========================";
                JOptionPane.showMessageDialog(null,cetak,"Struk pembelian",JOptionPane.INFORMATION_MESSAGE);
                
                allobject.trans.insert(text_pembeli.getText(),nama_sales.getText(),id_regis.getText(), temp, temp.size());
                beli.setModel(allobject.pesanan.viewpesanan());
                id_regis.setText("");
                text_pembeli.setText("");
//                textnama.setText("");
//                textnamabrg.setText("");
//                texthargabrg.setText("");
                history_tabel.setModel(allobject.trans.viewhistory());
            }
        });
    admin.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            int i = admin.getSelectedRow();
            textnama.setText(allobject.data_admin.viewTabelBarang().getValueAt(i, 0).toString());
            textnamabrg.setText(allobject.data_admin.viewTabelBarang().getValueAt(i, 1).toString());
            texthargabrg.setText(allobject.data_admin.viewTabelBarang().getValueAt(i, 2).toString());
        }
    });
    
    back.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            sales.dispose();
        }
    });
    clear.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
               temp.clear();
               beli.setModel(allobject.pesanan.viewpesanan());
            }
        });
    sales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
