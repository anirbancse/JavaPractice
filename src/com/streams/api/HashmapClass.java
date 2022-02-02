package com.streams.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashmapClass {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",3);
        map.put("c",1);


         Map sortByValue1 =  map.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                 .collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));

        Map sortByValue = map.entrySet() .stream() .sorted(Map.Entry.<String, Integer>comparingByValue()) .
            collect(Collectors.toMap(e -> e.getKey(),e -> e.getValue()));

        System.out.println(sortByValue+ " "+ map);
        System.out.println(sortByValue1);
    }
}
