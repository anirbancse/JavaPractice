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

    // System.out.println(employees);

    // TODO print employee names belongs to dept "D2" - using streams functions

    var employeeD2 =
        employees.stream()
            // .map(Employee::getDeptno)
            .filter(s -> s.getDeptno() != null && s.getDeptno().equals("D2"))
            .map(Employee::getName)
            .collect(Collectors.toList());

    System.out.println(employeeD2);

    // TODO print employees with the highest salary
    var maxSalary =
        employees.stream()
            .max(Comparator.comparing(Employee::getSalary))
            .map(Employee::getName)
            .orElse("No employee found");
    System.out.println("maxSalary::: " + maxSalary);

    // TODO print 2nd Highest Salary

    var max2ndSalary =
        employees.stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .skip(1)
            .findFirst()
            .map(Employee::getName)
            .orElseThrow(() -> new IllegalArgumentException("No such member present!"));
    System.out.println("max2ndSalary:::::::" + max2ndSalary);

    //    var employeeName =
    //        employees.stream()
    //            .filter(e -> e.getDeptno() != null && e.getDeptno().equals("D2"))
    //            .map(Employee::getName)
    //            .collect(Collectors.toList());
    //    System.out.println(employeeName);

    // TODO Print the sum of all employees salaries using streams - expected to
    // print 21000
    var empSum = employees.stream().map(Employee::getSalary).reduce(0, Integer::sum);
    System.out.println(empSum);
    // TODO Given a sentence find the word that has the highest length using
    // Streams. expected to print "Welcome"
    String input = " Welcome to Java world";
    var h = Arrays.stream(input.split(" ")).max(Comparator.comparingInt(String::length)).orElse("");
    System.out.println(h);

    // TODO Should print most repeated number from the array, using streams or Java
    // 7 features...
    // number 5 repeated most of the (3)times, Should print 5 and not 3
    int arr[] = {7, 5, 7, 7, 5, 5, 5};

    var ans =
        Arrays.stream(arr)
            .boxed()
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(0);
    System.out.println(ans);
    //        int mostRepeated = Arrays.stream(arr)
    //                // Step 2: Count the occurrences of each element
    //                .boxed()
    //                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
    //                // Step 3: Find the element with the maximum count
    //                .entrySet()
    //                .stream()
    //                .max(Map.Entry.comparingByValue())
    //                // Step 4: Retrieve the most repeated element
    //                .map(Map.Entry::getKey)
    //                .orElseThrow(() -> new IllegalArgumentException("Array is
    // empty"));
    //
    //        System.out.println("GGGGGGG " + mostRepeated);

    // TODO frequency of element more than 1
    List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
    Set<Integer> duplicated =
        numbers.stream()
            .filter(n -> Collections.frequency(numbers, n) > 1)
            .collect(Collectors.toSet());
    System.out.println(duplicated);

    // Optional example
    if (employees == null) {
      throw new RuntimeException();
    } else {
      processEmp(employees);
    }
    // number 5 repeated most of the (3)times, Should print 5 and not 3

    // TODO flatten a list and adding all the even values

    List<List<Integer>> listNumbers =
        List.of(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));

    System.out.println("FlattenList:::::::::");
    var sum =
        listNumbers.stream()
            .flatMap(Collection::stream)
            .filter(s -> s % 2 == 0)
            .reduce(0, Integer::sum);

    //        listNumbers.stream()
    //            .flatMap(Collection::stream)
    //            .filter(s -> s % 2 == 0)
    //            .map(s -> s + 1)
    //            .toList()
    //            .stream()
    //            .reduce(0, Integer::sum);
    System.out.println(sum);

    // TODO trying to update the value at particulat index <UnsupportedOperationException>
    /**
     * Arrays.asList() it wraps the original array with the List interface. Therefore, changes to
     * the array reflect on the list too: List.of creates a copy of the provided array and does not
     * allows null values.
     */
    List<String> words = Arrays.asList("hello", "world", "java");
    words.set(0, "Anirban");
    words.stream().map(String::toUpperCase).forEach(System.out::println);

    // TODO filter the list starting with vowel
    List<String> normalWords = Arrays.asList("apple", "banana", "cat", "egg", "orange");
    System.out.println("filter the list starting with vowel::::::::::::::;");
    normalWords.stream()
        .filter(s -> "aeiou".indexOf(s.charAt(0)) >= 0)
        .map(String::toUpperCase)
        .toList()
        .forEach(System.out::println);

    // TODO BIFUNCTION   <U> U reduce(U identity,
    //                 BiFunction<U, ? super T, U> accumulator,
    //                 BinaryOperator<U> combiner);

    List<User> users = Arrays.asList(new User("John", 30), new User("Julie", 35));
    int computedAges =
        users.stream()
            .reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
    /** without combiner */
    int age = users.stream().mapToInt(User::getAge).reduce(0, Integer::sum);
    System.out.println(computedAges + "::::::" + age);

    List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
    var result = ages.parallelStream().reduce(0, Integer::sum);
    System.out.println(result);
    /**
     * To put it simply, if we use sequential streams and the types of the accumulator arguments and
     * the types of its implementation match, we don’t need to use a combiner.
     */
    var result1 = ages.parallelStream().reduce(0, Integer::sum);
    System.out.println("%%%%%%%% " + result1);

    /** PARTITIONING BY IN COLLECTOR */
    List<Article> articles =
        Arrays.asList(
            new Article("Baeldung", true),
            new Article("Baeldung", false),
            new Article("Programming Daily", false),
            new Article("The Code", false));

    // TODO e’ll divide it into two groups, one containing only Baeldung articles and the second one
    // containing the rest:
    var baeldungList = articles.stream().filter(s -> "Baeldung".equals(s.getName())).toList();
    System.out.println(baeldungList);
    var baeldungList1 =
        //        articles.stream().collect(Collectors.groupingBy(a -> a.name)).entrySet().stream()
        //            .filter(s -> s.getKey().equals("Baeldung"))
        //            .toList();

        articles.stream()
            .collect(Collectors.groupingBy(a -> a.name, Collectors.toList()))
            .get("Baeldung");

    System.out.println("baeldungList1:::::: " + baeldungList1);

    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
    /** using for loop starting from end in reverse order.. */
    List<Integer> res = new ArrayList<>();

    for (int i = integerList.size() - 1; i >= 0; i--) {
      res.add(integerList.get(i));
    }
    System.out.println(res);

    /** using java 8 streams api */
    var res1 = integerList.stream().sorted(Collections.reverseOrder()).toList();
    //        IntStream.range(0, integerList.size())
    //            .mapToObj(i -> integerList.get(integerList.size() - 1 - i))
    //            .toList();
    System.out.println(res1);

    Map<String, String> idValueMap = new HashMap<>();
    idValueMap.put("Account1", "4000");
    idValueMap.put("Account2", "2000");
    idValueMap.put("Account3", "7000");
    idValueMap.put("Account4", "2000");

    // TODO print the account having highest trasactions

    var val =
        idValueMap.entrySet().stream()
            .max(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .map(Map.Entry::getKey)
            // .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("No such element found!!"));
    System.out.println(val);

    // TODO print the second highest tramsaction
    var val1 =
        idValueMap.entrySet().stream()
            .sorted(Map.Entry.<String, String>comparingByValue(Comparator.reverseOrder()))
            .map(Map.Entry::getKey)
            .skip(1)
            .findFirst()
            .orElse("No such element found");

    // TODO return a list in descending order
    var lop =
        idValueMap.entrySet().stream()
            .sorted(
                Map.Entry.<String, String>comparingByValue(Comparator.reverseOrder())
                    .thenComparing(
                        Map.Entry.<String, String>comparingByKey(Comparator.reverseOrder())))
            .toList();

    System.out.println(lop);
  }

  private void processEmp(List<Employee> employees) {}

  class Article {
    String name;
    boolean flag;

    public Article(String name, boolean flag) {
      this.name = name;
      this.flag = flag;
    }

    public String getName() {
      return name;
    }

    public boolean isFlag() {
      return flag;
    }

    @Override
    public String toString() {
      return "Article{" + "name='" + name + '\'' + ", flag=" + flag + '}';
    }
  }

  class User {
    String name;
    int age;

    public User(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }
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
}
