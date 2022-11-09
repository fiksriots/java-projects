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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import proses.allobject;
/**
 *
 * @author ALAN
 */
public class adminstaf extends JFrame{
    JTextField textkasir,textsales;
    public adminstaf(){
        JFrame admin_staf = new JFrame("staf");
        admin_staf.setSize(400,580);
        admin_staf.getContentPane().setBackground(Color.YELLOW);
        admin_staf.setLayout(null);
        
        JLabel sales = new JLabel("nama sales");
        sales.setBounds(30,30,100,50);
        JLabel kasir = new JLabel("nama kasir");
        kasir.setBounds(30,80,100,50);
        admin_staf.add(sales);
        admin_staf.add(kasir);
        
        textsales = new JTextField();
        textsales.setBounds(150,40,200,30);
        admin_staf.add(textsales);
        
        textkasir = new JTextField();
        textkasir.setBounds(150,90,200,30);
        admin_staf.add(textkasir);
        
        JButton insert = new JButton("insert");
        insert.setBounds(30,140,80,20);
        insert.setBackground(Color.GREEN);
        admin_staf.add(insert);
        
        JButton update = new JButton("update");
        update.setBounds(150,140,80,20);
        update.setBackground(Color.GREEN);
        admin_staf.add(update);
        
        JButton delete = new JButton("delete");
        delete.setBounds(270,140,80,20);
        delete.setBackground(Color.GREEN);
        admin_staf.add(delete);
        
        JButton back = new JButton("back");
        back.setBounds(30,470,100,30);
        back.setBackground(Color.RED);
        admin_staf.add(back);
        
        JTable staf = new JTable();
        JScrollPane Scrollstaf = new JScrollPane(staf);
        Scrollstaf.setBounds(30,200,330,250);
        admin_staf.add(Scrollstaf);
        staf.setModel(allobject.data_admin.viewTabelStaf());
        
        insert.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                String sales = textsales.getText();
                String kasir = textkasir.getText();
                allobject.data_admin.insert(sales, kasir);
                staf.setModel(allobject.data_admin.viewTabelStaf());
                kosong();
            }
        });
        update.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                String sales = textsales.getText();
                String kasir = textkasir.getText();
                int i = staf.getSelectedRow();
                allobject.data_admin.update(i, sales, kasir);
                staf.setModel(allobject.data_admin.viewTabelStaf());
                kosong();
            }
        });
        delete.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                int i = staf.getSelectedRow();
                allobject.data_admin.delete_staf(i);
                staf.setModel(allobject.data_admin.viewTabelStaf());
            }
        });
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                admin_staf.dispose();
            }
        });
        admin_staf.setLocationRelativeTo(null);
        admin_staf.setVisible(true);
        admin_staf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void kosong(){
        textsales.setText(null);
        textkasir.setText(null);
    }
}
