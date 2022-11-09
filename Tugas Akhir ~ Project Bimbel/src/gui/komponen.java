package gui;
import javax.swing.*;

public class komponen extends JFrame {
    protected JLabel labelSiswa = new JLabel("=== SISWA ===");
    protected JLabel labelLogin = new JLabel("=== LOGIN ===");
    protected JLabel labelUsername = new JLabel("Username : ");
    protected JLabel labelPassword = new JLabel("Password : ");
    protected JLabel labelDaftarSiswa = new JLabel("Daftar siswa");
    protected JLabel labelNamaMapel = new JLabel("Nama Mapel : ");
    protected JLabel labelKodeMapel = new JLabel("Kode Mapel : ");
    protected JLabel labelJudulJadwal = new JLabel("Jadwal Bimbel");
    protected JLabel labelHari = new JLabel("Hari : ");
    protected JLabel labelJam = new JLabel("Jam : ");
    protected JLabel labelGuru = new JLabel("Guru : ");
    protected JLabel labelAturJadwa = new JLabel("Atur Jadwal Siswa");

    //Daftar siswa
    protected JLabel nmSiswa = new JLabel("Nama siswa  ");
    protected JLabel umrSiswa = new JLabel("Umur siswa  ");
    protected JLabel asalSiswa = new JLabel("Asal Sekolah  ");
    protected JLabel kelaminSiswa = new JLabel("Kelamin siswa  ");
    protected JLabel tglLahirSiswa = new JLabel("Tanggal Lahir  ");
    protected JLabel alamatSiswa = new JLabel("Alamat siswa  ");
    protected JLabel tmptLahirSiswa = new JLabel("Tempat Lahir   ");
    protected JLabel labelUsernameSiswa = new JLabel("Username : ");
    protected JLabel labelPasswordSiswa = new JLabel("Password : ");
    protected JTextField txtnmSiswa = new JTextField();
    protected JTextField txtumrSiswa = new JTextField();
    protected JTextField txtasalSiswa = new JTextField();
    protected JTextField txtkelaminSiswa = new JTextField();
    protected JTextField txttglLahirSiswa = new JTextField();
    protected JTextField txtalamatSiswa = new JTextField();
    protected JTextField txttmptLahirSiswa = new JTextField();
    protected JTextField txtunameDaftar = new JTextField();
    protected JPasswordField txtpasswdDaftar = new JPasswordField();

    //Admin
    protected JLabel labelAdmin = new JLabel("=== Admin ===");
    protected JButton daftarSiswa = new JButton("Daftar");

    //== TextField
    protected JTextField uname = new JTextField();
    protected JTextField passwd = new JTextField();
    protected JTextField txtNamaMapel = new JTextField();
    protected JTextField txtKodeMapel = new JTextField();
    protected JTextField txtGuru = new JTextField();
    protected JTextField txtHari = new JTextField();
    protected JTextField txtJam = new JTextField();
    protected JTextField txtid_Jadwal = new JTextField();
    protected JTextArea cetakStruk  = new JTextArea();

    //==Btn
    protected JButton login = new JButton("LOGIN");
    protected JButton daftar = new JButton("DAFTAR Siswa");
    protected JButton btnCetak = new JButton("Cetak");
    protected JButton btnLogout = new JButton("Logout");
    protected JButton btnMapel = new JButton("Mapel");
    protected JButton btnInsert = new JButton("Insert");
    protected JButton btnSelect = new JButton("Select Row");
    protected JButton btnUpdate = new JButton("Update Data");
    protected JButton btnJadwal = new JButton("Jadwal");
    protected JButton btnAturjadwal = new JButton("Jadwal Siswa");
    protected JButton btnSelectJadwal = new JButton("Select Row Jadwal");
    protected JButton btnPrint = new JButton("Print Struk");


    //AmbilId
    protected JTextField txtid_mapel = new JTextField();// nangkep id

    public void IsiSemua(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Isi Semua Data !!");
    }
    public void dataKosong(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Data Kosong !!" );
    }
    public void err(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Error !!" );
    }


}
