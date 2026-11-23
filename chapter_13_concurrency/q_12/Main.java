package q_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    private final static Runnable takeNap = () -> {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    };

    public static void run() {
        ExecutorService service = Executors.newFixedThreadPool(4);
        try {
            service.execute(takeNap);
            service.execute(takeNap);
            service.execute(takeNap);
        } finally {
            service.shutdown();
        }
        try {
            // service.awaitTermination(2, TimeUnit.SECONDS);
            service.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
       
        System.out.println("Done");
        System.out.println("service.isTerminated(): " + service.isTerminated());
        System.out.println("service.isShutdown: " + service.isShutdown());
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        run();
        long durationNanos = System.nanoTime() - start;
        double durationSeconds = durationNanos / 1_000_000_000.0;
        System.out.println("duration in s: " + durationSeconds);
    }

    public Runnable getTakeNap() {
        return takeNap;
    }
    
}
