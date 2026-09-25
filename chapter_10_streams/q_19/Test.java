package q_19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

    public static void run1() {
        List<Integer> x = IntStream.range(1, 6)
            // return Stream<Integer>
            .mapToObj(i -> i)
            // return List<Integer>
            .collect(Collectors.toList());
        x.forEach(System.out::println);
    }

    public static void run2() {
        IntStream.range(1, 6)
            .forEach(System.out::println);
    }

    public static void run3() {
        IntStream.range(1, 6)
            // return Stream<Integer>
            .mapToObj(i -> i)
            .forEach(System.out::println);
    }

    public static void main(String[] args) {
        run1();
        System.out.println("********************");
        run2();
        System.out.println("********************");
        run3();
    } 
    
}
