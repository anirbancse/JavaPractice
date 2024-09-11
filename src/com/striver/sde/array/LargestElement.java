package com.striver.sde.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestElement {

  static void rotateLeft(int nums[], int k) {

    int n = nums.length;
    int temp = nums[0];

    for (int i = 1; i < n; i++) {
      nums[i - 1] = nums[i];
    }

    nums[n - 1] = temp;

    Arrays.stream(nums).forEach(System.out::print);
  }

  static boolean isArraySorted(int arr[]) {
    boolean ans = true;
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      if (arr[i] >= arr[i - 1]) {
      } else return false;
    }
    return ans;
  }

  public static void main(String[] args) {
    //
    int arr[] = {3, 4, 5, 1, 2};
    int arr1[] = {1, 2, 3, 4, 5, 6, 7};

    rotateRightByNsteps(arr1, 3);

    var numList = List.of(3, 4, 5, 1, 2);

    var ans = isArraySorted(arr);

    if (ans) System.out.println("ArraySorted");
    else System.out.println("NotArraySorted");
  }

//  public static void rotateLeftByNsteps(int[] nums, int k) {
//
//    int temp[] = new int[k];
//
//    //storing temp values thats need to be added after shifting is done
//    for(int i=0;i<k;i++){
//      temp[i] = nums[i];
//    }
//
//    //shifting
//    for(int ii)
//
//  }

  public static void rotateRightByNsteps(int[] nums, int k) {

    int n = nums.length;
    k = k % n;
    List<Integer> listIntegers = new ArrayList<>();

    // storing k elements
    for (int i = n - k; i < n; i++) {
      listIntegers.add(nums[i]);
    }

    // shifting done
    for (int i = n - 1; i >= k; i--) {
      nums[i] = nums[i - k];
    }

    // back the element
    for (int i = 0; i < k; i++) {
      nums[i] = listIntegers.get(i);
    }

    System.out.println(k);
    Arrays.stream(nums).forEach(System.out::print);
  }
}
