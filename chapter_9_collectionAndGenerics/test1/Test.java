import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    static class Sparrow extends Bird { }
    static class Bird { }

    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<Bird>();
        birds.add(new Sparrow()); // DOES NOT COMPILE
        birds.add(new Bird());    // DOES NOT COMPILE

        List<? extends Number> list1 = List.of(1, 2, 3, 4, 5);
        List<? extends Number> list2 = Arrays.asList(1.3, 2, 3, 4, 5.0);
        list1.add(6); // DOES NOT COMPILE
        
    }
}