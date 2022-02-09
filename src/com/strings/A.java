package com.strings;


class B {

    public void show() {
        System.out.println("IN B");
    }
}

public class A extends B {

    @Override
    public void show() {
        System.out.println("In A..");
    }

    public static void main(String[] args) {
        B b = new B();
        A a = new A();

        ((B)a).show();

        b = a;

        b.show();
    }
}
