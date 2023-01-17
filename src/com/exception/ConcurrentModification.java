package com.exception;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class ConcurrentModification {

    public static void main(String[] args) {
        List<Integer> lists = List.of(1,2,3,4,8);

      int maxc = lists.stream().max((o1, o2) -> o1-o2).orElseThrow(NoSuchElementException::new);
        System.out.println(maxc);

        List<Integer> finalList = lists.stream()
                .filter(s->s!=2)
                .collect(Collectors.toList());



        System.out.println(finalList);

    }
}
