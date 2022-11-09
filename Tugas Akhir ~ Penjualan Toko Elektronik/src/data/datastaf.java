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
public class datastaf {
    private final String sales;
    private final String kasir;
    
    public datastaf(String sales,String kasir){
        this.sales=sales;
        this.kasir=kasir;
    }
    public String getNamaSales(){
        return sales;
    }
    public String getNamaKasir(){
        return kasir;
    }  
}
