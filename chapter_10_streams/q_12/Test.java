import java.util.Set;
import java.util.stream.Stream;

public class Test {

    public static void run() {
        Set<String> birds = Set.of("oriole", "flamingo");
        // Stream.concat(birds.stream(), birds.stream(), birds.stream())
        Stream.concat(birds.stream(), birds.stream())
            .sorted()
            .distinct()
            .findAny()
            .ifPresent(x -> System.out.println(x));

    }

    public static void main(String[] args) {
        run();
    }
    
}