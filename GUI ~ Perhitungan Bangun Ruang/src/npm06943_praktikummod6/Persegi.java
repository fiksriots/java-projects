/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06943_praktikummod6;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Moch Ilham
 */
public class Persegi extends Komponen {

    public Persegi() {
        prsgi.setBounds(85, 20, 500, 40);
        prsgi.setFont(new Font("Consolas", Font.BOLD, 30));
        ss.setBounds(20, 75, 200, 30);
        ss.setFont(new Font("Consolas", Font.BOLD, 14));
        sisi.setBounds(20, 100, 200, 30);
        sisi.setFont(new Font("Consolas", Font.BOLD, 14));
        hasil.setBounds(20, 150, 200, 30);
        hasil.setFont(new Font("Consolas", Font.BOLD, 15));
        back.setBounds(20, 200, 75, 25);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                } catch (Exception ex) {

                }
            }
        });
        calculate.setBounds(125, 200, 90, 25);
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    hasil.setText("Luas : " + Luas());
                } catch (Exception ex) {

                }
            }
        });
        add(prsgi);
        add(ss);
        add(sisi);
        add(back);
        add(calculate);
        add(hasil);
        setSize(275, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private double Luas() {
        double Luas;
        Luas = Math.pow(Integer.parseInt(sisi.getText()), 2);
        return Luas;
    }
}
