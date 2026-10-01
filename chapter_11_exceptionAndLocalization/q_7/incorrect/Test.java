package q_7.correct;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {

    public void tryAgain(String s) {
        try (FileReader r = null; FileReader p = new FileReader("")) {
            System.out.print("X");
            throw new IllegalArgumentException();
        } catch (Exception s) {
            System.out.print("A");
            throw new FileNotFoundException();
        } finally {
            System.out.print("O");
        }
    }

    public static void main(String[] args) {
        new Test().tryAgain("Cat");
    }
}
