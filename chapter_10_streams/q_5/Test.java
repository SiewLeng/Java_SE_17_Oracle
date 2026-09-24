package q_5;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Test {

    public static void run1() {
        double result = LongStream.of(6L, 8L, 10L)
            .mapToInt(x -> (int)x)
            .boxed()
            .collect(Collectors.groupingBy(x -> x))
            .keySet()
            .stream()
            .collect(Collectors.averagingInt(x -> x));
        
        System.out.println(result);
            
    }

    public static void run2() {
        double result = LongStream.of(6L, 8L, 10L)
            .mapToInt(x -> (int)x)
            .boxed()
            // return Map<int, Set<int>>
            .collect(Collectors.groupingBy(x -> x, Collectors.toSet())) 
            .keySet()
            .stream()
            .collect(Collectors.averagingInt(x -> x));
        
        System.out.println(result);
            
    }
    
    public static void main(String[] args) {
        run1();
        run2();
    }
}
