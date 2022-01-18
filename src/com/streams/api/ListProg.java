package com.streams.api;

import java.util.*;

public class ListProg {

    public static void main(String[] args) {
        List <Integer> lists =  Arrays.asList(1,88,45,67,90);

        //Collections.sort(lists,Collections.reverseOrder());
        lists.forEach(System.out::println);

        int max = lists.stream().min((o1, o2) -> o1.compareTo(o2)).orElseThrow(NoSuchElementException::new);
        System.out.println(max);
    }
}
