package q_18;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Test {
    public void run() {
        Supplier<String> x = String::new;
        System.out.println(x.get());

        BiConsumer<String, String> m = (x1, y1) -> System.out.println(x1 + y1);
        BiConsumer<String, String> n = (x1, y1) -> System.out.println(x1 + y1);
        BiConsumer<String, String> y = m.andThen(n);
        y.accept("a", "b");
        
        UnaryOperator<String> z = a -> a + a;
        System.out.println(z.apply("a"));
    }

    public static void main(String[] args) {
        new Test().run();
    }
}
