public class TestCustomArray {

    public static void main(String[] args) {
        Array arr = new Array(3);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        arr.insert(6);
        arr.insert(7);
        arr.removeAt(2);
        arr.removeAt(3);
        arr.search(1);
        arr.print();
    }
}
