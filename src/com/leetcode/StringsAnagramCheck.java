package com.leetcode;

import java.util.Arrays;

public class StringsAnagramCheck {
    public static void main(String[] args) {
        System.out.println(AnaSolution.isAnagram("allergy","allergic"));
    }
}

class AnaSolution {
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b) {
        char[] carr1 = a.toCharArray();
        char[] carr2 = b.toCharArray();

        Arrays.sort(carr1);
        Arrays.sort(carr2);

        String str1 = String.valueOf(carr1);
        String str2 = String.valueOf(carr2);

        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }
}
