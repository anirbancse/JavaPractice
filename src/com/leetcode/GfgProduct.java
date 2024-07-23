package com.leetcode;

import java.util.Arrays;

public class GfgProduct {

  public static long[] productExceptSelf(int nums[], int n) {
    // code here
    long product = 1;
    long[] P = new long[n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          continue;
        }
        product = product * nums[j];
      }
      P[i] = product;
      product = 1;
    }
    return P;
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    var x = productExceptSelf(arr, 5);
    System.out.println(Arrays.toString(x));
  }
}
