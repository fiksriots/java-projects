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
public class PinjamBuku {
    public String namabuku;
    public String member;
    public String pengarang;
    public String idbuku;

    public PinjamBuku(String namabuku, String member, String pengarang, String idbuku) {
        this.namabuku = namabuku;
        this.member = member;
        this.pengarang = pengarang;
        this.idbuku = idbuku;
    }
}
