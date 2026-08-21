package q_7;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Test {
    public void method() {
        x((var x) -> {}, (var x, var y) -> false);
    }

    public void x(Consumer<String> x, BinaryOperator<Boolean> y) {
        x.accept("Test");
        System.out.println(y.apply(false,false));
    }

    public static void main(String[] args) {
        new Test().method();
    }
}