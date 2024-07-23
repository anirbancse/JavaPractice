package threads;

import java.util.concurrent.CompletableFuture;

public class AsynchronousProg1 {

  /**
   * Java 7 introduced the fork/join framework. It provides tools to help speed up parallel
   * processing by attempting to use all available processor cores. It accomplishes this through a
   * divide and conquer approach.
   *
   * <p>In practice, this means that the framework first “forks,” recursively breaking the task into
   * smaller independent subtasks until they are simple enough to run asynchronously.
   *
   * <p>After that, the “join” part begins. The results of all subtasks are recursively joined into
   * a single result. In the case of a task that void, the program simply waits until every subtask
   * runs.returns
   *
   * <p>The ForkJoinPool is the heart of the framework. It is an implementation of the
   * ExecutorService that manages worker threads and provides us with tools to get information about
   * the thread pool state and performance.
   *
   * <p>Worker threads can execute only one task at a time, but the ForkJoinPool doesn’t create a
   * separate thread for every single subtask. Instead, each thread in the pool has its own
   * double-ended queue (or deque, pronounced “deck”) that stores tasks.
   *
   * <p>This architecture is vital for balancing the thread’s workload with the help of the
   * work-stealing algorithm
   */
  public static void main(String[] args) {

    CompletableFuture<String> future =
        CompletableFuture.supplyAsync(() -> "Hello")
            .thenApply(s -> s + " World")
            .thenApply(String::toUpperCase);



    future.thenAccept(System.out::println);

    // Ensure the main thread waits for the CompletableFuture to complete
    future.join();
  }
}

/** Exception Handling */
class CompletableFutureExceptionExample {
  public static void main(String[] args) {
    CompletableFuture<Integer> future =
        CompletableFuture.supplyAsync(
            () -> {
              if (Math.random() < 0.5) {
                throw new RuntimeException("Oops! Something went wrong");
              }
              return 100;
            });


    future.exceptionally(
        ex -> {
          System.out.println("Exception occurred: " + ex.getMessage());
          return 0;
        });

    future.thenAccept(System.out::println);

    future.join();
  }
}

class CompletableFutureCombineExample {
  public static void main(String[] args) {
    CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);
    CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 20);

    CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, Integer::sum);

    combinedFuture.thenAccept(System.out::println);

    // combinedFuture.join(); // make sure Main Thread waits for the future object
  }
}
