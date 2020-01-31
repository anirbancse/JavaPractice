import java.util.Arrays;

interface IA{

}

interface IB{

}

class B implements IB,IA{

}

class A extends B implements  IA{

}

public class Test3  {

    public static void main(String[] args) throws InterruptedException {

        IA a = new B();
        IA a1 = new A();

        int arr[] = new int[3];
        System.out.println(Arrays.toString(arr));

        Runnable r2 = () -> System.out.println("Hello from "
                + Thread.currentThread().getName());

        Thread t1 = new Thread(r2, "Thread t1");
        t1.start();
        t1.notify();
       // t1.join(); //makes sure that t1 completes


        Thread t2 = new Thread(r2,"Thread t2");
        t2.join();
        t2.start();

        Thread t3 = new Thread(r2,"Thread t3");
        t3.start();


        //A b = new B();
        B b1 = new A();
        StringBuilder sb = new StringBuilder("abc");
        sb.append("pqr");

        System.out.println(" "+sb);
    }


}