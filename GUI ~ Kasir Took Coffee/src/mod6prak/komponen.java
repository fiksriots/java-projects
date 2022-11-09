package mod6prak;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class komponen extends JFrame
{   
    JLabel label = new JLabel("Coffee Shop Cashier");
    JLabel id = new JLabel("Product ID");
    JLabel nama = new JLabel("Product Name");
    JLabel bayar = new JLabel("Price");
    JLabel pesan = new JLabel("Quantity");
    JTextField us = new JTextField();
    JTextField nm = new JTextField();
    JTextField byr = new JTextField();
    JTextField psn = new JTextField();
    JTextField ttl = new JTextField(); 
    DefaultTableModel tabel;
    JTable tbl = new JTable();
    JScrollPane scroll = new JScrollPane();
    JButton ttlbyr = new JButton("Total Sales");    
    JButton clear = new JButton("I Clear Field");
    JButton print = new JButton("Print Struct");
    JButton add = new JButton("+Add New Product");
}
