package com.leetcode;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        String s= "AAABBCCDDFFEE";
        char ch[] = s.toCharArray();
        Set<Character> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        List<Integer> list = Arrays.asList(67,1,5);

        for(int x:list){
            set2.add(x);
        }

        System.out.println(set2);

        for(char c:ch){
          set.add(c);
        }
        set.stream().sequential().forEach(System.out::print);
    }
}
