/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuas.controller;

import projectuas.model.Pelanggan;

/**
 *
 * @author ZEIDAR
 */
public class PelangganController {
    Pelanggan[] dataPelanggan = new Pelanggan[100];
    private int index = 0;
    
    public void insert(String nama){
        dataPelanggan[index]=new Pelanggan(nama);
        index++;
    }
}
