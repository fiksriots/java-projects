package Admin;

import java.util.ArrayList;

/**
 *
 * @author rifai
 */
public class inputMobilcontroller 
{
    private final ArrayList <inputMobil> mobil = new ArrayList();
    public void insert(String a,String b,int c,int d){
        mobil.add(new inputMobil(a,b,c,d));
    }
}
