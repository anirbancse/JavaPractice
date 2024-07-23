package com.leetcode.array;

public class PeekJava {
  public static void main(String[] args) {
    //
      int arr[] = {1, 1, 1, 2, 1, 1, 1};
    System.out.println(peakElement(arr,1));
  }

  static public int peakElement(int[] arr, int n) {
    // add code here.
    if (n == 1) return 0;
    if (arr[0] > arr[1]) return 0;
    if (arr[n - 1] > arr[n - 2]) return n - 1;
    int left = 0;
    int right = n - 2;
    while (left <= right) {
      // Perform a binary search to find a peak element.
      int mid = (left + right) / 2;

      // If arr[mid] is the peak:
      if (arr[mid - 1] <= arr[mid] && arr[mid] >= arr[mid + 1]) return mid;

      // If we are in the left:
      if (arr[mid] > arr[mid - 1]) left = mid + 1;

      // If we are in the right:
      // Or, arr[mid] is a common point:
      else right = mid - 1;
    }
    return -1;
  }
}
