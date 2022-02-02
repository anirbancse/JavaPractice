package com.designPattern;



import java.util.Arrays;
import java.util.List;

public class HoistingMainClass {

    public static void main(String[] args) {

        Hoisting h1 = new Hoisting(1,"amazon","aws.amazon.com");
        Hoisting h2 = new Hoisting(2,"google","google.com");
        Hoisting h3 = new Hoisting(3,"facebook","facebook.com");


        List<Hoisting> hoistingList = Arrays.asList(h1,h2,h3);

        List<Hoisting> result1 = HoistingRepo.filterHoisting(hoistingList,s->s.getName().startsWith("g"));
        System.out.println(result1);
    }
}
