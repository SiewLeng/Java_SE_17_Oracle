package q_10.no_exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void run() {
        List<Integer> lions = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> tigers = new CopyOnWriteArrayList<>(lions);
        Set<Integer> bears = new ConcurrentSkipListSet<>();
        bears.addAll(lions);
        for(Integer item:tigers) {
            System.out.print(item);
            tigers.add(4);
        }

        System.out.println();

        for(Integer item:bears) {
            System.out.print(item);
            bears.add(5);
        }

        System.out.println();

        System.out.println(lions.size() + " " + tigers.size()
            + " " + bears.size());
    }

    public static void main(String[] args) {
        run();
    }
}