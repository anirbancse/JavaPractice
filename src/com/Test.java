package com;

class Node {

  int root;
  Node leftNode;
  Node rightNode;

  public Node(int root, Node leftNode, Node rightNode) {
    this.root = root;
    this.leftNode = leftNode;
    this.rightNode = rightNode;
  }
}

public class Test {

  static int sortArray(int arr[], int num) {
    int index = -1;
    int n = arr.length;
    int p = n/2;
    int q = 0;


    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) {
        index = i;
        break;
      }
    }

    return index;
  }

  public static void main(String[] args) {
    // root Node ---> 1

    // sorted array of int
    int arr[] = {1, 3, 4, 6, 6, 6, 7};
    System.out.println(sortArray(arr, 6));
  }
}
