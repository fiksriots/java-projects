package model;

public class Siswa extends Kendaraan {

    private String asalSekolah ;

    public Siswa(String nama, String tglLahir, String tempatLahir, String alamat, String kelamin, String umur , String asalSekolah , String username , String password) {
        super(nama, tglLahir, tempatLahir, alamat, kelamin, umur , username , password);
        this.asalSekolah = asalSekolah;
    }

    public String getAsalSekolah() {
        return asalSekolah;
    }

}
