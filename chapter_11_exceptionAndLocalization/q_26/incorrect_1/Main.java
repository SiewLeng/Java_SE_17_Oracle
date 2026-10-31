package q_26.incorrect_1;

import java.io.IOException;

public class Main {
    void rollOut() throws ClassCastException {}

    public void transform(String c) {
       try {
          rollOut();
       } catch (IllegalArgumentException | IOException a) {
       }
    }

    public static void main(String[] args) {
        new Main().transform("abc");
    }
    
}
