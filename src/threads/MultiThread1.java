package threads;

// Java program to illustrate need
// of Synchronization

class Multithread {
  private int count = 0;

  public void incement() {

    /**
     * here it is synchronizing at the class level to make sure no instances of the class can
     * interrup one another synchronize across all instances of a class, you should use
     * `synchronized (ClassName.class)` instead. when you use `synchronized (Multithread.class)`,
     * you are synchronizing on the class level. This means that all instances of the class share
     * the same lock, ensuring that only one thread can execute the synchronized block across all
     * instances of the class.
     */
    synchronized (this) {
      for (int i = 0; i < 3; i++) {
        try {
          System.out.println(count++);
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public int getValue() {
    return count;
  }
}

public class MultiThread1 {
  public static void main(String[] args) {
    Multithread t = new Multithread();
    Multithread t1 = new Multithread();
    t.incement();
    t1.incement();
    // Output will be 2
  }
}

class SynchronizedExample {
  private int count = 0;

  public void increment() {

    /**
     * synchronizing access to instance-level data or resources within the same object instance.
     * <p>- Here we can see only one instance of the class is created and been shared across two different threads
     * here it's a private lock
     */
    synchronized (SynchronizedExample.class) {
      System.out.println(Thread.currentThread().getName());
      count++;
    }
  }

  public int getCount() {
    return count;
  }
}

class Main {
  public static void main(String[] args) {
    SynchronizedExample example = new SynchronizedExample();

    Thread thread1 =
        new Thread(
            () -> {
              for (int i = 0; i < 50; i++) {
                example.increment();
              }
            });

    Thread thread2 =
        new Thread(
            () -> {
              for (int i = 0; i < 10; i++) {
                example.increment();
              }
            });

    thread1.start();
    thread2.start();

    /**
     * In the context of Java threading, the use of `join()` and `synchronized` serve different
     * purposes:
     *
     * <p>- **`synchronized`**: In your code snippet where the `increment()` method is synchronized,
     * it ensures that the method is accessed by only one thread at a time, preventing concurrent
     * modification issues when multiple threads try to increment the value simultaneously.
     *
     * <p>- **`join()`**: On the other hand, the `join()` method is used to wait for a thread to
     * complete its execution before moving on to the next steps in the program. In the provided
     * example, `join()` is used to ensure that the main thread waits for `thread1` and `thread2` to
     * finish their execution before printing the final count. This sequencing is necessary to get
     * the correct final count value after both threads have completed their increments.
     *
     * <p>So, even though the `increment()` method is synchronized to handle concurrent access
     * within the method itself, the `join()` method is used to coordinate the main thread's
     * execution with the completion of the worker threads to ensure the final count is accurate.
     */
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Final Count: " + example.getCount()); // Output should be 2000
  }
}
