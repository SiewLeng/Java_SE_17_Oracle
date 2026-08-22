package q_16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public void remove(List<Character> chars) {
        char end = 'z';
        // char start = 'a';
        // char c = 'x';
        // chars = null;
        // end = '1';
        Predicate<Character> predicate = c -> {
            char start = 'a'; return start <= c && c <= end; 
        };
    }

    public static void main(String[] args) {
        new Test().remove(new ArrayList<>(List.of('a', 'b', 'c')));
    }
}

