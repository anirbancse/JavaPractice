package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ComparatorClass {


    public static void main(String[] args) {

        A a = new A("Force Awakens",  2015);

        ArrayList<A> list = new ArrayList<A>();
        list.add(new A("Force Awakens",  2015));
        list.add(new A("Star Wars",  1977));
        list.add(new A("Empire Strikes Back",  1980));
        list.add(new A("Return of the Jedi",  1983));


        list.sort((m1,m2)->m1.getName().compareTo(m2.getName()));

        list.sort((m1,m2)->{
            if(m1.getYear()> m2.getYear())
                return 1;
            else if(m1.getYear()<m2.getYear())
                return -1;
            else
                return 0;
            }
        );

        list.forEach(e->System.out.println(e.getName()+" "+e.getYear()));





    }
}
