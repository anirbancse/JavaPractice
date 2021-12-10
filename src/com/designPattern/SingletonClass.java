package com.designPattern;

public class SingletonClass {

    private static SingletonClass singleton = null;


    String s;

    public String getMsg(){
        return "In Singleton";
    }

    private SingletonClass(){
        s= "Hello";
    }

    public static SingletonClass getSingleton(){
        if(singleton==null)
            singleton = new SingletonClass();

        return singleton;
    }

    public static void main(String[] args) {
        SingletonClass s = SingletonClass.getSingleton();
        SingletonClass p = SingletonClass.getSingleton();

        System.out.println(s.hashCode()+ ", "+p.hashCode());
    }
}
