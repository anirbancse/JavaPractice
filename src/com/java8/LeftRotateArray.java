package com.java8;

// Java Program to Rotate Elements of the List

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LeftRotateArray {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here

        List<Integer> results = new ArrayList<>();
        int size = arr.size()-1;


        for(int i=0;i<d-1;i++){
            int temp = arr.get(size);
            for (int j = size; j >0; j--) {
                arr.set(j, arr.get(j - 1));
            }
            arr.set(0, temp);
        }

        return arr;


    }

    public static void main(String[] args) {
        // creating ArrayList
        List<Integer> my_list = new ArrayList<>();
        my_list.add(1);
        my_list.add(2);
        my_list.add(3);
        my_list.add(4);
        my_list.add(5);

        List<Integer> result =rotateLeft(2,my_list);
        System.out.println(result);

//        // Printing list before rotation
//        System.out.println(
//                "List Before Rotation : "
//                        + Arrays.toString(my_list.toArray()));
//
//        // Loop according to the number of rotations
//        for (int i = 0; i < 1; i++) {
//
//            // storing the last element in the list
//            int temp = my_list.get(size);
//
//            // traverse the list and move elements to right
//            for (int j = size; j > 0; j--) {
//                my_list.set(j, my_list.get(j - 1));
//            }
//            my_list.set(0, temp);
//        }
//
//        // Printing list after rotation
//        System.out.println(
//                "List After Rotation : "
//                        + Arrays.toString(my_list.toArray()));
//    }
    }
}

