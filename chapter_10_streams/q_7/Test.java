package q_7;

import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static List<String> sort(List<String> list) {
        return list.stream()
                .sorted((a, b)  -> b.compareTo(a))
                .collect(Collectors.toList());    
    }

    public static void main(String[]  args) {
        List<String> list = List.of("apple", "orange", "banana");
        for (var item : sort(list)) {
            System.out.print(item + " ");
        }
    }
    
}
