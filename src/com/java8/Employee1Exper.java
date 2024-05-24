package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee1Exper {

  public static void main(String[] args) {

    Employee1 emp1 = new Employee1("a", 45);
    Employee1 emp2 = new Employee1("b", 78);
    Employee1 emp3 = new Employee1("c", 24);

    List<Employee1> lists = Arrays.asList(emp1, emp2, emp3);

    lists.stream().filter(s -> s.getName().equalsIgnoreCase("a")).forEach(System.out::println);

    int max = lists.stream().map(Employee1::getSalary).reduce(0, Integer::sum); // using reduce

    int max1 =
        lists.stream().map(Employee1::getSalary).mapToInt(Integer::intValue).sum(); // using maptoInt

    int max2 =
        lists.stream().map(Employee1::getSalary).collect(Collectors.summingInt(Integer::intValue));

    System.out.println(max + " " + max1 + " " + max2);
  }
}
