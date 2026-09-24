package q_21;

import java.util.List;

public class Test {

    public static void run() {
        var spliterator = List.of("1", "2", "3", "4", "5", "6", "7", "8")
            .spliterator();
        spliterator.tryAdvance(System.out::println);

        var split = spliterator.trySplit();
        System.out.println("******************");
        split.tryAdvance(System.out::println);
        split.forEachRemaining(System.out::println);
        
        System.out.println("******************");
        spliterator.forEachRemaining(System.out::println);

    }

    public static void main(String[] args) {
        run();
    }
}