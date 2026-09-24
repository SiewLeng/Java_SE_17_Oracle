package q_2;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public void run() {
        Predicate<String> predicate = s -> s.startsWith("g");
        Stream<String> stream1 = Stream.generate(() -> "growls!");
        boolean b1 = stream1.anyMatch(predicate);
        System.out.println("b1: " + b1);

        Stream<String> stream2 = Stream.generate(() -> "growls!");
        boolean b2 = stream2.allMatch(predicate);
        System.out.println("b2: " + b2);

    }
   
    public static void main(String[] args) {
        new Test().run();
    }
}
