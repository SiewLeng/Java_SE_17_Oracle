package q_18;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
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

        BiFunction<String, String, String> before1 = (x1, y1) -> x1 + " " + y1;
        Function<String, String> after1 = x1 -> x1 + " " + x1;
        BiFunction<String, String, String> y1 = before1.andThen(after1);
        System.out.println(y1.apply("c", "d"));
        
        Function<String, String> before2 = x1 -> x1 + " " + x1;
        Function<String, String> after2 = x1 -> x1 + "," + x1;
        Function<String, String> y2 = after2.compose(before2);
        System.out.println(y2.apply("e"));

        Function<String, String> y3 = before2.andThen(after2);
        System.out.println(y3.apply("e"));
        
        UnaryOperator<String> z = a -> a + a;
        System.out.println(z.apply("f"));
    }

    public static void main(String[] args) {
        new Test().run();
    }
}
