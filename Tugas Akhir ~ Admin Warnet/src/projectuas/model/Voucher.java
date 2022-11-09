
package projectuas.model;

/**
 *
 * @author ZEIDAR
 */
public class Voucher {

    public String voucher;
    public String tgl;
    public String jam;
   // public String namaKasir;
    public String namaGuest;
    public int index = 0;
    public Voucher[] Modelvoucher = new Voucher[10];
    
    public Kasir kasir;

    public Voucher() {

    }

    public Voucher(String voucher, String tgl, String jam, String namaGuest) {
        this.kasir = AllObject.kasir1.cariObjek(AllObject.nama);
        this.voucher = voucher;
        this.tgl = tgl;
        this.jam = jam;
        this.namaGuest = namaGuest;
    }

    public String getVoucher() {
        return voucher;
    }

    public String getTgl() {
        return tgl;
    }

    public String getJam() {
        return jam;
    }

    public String getNamaKasir() {
        return kasir.getUsername();
    }

    public String getNamaGuest() {
        return namaGuest;
    }

}
