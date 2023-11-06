package com.leetcode;

public class LongestSum {
    static long countStrings(int n) {
        // code here
        int zeroend = 1;
        int oneend = 1;
        int sum = zeroend + oneend;
        if (n == 1)
            return sum;

        int i = 2;
        while (i <= n) {
            oneend = zeroend % 1000000007;
            zeroend = sum % 1000000007;
            sum = zeroend + oneend % 1000000007;
            i++;
        }
        return sum % (1000000007);
    }

    public static void main(String[] args) {
        System.out.println(countStrings(1));
    }
}
