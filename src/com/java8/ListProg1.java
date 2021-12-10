package com.java8;

import java.util.ArrayList;
import java.util.List;

public class ListProg1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("A");
        names.add("B");
        names.add("C");

        System.out.println("Before Set method::: "+names);

        names.add(1,"k");
        System.out.println(names);

        names.set(0,"P");
        System.out.println(names);

      /*  names.add(0,"H"); //replac
        System.out.println(names);*/
    }
}
