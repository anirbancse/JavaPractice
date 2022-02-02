package com.strings;

public class Prog5 {

    static void leftRotate(int arr[],int d){

        int n = arr.length;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }


    static void reverse(int arr[],int m ,int n){
        int temp;

        while(m<n){
            temp = arr[m];
            arr[m] = arr[n];
            arr[n] = temp;
            m++;
            n--;
        }
    }

    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        leftRotate(arr,2);
        print(arr);
    }
}
