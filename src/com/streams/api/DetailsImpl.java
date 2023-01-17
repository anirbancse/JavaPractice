package com.streams.api;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class DetailsImpl {

    public static void main(String[] args) {

        List<List<String>> lists = new ArrayList<>();

        List<String> parts = new ArrayList<>();
        parts.add("A");
        parts.add("V");
        parts.add("C");

        List<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("John");

        lists.add(parts);
        lists.add(names);
        //System.out.println(lists);

       lists.parallelStream().flatMap(Collection::stream)
               .map(e->e.length())
               .forEach(System.out::println);

    }
}
