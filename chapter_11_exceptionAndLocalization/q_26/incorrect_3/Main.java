package q_26.incorrect_3;

public class Main {
    void rollOut() throws ClassCastException {}

    public void transform(String c) {
       try {
          rollOut();
       } catch (IllegalArgumentException | RuntimeException d) {
       }
    }

    public static void main(String[] args) {
        new Main().transform("abc");
    }
    
}
