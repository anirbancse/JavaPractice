import java.util.*;

public class BlockingQueue {

    private ArrayList  queue = new ArrayList();
    private int limit = 10;

    public BlockingQueue(int limit)
    {
        this.limit = limit;
    }

    public synchronized void enqueue(Object item)
            throws InterruptedException
    {
        while (this.queue.size() == this.limit) {
            System.out.println("While"+this.queue.size());
            wait(2000);
        }
        if (this.queue.size() == 0) {
            System.out.println("Inside IF");
            notify();
        }
        System.out.println("adding...");
        this.queue.add((String)item);
    }

    public synchronized Object dequeue()
            throws InterruptedException
    {
        while (this.queue.size() == 0) {
            wait(2000);
        }
        if (this.queue.size() == this.limit) {
            notify();
        }

        return this.queue.remove(0);
    }

    public void show(){
        for(int i=0;i<queue.size();i++){
            System.out.print(" "+queue.get(i));
        }
    }
} 