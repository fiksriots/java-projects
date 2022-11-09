/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author ALAN
 */
public class datastok extends data{
    public datastok (String nama,String id,int harga){
        super.nama=nama;
        super.id=id;
        super.harga=harga;
    }
    
    public String getnama(){
        return nama;
    }
    public String getid(){
        return id;
    }
    public int getharga(){
        return harga;
    }
}
