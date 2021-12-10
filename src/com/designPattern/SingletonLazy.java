package com.designPattern;

public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    private SingletonLazy (){}

    public static SingletonLazy getInstance(){
        if(singletonLazy==null)
            return singletonLazy = new SingletonLazy();
        else
            return singletonLazy;
    }
}
