package com.java8;

import javax.sound.sampled.SourceDataLine;

public class RecursionJava {

    public static int fact(int num) {
        if (num == 0)
            return 1;
        else
            return (num * fact(num - 1));
    }

    public static void main(String[] args) {

        System.out.println(fact(5));

    }
}
