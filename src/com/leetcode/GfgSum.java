package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class GfgSum {

    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here4
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int b = x - arr[i];
            if (set.contains(b)) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 67, 6, 8};
        System.out.println(hasArrayTwoCandidates(arr, 6, 16));
    }
}
