package com.designPattern;

public class StaticOverriden {
    // A Java program with overloaded main()


    // Normal main()
    public static void main(String[] args) {
        System.out.println("Hi Geek (from main)");
        StaticOverriden.main("Geek");
    }

    // Overloaded main methods
    public static void main(String arg1) {
        System.out.println("Hi, " + arg1);
        StaticOverriden.main("Dear Geek", "My Geek");
    }

    private static void main(String arg1, String arg2) {
        System.out.println("Hi, " + arg1 + ", " + arg2);
    }
}


class ParentClass {
    //we cannot override the display() method
    public static void display() {
        System.out.printf("display() method of the parent class.");
    }
}

//child class
class ChildClass extends ParentClass {
    //the same method also exists in the ParentClass
//it does not override, actually it is method hiding
    public static void display() {
        System.out.println("Overridden static method in Child Class in Java");
    }
}
