package com.leetcode;

class Solution {
    public int nCr(long n, long r) {
        // Code here
        // Code here
        long diff = 0;
        Long result;

        if (n == 0 || r == 0)
            return 1;
        else {
            diff = n - r;
            result = fact(n) / (fact(r) * fact(diff));

        }

        return result.intValue();
    }

    public long fact(long num) {

        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.nCr(17, 3));
    }
}
