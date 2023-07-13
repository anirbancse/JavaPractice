package com.designPattern;
import com.designPattern.SingletonLazy;

public class Singleton {

    public static void main(String[] args) {

        new Thread(()->
        {
            System.out.println(Thread.currentThread().getName());
            SingletonClass singletonClass= SingletonClass.getSingleton();
            System.out.println(singletonClass.getMsg());
        }).start();

        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName());
                SingletonClass singletonClass= SingletonClass.getSingleton();
                System.out.println(singletonClass.getMsg());
                Thread.sleep(1000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();

        System.out.println(SingletonLazy.getInstance());

        //SingletonClass singletonClass = SingletonClass.getSingleton();

      //  System.out.println(singletonClass.getMsg());
    }
}
