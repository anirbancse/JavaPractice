package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Executables {

  public static void main(String[] args) {
    Runnable r1 =
        () -> {
          System.out.println("I am task 1");
        };
    Runnable r2 =
        () -> {
          System.out.println("I am task 2");
        };

     // var executorService = Executors.newFixedThreadPool(2);
      //executorService.execute(r1);

    Thread thread1 = new Thread(r1);
    Thread thread2 = new Thread(r2);

    // Start the threads
    //thread1.start();
    thread2.start();
  }
}
