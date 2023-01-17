package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class LongestNumber {

//    public static String findLargestNumber(List<Integer> nums) {
//        // sort using a custom function object
//        Collections.sort(nums, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));
//        return nums.stream()
//                .map(Object::toString)
//                .collect(Collectors.joining(""));
//    }

    public static String findLargestNumber(String nums[]) {
        // sort using a custom function object
        List<String> lists = Arrays.asList(nums);
        String finalRes="";
        Collections.sort(lists, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));
            for(String s:lists){
                finalRes= finalRes.concat(s);
            }

        System.out.println(finalRes);

        return lists.stream()
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        String arr[] = {"10","68","97","9","21","12"};
        List<Integer> numbers = Arrays.asList(10, 68, 97, 9, 21, 12);

        String largestNumber = findLargestNumber(arr);
        System.out.println("The largest number is " + largestNumber);
    }
}


