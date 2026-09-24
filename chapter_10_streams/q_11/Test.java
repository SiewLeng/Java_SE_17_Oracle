package q_11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void run() {
        String result = Stream.iterate(1, x -> ++x)
            .limit(5)
            .map(x -> x + "")
            .collect(Collectors.joining());
        
        System.out.println(result);
    }

    public static void main(String[] args) {
        run();
    }
}
