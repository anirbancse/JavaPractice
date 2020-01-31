import jdk.nashorn.internal.ir.Block;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerSolution {

    public static void main(String[] args) {
        //BlockingQueue<Integer> sharedQ = new LinkedBlockingQueue<Integer>();
        ArrayBlockingQueue<Integer> sharedQ = new ArrayBlockingQueue<Integer>(10);

        Producer p = new Producer(sharedQ);
        Consumer c = new Consumer(sharedQ);

        new Thread(p).start();
        new Thread(c).start();
    }
}

class Producer extends Thread {
    private BlockingQueue<Integer> sharedQueue;

    public Producer(BlockingQueue<Integer> aQueue) {
        super("PRODUCER");
        this.sharedQueue = aQueue;
    }

    public void run() {
        // no synchronization needed
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(getName() + " produced " + i);
                sharedQueue.put(i);
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Consumer extends Thread {
    private BlockingQueue<Integer> sharedQueue;

    public Consumer(BlockingQueue<Integer> aQueue) {
        super("CONSUMER");
        this.sharedQueue = aQueue;
    }

    public void run() {
        try {
            while (true) {
                Integer item = sharedQueue.take();
                System.out.println(getName() + " consumed " + item);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
