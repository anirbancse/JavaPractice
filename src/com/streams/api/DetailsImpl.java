package com.streams.api;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DetailsImpl {

    public static void main(String[] args) {

        List<Details> lists = new ArrayList<>();

        List<String> parts = new ArrayList<>();
        parts.add("A");
        parts.add("V");
        parts.add("C");

        lists.add(new Details(parts));

       lists.stream().flatMap(e->e.getParts().stream()).forEach(System.out::println);

    }
}
