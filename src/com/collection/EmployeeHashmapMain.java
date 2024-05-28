package com.collection;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashmapMain {

  public static void main(String[] args) {
    EmployeeHashMap employeeHashMap1 = new EmployeeHashMap(1, "Anirban", "Birati");
    EmployeeHashMap employeeHashMap2 = new EmployeeHashMap(1, "Anirban", "Kolkata");

    Map<EmployeeHashMap, String> hashMap = new HashMap<>();
    // normalHashmap.put(null,344);

    EmployeeHashMap employeeHashMap = new EmployeeHashMap(2, "Arka", "Birati");
    EmployeeHashMap employeeHashMap3 = employeeHashMap;
    EmployeeHashMap employeeHashMap4 = employeeHashMap3;

    //    //Map<EmployeeHashMap, Integer> employeeHashMapIntegerMap = new HashMap<>();
    //
    //    //
    //
    //    employeeHashMapIntegerMap.put(null, null);
    //
    //
    //    employeeHashMapIntegerMap.put(null, 1);
    //    employeeHashMapIntegerMap.put(employeeHashMap4, 3);
    //
    //    System.out.println(employeeHashMapIntegerMap);

    hashMap.put(employeeHashMap1, "CSE");
    hashMap.put(employeeHashMap2, "IT");

    hashMap.entrySet().forEach(e -> System.out.println(e.getValue()));

    // System.out.println(hashMap.get(employeeHashMap2));
  }
}
