package com.leetcode.array;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ReturnSmallestPositiveInteger {

  public static void main(String[] args) {
    int arr[] = {1, 3, 6, 4, 1, 2};
    int arr1[] = {2, 3, -7, 6, 8, 1, -10, 15};

    Set<Integer> numberSet = new TreeSet<>();
    Arrays.stream(arr).filter(s -> s > 0).forEach(numberSet::add);
    Arrays.sort(arr1);

    int sm1 = 1;

    for (int i = 0; i < arr1.length; i++) {
      if (sm1 == arr1[i]) {
        sm1++;
      }
    }
    System.out.println(sm1);

    // numberSet.forEach(System.out::println);
    int sm = 1;
    while (numberSet.contains(sm)) {
      sm++;
    }
    System.out.println(sm);
  }
}
