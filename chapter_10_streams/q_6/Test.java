package q_6;

import java.util.stream.Stream;

public class Test {

    public static void run1() {
        var s = Stream.generate(() -> "meow");
        var match = s.allMatch(String::isEmpty);
        System.out.println(match);
    }

    public static void run2() {
        var s = Stream.generate(() -> "meow");
        var match = s.anyMatch(String::isEmpty);
        System.out.println(match);
    }

    public static void run3() {
        var s = Stream.generate(() -> "meow");
        var match = s.findAny();
        System.out.println(match);
    }

     public static void run4() {
        var s = Stream.generate(() -> "meow");
        var match = s.findFirst();
        System.out.println(match);
    }

    public static void run5() {
        var s = Stream.generate(() -> "meow");
        var match = s.noneMatch(String::isEmpty);
        System.out.println(match);
    }

    public static void main(String[] args) {
        // run1();
        run5();
    }
    

}
