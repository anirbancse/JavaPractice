package com.javatechie.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UniversalSubarrays {
    public static void main(String[] args) {


//        System.out.println(Fi);

        int[] arr = {4, 4, 2, 2, 4};
        int count = countUniversalSubarrays(arr);
        System.out.println("Number of universal subarrays: " + count);
    }

    public static int countUniversalSubarrays(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] subarray = Arrays.copyOfRange(arr, i, j + 1);
                if (isUniversal(subarray)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isUniversal(int[] arr) {
        int fourfreq = 0, twoFreq = 0;
        List<String> newList = Arrays.asList(arr).stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        if (arr.length == 1)
            return false;
        else {
            fourfreq = Collections.frequency(newList, "4");
            twoFreq = Collections.frequency(newList, "2");
        }

        return fourfreq == twoFreq;
    }
}