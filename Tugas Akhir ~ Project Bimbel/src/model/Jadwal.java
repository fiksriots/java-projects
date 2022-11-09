package model;

public class Jadwal {
    private String hari , jam , guruBimbel;
    public Jadwal(String hari, String jam, String guruBimbel) {
        this.hari = hari;
        this.jam = jam;
        this.guruBimbel = guruBimbel;
    }

    public String getHari() {
        return hari;
    }

    public String getJam() {
        return jam;
    }

    public String getGuruBimbel() {
        return guruBimbel;
    }
}
