package com.designPattern;

public class FactRecursion {

    static long fact(int num) {
        if (num == 1)
            return 1;
        else
            return num * fact(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(FactRecursion.fact(100));
    }
}
