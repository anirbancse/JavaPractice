package gfg;

public class BinarySearchProg {

  static int search(int arr[], int l, int r, int elem) {

    while (l <= r) {
      int mid = (l + r) / 2;
      // best case scenario
      if (arr[mid] == elem) {
        return mid;
      } else if (arr[mid] < elem) {
        l = mid + 1;
      } else {
        r = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = {2, 3, 4, 10, 40};
    int elem = 10, r = arr.length - 1;
    System.out.println(search(arr, 0, r, elem));
    //
  }
}
