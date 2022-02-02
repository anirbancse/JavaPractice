package com.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ComparatorClass {

        public static void main(String[] args) {

                A a = new A("Force Awakens", 2015);

                // ArrayList<A> list = new ArrayList<A>();
                // list.add(new A("Force Awakens", 2015));
                // list.add(new A("Star Wars", 1977));
                // list.add(new A("Empire Strikes Back", 1980));
                // list.add(new A("Return of the Jedi", 1983));

                List<A> list = Arrays.asList(
                                new A("Force Awakens", 2015),
                                new A("Star Wars", 1977),
                                new A("Empire Strikes Back", 1980),
                                new A("Return of the Jedi", 1983));

                System.out.println("Original List--->" + list);

                list.sort((m1, m2) -> m1.getName().compareTo(m2.getName()));

                //Collections.sort(list);

                // list.sort((m1,m2)->{
                // if(m1.getYear()> m2.getYear())
                // return 1;
                // else if(m1.getYear()<m2.getYear())
                // return -1;
                // else
                // return 0;
                // }
                // );

                list.forEach(e -> System.out.println(e.getName() + " " + e.getYear()));

                List<Integer> integerList = Arrays.asList(9, 2, 5, 7, 6);

                Collections.sort(integerList, (o1, o2) -> o1 - o2);

                System.out.println(integerList);
                Predicate<Integer> predicate = s -> (s % 3 == 0);

                int finalsum = integerList.stream()
                                .map(e -> e * 2)
                                .filter(predicate)
                                .reduce(0, (ans, i) -> ans + i);
                System.out.println(finalsum);

                integerList.stream()
                                .map(s -> s * 2)
                                .filter(predicate)
                                .forEach(e -> System.out.println(e));

        }
}
