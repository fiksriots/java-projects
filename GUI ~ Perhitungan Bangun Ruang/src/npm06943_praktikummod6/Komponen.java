/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06943_praktikummod6;

import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moch Ilham
 */
public class Komponen extends JFrame{
  
    JTable table;
    JButton button;
    Container konten = getContentPane();
    private final Object[] columnName = {"ID","Name","Price","Stock"};
    private Object[][] data;
    DefaultTableModel tableModel = new DefaultTableModel(data, columnName);
    
    JLabel JUDUL = new JLabel("Coffee Shop Cashier");
    JLabel PID = new JLabel("Product ID");
    JLabel PName = new JLabel("Product Name");
    JLabel Price = new JLabel("Price");
    JLabel Quantity = new JLabel("Quantity");
    JLabel TSales = new JLabel("Total Sales");
    
    JTextField PID1 = new JTextField();
    JTextField PName1 = new JTextField();
    JTextField Price1 = new JTextField();
    JTextField Quantity1 = new JTextField();
    JTextField TSales1 = new JTextField();
    
    JButton ClearF = new JButton("I Clear Field");
    JButton PrintStruct = new JButton("Print Struct");
    JButton NewProduct = new JButton("+Add New Product");
    JTextPane hasil = new JTextPane();
    JPanel panel = new JPanel();
}
