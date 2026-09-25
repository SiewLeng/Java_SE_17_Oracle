package q_16;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void run1() {
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        var result = Stream.generate(() -> "")
            .limit(10)
            .filter(notEmpty)
            // return Map<String, List<String>>
            .collect(Collectors.groupingBy(k -> k))
            // return Set<Entry<String, List<String>>>
            .entrySet()
            // return Stream<Entry<String, List<String>>>
            .stream()
            // return Stream<List<String>>>
            .map(Entry::getValue)
            // return Stream<String>>
            .flatMap(Collection::stream)
            // return Map<Boolean, List<String>>
            .collect(Collectors.partitioningBy(notEmpty));
        System.out.println(result);
    }

    public static void run2() {
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        var result = Stream.of("", "1", "2", "3")
            .limit(10)
            .filter(notEmpty)
            // return Map<String, List<String>>
            .collect(Collectors.groupingBy(k -> k))
            // return Set<Entry<String, List<String>>>
            .entrySet()
            // return Stream<Entry<String, List<String>>>
            .stream()
            // return Stream<List<String>>>
            .map(Entry::getValue)
            // return Stream<String>>
            .flatMap(Collection::stream)
            // return Map<Boolean, List<Stream>>
            .collect(Collectors.partitioningBy(notEmpty));
        System.out.println(result);
    }

    public static void run3() {
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        var result = Stream.generate(() -> "")
            .limit(10)
            .filter(notEmpty)
            // return Map<String, List<String>>
            .collect(Collectors.groupingBy(k -> k))
            // return Set<Entry<String, List<String>>>
            .entrySet()
            // return Stream<Entry<String, List<String>>>
            .stream()
            // return Stream<List<String>>>
            .map(Entry::getValue)
            // return Stream<String>>
            .flatMap(Collection::stream)
            // return Map<String, List<String>>
            .collect(Collectors.groupingBy(n -> n));
        System.out.println(result);
    }

    public static void run4() {
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        var result = Stream.of("", "1", "2", "3")
            .limit(10)
            .filter(notEmpty)
            // return Map<String, List<String>>
            .collect(Collectors.groupingBy(k -> k))
            // return Set<Entry<String, List<String>>>
            .entrySet()
            // return Stream<Entry<String, List<String>>>
            .stream()
            // return Stream<List<String>>>
            .map(Entry::getValue)
            // return Stream<String>>
            .flatMap(Collection::stream)
            // return Map<String, List<String>>
            .collect(Collectors.groupingBy(n -> n));
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        run1();
        System.out.println("*****************");
        run2();
        System.out.println("*****************");
        run3();
        System.out.println("*****************");
        run4();
    }
}
