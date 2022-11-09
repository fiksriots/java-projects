
package multitreading.ktp;
 import java.util.Scanner;

/**
 * @author fikri
 */
public class testtread {


   public static void main(String args[]) {       
      RunnableDemo R1 = new RunnableDemo(nama);
      R1.start();
      
      RunnableDemo R2 = new RunnableDemo(ttl);
      R2.start();
   }   
}
class input()
{
Scanner input=new Scanner(System.in);
       System.out.println("----- Masukkan DATA KTP 1 -----");
        System.out.print("masukkan nama : ");
        String nama=input.nextLine();
        System.out.print("masukkan tempat lahir : ");
        String ttl=input.nextLine();
        System.out.print("masukkan nomer hape : ");
        String noHp=input.nextLine();
        System.out.print("masukkan alamat : ");
        String alamat=input.nextLine();
