package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureExample {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(1);

    Callable<String> task =
        () -> {
          Thread.sleep(2000); // Simulate a time-consuming task
          return "Result of the asynchronous computation";
        };
    Callable<Integer> task2 =
        () -> {
          return 1;
        };

    var future = executor.submit(task);

    System.out.println("Task submitted, waiting for result...");

    try {
      String result = future.get(); // This call blocks until the result is available
      System.out.println("Result: " + result);
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    executor.shutdown();
  }
}
