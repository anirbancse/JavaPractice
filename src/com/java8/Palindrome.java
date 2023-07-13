package com.java8;

public class Palindrome {
    static void palindrom(String num) {


        String ar[] = num.split("");
        String str = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            str = str.concat(ar[i]);
        }
        System.out.println(str);
        if (str.equalsIgnoreCase(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        // write your code here
        Palindrome.palindrom("121");


        //Stream of numbers --> [Highest 5 nos]

    }
}
