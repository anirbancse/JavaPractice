package com.strings;



    // Java program to understand
// the concept of == operator

    public class StringComp {
        public static void main(String[] args)
        {
            String s1 = "HELLO";
            String s2 = "EHLLO";

            System.out.println(String.valueOf(s1.compareTo(s2)));
            String s3 = new String("HELLO");

            System.out.println(s1 == s2); // true
            System.out.println(s1 == s3); // false
            System.out.println(s1.equals(s2)); // true
            System.out.println(s1.equals(s3)); // true
            System.out.println(s1.compareTo(s2));
        }
    }


