package com.striver.sde.array;

import java.util.HashSet;
import java.util.Set;

public class MissingNumberSearch {

  public static void main(String[] args) {
    //
    Set<Integer> integerSet = new HashSet<>();

    int arr[] = {3, 0, 1};
    int sum = 0;
    for (int i=0;i<arr.length-1;i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}
