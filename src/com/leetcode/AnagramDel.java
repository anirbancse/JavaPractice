package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramDel {

//    public static int makeAnagram(String a, String b) {
//        // Write your code here
//        String s1 = a.replaceAll("\\s", "");
//        String s2 = b.replaceAll("\\s", "");
//        int n1 = s1.length(), n2 = s2.length();
//
//        if (n1 != n2)
//            return -1;
//
//        char[] c1 = s1.toLowerCase().toCharArray();
//        char[] c2 = s2.toLowerCase().toCharArray();
//
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//        int delCount = 0;
//
//        if (c1.equals(c2))
//            return 0;
//        else {
//            int minLength = Math.min(c1.length,c2.length);
//            int count = 0;
//            for(char c:c1){
//                for(char d:c2){
//                    if(c==d){
//                        count++;
//                        break;
//                    }
//                }
//            }
//            delCount = count != 0 ? count * 2 : count;
//            return delCount;
//        }
//
//    }

    public static int makeAnagram(String first, String second) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<first.length();i++){
            if(map.get(first.charAt(i)) == null){
                map.put(first.charAt(i), 1);
            } else {
                int cur = map.get(first.charAt(i));
                map.put(first.charAt(i), cur+1);
            }
        }
        for(int i=0;i<second.length();i++){
            if(map.containsKey(second.charAt(i))){
                int cur = map.get(second.charAt(i));
                if(cur == 1){
                    map.remove(second.charAt(i));
                } else {
                    map.put(second.charAt(i), cur-1);
                }
            } else {
                count++;
            }
        }

        for(Integer i: map.values()){
            count=count+i;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(makeAnagram("cde","cdf"));

    }

}

