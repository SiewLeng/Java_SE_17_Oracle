package q_5.correct;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class Main {
    public static void run() {
        var value1 = new AtomicLong(0);
        final List<Integer> list = Arrays.asList(0);
        final List<Integer> sList = Collections.synchronizedList(Arrays.asList(0));

        IntStream.iterate(1, i -> 1).limit(100).parallel()
            .forEach(i -> value1.incrementAndGet());
        IntStream.iterate(1, i -> 1).limit(100).parallel()
            .forEach(i -> {
                synchronized(list) {
                    list.set(0, list.get(0) + 1);
                }
            });
        IntStream.iterate(1, i -> 1).limit(100).parallel()
            .forEach(i -> sList.set(0, sList.get(0) + 1));
        System.out.println(value1+" " + list.get(0) + " " + sList.get(0));
    }

    public static void main(String[] args) {
        run();
    }
    
}