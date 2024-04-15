package com;

import java.util.Arrays;
import java.util.Collections;

public class StreamPracticeTest {
    public static void main(String[] args) {
        int arr[] = {35, 12, 34, 9, 5};
        var x = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println(x);

        String s = "Chowdhury";
        int y = 8;
        double hj = 35 / 8;
        System.out.println(String.format("My name is Anirban {%.1f}", hj));

    }
}