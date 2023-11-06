package com.leetcode;

public class MaxProductSubArray {

    static long maxProduct(int[] arr, int n) {
        // code here

        long prefix = 1;
        long suffix = 1;
        long maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix = prefix * arr[i];
            suffix = suffix * arr[n - i - 1];
            maxi = Math.max(maxi, Math.max(prefix, suffix));
        }
        return maxi;
    }


    public static void main(String[] args) {
        int arr[] = {6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr, arr.length));
    }
}
