public class LinkeMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(6);
        System.out.println(list.indexOf(4));
        System.out.println(list.contains(7));
        //

        list.deletLast();
    }
}
