/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06943_praktikummod6;

import java.awt.Font;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

/**
 *
 * @author Moch Ilham
 */
public class MenuBangunRuang extends Komponen {

    public MenuBangunRuang() {
        kubus.setBounds(10, 10, 150, 25);
        kubus.setBackground(Color.black);
        kubus.setForeground(Color.white);
        kubus.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               Kubus kbs = new Kubus();
           } 
        });
        balok.setBounds(10, 50, 150, 25);
        balok.setBackground(Color.black);
        balok.setForeground(Color.white);
        balok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Balok blk = new Balok();
                } catch (Exception ex) {

                }
            }
        });
        add(kubus);
        add(balok);
        setSize(190, 130);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
