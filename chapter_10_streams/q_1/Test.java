package q_1;

import java.util.stream.Stream;

public class Test {
    public static void run2() {
        var stream = Stream.iterate("", (s) -> s + "1");
        stream.limit(2).map(x -> x + "2").forEach(System.out::println);
    }

    public static void run1() {
        var stream = Stream.iterate("", (s) -> s + "1");
        Stream<String> result = stream.limit(2).map(x -> x + "2");
        System.out.println(result);
    }


    public static void main(String[] args) {
        run1();
        run2();
    }
}
