package q_1.correct;

import java.io.IOException;

public class Test {

    public static void whatHappensNext1() throws IOException {
        System.out.println("it's ok");
    }

    public static void whatHappensNext2() throws IOException {
        // unchecked exception
        throw new IllegalArgumentException(); 
    }

    public static void whatHappensNext3() throws IOException {
        // checked exception
        throw new IOException(); 
    }

    public static void whatHappensNext4() throws IOException {
        // checked unexception
        throw new RuntimeException(); 
    }

    public static void main(String[] args) {
        try {
            whatHappensNext1();
        } catch (IOException | RuntimeException e) {
            System.out.println(e);
        }

        try {
            whatHappensNext2();
        } catch (IOException | RuntimeException e) {
            System.out.println(e);
        }

        try {
            whatHappensNext3();
        } catch (IOException | RuntimeException e) {
            System.out.println(e);
        }

        try {
            whatHappensNext4();
        } catch (IOException | RuntimeException e) {
            System.out.println(e);
        }
       
    }
}