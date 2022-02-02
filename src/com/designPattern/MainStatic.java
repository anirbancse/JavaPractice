package com.designPattern;

import java.util.List;

class MyTHread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(i + " "+ Thread.currentThread().getName());
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception!!!");
        }
    }
}

public class MainStatic {

    public static void main(String[] args) {
        MyTHread t1 = new MyTHread();
        MyTHread t2 = new MyTHread();
        MyTHread t3 = new MyTHread();


        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();

        try{
            t1.join();
            t2.start();
           // t2.join();
            t3.start();
            t3.join();

        }catch (InterruptedException e){
            System.out.println();
        }

    }
}
