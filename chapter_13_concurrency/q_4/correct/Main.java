package q_4.correct;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void run() throws InterruptedException, ExecutionException {
        ScheduledExecutorService service =   // w1
            Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(() -> {
            System.out.println("Open Zoo");
        }, 0, 1, TimeUnit.MINUTES);

        var result = service.submit(() ->   // w3
            System.out.println("Wake Staff"));
        System.out.println(result.get());   // w4
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        run();
    }
    
}
