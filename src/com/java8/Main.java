/*
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum =0 , n = 10;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        String startIndex="",endIndex="";
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            sum = arr[i];
            for(int j=i+1;j<=n;j++){
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println(
                            "Sum found between indexes " + i
                                    + " and " + p);
                    return 1;
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }
        System.out.println(startIndex+" "+endIndex);

    }
}
*/
