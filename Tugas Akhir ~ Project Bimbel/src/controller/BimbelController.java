package controller;
import model.Bimbel;
import model.Jadwal;
import model.Mapel;

public class BimbelController {
    private int Kapasitas = 4;
    Bimbel [] bimbel = new Bimbel[Kapasitas];
    Jadwal [] jadwal = new Jadwal[Kapasitas];
    Mapel [] mapel = new Mapel[Kapasitas];
    private int indexBimbel = 0;

    public void tambahBimbel(Mapel mapel, Jadwal jadwal , String username) {
        this.Kapasitas++;
        this.bimbel[indexBimbel] = new Bimbel(username);
        this.jadwal[indexBimbel] = jadwal;
        this.mapel[indexBimbel] = mapel;
        this.indexBimbel++;
    }

    public Bimbel[] getBimbel() {
        return bimbel;
    }

    public Jadwal[] getJadwal() {
        return jadwal;
    }
    public Mapel[] getMapel() {
        return mapel;
    }

    public int getIndexBimbel() {
        return indexBimbel;
    }
}
