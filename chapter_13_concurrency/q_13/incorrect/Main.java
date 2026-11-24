package q_13.incorrect;

import java.util.List;

public class Main {

    public static void run() {
        System.out.print(List.of("duck","flamingo","pelican")
        .parallelStream().parallel()
        .reduce(0,
            (c1, c2) -> c1.length() + c2.length(),
            (s1, s2) -> s1 + s2)
        );
    }

    public static void main(String[] args) {
        run();
    }
    
}
