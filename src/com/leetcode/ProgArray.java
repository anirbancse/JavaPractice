package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgArray {

    public static void main(String[] args) {

        List<List<Integer>> lists = new ArrayList<>();



        lists.add(Arrays.asList(1,2,3));
        lists.add(Arrays.asList(1,2,3));

//        lists.stream().flatMap(Collection::stream)
//                .filter(f->f%2==0)
//                .map(e->e*2)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        int sum = lists.stream().flatMap(Collection::stream)
                .mapToInt(Integer::intValue).sum();

        System.out.println(sum);





    }
}
