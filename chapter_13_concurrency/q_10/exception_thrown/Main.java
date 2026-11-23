package q_10.exception_thrown;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void run() {
        List<Integer> lions = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> tigers = new ArrayList<>(lions);
        Set<Integer> bears = new HashSet<>();
        bears.addAll(lions);
        try {
            for(Integer item:tigers) {
                System.out.println(item);
                tigers.add(4);
            }
        } catch (Exception e) {
            System.out.println("Tigers exception: " + e);
        }
       
        try {
            for(Integer item:bears) {
                System.out.println(item);
                bears.add(5);
            }
        } catch (Exception e) {
            System.out.println("Bears exception: " + e);
        }

        System.out.println(lions.size() + " " + tigers.size()
            + " " + bears.size());
    }

    public static void main(String[] args) {
        run();
    }
}
