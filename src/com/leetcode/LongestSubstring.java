package com.leetcode;


import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {

//    static int longestUniqueSubsttr(String s) {
//
//        // Creating a set to store the last positions of occurrence
//        HashMap<Character, Integer> seen = new HashMap<>();
//        int maximum_length = 0;
//
//        // starting the initial point of window to index 0
//        int start = 0;
//
//        for (int end = 0; end < s.length(); end++) {
//            // Checking if we have already seen the element or not
//            if (seen.containsKey(s.charAt(end))) {
//                // If we have seen the number, move the start pointer
//                // to position after the last occurrence
//                start = Math.max(start, seen.get(s.charAt(end)) + 1);
//            }
//
//            // Updating the last seen value of the character
//            seen.put(s.charAt(end), end);
//            maximum_length = Math.max(maximum_length, end - start + 1);
//        }
//        return maximum_length;
//    }

    static int longestUniqueSubsttr(String S){

        HashSet<Character> set = new HashSet<>();
        int start=0;
        int max=Integer.MIN_VALUE;
        for(int end=0;end<S.length();end++){
            while(set.contains(S.charAt(end))){
                set.remove(S.charAt(start));
                start++;
            }
            set.add(S.charAt(end));

            max=Math.max(max,end-start+1);
        }
        return max;
    }

    // Driver code
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println("The input String is " + s);
        int length = longestUniqueSubsttr(s);
        System.out.println("The length of the longest non-repeating character substring is " + length);
    }
}




