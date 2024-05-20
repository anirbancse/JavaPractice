package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InitializeExecuotr {
  public static void main(String[] args) {
    //

    Runnable r1 =
        () -> {
          System.out.println("Running task 1");
        };

    Runnable r2 =
        () -> {
          System.out.println("Running task 2");
        };

    Runnable r3 =
        () -> {
          System.out.println("Running task 3");
        };

    Runnable r4 =
        () -> {
          System.out.println("Running task 4");
        };

    ExecutorService executors = Executors.newFixedThreadPool(2);

    /**
     * only accepts `Runnable` tasks `execute()` method is simpler and more suitable for
     * fire-and-forget tasks where you don't need to retrieve the result or handle exceptions
     * explicitly.
     */
    executors.execute(r1);
    executors.execute(r2);
    executors.execute(r4);
    /**
     * If the task throws an exception, it will be wrapped in the `Future`, allowing you to handle
     * exceptions when you retrieve the result. accepts both callable and runnable instance The
     * `submit()` method is more flexible as it allows you to get the result of the task and handle
     * exceptions.
     */
    var x = executors.submit(r3);

    executors.shutdown();
  }
}
