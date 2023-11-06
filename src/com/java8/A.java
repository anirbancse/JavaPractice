package com.java8;

public class A implements Comparable<A> {

    private int year;
    private String name;
    private int age;

    public A(int year, String name, int age) {
        this.year = year;
        this.name = name;
        this.age = age;
    }

    public A(String name, int year) {
        this.year = year;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(A a) {
        if (this.getName().compareTo(a.getName()) == 0) {
            return Integer.compare(this.getAge(), a.getAge());
        }
        return age;

    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "A{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
