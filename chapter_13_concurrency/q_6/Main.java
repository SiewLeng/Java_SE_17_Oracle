package q_6;

import java.util.List;

public class Main {

    public static void run_1() {
        var data = List.of(2, 5, 1, 9, 8);
        data.stream().parallel()
        .mapToInt(s -> s)
        .peek(System.out::print)
        .forEachOrdered(System.out::print);
    }

    public static void run_2() {
        var data = List.of(2, 5, 1, 9, 8);
        data.stream().parallel()
        .mapToInt(s -> s)
        .forEachOrdered(System.out::print);
    }

    public static void run_3() {
        var data = List.of(2, 5, 1, 9, 8);
        data.stream().parallel()
        .mapToInt(s -> s)
        .forEach(System.out::print);
    }

    public static void main(String[] args) {
        run_1();
        System.out.println("");
        run_2();
        System.out.println("");
        run_3();
        

    }
    
}
