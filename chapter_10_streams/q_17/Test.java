package q_17;

import java.util.stream.DoubleStream;

public class Test {

    public static void run() {
        var s = DoubleStream.of(1.2, 2.4);
        var count = s.peek(System.out::println).filter(x -> x > 2).count();
        System.out.println("count: " + count);
    }

    public static void main(String[] args) {
        run();
    }
}
