package ta;
public class PenitipanController {
    private int indexP = 0;
    Penitipan [] penitipan = new Penitipan[100];


    public void tambahPenitipan(String jmlHari, String jenisBarang , String hari){
        penitipan[indexP] = new Penitipan(jmlHari , jenisBarang , hari);
        this.indexP++;
    }

    public int cariPenitipan(String id_penitipan){
        int cariPenitip = 0;
        return cariPenitip;
    }

    public int getIndexP() {
        return indexP;
    }

    public Penitipan[] getPenitipan() {
        return penitipan;
    }

    public float hitungHarga(String jenisB , int tunggak , int hari){
        float totalHarga  = 0;
        float harga = 0;
        if(jenisB.equals("Helm")){
            harga = 15000;
        }else if(jenisB.equals("Jaket")){
            harga = 10000;
        }else if(jenisB.equals("Tas")){
            harga = 5000;
        }

        totalHarga = (hari * harga) + (tunggak*harga);
        return totalHarga;
    }

}

