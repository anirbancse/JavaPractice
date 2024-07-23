package com.designPattern;

public class Singleton {

  public static void main(String[] args) throws InterruptedException {

    for (int i = 0; i < 5; i++) {
      //Thread.sleep(1000);
      new Thread(
              () -> {
                System.out.println(Thread.currentThread().getName());

                var singletonClass = SingletonClass1.getSingleton();
                System.out.println(singletonClass.hashCode());
              })
          .start();
    }

    //      new Thread(
    //              () -> {
    //                try {
    //                  System.out.println(Thread.currentThread().getName());
    //                  var singletonClass = SingletonClass1.getSingleton();
    //                  System.out.println(singletonClass.hashCode());
    //                  Thread.sleep(1000);
    //
    //                } catch (InterruptedException e) {
    //                  e.printStackTrace();
    //                }
    //              })
    //          .start();

    // System.out.println(SingletonLazy.getInstance());

    // SingletonClass singletonClass = SingletonClass.getSingleton();

    //  System.out.println(singletonClass.getMsg());
  }
}
