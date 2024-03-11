package com.leetcode;


import java.util.HashSet;
import java.util.List;

public class LongestSubstring {

    public static String findLongestUniqueSubstring(String input) {
        return input
                .chars()
                .mapToObj(c -> (char) c)
                .collect(StringBuilder::new, (sb, c) -> {
                    if (sb.indexOf(String.valueOf(c)) == -1) {
                        sb.append(c);
                    }
                }, StringBuilder::append)
                .toString();
    }


    static int longestUniqueSubsttr(String S) {

        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int max = Integer.MIN_VALUE;
        for (int end = 0; end < S.length(); end++) {
            var x = S.charAt(end);
            while (set.contains(x)) {
                set.remove(S.charAt(start));
                start++;
            }
            set.add(S.charAt(end));

            max = Math.max(max, end - start + 1);
        }
        return max;
    }

    // Driver code
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        //System.out.println("The input String is " + s);
        int length = longestUniqueSubsttr(s);
        var str = findLongestUniqueSubstring(s);

        List<String> vowels = List.of("a", "e", "i", "o", "u");

// sequential stream - nothing to combine
        StringBuilder result = vowels.stream().collect(StringBuilder::new, (x, y) -> x.append(y),
                (a, b) -> a.append(",").append(b));
        System.out.println(result.toString());
//        System.out.println(str);
//        System.out.println("The length of the longest non-repeating character substring is " + length);
    }
}




