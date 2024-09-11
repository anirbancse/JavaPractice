package com.java8;

@FunctionalInterface
interface Demo {

  String getName(String name);

  default String getCity(String city) {
    return city;
  }

  default int getAge(int age) {
    return age;
  }
}

class KL {

  /**
   * The constructor of B is called, which in turn calls the constructor of KL implicitly (since
   * every constructor in Java implicitly calls the constructor of its superclass).
   */
  public KL() {
    System.out.println("In constructor A");
  }

  void show() {
    System.out.println("In method A");
  }
}

class B extends KL {

  public B() {
    // super();
    System.out.println("In Constructor B");
  }

  @Override
  void show() {
    super.show();
    System.out.println("In method B");
  }
}

public class Test {

  public static void main(String[] args) {
    B b = new B();
    Demo d = name -> "Hello " + name;

    System.out.println(d.getName("Anir"));
    System.out.println(d.getAge(30));
    System.out.println(d.getCity("Kolkata"));
  }
}
