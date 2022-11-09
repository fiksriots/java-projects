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
public class PersegiPanjang extends Komponen{

    public PersegiPanjang() {
        pPanjang.setBounds(85, 20, 500, 40);
        pPanjang.setFont(new Font("Consolas", Font.BOLD, 30));
        pnjng.setBounds(20, 75, 200, 30);
        pnjng.setFont(new Font("Consolas", Font.BOLD, 14));
        lbr.setBounds(20, 125, 200, 30);
        lbr.setFont(new Font("Consolas", Font.BOLD, 14));
        panjang.setBounds(20, 100, 200, 30);
        panjang.setFont(new Font("Consolas", Font.BOLD, 14));
        lebar.setBounds(20, 150, 200, 30);
        lebar.setFont(new Font("Consolas", Font.BOLD, 14));
        hasil.setBounds(20, 200, 200, 30);
        hasil.setFont(new Font("Consolas", Font.BOLD, 15));
        back.setBounds(20, 250, 75, 25);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                } catch (Exception ex) {

                }
            }
        });
        calculate.setBounds(125, 250, 90, 25);
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    hasil.setText("Luas : " + Luas());
                } catch (Exception ex) {

                }
            }
        });
        add(pPanjang);
        add(pnjng);
        add(lbr);
        add(panjang);
        add(lebar);
        add(back);
        add(calculate);
        add(hasil);
        setSize(275, 375);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private double Luas() {
        double Luas;
        Luas = Integer.parseInt(panjang.getText()) * Integer.parseInt(lebar.getText());
        return Luas;
    }
}
