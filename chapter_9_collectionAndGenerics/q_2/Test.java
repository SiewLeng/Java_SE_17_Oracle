package q_2;

import java.util.List;

public class Test {
    public static void run() {
    List<?> q = List.of("mouse", "parrot");
        var v = List.of("mouse", "parrot");
        q.removeIf(String::isEmpty);
        q.removeIf(s -> s.length() == 4);
        v.removeIf(String::isEmpty);
        v.removeIf(s -> s.length() == 4); 
    }
    public static void main(String[] args) {
        run();
    }
}
