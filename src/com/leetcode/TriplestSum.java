package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TriplestSum {

    public static List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> answer = new ArrayList<>();
        //List <Integer> lists = new ArrayList<>();
        int n= nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        answer.add(List.of(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int nums[] = {0, -1, 2, -3, 1};
        System.out.println(threeSum(nums));

    }
}
