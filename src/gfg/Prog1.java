package gfg;

import java.util.Arrays;

public class Prog1 {

  static int getMinDiff(int[] arr, int n, int k) {
    // code here
    Arrays.sort(arr);
    int mini = arr[0] + k;
    int maxim = arr[n - 1] - k;
    int ans = arr[n - 1] - arr[0];

    int mi = 0, ma = 0;

    for (int i = 1; i < n; i++) {
      if (arr[i] - k < 0) continue;

      mi = Math.min(arr[i] - k, mini);
      ma = Math.max(arr[i - 1] + k, maxim);
      ans = Math.min(ans, ma - mi);
    }
    return ans;
  }

  public static void main(String[] args) {
    int arr[] = {3, 9, 12, 16, 20};

    System.out.println(Prog1.getMinDiff(arr, 5, 3));
  }
  //
}
