package com.threads;

import javax.swing.plaf.TableHeaderUI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Thread1 extends Thread {

    static Map<String,Integer> hashMap = new ConcurrentHashMap<String,Integer>();

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            hashMap.put("D",4);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        hashMap.put("A",1);
        hashMap.put("B",2);
        hashMap.put("C",3);

        Thread1 thread2 = new Thread1();

        Thread th = new Thread(thread2);
        th.start();
        System.out.println("sadasd"+th.currentThread().getName());

        Thread1 thread1 = new Thread1();
        thread1.start();
        //System.out.println(hashMap);

        for(Object o: hashMap.entrySet()){
            System.out.println(o);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        System.out.println(hashMap);
    }
}
