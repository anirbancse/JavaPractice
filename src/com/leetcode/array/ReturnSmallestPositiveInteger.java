package com.leetcode.array;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ReturnSmallestPositiveInteger {

    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 4, 1, 2};

        Set<Integer> numberSet = new TreeSet<>();
        Arrays.stream(arr).filter(s -> s > 0).forEach(numberSet::add);
        numberSet.forEach(System.out::println);
        int sm = 1;
        while (numberSet.contains(sm)) {
            sm++;
        }
        System.out.println(sm);
    }
}
