package com.collection;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashmapMain {

    public static void main(String[] args) {
        EmployeeHashMap employeeHashMap1 = new EmployeeHashMap(1, "Anirban","Kolkata");
        EmployeeHashMap employeeHashMap2 = new EmployeeHashMap(1, "Anirban","Kolkata");

        Map<EmployeeHashMap, String> hashMap = new HashMap<>();
        //normalHashmap.put(null,344);


        hashMap.put(employeeHashMap1, "CSE");
        hashMap.put(employeeHashMap2, "IT");

        hashMap.entrySet().forEach(e-> System.out.println(e.getValue()));

        //System.out.println(hashMap.get(employeeHashMap2));
    }
}