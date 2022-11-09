/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuas;

import javax.swing.*;

/**
 *
 * @author ZEIDAR
 */
public class ModelVoucher {
 public static   String voucher;
 public static   String tgl;
 public static   String jam;
 public static   String namaAdm;
 public static   String namaGuest;
 public static   int index=0;
public static ModelVoucher [] Modelvoucher=new ModelVoucher[10];
     
     public ModelVoucher(){
         
     }
    
      public ModelVoucher(String voucher, String tgl, String jam, String namaGuest,String namaAdm) {
        this.voucher=voucher;
        this.tgl = tgl;
        this.jam = jam;
        this.namaAdm = namaAdm;
        this.namaGuest = namaGuest;
    }
    

    public void insert(JTextField voucher, JTextField tgl,JTextField jam,JTextField namaGuest){
        String getVoucher=voucher.getText();
        String getTgl=tgl.getText();
        String getJam=jam.getText();
//        String getNamaAdm=namaAdm.;
        String getNamaGuest=namaGuest.getText();
        Modelvoucher[index]=new ModelVoucher(getVoucher,getTgl, getJam, getNamaGuest,namaAdm);
        index++;
    }

   
}