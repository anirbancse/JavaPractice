import java.util.ArrayList;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("I am Anirban");
        BlockingQueue b = new BlockingQueue(5);


        try{
            b.enqueue("Anir");
            b.enqueue("Anir");
            b.enqueue("Anir");
            b.enqueue("Anir");
            b.enqueue("Anir");
            b.enqueue("Anir");

            b.show();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
