package com.java8;

public class TripletJava {

    public static void main(String[] args) {

        int arr [] = {3,2,4,6,5},len=arr.length;
        double num,sum;

        double check = Math.pow(arr[len-1],2);

        for(int i=0;i<len-1;i++){
            num = Math.pow(arr[i],2);
            sum=0;
            for(int j=i+1;j<len-1;j++) {
                sum = num + Math.pow(arr[j], 2);
                if (sum == check) {
                    System.out.println("Find the triplets...");
                   return;
                }
            }

        }
    }
}
