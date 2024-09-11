package com.threads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Thread1 extends Thread {

  static Map<String, Integer> hashMap = new ConcurrentHashMap<>();
  static int count = 0;

  @Override
  public void run() {
    try {
      System.out.println("3rdPoint::" + Thread.currentThread().getName());
      Thread.sleep(1000);
      hashMap.put("D", 4);
      count++;
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws InterruptedException {

    hashMap.put("A", 1);
    hashMap.put("B", 2);
    hashMap.put("C", 3);

    Thread1 thread1 = new Thread1();

    // Thread th = new Thread(thread2);
    thread1.start();
    System.out.println("1stPoint::" + Thread.currentThread().getName());

    Thread1 thread2 = new Thread1();
    // thread1.join();
    thread2.start();
    //  thread2.join();
    // System.out.println(hashMap);

    // thread1.join();

    for (Object o : hashMap.entrySet()) {
      System.out.println(o);
      System.out.println("2ndPoint::" + Thread.currentThread().getName());
      Thread.sleep(1000);
    }
    System.out.println(hashMap);
    System.out.println(count);
  }
}

/** Thread-1 sadasdmain Thread-2 A=1 main B=2 main C=3 main D=4 main {A=1, B=2, C=3, D=4} */
