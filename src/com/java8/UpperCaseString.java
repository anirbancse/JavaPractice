package com.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCaseString {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("Abc","Def");

        names.map(e->e.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
