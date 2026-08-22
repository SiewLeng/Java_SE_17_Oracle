package q_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// refer q_16 which is related to this question

public class Test {
    public void remove(List<Character> chars) {
        char end = 'z';
        Predicate<Character> predicate = c -> {
            char start = 'a'; return start <= c && c <= end; 
        };
        // char start = 'a';
        // char c = 'x';
        // chars = null;
        // end = '1';
    }

    public static void main(String[] args) {
        new Test().remove(new ArrayList<>(List.of('a', 'b', 'c')));
    }
}
