package q_1;

import java.util.ArrayList;

public class Main {
    public static void run() {
        var c = new ArrayList<Thread>();
        var s = c.stream();
        var stream_1 = c.parallelStream();
        var stream_2 = s.parallel();
    }

    public static void main(String[] args)  {
        run();
    }
    
}
