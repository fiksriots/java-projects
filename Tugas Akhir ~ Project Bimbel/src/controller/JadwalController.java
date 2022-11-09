package controller;

import model.Jadwal;
import model.Mapel;


public class JadwalController {
    private int Kapasitas = 4;
    Jadwal [] jadwal = new Jadwal[Kapasitas];
    Mapel[] mapel = new Mapel[Kapasitas];
    private int id_jadwal = 0;

    public void tambahJadwal(String hari , String jam ,String guruBimbel , Mapel mapel){
        this.Kapasitas ++;
        this.jadwal[id_jadwal] = new Jadwal(hari , jam , guruBimbel);
        this.mapel[id_jadwal] = mapel;
        this.id_jadwal++;
    }

    public Jadwal[] getJadwal() {
        return jadwal;
    }

    public Mapel[] getMapel() {
        return mapel;
    }

    public int getId_jadwal() {
        return id_jadwal;
    }
}
