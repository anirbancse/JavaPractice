package com.exception;

import java.util.*;
import java.util.stream.Collectors;

public class ConcurrentModification {

    public static void main(String[] args) {
        List<Integer> lists = List.of(1, 2, 3, 4, 8);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Arka");
        map.put(2, "Guddu");
        map.put(3, "Rishi");

        var nameList = map.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .sorted()
                .collect(Collectors.toList());

       // Collections.sort(nameList);
        System.out.println(nameList);

        var res = lists.stream().filter(num -> num % 2 == 0).reduce(Integer::sum);
        if (res.isEmpty())
            System.out.println("No value found");
        else
            System.out.println("*********** " + res.get());

        int maxc = lists.stream().max(Comparator.comparingInt(o -> o)).orElseThrow(NoSuchElementException::new);
        System.out.println(maxc);

        var slargest = lists.stream()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
    System.out.println(slargest);

        List<Integer> finalList = lists.stream()
                .filter(s -> s != 2)
                .collect(Collectors.toList());

        System.out.println(finalList);

    }
}
