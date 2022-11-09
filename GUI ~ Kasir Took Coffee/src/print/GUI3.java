package print;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import mod6prak.GUI;
public class GUI3 extends komponen1
{
    String nama,id;
    String harga,total,banyak;
    public GUI3(String nama,String id,String harga,String banyak,String total)
    {
        this.nama=nama;
        this.id=id;
        this.harga=harga;
        this.banyak=banyak;
        this.total=total;
        setTitle("print");
        setSize(340,350);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        print.setBounds(0,0,340,170);
        print.setBackground(Color.BLACK);
        print.setForeground(Color.WHITE);
        
        print.setText
        (
                " ==== STRUCT PEMBELIAN ====\n" +
                "\n"+
                "   ID     : "+this.id+"\n"+
                "   nama   : "+this.nama+"\n"+
                "   harga  : "+this.harga+"\n"+
                "   banyak : "+this.banyak+"\n"+
                "   total  : "+this.total+"\n"+
                "\n"+
                " ===========================\n"
        );
        add(print);
        
        kembali.setBounds(40,200,100,30);
        kembali.setBackground(Color.BLACK);
        kembali.setForeground(Color.WHITE);
        kembali.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
            }
        });
        add(kembali);
    }
}
