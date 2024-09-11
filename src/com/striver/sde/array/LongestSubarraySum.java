package com.striver.sde.array;

public class LongestSubarraySum {

  public static int lenOfLongSubarr(int A[], int N, int K) {
    // Complete the function

    int maxLength = 0;
    int sum = 0;

    for (int i = 0; i < N; i++) {
       sum = 0;

      for (int j = i; j < N; j++) {

        sum += A[j];
        if (sum == K) {
          maxLength = Math.max(maxLength, j - i + 1);
          // return maxLength;

        }
      }
    }
    return maxLength;
  }

  public static void main(String[] args) {
    int arr[] = {10, 5, 2, 7, 1, 9};
    int k = 15;
    int N = arr.length;
    System.out.println(lenOfLongSubarr(arr, N, k));
  }
}
