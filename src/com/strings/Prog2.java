package com.strings;

public class Prog2 {

    static boolean check(String s){
        try{
           return s.length() > 4;
        }catch (NullPointerException e){
            System.out.println("asdasd");
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "10";
        String check = "1";
        String[] s1 = s.split("");
        System.out.println(s1);



        System.out.println(check(null));


        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals(check)) {
                System.out.println(i);
            }
        }
    }
}
