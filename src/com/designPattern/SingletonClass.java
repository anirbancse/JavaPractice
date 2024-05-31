package com.designPattern;

public class SingletonClass {

  private static SingletonClass singleton = null;

  String s;

  private SingletonClass() {
    s = "Hello";
  }

  public static synchronized SingletonClass getSingleton() {
    //    synchronized (Singleton.class) {
    //
    //    }
    if (singleton == null) singleton = new SingletonClass();

    return singleton;
  }

  public static void main(String[] args) {
    SingletonClass s = SingletonClass.getSingleton();
    s.setMsg("World!!");
    SingletonClass p = SingletonClass.getSingleton();

    System.out.println(s.hashCode() + ", " + p.hashCode());
  }

  public String getMsg() {
    return "In Singleton";
  }

  public void setMsg(String s) {
    this.s = s;
  }

  @Override
  public String toString() {
    return "SingletonClass{" + "s='" + s + '\'' + '}';
  }
}
