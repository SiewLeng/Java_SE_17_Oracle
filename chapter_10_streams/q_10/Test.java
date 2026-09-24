package q_10;

import java.util.stream.Stream;

public class Test {

     public static void run3() {
        Stream.generate(() -> "1")
            .limit(10)
            .peek(System.out::println);
    }

    public static void run2() {
        Stream.generate(() -> "1")
            .limit(10)
            .peek(System.out::println)
            .count();   
        }

    public static void run1() {
        Stream.generate(() -> "1")
            .limit(10)
            .forEach(System.out::println);
    }

    public static void main(String[] args) {
        run1();
        System.out.println("******************");
        run2();
        System.out.println("******************");
        run3();
    }
    
}
