package com.threads;

// A Class used to send a message
class Sender {
  public void send(String msg) {
    System.out.println("Sending\t" + msg);
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      System.out.println("Thread interrupted.");
    }
    System.out.println("\n" + msg + "Sent");
  }
}

// Class for send a message using Threads
class ThreadedSend implements Runnable {
  Sender sender;
  private String msg;

  // Receives a message object and a string
  // message to be sent
  ThreadedSend(String m, Sender obj) {
    msg = m;
    sender = obj;
  }

  public void run() {
    // Only one thread can send a message
    // at a time.

    // synchronizing the snd object
    System.out.println(Thread.currentThread().getName());
    sender.send(msg);
  }
}

// Driver class
public class JoinThread {
  public static void main(String args[]) {
    Sender snd = new Sender();
    ThreadedSend S1 = new ThreadedSend(" Hi ", snd);
    ThreadedSend S2 = new ThreadedSend(" Bye ", snd);

    Thread t1 = new Thread(S1);
    Thread t2 = new Thread(S2);

    // Start two threads of ThreadedSend type

    // S2.start();

    // wait for threads to end
    try {
      t1.start();
      t1.join();
      t2.start();
    } catch (Exception e) {
      System.out.println("Interrupted");
    }
  }
}
