package q_6;

import java.util.List;

public class Main {

    public static void run() {
        var data = List.of(2, 5, 1, 9, 8);
        data.stream().parallel()
        .mapToInt(s -> s)
        .peek(System.out::print)
        .forEachOrdered(System.out::print);
    }

    public static void main(String[] args) {
        run();
    }
    
}
