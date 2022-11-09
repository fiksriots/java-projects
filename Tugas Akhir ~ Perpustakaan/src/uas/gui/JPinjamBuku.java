/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;
import uas.Objek;
import uas.ModelMember;

/**
 *
 * @author Alexander Pratama
 */
public class JPinjamBuku extends JFrame {

    static ArrayList cetakmem;
    
    String id2, judul2, pengaranghp2;

    public JPinjamBuku() {
        JFrame frameKasir = new JFrame();
        frameKasir.setTitle("");
        frameKasir.setSize(450, 700);
        frameKasir.setLocationRelativeTo(null);
        frameKasir.setLayout(null);
        frameKasir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel input = new JLabel("Pinjam Buku");
        JLabel judul = new JLabel("Judul Buku");
        JLabel pengaranghp = new JLabel("Pengarang");
        JLabel noid = new JLabel("ID Buku");
        JTextField textjudul = new JTextField();
        JTextField textpengarang = new JTextField();
        JTextField textnoid = new JTextField();
        JTextField texttgl = new JTextField();
        JTextField texttix = new JTextField();
        JTextField textid = new JTextField();
        TableColumn tc1 = new TableColumn();
        TableColumn tc2 = new TableColumn();
        TableColumn tc3 = new TableColumn();
        JButton bhome = new JButton("Home");
        JButton bcm = new JButton("C");
        JButton bcetakm = new JButton("Pinjam");
        JTextPane pan = new JTextPane();

        input.setBounds(20, 10, 300, 30);
        input.setFont(new Font("Arial", Font.BOLD, 20));
        frameKasir.add(input);

        judul.setBounds(20, 40, 100, 30);
        judul.setFont(new Font("Arial", Font.BOLD, 14));
        frameKasir.add(judul);

        textjudul.setBounds(20, 80, 200, 30);

        frameKasir.add(textjudul);

        pengaranghp.setBounds(20, 110, 100, 30);
        pengaranghp.setFont(new Font("Arial", Font.BOLD, 14));
        frameKasir.add(pengaranghp);

        textpengarang.setBounds(20, 150, 200, 30);
        textpengarang.setFont(new Font("Arial", Font.PLAIN, 14));
        frameKasir.add(textpengarang);

        noid.setBounds(20, 180, 100, 30);
        noid.setFont(new Font("Arial", Font.BOLD, 14));
        frameKasir.add(noid);

        textnoid.setBounds(20, 210, 200, 30);

        frameKasir.add(textnoid);

        String[] field = {"ID", "Judul Buku", "Pengarang"};
        DefaultTableModel model = new DefaultTableModel(field, 0);
        JTable tabel = new JTable(model);
        tc1 = tabel.getColumnModel().getColumn(0);
        tc2 = tabel.getColumnModel().getColumn(1);
        tc3 = tabel.getColumnModel().getColumn(2);
        tc1.setPreferredWidth(50);
        tc2.setPreferredWidth(150);
        tc3.setPreferredWidth(100);
        JScrollPane scroll_pane = new JScrollPane(tabel);
        scroll_pane.setBounds(20, 300, 300, 300);
        frameKasir.add(scroll_pane);

        bhome.setBounds(325, 10, 90, 30);
        bhome.setFont(new Font("Arial", Font.BOLD, 14));
        bhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ex) {
                JAwal le = new JAwal();
                frameKasir.dispose();
            }
        });
        frameKasir.add(bhome);
        

        bcetakm.setBounds(20, 250, 90, 30);
        bcetakm.setFont(new Font("Arial", Font.BOLD, 14));
        bcetakm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textnoid.getText().equals("")||textjudul.getText().equals("")||textpengarang.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Buku Kosong"); 
                }else{
                id2 = textnoid.getText();
                judul2 =  textjudul.getText();
                String pengarang2 = textpengarang.getText();
                
                Objek.data_pinjam.insert(judul2, Objek.a, pengarang2, id2);
                Objek.data_member.ambil(judul2);
                tabel.setModel(Objek.data_member.viewTabel());
                JOptionPane.showMessageDialog(null, "Buku Dipinjam");
            }}
        });
        frameKasir.add(bcetakm);
        tabel.setModel(Objek.data_member.viewTabel());
        
        bcm.setBounds(140, 250, 90, 30);
        bcm.setFont(new Font("Arial", Font.BOLD, 14));
        bcm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                textnoid.setText("");
                textjudul.setText("");
                textpengarang.setText("");

            }
        });
        frameKasir.add(bcm);


        pan.setBounds(450, 300, 450, 300);

        frameKasir.add(pan);

        frameKasir.setVisible(true);
    }
}
