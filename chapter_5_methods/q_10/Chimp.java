package q_10;

import q_10.rope.*;
import static q_10.rope.Rope.*;

public class Chimp {
    public static void test() {
        System.out.println("----test-----");
        swing();
        System.out.println(LENGTH);
    }

    public static void main(String[] args) {
        Rope.swing();
        new Rope().swing();
        System.out.println(LENGTH);
        test();
    } 
}