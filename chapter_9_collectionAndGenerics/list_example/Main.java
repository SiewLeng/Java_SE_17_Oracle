package list_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void printIntegerList(List<Integer> input) {
        System.out.println(
            input.stream()
            .map(s -> s + "")
            .collect(Collectors.joining(" ")));
    }

     public static void run_1() {
        try {
            // Returns immutable list
            List<Integer> immutableList = List.copyOf(List.of(1, 2, 3, 4, 5));

            // result unsupportedOperationException
            // immutableList.set(0, immutableList.get(0) + 1);

            // result unsupportedOperationException
            // immutableList.add(6);

            // result unsupportedOperationException
            // immutableList.remove(1);

            printIntegerList(immutableList);
        } catch (Exception e) {
            System.out.println("run_1: " + e);
        }
       
    }

    public static void run_2() {
        try {
            // Returns immutable list
            List<Integer> immutableList = List.of(1, 2, 3, 4, 5);

            // result unsupportedOperationException
            // immutableList.set(0, immutableList.get(0) + 1);

            // result unsupportedOperationException
            // immutableList.add(6);

            // result unsupportedOperationException
            // immutableList.remove(1);

            printIntegerList(immutableList);
        } catch (Exception e) {
            System.out.println("run_1: " + e);
        }
       
    }

    public static void run_3() {
        try {
            // Returns fixed size list backed by an array
            List<Integer> mutableList = Arrays.asList(1, 2, 3, 4, 5);

            mutableList.set(0, mutableList.get(0) + 1); // [2, 2, 3, 4, 5]

            // result unsupportedOperationException
            // mutableList.add(6);

            // result unsupportedOperationException
            // mutableList.remove(1);

            printIntegerList(mutableList);
        } catch (Exception e) {
            System.out.println("run_2: " + e);
        }
       
    }

    public static void run_4() {
        try {
            List<Integer> mutableList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

            mutableList.set(0, mutableList.get(0) + 1); // [2, 2, 3, 4, 5]

            mutableList.add(6); // [2, 2, 3, 4, 5, 6]

            mutableList.remove(1); // [2, 3, 4, 5, 6]

            printIntegerList(mutableList);
        } catch (Exception e) {
            System.out.println("run_3: " + e);
        }
       
    }

    public static void main(String[]  args) {
        run_1();
        // run_2();
        // run_3();
        // run_4();
    }
}