import java.util.NoSuchElementException;

public class LinkedList {

    public class Node {

        public Node(int data) {
            this.data = data;
        }

        public int data;
        public Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

        public Node head ;
    public Node last ;

    public void addFirst(int data){

        Node newNode = new Node(data);
        if(isEmpty()){
            head=last=newNode;
        } else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head=last=newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
    }

    public int indexOf(int value){

        int flag = 0;
        Node current = head;

        while(current!=null) {
            if (current.data == value) {
                return flag;
            }
            current = current.next;
            flag++;
        }
        return -1;
    }

    public boolean contains(int value){
        int count =0;
        Node current = head;

        while (current!=null){
            if(current.data==value){
                return true;
            }
            current = current.next;
            count++;
        }
        return false;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void deleteFirst(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(head==last)
        {
            head=last=null;
            return;
        }

        Node n = head.next;
        head.next = null;
        head = n;
    }

    public void deletLast(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(head==last)
        {
            head=last=null;
            return;
        }

        Node prevNode = prevNode(last);
        prevNode.next = null;
        last = prevNode;
    }

    public Node prevNode(Node last){
        Node current = head;
        while(current!=null){
            if(current.next==last )
                return current;
            current = current.next;
        }
        return null;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", last=" + last +
                '}';
    }
}
