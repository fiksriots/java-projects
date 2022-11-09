package Admin;

/**
 *
 * @author fikri
 */
public class inputMobil 
{
    String nama;
    String plat;
    int harga;
    int jumlah;
    public inputMobil(String nama,String plat,int harga,int jumlah)
    {
        this.nama=nama;
        this.plat=plat;
        this.harga=harga;
        this.jumlah=jumlah;
    }
    public String getNama()
    {
        return nama;
    }
    public String getPlat()
    {
        return plat;
    }
    public int getHarga()
    {
        return harga;
    }
    public int getJumlah()
    {
        return jumlah;
    }
}
