package q_22.multi_thread.example_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.ReentrantLock;

public class BedTime {
    private AtomicInteger s1 = new AtomicInteger(0);
    private int s2 = 0;
    private final ReentrantLock lock = new ReentrantLock();

    private void countSheep() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        try {
            for (int i = 0; i < 100; i++) {
                service.execute(() -> {
                    s1.getAndIncrement();
                    try {
                        lock.lock();
                        s2++;
                    } finally {
                        lock.unlock();
                    }
                });
            } 
            Thread.sleep(6*1000);
            System.out.println(s1 + " " + s2);
        } finally {
            service.shutdown();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        new BedTime().countSheep();
       
    }
}
