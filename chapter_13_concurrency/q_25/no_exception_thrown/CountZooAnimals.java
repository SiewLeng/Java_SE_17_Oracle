package q_25.no_exception_thrown;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CountZooAnimals {

    public static void performCount(int animal) {
        System.out.println("performCount: " + animal);
    }

    public static void printResults(Future<?> f) {
        try {
            System.out.println(f.get(1, TimeUnit.DAYS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.out.println("Exception!");
        }
    }

    public static void main(String[] args)  {
        final var r = new ArrayList<Future<?>>();
        ExecutorService s = Executors.newSingleThreadExecutor();
        try {
            for (int i = 0; i < 10; i++) {
                final int animal = i;
                Runnable task = () -> performCount(animal);
                r.add(s.submit(task));
            }
            r.forEach(f -> printResults(f));
        } finally {
            s.shutdown();
        }
    }
    
}
