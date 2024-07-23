package com.generic;

public class Generic1 {

  public static <T> T myshow(T argument, T argument2) {
    if (argument instanceof String) {
      return (T) ((String) argument).concat((String) argument2);
    } else if (argument instanceof Integer)
      return (T) Integer.valueOf((Integer) argument + (Integer) argument2);
    throw new IllegalArgumentException("Unsupported types or arguments");
  }



  public static void main(String[] args) {
    //
    System.out.println(Generic1.myshow("Hi", "Anirban"));
    System.out.println(Generic1.myshow(2, 4));
    System.out.println(Generic1.myshow(2.3, 4.5));
  }
}
