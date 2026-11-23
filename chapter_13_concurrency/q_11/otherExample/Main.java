package q_11.otherExample;

import java.util.List;

public class Main {

    public static void run_1() {
        System.out.println(List.of(1,2,3,4,5,6,7,8,9,10)
        .parallelStream()
        .findAny()
        .get());
    }

    public static void run_2() {
        System.out.println(List.of(1,2,3,4,5,6,7,8,9,10)
        .parallelStream()
        .findFirst()
        .get());
    }

     public static void run_3() {
        System.out.println(List.of(1,2,3,4,5,6,7,8,9,10)
        .parallelStream()
        .limit(5)
        .skip(3)
        .findFirst()
        .get());
    }

    public static void run_4() {
       List.of(10, 4, 11, 7)
        .parallelStream()
        .sorted()
        .peek(i -> System.out.println("sorted->peek: " + i + " on " + Thread.currentThread().getName()))
        .forEach((i) -> System.out.println("peak->forEach: " + i + " on " + Thread.currentThread().getName()));
    }

    public static void run_5() {
        System.out.println("");
        List.of(10, 4, 11, 7)
        .parallelStream()
        .sorted()
        .peek(i -> System.out.println("sorted->peek: " + i + " on " + Thread.currentThread().getName()))
        .forEachOrdered((i) -> System.out.println("peak->forEachOrdered: " + i + " on " + Thread.currentThread().getName()));
    }
    
    public static void main(String[] args) {
        /* 
        run_1();
        run_2();
        run_3();
        */
        run_4();
        /* 
        run_5();
        */
    }
    
}
