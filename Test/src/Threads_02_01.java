/* This program was created to demonstrate a potential problem 
 * with using Threads in Java
*/

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Producer
 */
public class Threads_02_01 {
    static double a = 10;
    static double b; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Runnable r1 = ()->
            {
                if(a == 10)
             try {
                 Thread.sleep(0);
                 b = a/2.0;
                 System.out.println(Thread.currentThread().getName() + ": " + b);
             } catch (InterruptedException e) { }
            };
         Runnable r2 = () -> {
               a = 12;

             System.out.println(Thread.currentThread().getName()+": "+b);
            };

        Thread thdB = new Thread(r2, "Thread B");
        Thread thdA = new Thread(r1, "Thread A");
        thdA.start();
        thdB.start();


        
    }
    
}
