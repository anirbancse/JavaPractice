package com.leetcode;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 4};

        System.out.println(remove_duplicate(arr, arr.length));
    }

    static int remove_duplicate(int A[], int N) {
        // code here
        int temp = -1, index = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] == temp)
                temp = A[i];
            else {
                A[index] = A[i];
                index++;
                temp = A[i];
            }
        }

        return index;
    }
}
