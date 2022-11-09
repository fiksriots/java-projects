/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;
import javax.swing.*;

public class komponen extends JFrame {
    JLabel labelJudul = new JLabel("Penitipan Barang");
    JLabel labelNama = new JLabel("Nama Barang");
    JLabel labelHari = new JLabel("Hari");
    JLabel labelLamaPenitipan = new JLabel("Lama Penitipan ");
    JLabel labelTelat = new JLabel("Tunggak kan  ");
    JLabel labelUrut = new JLabel("No Urut");

    JTextField txtHari = new JTextField();
    JTextField txtLamaPenitipan = new JTextField();
    JTextField txtTelat = new JTextField();
    JTextField txtAmbilUrut = new JTextField();

    JButton btnInsert = new JButton("INSERT");
    JButton btnSelect = new JButton("SELECT");
    JButton btnTotal = new JButton("TOTAL");

}
