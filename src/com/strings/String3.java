package com.strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class String3 {

    public static void main(String[] args) {
        String s = "ABCCC sdfdsf";

        char str[]  = s.toCharArray();
        System.out.println(str[6]);
        Stream.of(s).forEach(System.out::println);
    }
}
