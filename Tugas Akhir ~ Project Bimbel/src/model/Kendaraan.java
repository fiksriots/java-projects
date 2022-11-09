package model;

public class Kendaraan {
    private String nama , tglLahir , tempatLahir , alamat , kelamin , username , password , umur;


    public Kendaraan(String nama, String tglLahir , String tempatLahir , String alamat , String kelamin , String umur , String username, String password){
        this.alamat = alamat;
        this.umur = umur;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tempatLahir = tempatLahir;
        this.kelamin = kelamin;
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return umur;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKelamin() {
        return kelamin;
    }

    public String getTglLahir() {
        return tglLahir;
    }
}
