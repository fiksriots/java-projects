/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proses;

import data.datastok;
import java.util.ArrayList;

/**
 *
 * @author ALAN
 */
public class modelkasir {
    
    public int harga(String id){
        int hargat=0;
        for(int i=0;i<allobject.trans.getTransaksi().size();i++){
            if(id.equals(allobject.trans.getTransaksi().get(i).getidreg())){
                for(int j=0;j<allobject.trans.getTransaksi().get(i).get_index();j++){
                    hargat=hargat+allobject.trans.getTransaksi().get(i).getpesan().get(j).getharga();
                }
            }
        }
        return hargat;
    }
    
    public int kembalian(int bayar,int harga){
        int kembali = bayar-harga;
        return kembali;
    }
    
    public String struck(String id){
        String struk = null;
        for(int i=0;i<allobject.trans.getTransaksi().size();i++){
            if(id.equals(allobject.trans.getTransaksi().get(i).getidreg())){
                //for(int j=0;j<allobject.trans.transaksi.get(i).get_index();j++){
                    struk="nama = "+allobject.trans.getTransaksi().get(i).get_namaPembeli()+"\n"
                            + "id transaksi = "+allobject.trans.getTransaksi().get(i).getidreg()+"\n"
                            + "nama sales   = "+allobject.trans.getTransaksi().get(i).get_namaSales()+"\n";
                //}
            }
        }
        return struk;
    }
    
}
