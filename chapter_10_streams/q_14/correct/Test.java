package q_14.correct;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public static void run() {
        Stream<Integer> s = Stream.of(1);
        // IntStream is = s.mapToInt(x -> x);
        DoubleStream ds = s.mapToDouble(x -> x);
        IntStream s2 = ds.mapToInt(x -> (int)x);
        s2.forEach(System.out::print);
    }

    public static void main(String[] args) {
        run();
    }
}
