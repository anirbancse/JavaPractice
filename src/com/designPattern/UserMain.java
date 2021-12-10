package com.designPattern;

import java.util.HashSet;
import java.util.Set;

public class UserMain {

    public static void main(String[] args) {
        User user = User.builder().firstName("Anirban").lastName("Chowdhury").build();

        Set<Integer> sets = new HashSet<>();
        sets.add(5);
        sets.add(3);
        sets.add(7);
        sets.add(1);
        System.out.println(sets);

        System.out.println(user);
    }
}
