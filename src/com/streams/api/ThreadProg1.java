package com.streams.api;

public class ThreadProg1 {

    public static void main(String[] args) {


        Thread thread = new Thread(() -> {
            try{
                Thread.sleep(2000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        });

        System.out.println(Thread.currentThread().getName());
        thread.start();

    }
}
