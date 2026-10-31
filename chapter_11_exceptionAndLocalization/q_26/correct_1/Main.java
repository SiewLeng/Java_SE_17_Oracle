package q_26.correct_1;

public class Main {
    void rollOut() throws ClassCastException {}

    public void transform(String c) {
       try {
          rollOut();
       } catch (IllegalArgumentException | Error b) {
       }
    }

    public static void main(String[] args) {
        new Main().transform("abc");
    }
    
}
