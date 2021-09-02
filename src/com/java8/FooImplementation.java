package com.java8;

import java.util.HashMap;
import java.util.stream.Stream;

public class FooImplementation implements Foo {

    @Override
    public void bar() {


    }

    // Default Method - Optional to Override

    public static void main(String[] args) {

        FooImplementation fi = new FooImplementation();
        HashMap <Integer,String> map = new HashMap();

        System.out.println(fi.HelloWorld());
        //System.out.println(fi.CustomMessage(“Hi”));
        fi.bar();
    }
}