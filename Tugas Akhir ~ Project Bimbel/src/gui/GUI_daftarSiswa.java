package gui;
import controller.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class GUI_daftarSiswa extends komponen {
    private Object a;

    SiswaController siswa;
    AdminController admin;
    MapelController mapelC;
    JadwalController jadwalC;
    BimbelController bimbelC;

    public GUI_daftarSiswa(SiswaController siswa , AdminController admin , MapelController mapelC , JadwalController jadwalC , BimbelController bimbelC ){
        this.siswa = siswa;
        this.admin = admin;
        this.mapelC = mapelC;
        this.jadwalC = jadwalC;
        this.bimbelC = bimbelC;
        initComponent();
    }

    public void initComponent(){

        labelDaftarSiswa.setBounds(300,30,500,60);
        labelDaftarSiswa.setFont(new Font("Consolas" ,Font.BOLD,45));
        labelDaftarSiswa.setForeground(new Color(20,1,188));

        nmSiswa.setBounds(70 , 120 , 200 , 30);
        nmSiswa.setFont(new Font("Consolas" , Font.BOLD,17));
        txtnmSiswa.setBounds(200 , 120, 300 , 25);

        umrSiswa.setBounds(70 , 150 , 200 , 30);
        umrSiswa.setFont(new Font("Consolas" , Font.BOLD,17));
        txtumrSiswa.setBounds(200 , 150, 80 , 25);

        asalSiswa.setBounds(70 , 180 , 200 , 30);
        asalSiswa.setFont(new Font("Consolas" , Font.BOLD,17));
        txtasalSiswa.setBounds(200 , 180, 300 , 25);

        kelaminSiswa.setBounds(70 , 210 , 200 , 30);
        kelaminSiswa.setFont(new Font("Consolas" , Font.BOLD,17));


        tglLahirSiswa.setBounds(70 , 240 , 200 , 30);
        tglLahirSiswa.setFont(new Font("Consolas" , Font.BOLD,17));

        alamatSiswa.setBounds(70 , 270 , 200 , 30);
        alamatSiswa.setFont(new Font("Consolas" , Font.BOLD,17));
        txtalamatSiswa.setBounds(200 , 270, 300 , 25);

        tmptLahirSiswa.setBounds(70 , 300 , 200 , 30);
        tmptLahirSiswa.setFont(new Font("Consolas" , Font.BOLD,17));
        txttmptLahirSiswa.setBounds(200 , 300, 300 , 25);

        labelUsernameSiswa.setBounds(550,150,200,60);
        labelUsernameSiswa.setFont(new Font("Consolas" , Font.BOLD,20));
        txtunameDaftar.setBounds(550 , 190 , 300 , 30);
        txtunameDaftar.setFont(new Font("Consolas" , Font.BOLD,15));

        labelPasswordSiswa.setBounds(550,220,200,60);
        labelPasswordSiswa.setFont(new Font("Consolas" , Font.BOLD,20));
        txtpasswdDaftar.setBounds(550 , 260 , 300 , 30);
        txtpasswdDaftar.setFont(new Font("Consolas" , Font.BOLD,15));
        daftarSiswa.setBounds(550 , 290 , 299 , 30);

        String tanggal[] = {"1","2","3","4","5","6","7","8","9","10","11","12",
                "13","14","15","16","17","18","19","20","21","22","23","24","25","26",
                "27","28","29","30","31"};
        JComboBox combo_tanggal = new JComboBox(tanggal);
        combo_tanggal.setBounds(200, 240, 50, 30);
        add(combo_tanggal);
        String bulan[] = {"Januari","Februari","Maret","April","Mei","Juni",
                "Juli","Agustus","September","Oktober","November","Desember"};
        JComboBox combo_bulan = new JComboBox(bulan);
        combo_bulan.setBounds(310, 240, 100, 30);
        add(combo_bulan);
        String tahun[] = {"2000","2001","2002","2003","2004","2005","2006",
                "2007","2008","2009","2010"};
        JComboBox combo_tahun = new JComboBox(tahun);
        combo_tahun.setBounds(420, 240, 70, 30);
        add(combo_tahun);

        String pilihKelamin[] = {"Laki-Laki","Perempuan"};
        JComboBox combo_kelamin = new JComboBox(pilihKelamin);
        combo_kelamin.setBounds(200 , 210, 200 , 25);
        add(combo_kelamin);

        daftarSiswa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(txtnmSiswa.getText().equals("")  || txttmptLahirSiswa.getText().equals("") ||
                            txtalamatSiswa.getText().equals("") || txtumrSiswa.getText().equals("") ||
                            txtasalSiswa.getText().equals("") ||txtunameDaftar.getText().equals("") || txtpasswdDaftar.getText().equals(""))
                    {
                        IsiSemua((MouseEvent) a);
                    }
                    else if(ujiUmur() == 0){
                            String kelamin = (String) combo_kelamin.getSelectedItem();
                            String tanggal = (String) combo_tanggal.getSelectedItem();
                            String bulan = (String) combo_bulan.getSelectedItem();
                            String tahun = (String) combo_tahun.getSelectedItem();
                            String tglBulan = tanggal.concat(bulan);
                            String tglKirim = tglBulan.concat(tahun);
                            siswa.tambahSiswa(txtnmSiswa.getText(), tglKirim, txttmptLahirSiswa.getText(),
                                    txtalamatSiswa.getText(), kelamin, txtumrSiswa.getText(), txtasalSiswa.getText(),
                                    txtunameDaftar.getText(), txtpasswdDaftar.getText());
                            sukses((MouseEvent) a);
                            Thread.sleep(1000);
                            new GUI_admin(siswa, admin, mapelC, jadwalC, bimbelC);
                            dispose();
                    }else {
                        throw new Exception();
                    }

                }catch (Exception x){
                    salahformat((MouseEvent) a);
                }
            }
        });



        txttglLahirSiswa.setBounds(200 , 240, 300 , 25);
        add(nmSiswa);
        add(labelDaftarSiswa);
        add(txtnmSiswa);
        add(umrSiswa);
        add(txtumrSiswa);
        add(asalSiswa);
        add(txtasalSiswa);
        add(kelaminSiswa);
        add(tglLahirSiswa);
        add(alamatSiswa);
        add(txtalamatSiswa);
        add(tmptLahirSiswa);
        add(txttmptLahirSiswa);
        add(labelPasswordSiswa);
        add(labelUsernameSiswa);
        add(txtpasswdDaftar);
        add(txtunameDaftar);
        setSize(930,590);
        add(daftarSiswa);
        setLayout(null);
        setLocationRelativeTo(null);
    }

    public void salahformat(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Umur Harus Angka || Nama Harus Huruf ||  Tempat Lahir Harus Huruf !!");
    }
    public void sukses(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Daftar Sukses" + siswa.getId_Siswa() );
    }

    public int ujiUmur(){
        int asci;
        int umurFix = 0;

        for (char c : txtumrSiswa.getText().toCharArray()) {
            asci = c;
            if(asci<47 || asci > 58){
                umurFix = 1;
            }
        }
        return umurFix;
    }

    public int ujiNama(){
        int ascii;
        int namaFix = 0;

        for(char c : txtnmSiswa.getText().toCharArray()){
            ascii =c;
            if((ascii<64 || ascii>91) && (ascii<60 || ascii >123)){
                namaFix = 1;
            }
        }

        return namaFix;
    }

    public int ujiTempat(){
        int ascii;
        int tmptFix = 0;

        for(char c : txttmptLahirSiswa.getText().toCharArray()){
            ascii =c;
            if((ascii<64 || ascii>91) && (ascii<60 || ascii >123)){
                tmptFix = 1;
            }
        }
        return tmptFix;
    }

}
