package controller;
import model.Admin;
public class AdminController {
    private int KapasitasIndex = 3;
    private int indexAdmin = 1;
    Admin [] admin = new Admin[KapasitasIndex];

    public void tambahAdmin(String nama, String tglLahir, String tempatLahir, String alamat, String kelamin, String umur , String username , String password){
        admin[0] = new Admin(nama , tglLahir ,tempatLahir , alamat , kelamin , umur , username , password);
        admin[indexAdmin] = new Admin(nama , tglLahir ,tempatLahir , alamat , kelamin , umur , username , password);
        this.indexAdmin++;
        this.KapasitasIndex++;
    }
    public Admin [] getAdmin(){
        return admin;
    }


}
