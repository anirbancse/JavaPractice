package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ProgArray {

  static int inversionCount(int arr[], int n) {
    // Your Code Here

    var x = mergeSort(arr, 0, n - 1);

    return x;
  }

  private static int merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>(); // temporary array
    int left = low; // starting index of left half of arr
    int right = mid + 1; // starting index of right half of arr
    int count = 0;
    // storing elements in the temporary array in a sorted manner//

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        count += (mid - left) + 1;
        right++;
      }
    }

    // if elements on the left half are still left //

    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    //  if elements on the right half are still left //
    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }

    // transfering all elements from temporary to arr //
    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
    return count;
  }

  public static int mergeSort(int[] arr, int low, int high) {
    int cnt = 0;

    if (low >= high) return cnt;
    int mid = (low + high) / 2;
    cnt += mergeSort(arr, low, mid); // left half
    cnt += mergeSort(arr, mid + 1, high); // right half
    cnt += merge(arr, low, mid, high); // merging sorted halves
    return cnt;
  }

  public static void main(String[] args) {

    List<List<Integer>> lists = new ArrayList<>();

    int arr[] = {9, 4, 7, 6, 3, 1, 5};
    System.out.println("------------> " + inversionCount(arr, 5));

    //    lists.add(Arrays.asList(1, 2, 3));
    //    lists.add(Arrays.asList(1, 2, 3));
    //
    //    lists.stream()
    //        .flatMap(Collection::stream)
    //        .filter(f -> f % 2 == 0)
    //        .map(e -> e * 2)
    //        .collect(Collectors.toList())
    //        .forEach(System.out::println);
    //
    //    int sum = lists.stream().flatMap(Collection::stream).mapToInt(Integer::intValue).sum();
    //
    //    System.out.println(sum);
  }
}
