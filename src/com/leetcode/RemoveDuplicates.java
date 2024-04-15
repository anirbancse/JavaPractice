package com.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 4};
        var x = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(x);

        Arrays.stream(Arrays.stream(arr)
                .distinct()
                .toArray())
                .boxed()
                .forEach(System.out::println);


        //System.out.println(remove_duplicate(arr, arr.length));
    }

    static int remove_duplicate(int A[], int N) {
        // code here
        int temp = -1, index = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] == temp)
                temp = A[i];
            else {
                A[index] = A[i];
                index++;
                temp = A[i];
            }
        }

        return index;
    }
}
