package q_13.incorrect;

import java.util.List;
import java.util.stream.Stream;

public class Test {
    
    public static void run1() {
        List<Integer> x1 = List.of(1, 2, 3);
        List<Integer> x2 = List.of(4, 5, 6);
        List<Integer> x3 = List.of();
        Stream.of(x1, x2, x3)
            .map(x -> x + 1)
            .flatMap(x -> x.stream())
            .forEach(System.out::println);
    }
    public static void main(String[] args) {
        run();
    }
    
}
