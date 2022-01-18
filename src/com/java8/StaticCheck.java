package com.java8;


class J {
    static int x= 7;
    J(int x){
        this.x=x;
    }
}

public class StaticCheck {

    public static void main(String[] args) {
        J j = new J(8);
        System.out.println(J.x);
        J.x = 10;
        System.out.println(J.x);
    }

}
