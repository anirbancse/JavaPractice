package com.java8;


import java.util.Arrays;
import java.util.List;

public class ListVowels {


    public static void main(String[] args) {
        List<Character> lists = List.of('a','b','c','d','e','f');

        List<Character> vowelList = List.of('a','e','i','o','u');
        String input = "ANother input with special characters";

        long val  = lists.stream().filter(s->vowelList.contains((char)s)).count();

        long constNo = input.toLowerCase()
                .chars()
                .filter(s->!vowelList.contains((char)s))
                .count();

        System.out.println(constNo);

    }
}
