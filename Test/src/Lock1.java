import sun.security.provider.SHA;

import java.util.concurrent.locks.ReentrantLock;

 class SharedObject {
    //...

    ReentrantLock lock = new ReentrantLock();
    int counter = 0;

    public void perform() {
        lock.lock();
        try {
            // Critical section here
            System.out.println(counter++);
        } finally {
            lock.unlock();
        }
    }
    //...
}

public class Lock1{
    public static void main(String[] args) {

        SharedObject sh = new SharedObject();
        Runnable r1 = ()->{
            System.out.println(Thread.currentThread().getName());
        };
        Thread t1 = new Thread(r1,"MTHR");
        t1.start();
        sh.perform();

    }
}