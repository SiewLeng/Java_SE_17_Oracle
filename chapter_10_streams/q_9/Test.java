package q_9;

import java.util.stream.LongStream;

public class Test {

    public static void run() {
        var stream = LongStream.of(1, 2, 3);
        var opt = stream.map(n -> n * 10)
            .filter(n -> n < 5).findFirst();
        
        if (opt.isPresent()) {
            System.out.println(opt.getAsLong());
        }

        opt.ifPresent((s) -> System.out.println(s));
    }

    public static void main(String[] args) {
        run();
    }
}
