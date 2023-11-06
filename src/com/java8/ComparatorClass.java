package com.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ComparatorClass {

    public static void main(String[] args) {

        // ArrayList<A> list = new ArrayList<A>();
        // list.add(new A("Force Awakens", 2015));
        // list.add(new A("Star Wars", 1977));
        // list.add(new A("Empire Strikes Back", 1980));
        // list.add(new A("Return of the Jedi", 1983));

        List<? extends A> list = Arrays.asList(
                new A(2015, "Force Awakens", 65),
                new A(2018, "Force Awakens", 67),
                new A(1977, "Star Wars", 34),
                new A(1980, "Empire Strikes Back", 23),
                new A(1983, "Return of the Jedi", 66),
                new A(1994, "Anirban", 28));

        // System.out.println("Original List--->" + list);

        // list.sort((m1, m2) -> {
        // if (m1.getName().equals(m2.getName()))
        // return Integer.compare(m1.getAge(), m2.getAge());
        // else {
        // return m1.getName().compareTo(m2.getName());
        // }
        // });

        list.sort(Comparator.comparing(A::getName).thenComparing(A::getAge));

        // list.sort((person1, person2) -> (Integer.compare(person2.getAge(),
        // person1.getAge())));

        // Collections.sort(list);
        // list.sort((m1,m2)->{
        // if(m1.getYear()> m2.getYear())
        // return 1;
        // else if(m1.getYear()<m2.getYear())
        // return -1;
        // else
        // return 0;
        // }
        // );
        // Collections.sort(list);

        list.forEach(e -> System.out.println(e.getName() + " " + e.getYear()));

        List<Integer> integerList = Arrays.asList(9, 2, 5, 7, 6);

        List<Integer> hackerList = Arrays.asList(5, 4, 4, 2, 2, 4);
        var kList = hackerList.stream().filter(num -> num == 2 || num == 4).collect(Collectors.toList());
        //System.out.println(kList);
        List<Integer> pList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        var array = kList.toArray();

//        for (int i = 0; i < kList.size(); i++){
//            for(int j=i+1;j< kList.size();j++){
//                if(kList.get(i)== kList.get(j))
//                    System.out.println(arr);
//
//            }
//        }

            Collections.sort(integerList);

        // System.out.println(integerList);
        Predicate<Integer> predicate = s -> (s % 3 == 0);

        int finalsum = integerList.stream()
                .map(e -> e * 2)
                .filter(predicate)
                .reduce(0, (ans, i) -> ans + i);
        // System.out.println(finalsum);


        // integerList.stream()
        // .map(s -> s * 2)
        // .filter(predicate)
        // .forEach(e -> System.out.print(e + "***"));

        List<String> peekResult = new ArrayList<>();

        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("CCC", "BBB", "AAA", "DDD", "KKK"));
        treeSet.add("HHH");

        var x = treeSet.stream()
                .peek(peekResult::add)
                .sorted()
                .findFirst();

        System.out.println(x.get());

    }
}
