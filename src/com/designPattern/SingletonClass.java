package com.designPattern;

class SingletonClass1 {
  private static SingletonClass1 singleton = null;

  String s;

  private SingletonClass1() {
    s = "Hello";
  }

  public static synchronized SingletonClass1 getSingleton() {
    //    synchronized (SingletonClass1.class) {
    //
    //    }
    if (singleton == null) singleton = new SingletonClass1();
    return singleton;
  }

  public String getS() {
    return s;
  }

  public void setS(String s) {
    this.s = s;
  }
}

public class SingletonClass {

  public static void main(String[] args) {

    SingletonClass1 s = SingletonClass1.getSingleton();
    s.setS("World!!");
    SingletonClass1 p = SingletonClass1.getSingleton();

    System.out.println(s.hashCode() + ", " + p.hashCode());
  }
}
