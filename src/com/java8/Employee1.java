package com.java8;

public class Employee1 {

    private String name;
    public int salary;

    public Employee1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
