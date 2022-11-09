/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author Rayhan_07023
 */
public class Member extends Manusia {

   private String judul;
   private String pengarang;
   private String id;

    public Member(String id, String judul, String pengarang) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;

    }

    @Override
    public void setJudul(String judul) {
        this.judul = judul;
    }

   @Override
    public String getJudul() {
        return judul;
    }

   @Override
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

   @Override
    public String getPengarang() {
        return pengarang;
    }

   @Override
    public void setId(String id) {
        this.id = id;
    }

   @Override
    public String getId() {
        return id;
    }

}
