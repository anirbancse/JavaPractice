package com;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPracticeTest {

  private static class Employee {

    private String name;
    private int id;
    private String deptno;
    private int salary;
    private List<String> addresses;

    public Employee(String name, int id, String deptno, int salary) {
      this.name = name;
      this.id = id;
      this.deptno = deptno;
      this.salary = salary;
    }

    public static void main(String[] args) {}

    @Override
    public String toString() {
      return name + "::" + id + "::" + deptno + "::" + salary;
    }

    public String getName() {
      return name;
    }

    public int getId() {
      return id;
    }

    public String getDeptno() {
      return deptno;
    }

    public int getSalary() {
      return salary;
    }
  }


  public static void main(String[] args) {
    int arr[] = {35, 12, 34, 9, 5};

    var x =
        Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(0);
  //  System.out.println(x);

    String s = "Chowdhury";
    int y = 8;
    double hj = 35 / 8;
    //System.out.println(String.format("My name is Anirban {%.1f}", hj));


    /**
     * **************************************************************************************
     */

    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("AAA", 111, "D1", 1000));
    employees.add(new Employee("BBB", 222, null, 2000));
    employees.add(new Employee("CCC", 333, "D2", 3000));
    employees.add(new Employee("DDD", 444, "D3", 4000));
    employees.add(new Employee("EEE", 555, "D2", 5000));
    employees.add(new Employee("FFF", 666, "D2", 6000));



    // TODO return the map based on the name

    var name = employees.stream()
            .map(Employee::getName)
            .sorted().toList();
    System.out.println(name);

    // TODO print employee names belongs to dept "D2" - using streams functions

    var employeeNames = employees.stream()
            .filter(e->e.getDeptno()!=null && e.getDeptno().equals("D2"))
            .map(Employee::getName)
            .toList();
    System.out.println(employeeNames);

    // TODO print employees with the highest salary

    var employee = employees.stream()
            .max(Comparator.comparing(Employee::getSalary))
            .map(Employee::getName)
            .orElse("No employee found");
    System.out.println(employee);

    // TODO print employees with the second highest salary

    var employee1 = employees.stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .map(Employee::getName)
            .skip(1)
            .findFirst()
            .orElse("No employee found");
    System.out.println(employee1);

    // TODO Print the sum of all employees salaries using streams - expected to
      var salary = employees.stream().map(Employee::getSalary)
              .reduce(0,Integer::sum);
    System.out.println(salary);
    // TODO Given a sentence find the word that has the highest length using
    String input = " Welcome to Java world";
    var word = Arrays.stream(input.split(" ")).max(Comparator.comparingInt(String::length)).get();
    System.out.println(word);

    //TODO Should print most repeated number from the array, using streams or Java
    int arr1[] = {7, 5, 7, 7, 5, 5, 5};

   var i =  Arrays.stream(arr1)
            .boxed()
            .collect(Collectors.groupingBy(e->e,Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(0);

    System.out.println(i);

    // TODO frequency of element more than 1
    List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
    var dupli = numbers.stream().filter(e-> Collections.frequency(numbers,e) > 1)
            .collect(Collectors.toSet());
    System.out.println(dupli);

    // TODO flatten a list and adding all the even values
    List<List<Integer>> listNumbers =
            List.of(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));

    var gh = listNumbers.stream().
            flatMap(Collection::stream)
            .filter(j->j%2==0)
            .reduce(0,Integer::sum);
    System.out.println(gh);

    // TODO trying to update the value at particulat index <UnsupportedOperationException>
    List<String> words = Arrays.asList("hello", "world", "java");
    words.set(0,"Ani");
    words.stream().map(String::toUpperCase).forEach(System.out::println);
    // TODO filter the list starting with vowel
    List<String> normalWords = Arrays.asList("apple", "banana", "cat", "egg", "orange");
    normalWords.stream().filter(l -> "aeiou".indexOf(l.charAt(0)) >= 0).map(String::toUpperCase)
            .forEach(System.out::println);
    // TODO BIFUNCTION   <U> U reduce(U identity,
    //                 BiFunction<U, ? super T, U> accumulator,
    //                 BinaryOperator<U> combiner);

    // TODO e’ll divide it into two groups, one containing only Baeldung articles and the second one
    // TODO print the account having highest trasactions
    // TODO return a list in descending order

  }
}
