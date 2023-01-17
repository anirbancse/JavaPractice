package com.java8;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<String> countryList = List.of("INDIA", "AUSTRALIA", "ENGLAND", "NEWZEALAND", "SCOTLAND");

        List<String> countryList1 = Arrays.asList("INDIA", "AUSTRALIA", "ENGLAND", "NEWZEALAND", "SCOTLAND");

      //  countryList.stream().filter(s->s.endsWith("A")).forEach(e-> System.out.println(e));

        countryList1.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(countryList1);


        List<Integer> lists = Arrays.asList(1,2,3,5,4,6,7,8,9);

       int min =  lists.stream().min(((o1, o2) -> o1-o2)).orElseThrow(NoSuchElementException::new);
       int max = lists.stream()
               .max((o1, o2) -> o1-o2)
               .orElseThrow(NoSuchElementException::new);

        System.out.println(max+"-"+min);
    }
}
