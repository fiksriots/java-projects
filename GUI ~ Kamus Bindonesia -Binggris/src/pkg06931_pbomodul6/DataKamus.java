
package pkg06931_pbomodul6;

/**
 *
 * @author hamlet
 */
public class DataKamus {
    String[][] dataKamus = {{"Man","Women","Banana","Mango"},
                            {"Laki-laki","Perempuan","Pisang","Mangga"}
                            };
    
    public String transToIndo(String kata){
        for(int i=0;i<dataKamus[1].length;i++){
            if(dataKamus[0][i].equals(kata)){
                String hasil = dataKamus[1][i].toString();
                return hasil;
            }
        }
        return null;
    }
    
    public String transToEng(String kata){
        for(int i=0;i<dataKamus[0].length;i++){
            if(dataKamus[1][i].equals(kata)){
                String hasil = dataKamus[0][i].toString();
                return hasil;
            }
        }
        return null;
    }
}
