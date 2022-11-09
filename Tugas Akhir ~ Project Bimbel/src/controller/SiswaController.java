package controller;
import model.Siswa;
public class SiswaController {

    private Siswa [] siswa = new Siswa[100];
    private int id_Siswa = 0;

    public void tambahSiswa(String nama, String tglLahir, String tempatLahir, String alamat, String kelamin, String umur , String asalSekolah , String username , String password){
        siswa[id_Siswa] = new Siswa(nama , tglLahir , tempatLahir , alamat , kelamin ,umur , asalSekolah , username , password);
        this.id_Siswa++;
    }

    public Siswa[] getSiswa() {
        return siswa;
    }

    public int getId_Siswa() {
        return id_Siswa;
    }

    public int cariSiswa(String username , String password){
        int cariSiswa = 0;
        if(id_Siswa == 0){
            cariSiswa = -1;
        }else {
            while (cariSiswa != id_Siswa+1) {

                if(cariSiswa == id_Siswa) {
                    cariSiswa = -5;
                    break;
                }else if(username.equals(siswa[cariSiswa].getUsername()) && password.equals(siswa[cariSiswa].getPassword())){
                    break;
                }else{ cariSiswa++;}

            }
        }
        return cariSiswa;
    }
}
