package q_19;

import java.util.HashMap;

public class Test {

    public static void run() {
        var map = new HashMap<Integer, Integer>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        map.merge(1, 3, (a,b) -> a + b);
        map.merge(3, 4, (a,b) -> a + b);
        System.out.println(map);
    }

    public static void main(String[] args) {
        run();
    }
}
