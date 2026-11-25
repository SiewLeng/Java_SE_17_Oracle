package q_20.correct;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class PrintCounter {
       static int count = 0;
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            List<Future<?>> r = new ArrayList<>();
            IntStream.iterate(0, i -> i + 1).limit(5).forEach(
                i -> r.add(service.submit(() -> {count++;}))
            );
            for (Future<?> result:r) {
                System.out.print(result.get() + " ");
            }
        } finally {
            service.shutdown();
        }
    }
}
