package com;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsTest {
    public static void main(String[] args) {
        StreamsTest streamsTest = new StreamsTest();
        streamsTest.solution();
    }

    private void solution() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("AAA", 111, "D1", 1000));
        employees.add(new Employee("BBB", 222, null, 2000));
        employees.add(new Employee("CCC", 333, "D2", 3000));
        employees.add(new Employee("DDD", 444, "D3", 4000));
        employees.add(new Employee("EEE", 555, "D2", 5000));
        employees.add(new Employee("FFF", 666, "D2", 6000));

        System.out.println(employees);
        // TODO print employee names belongs to dept "D2" - using streams functions
        var x = employees.stream().filter(d -> d.getDeptno() != null && d.getDeptno().equals("D2")).toList();
        System.out.println(x);

        // TODO Print the sum of all employees salaries using streams - expected to
        // print 21000
        var y = employees.stream().map(Employee::getSalary).reduce(0, Integer::sum);
        System.out.println(y);

        // TODO Given a sentence find the word that has the highest length using
        // Streams. expected to print "Welcome"
        String input = " Welcome to Java world";

        // TODO Should print most repeated number from the array, using streams or Java
        // 7 features...
        // number 5 repeated most of the (3)times, Should print 5 and not 3
        int arr[] = { 7, 5, 7, 5, 7, 5, 5 };

        int mostRepeated = Arrays.stream(arr)
                // Step 2: Count the occurrences of each element
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                // Step 3: Find the element with the maximum count
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                // Step 4: Retrieve the most repeated element
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));

        System.out.println("GGGGGGG "+mostRepeated);

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
        Set<Integer> duplicated = numbers
                .stream()
                .filter(n -> numbers
                        .stream()
                        .filter(k -> k == n)
                        .count() > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicated);

        // Optional example
        if (employees == null) {
            throw new RuntimeException();
        } else {
            processEmp(employees);
        }

    }

    private void processEmp(List<Employee> employees) {

    }

    private class Employee {

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
}