package com.collection;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamComp {

    // Java program to demonstrate Arrays.stream() method


    public static void main(String[] args) {

        // Creating a String array
//        String[] arr = {"Geeks", "for", "Geeks"};
//
//        // Using Arrays.stream() to convert
//        // array into Stream
//        Stream<String> stream = Arrays.stream(arr);
        Stream stream = Stream.of("Geeks", "for", "Geeks");

        // Displaying elements in Stream
        stream.forEach(str -> System.out.print(str + " "));
    }
}


