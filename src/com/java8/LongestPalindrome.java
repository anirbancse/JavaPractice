package com.java8;

public class LongestPalindrome {
    int longestCommonSubstr(String s1, String s2, int n, int m) {
        String ans = "";
        int maxl = 0;
        if (s1.equals(s2)) {
            return s1.length();
        }
        for (int i = 0; i < s1.length(); i++) {
            ans = "";
            for (int j = i; j < s1.length(); j++) {

                ans = ans + s1.substring(j, j + 1);
                if (s2.contains(ans)) {
                    maxl = Math.max(maxl, ans.length());
                }
            }

        }
        return maxl;
    }
}
