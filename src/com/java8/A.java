package com.java8;

public class A implements  Comparable<A>{

        private int year;
        private String name;


        public A(String name,int year) {
            this.year = year;
            this.name = name;
        }

        @Override
        public int compareTo(A a) {
            return this.year-a.year;
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

