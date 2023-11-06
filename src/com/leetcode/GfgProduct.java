package com.leetcode;

public class GfgProduct {

    public static long[] productExceptSelf(int nums[], int n) {
        // code here
        long product = 1;
        long[] P = new long[n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==j){
                    continue;
                }
                product = product*nums[j];
            }
            P[i] = product;
            product = 1;
        }
        return P;
    }

    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 6, 2};
        var x = productExceptSelf(arr, 5);
        for(long u:x ){
            System.out.println(x);
        }
    }
}
