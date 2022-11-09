/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06943_praktikummod6;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

/**
 *
 * @author Moch Ilham
 */
public class MenuBangun extends Komponen {

    public MenuBangun() {
        bangunDatar.setBounds(10, 10, 150, 25);
        bangunDatar.setBackground(Color.black);
        bangunDatar.setForeground(Color.white);
        bangunDatar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    MenuBangunDatar bngnDatar = new MenuBangunDatar();
                } catch (Exception ex) {

                }
            }
        });
        bangunRuang.setBounds(10, 50, 150, 25);
        bangunRuang.setBackground(Color.black);
        bangunRuang.setForeground(Color.white);
        bangunRuang.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    MenuBangunRuang bngnRuang = new MenuBangunRuang();
                }catch(Exception ex){
                    
                }
            }
        });
        panel.setBounds(5, 10, 50, 100);
        panel.setBackground(Color.BLACK);
        add(panel);
        add(bangunDatar);
        add(bangunRuang);
        setSize(190, 130);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
