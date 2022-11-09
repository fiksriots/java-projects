/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;
public class Penitipan {
    private String  jmlHari ,jenisBarang , hari;

    public Penitipan( String jmlHari, String jenisBarang , String hari) {
        this.jmlHari = jmlHari;
        this.jenisBarang = jenisBarang;
        this.hari = hari;
    }

    public String getJmlHari() {
        return jmlHari;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public String getHari() {
        return hari;
    }
}

