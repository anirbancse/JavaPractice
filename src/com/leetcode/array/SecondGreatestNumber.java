package com.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondGreatestNumber {

    public static void main(String[] args) {
//
//        int largest = arr[0];
//        int sLargest = -1;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                sLargest = largest;
//                largest = arr[i];
//            }
//            if (arr[i] > sLargest && arr[i] < largest) {
//                sLargest = arr[i];
//            }
//        }
//        System.out.println(sLargest);

        int[] arr = {12, 5, 6, 13, 15, 9};

        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

        var x = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println(x);

        var largestNumFromArray = Arrays.stream(arr).max().getAsInt();
        System.out.println(largestNumFromArray);


        //System.out.println(x);

        var numList = List.of(12, 5, 6, 13, 15, 9);

        var largestNumber = numList.stream()
                .max(Integer::compareTo).orElse(-1);
        System.out.println(largestNumber);

        var y = numList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseGet(() -> 1);
        System.out.println(y);

    }
}

//        var x = Arrays.stream(arr).max().getAsInt();
//        System.out.println(x);


