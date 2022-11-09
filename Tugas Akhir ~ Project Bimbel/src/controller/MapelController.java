package controller;
import model.Mapel;

public class MapelController {
    private int Kapasitas = 10 , idMapel = 0;
    Mapel [] mapel = new Mapel[Kapasitas];

    public void tambahMapel(String namaMapel , String kodeMapel){
        this.Kapasitas++;
        mapel[idMapel] = new Mapel(namaMapel , kodeMapel);
        this.idMapel++;
    }
    public int getIdMapel() {
        return idMapel;
    }

    public Mapel[] getMapel() {
        return mapel;
    }

    public int cariMapel(String kodeMapel){
        int cariMapel = 0;

        return cariMapel;
    }

    public void updateMapel(int id ,String namaMapel , String kodeMapel){
        mapel[id] = new Mapel(namaMapel , kodeMapel);
    }
}
