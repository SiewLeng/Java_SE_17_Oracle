package q_11.textbook;

import java.util.List;

public class Main {
    public static void run() {
        Integer i1 = List.of(1, 2, 3, 4, 5).stream().findAny().get();
        synchronized(i1) {
            Integer i2 = List.of(6, 7, 8, 9, 10)
                .parallelStream()
                .sorted()
                .findAny()
                .get();
            System.out.println(i1 + " " + i2);
        }
        
    }

    public static void main(String[] args) {
        run();
    }
    
}
