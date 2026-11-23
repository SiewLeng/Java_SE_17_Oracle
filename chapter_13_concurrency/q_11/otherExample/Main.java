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
    
    public static void main(String[] args) {
        run_1();
        run_2();
        run_3();
    }
    
}
