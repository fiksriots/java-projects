package view;
import controller.*;
import gui.GUI_login;


public class Main {
    public static void main(String[] args) {
        SiswaController siswa = new SiswaController();
        AdminController admmin = new AdminController();
        MapelController mapel = new MapelController();
        JadwalController jadwal = new JadwalController();
        BimbelController bimbel = new BimbelController();

        new GUI_login(siswa,admmin, mapel , jadwal , bimbel).setVisible(true);
    }

}
