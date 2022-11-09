/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitreading.ktp;

/**
 *
 * @author fikri
 */
public class RunnableDemo  {
    RunnableDemo ktp =new RunnableDemo;
   private Thread t;
   private String threadName;
   
   public RunnableDemo( String name) 
   {
      this.threadName = name;
      //System.out.println("Creating " +  threadName );
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         
            System.out.println("Nama : " + threadName + ", " );
            System.out.println("Alamat : " + ttl + ", " );
            System.out.println("Nama : " + threadName + ", " );
            System.out.println("Nama : " + threadName + ", " );
            
            // Let the thread sleep for a while.
            
         
      } 
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("alamat " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

