package q_21;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void printList(List<Integer> list) {
        for (Integer item: list) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }

    public static void run_1() {
        var data = List.of(List.of(1, 2),
            List.of(3, 4),
            List.of(5, 6)
        );
        Stream<List<Integer>> result1 = data.stream(); 
        // similar to Stream.of(List.of(1, 2),
        //     List.of(3, 4),
        //     List.of(5, 6))

        Stream<Integer> result2 = result1.flatMap(s -> {
                printList(s);
                return s.stream();
                // return Stream.of(1, 2) or
                // Stream.of(3, 4) or
                // Stream.of(5, 6)
            });
        result2.findFirst().ifPresent(System.out::print);
    }

    public static void run_2() {
        var data = List.of(List.of(1, 2),
            List.of(3, 4),
            List.of(5, 6)
        );
        Stream<List<Integer>> result1 = data.parallelStream(); 
        // similar to Stream.of(List.of(1, 2),
        //     List.of(3, 4),
        //     List.of(5, 6))

        Stream<Integer> result2 = result1.flatMap(s -> {
                printList(s);
                return s.stream();
                // return Stream.of(1, 2) or
                // Stream.of(3, 4) or
                // Stream.of(5, 6)
            });
        result2.findFirst().ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        run_1();
        System.out.println("\n-----------------");
        run_2();
    }
    
}
