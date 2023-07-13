package com.leetcode;

import java.util.PriorityQueue;
import java.util.Vector;

public class KLargestElement {
    public static Vector<Integer> kLargest(int[] arr, int k) {

        // Create a max heap using priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            // compare the root of the max-heap with the current element
            if (pq.peek() < arr[i]) {
                pq.poll(); // remove the root if it's smaller than current element
                pq.add(arr[i]); // add current element to heap
            }
        }
        // create a vector to store k largest elements
        Vector<Integer> res = new Vector<>();
        for (int i = 0; i < k; i++) {
            res.add(pq.poll()); // remove the k largest elements from heap and add to vector
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        Vector<Integer> res = kLargest(arr, k);
        System.out.print("K largest elements are: ");
        System.out.println(res);
    }
}
