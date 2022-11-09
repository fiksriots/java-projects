/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_kasir;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import proses.allobject;
/**
 *
 * @author ALAN
 */
public class kasir extends JFrame {
    public kasir(){
        JFrame kasir = new JFrame("kasir");
        kasir.setSize(800,600);
        kasir.getContentPane().setBackground(Color.YELLOW);
        kasir.setVisible(true);
        kasir.setLayout(null);
        kasir.setLocationRelativeTo(null);
        kasir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel konfirm = new JLabel("===KASIR===");
        konfirm.setBounds(230,40,300,30);
        konfirm.setFont(new Font("Times New Roman",Font.BOLD,40));
        kasir.add(konfirm);
        
        JTextPane struk = new JTextPane();
        struk.setBounds(350,130,400,400);
        kasir.add(struk);
        
        JLabel id_transaksi = new JLabel("Id Transaksi");
        id_transaksi.setBounds(30,280,100,20);
        kasir.add(id_transaksi);
        JLabel uang_pembayaran = new JLabel("bayar");
        uang_pembayaran.setBounds(30,430,120,20);
        kasir.add(uang_pembayaran);
        JLabel Kasir = new JLabel("nama kasir");
        Kasir.setBounds(30,180,100,20);
        kasir.add(Kasir);
        
        JTextField nama_kasir = new JTextField();
        nama_kasir.setBounds(30,200,200,20);
        kasir.add(nama_kasir);
        nama_kasir.setText(allobject.data_admin.carikasir(allobject.kasir_nama).getNamaKasir());
        
        JTextField text_id = new JTextField();
        text_id.setBounds(30,300,200,20);
        kasir.add(text_id);
        
        JTextField text_bayar = new JTextField();
        text_bayar.setBounds(30,460,200,20);
        kasir.add(text_bayar);
        
        JTextField text_harga = new JTextField();
        text_harga.setBounds(120,380,110,20);
        kasir.add(text_harga);
        
        
        JButton check = new JButton("cetak");
        check.setBounds(30,500,80,30);
        check.setBackground(Color.GREEN);
        kasir.add(check);
        
        JButton harga = new JButton("harga");
        harga.setBounds(30,380,80,20);
        kasir.add(harga);
        
        JButton back = new JButton("back");
        back.setBounds(130,500,80,30);
        back.setBackground(Color.red);
        kasir.add(back);
        
        harga.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                text_harga.setText(""+allobject.data_kasir.harga(text_id.getText()));
            }
        });
        
        check.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                int harga = Integer.parseInt(text_harga.getText());
                int bayar = Integer.parseInt(text_bayar.getText());
                struk.setText("===struk pembayaran===\n"
                        + allobject.data_kasir.struck(text_id.getText())+"\n"
                        + "nama kasir = "+nama_kasir.getText()+"\n"
                        + "kembalian = "+allobject.data_kasir.kembalian(bayar, harga)+"\n"
                            + "======================");
                text_id.setText("");
                text_bayar.setText("");
            }
        });
        
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                kasir.dispose();
            }
        });
        
    }
}
