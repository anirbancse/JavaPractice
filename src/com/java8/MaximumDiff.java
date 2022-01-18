package com.java8;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int arr[]) {
        elements = arr;
    }

    // Add your code here
    public void computeDifference() {
        int elem,currentDifference=0;
        maximumDifference = 0;
        Arrays.sort(elements);
        for(int i=0;i<elements.length;i++){
            elem = elements[i];
            for(int j=i+1;j<elements.length;j++){
                currentDifference = elements[j] - elem;
                if(maximumDifference<currentDifference){
                    maximumDifference = currentDifference;
                }
            }
        }
    }


} // End of Difference class

public class MaximumDiff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
