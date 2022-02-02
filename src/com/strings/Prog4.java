package com.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog4 {

    public static void main(String[] args) {
        String str = "hello there peter pan";

        String s1[] = str.split("\\s");

       // System.out.println(s1[0].charAt(0));


       for(int i=1;i<s1.length;i+=2){
           s1[i] = " "+reverseString(s1[i])+" ";
       }

       Arrays.stream(s1).forEach(System.out::print);

       // Arrays.stream(s1).forEach(System.out::println);
    }

    private static String reverseString(String s) {
        StringBuilder sb  = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
                 sb.append(s.charAt(i));
        }

        return sb.toString();
    }

}
