package q_3;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {

    public static void run() {
        Predicate<String> predicate = s -> s.length() > 3;
        var stream = Stream.iterate("-", s -> !s.isEmpty(), (s) -> s + s);
        var b1 = stream.noneMatch(predicate);
        System.out.println("b1" + b1);

        var b2 = stream.anyMatch(predicate);
        System.out.println("b2" + b2);

    }

    public static void main(String[] args) {
        run();
    }
}
