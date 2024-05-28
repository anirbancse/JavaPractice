package com.designPattern;

public class SingletonClass {

    private static SingletonClass singleton = null;

    String s;

    public String getMsg(){
        return "In Singleton";
    }

    public void setMsg(String s){
        this.s = s;
    }

    private SingletonClass(){
        s= "Hello";
    }

    public static SingletonClass getSingleton(){
        if(singleton==null)
            singleton = new SingletonClass();

        return singleton;
    }

    @Override
    public String toString() {
        return "SingletonClass{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SingletonClass s = SingletonClass.getSingleton();
        s.setMsg("World!!");
        SingletonClass p = SingletonClass.getSingleton();

        System.out.println(s + ", "+p);
    }
}
