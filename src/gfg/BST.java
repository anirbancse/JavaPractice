package gfg;

public class BST {

  public static void main(String[] args) {
    //

  }

  class Node {
    public int data;
    Node left;
    Node right;

    public Node(int item) {
      data = item;
      left = right = null;
    }

    public Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }

    public int getData() {
      return data;
    }

    public void setData(int data) {
      this.data = data;
    }

    public Node getLeft() {
      return left;
    }

    public void setLeft(Node left) {
      this.left = left;
    }

    public Node getRight() {
      return right;
    }

    public void setRight(Node right) {
      this.right = right;
    }

    @Override
    public String toString() {
      return "Node{" + "data=" + data + ", left=" + left + ", right=" + right + '}';
    }
  }
}
