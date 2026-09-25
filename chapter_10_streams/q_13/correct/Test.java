package q_13.correct;

import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void run1() {
        List<Integer> x1 = List.of(1, 2, 3);
        List<Integer> x2 = List.of(4, 5, 6);
        List<Integer> x3 = List.of();
        Stream.of(x1, x2, x3)
            .flatMap(x -> x.stream())
            .map(x -> x + "")
            .forEach(System.out::println);
    }

     public static void run2() {
        List<Integer> x1 = List.of(1, 2, 3);
        List<Integer> x2 = List.of(4, 5, 6);
        List<Integer> x3 = List.of(7, 8, 9);
        List<Integer> x4 = List.of(10, 11, 12);
        List<List<Integer>> x5 = List.of(x1, x2);
        List<List<Integer>> x6 = List.of(x3, x4);
        Stream.of(x5, x6)
            .flatMap(x -> x.stream())
            .flatMap(x -> x.stream())
            .map(x -> x + "")
            .forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        run1();
        System.out.println("************************");
        run2();
    }
    
}
