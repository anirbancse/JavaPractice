package com.leetcode;

public class CoinChangeProb {

    public static long count(int coins[], int N, int sum) {
        // code here.
        long curr[]=new long[sum+1];
        curr[0]=1;
        for(int coin:coins)
        {
            for(int i=coin;i<=sum;i++)
            {
                curr[i]+=curr[i-coin];
            }
        }
        return curr[sum];
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(count(arr,3, 4));
    }
}
