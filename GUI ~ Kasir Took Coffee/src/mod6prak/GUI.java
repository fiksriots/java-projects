package mod6prak;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import print.GUI3;

public class GUI extends komponen
{
    int indek=4;
    String nma,nomor;
    int hga,stok=0;
    GUI[] panggilb = new GUI[100];
    int line=0,paten;
    int i=1;
    int jumlah = 0;
        
    public GUI()
    {

        setTitle("Kasir Took Kopi");
        getContentPane().setBackground(Color.black);
        setSize(670,600);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
         
        label.setBounds(150, 30, 500, 40);
        label.setFont(new Font("Consolas", Font.BOLD,32));
        label.setForeground(Color.WHITE);
        add(label);
        
        id.setBounds(30, 300, 200, 30);
        us.setBounds(30,330,200,30);
        us.setBackground(Color.black);
        us.setForeground(Color.white);
        id.setForeground(Color.white);
        add(id);
        add(us);
        
        nama.setBounds(30, 360, 200, 30);
        nm.setBounds(30, 390, 200, 30);
        nm.setBackground(Color.black);
        nm.setForeground(Color.white);
        nama.setForeground(Color.white);
        add(nama);
        add(nm);
        
        bayar.setBounds(30, 420, 200, 30);
        byr.setBounds(30, 450, 200, 30);
        byr.setBackground(Color.black);
        byr.setForeground(Color.white);
        bayar.setForeground(Color.white);
        add(bayar);
        add(byr);
    
        pesan.setBounds(250, 300, 200, 30);
        psn.setBounds(250, 330, 200, 30);
        psn.setBackground(Color.black);
        psn.setForeground(Color.white);
        pesan.setForeground(Color.white);
        add(pesan);
        add(psn);

        ttlbyr.setBounds(250, 390, 200, 30);
        ttlbyr.setFont(new Font("Consolas",Font.BOLD,14));
        ttlbyr.setBackground(Color.black);
        ttlbyr.setForeground(Color.white);
        ttlbyr.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            
            
            int harga = Integer.parseInt(byr.getText())*Integer.parseInt(psn.getText());
            ttl.setText(String.valueOf(harga));
            stok = Integer.parseInt(psn.getText());
            JButton btnUpdate = new JButton("Update");
            
            
            
             
                // i = the index of the selected row
                int quintity = Integer.parseInt(psn.getText());
                int i = tbl.getSelectedRow();
                
                
                jumlah = jumlah -quintity;
                
                if(i >= 0) 
                {
                   tabel.setValueAt(us.getText(), i, 0);
                   tabel.setValueAt(nm.getText(), i, 1);
                   tabel.setValueAt(byr.getText(), i, 2);
                   tabel.setValueAt(jumlah, i, 3);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        ttl.setBounds(250, 450, 200, 30);
        ttl.setFont(new Font("Consolas",Font.BOLD,14));
        ttl.setBackground(Color.black);
        ttl.setForeground(Color.white);
        
        add(ttlbyr);
        add(ttl);

        JTextField stok =new JTextField();
        // button update row
        JButton btnUpdate = new JButton("Update");     
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = tbl.getSelectedRow();
                
                if(i >= 0) 
                {
                   tabel.setValueAt(us.getText(), i, 0);
                   tabel.setValueAt(nm.getText(), i, 0);
                   tabel.setValueAt(byr.getText(), i, 2);
                   tabel.setValueAt(psn.getText(), i, 0);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });add(btnUpdate);
        
        
        clear.setBounds(30, 500, 150,30);
        clear.setFont(new Font("Consolas",Font.BOLD,14));
        clear.setForeground(Color.white);
        clear.setBackground(Color.black);
        clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                us.setText("");
                nm.setText("");
                byr.setText("");
                psn.setText("");
                ttl.setText("");
            }
        });
        
        print.setBounds(200, 500, 150,30);
        print.setFont(new Font("Consolas",Font.BOLD,14));
        print.setForeground(Color.white);
        print.setBackground(Color.black);
        print.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                GUI3 panggil4 = new GUI3(nm.getText(),us.getText(),byr.getText(),psn.getText(),ttl.getText());   
            }
        });
        add.setBounds(380, 500, 200,30);
        add.setFont(new Font("Consolas",Font.BOLD,14));
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int harga = Integer.parseInt(byr.getText());
                int quintity = Integer.parseInt(psn.getText());
                jumlah = quintity;
                
                
                        tabel.addRow(new Object[0]);
                        tabel.setValueAt(us.getText(), line, 0);
                        tabel.setValueAt(nm.getText(), line, 1);
                        tabel.setValueAt(harga, line, 2);
                        tabel.setValueAt(jumlah, line, 3);
                        line = line + 1;
            }
        });
        add(clear);
        add(print);
        add(add);
                        
        scroll.setBounds(30,110,550,150);
        add(scroll);
        scroll.setViewportView(tbl);
        
        tabel = (DefaultTableModel)tbl.getModel();
        tabel.addColumn("ID");
        tabel.addColumn("NAMA");
        tabel.addColumn("HARGA");
        tabel.addColumn("STOCK");

  
        
        tbl.addMouseListener(new java.awt.event.MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int i=tbl.getSelectedRow();
                if(i>-1)
                {
                    int selectionRow = tbl.getSelectedColumn();
                    us.setText(tabel.getValueAt(i, 0).toString());
                    nm.setText(tabel.getValueAt(i, 1).toString());
                    byr.setText(tabel.getValueAt(i, 2).toString());                    
                }
            }

        });
    }
}
