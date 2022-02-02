package com.streams.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashmapProg1 {

    public static void main(String[] args) {
        HashMap <String,String> hashMap = new HashMap<>();

        hashMap.put("1","Ani");
        hashMap.put("2","Rb");
        hashMap.put("3","an");

        ConcurrentHashMap <String,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("1","Ani");
        concurrentHashMap.put("2","Rb");
        concurrentHashMap.put("3","an");

        hashMap.entrySet().forEach(e-> System.out.print(e.getValue()+" "));

       // System.out.println(hashMap.entrySet());
        System.out.println(concurrentHashMap.entrySet());
        //hashMap.forEach(System.out::println);


        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        list.stream()
                .filter(s->s.startsWith("O"))
                .map(e->e.toUpperCase())
                .forEach(System.out::println);

    }
}
