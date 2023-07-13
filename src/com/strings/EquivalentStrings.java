package com.strings;

public class EquivalentStrings {

    public boolean compare(String s1, String s2) {

        Math.min(s1.length(), s2.length());

        return true;
    }

    public static void main(String[] args) {

        String s1 = "abcdeef";
        String s2 = "abaaacc";

        boolean check = new EquivalentStrings().compare(s1, s2);
        System.out.println(check);
    }

}
