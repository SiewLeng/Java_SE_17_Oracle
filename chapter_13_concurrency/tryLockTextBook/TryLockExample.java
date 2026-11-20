package tryLockTextBook;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {
    private final static Lock lock = new ReentrantLock();

    public static void printHello() {
        try {
            lock.lock();
            System.out.println("Hello: " + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }

    public static void run() throws InterruptedException {
        new Thread(() -> printHello(), "myThread").start();
        if (lock.tryLock()) {
            try {
                System.out.println("Lock obtained, entering protected code: " + Thread.currentThread().getName());
            } finally {
                lock.unlock();
            }
        } else {
             System.out.println("Unable to acquire lock, doing something else");
        }

    }

    public static void main(String[] args) {
        try {
            run();
        } catch (InterruptedException e) {
            System.out.println("Interruption Exception thrown");
        }
        
    }

    
}
