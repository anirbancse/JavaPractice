package com.streams.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
        Function<String, Integer> nameMappingFunction = String::length;
        List<Integer> nameLength = names.stream().map(s->s.length()).collect(Collectors.toList());
        System.out.println(nameLength);
    }
}
