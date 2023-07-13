package com.leetcode;

import javax.sound.sampled.SourceDataLine;

public class ReverseWords {

    public static void main(String[] args) {

        String s = "abc.xyz.ghj";

        String p[] = s.split("\\.");

        for (int i = p.length - 1; i >= 0; i--) {

            if (i != 0)
                System.out.print(p[i] + ".");
            else
                System.out.println(p[i]);
        }

    }

}
