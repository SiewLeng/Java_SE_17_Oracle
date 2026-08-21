package q_13;

import java.util.function.Supplier;

public class Test {
    public static void run() {
        int length = 3;
        for (int i = 0; i<3; i++) {
            if (i%2 == 0) {
                Supplier<Integer> supplier = () -> length; // A
                System.out.println(supplier.get());        // B
            } else {
                int j = i;
                Supplier<Integer> supplier = () -> j;      // C
                System.out.println(supplier.get());        // D
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
    
}
