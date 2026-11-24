package q_14.deadlocked;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DeadlockDemo {

    public static void run() throws ExecutionException, InterruptedException {
        Object o1 = new Object();
        Object o2 = new Object();

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<?> f1 = service.submit(() -> {
            synchronized(o1) {
                synchronized(o2) { System.out.print("Tortoise"); }
            }
        });
        Future<?> f2 = service.submit(() -> {
            synchronized(o2) {
                synchronized(o1) { System.out.print("Hare"); }
            }
        });
        f1.get();
        f2.get();
    }

    public static void main(String[] args) {
        try {
            run();
        } catch (ExecutionException | InterruptedException e) {
        }
    }
    
}
