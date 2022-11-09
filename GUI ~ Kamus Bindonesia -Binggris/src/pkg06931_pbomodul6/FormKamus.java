/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06931_pbomodul6;


import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 *
 * @author hamlet
 */
public class FormKamus {
    DataKamus dataKamus = new DataKamus();
    
    JFrame jframe = new JFrame();
    JPanel jMain = new JPanel();
    
    
    JPanel jpanel0 = new JPanel();
    JPanel jpanel1 = new JPanel();
    
    JLabel jJudul = new JLabel("Kamus");
    JRadioButton jtoEnglish = new JRadioButton("Indonesia-Inggris");
    JRadioButton jtoIndonesia = new JRadioButton("Inggris-Indonesia");
    ButtonGroup bg = new ButtonGroup();
    
        
    
    
    String[] comboBox = {"red","blue"} ;
    JComboBox jcomboSet = new JComboBox(comboBox);
    
    JLabel jlblisi = new JLabel("Kata : ");
    JTextField jtxtIsi = new JTextField();
    JButton jbtnEnter = new JButton("Translate");
    JTextArea jtxtHasil = new JTextArea();

    public FormKamus() {               
        
        
        
        Dimension size0 = new Dimension(800,100);
        Dimension size = new Dimension(800,500);        
//        jJudul.setSize(400,200);
//        jJudul.setBounds(0, 350, 400, 200);

        
        
        jJudul.setBounds(350, 25, 300, 50);
        jJudul.setFont(new Font("sans-serif",Font.BOLD,28));                
        jcomboSet.setBounds(700, 45, 100, 20);
        jcomboSet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(jcomboSet.getSelectedItem().toString().equals("red")){
                    jpanel0.setBackground(Color.red);
                }else if(jcomboSet.getSelectedItem().toString().equals("blue")){
                    jpanel0.setBackground(Color.blue);
                }
            }
        });
        
        jpanel0.setBounds(0, 100, 800, 600);
//        jpanel0.setBackground(Color.red);
        jpanel0.setLayout(null);
        
        jtoEnglish.setBounds(0,0, 300, 40);
        jtoEnglish.setFont(new Font("sans-serif",Font.BOLD,22));
        jtoEnglish.setOpaque(false);
        
        jtoIndonesia.setBounds(550, 0, 300, 40);
        jtoIndonesia.setFont(new Font("sans-serif",Font.BOLD,22));
        jtoIndonesia.setOpaque(false);
        
        bg.add(jtoEnglish);
        bg.add(jtoIndonesia);     
        
        jlblisi.setBounds(0, 50, 300, 40);
        jlblisi.setFont(new Font("sans-serif",Font.BOLD,22));
        jtxtIsi.setBounds(80, 50, 500, 40);
        
        
        jbtnEnter.setBounds(600, 50, 150, 40);
        jbtnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(jtoIndonesia.isSelected()){
                    String kata = jtxtIsi.getText();
                
                    String hasil = dataKamus.transToIndo(kata);
                    jtxtHasil.setText(hasil);
                }else if(jtoEnglish.isSelected()){
                    String kata = jtxtIsi.getText();
                
                    String hasil = dataKamus.transToEng(kata);
                    jtxtHasil.setText(hasil);
                }
            }
        });
        jtxtHasil.setBounds(10, 100, 770, 400);
        
        jpanel0.setBackground(Color.red);
        jpanel0.add(jtoEnglish);
        jpanel0.add(jtoIndonesia);
        jpanel0.add(jlblisi);
        jpanel0.add(jtxtIsi);
        jpanel0.add(jbtnEnter);
        jpanel0.add(jtxtHasil);
        
        
        
        
        
        
     
        
        //FRAME
        jframe.setTitle("Kamus");
        jframe.setContentPane(jMain);
        jframe.getContentPane().setLayout(null);
        
        
        jMain.add(jJudul);
        jMain.add(jcomboSet);
        jMain.add(jpanel0);
       
        
        jframe.setSize(800, 600);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.getRootPane().setDefaultButton(jbtnEnter);
        jtxtIsi.requestFocusInWindow();

    }
    
    
}
