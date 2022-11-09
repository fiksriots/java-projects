/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06943_praktikummod6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Moch Ilham
 */
public class MenuBangunDatar extends Komponen{
    
    public MenuBangunDatar() {
        persegi.setBounds(10, 10, 150, 25);
        persegi.setBackground(Color.black);
        persegi.setForeground(Color.white);
        persegi.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               Persegi p = new Persegi();
           } 
        });
        persegiPanjang.setBounds(10, 50, 150, 25);
        persegiPanjang.setBackground(Color.black);
        persegiPanjang.setForeground(Color.white);
        persegiPanjang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    PersegiPanjang pp = new PersegiPanjang();
                } catch (Exception ex) {

                }
            }
        });
        add(persegi);
        add(persegiPanjang);
        setSize(190, 130);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
