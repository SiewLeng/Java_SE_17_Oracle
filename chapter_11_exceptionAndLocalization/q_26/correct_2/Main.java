package q_26.correct_2;

public class Main {
    void rollOut() throws ClassCastException {}

    public void transform(String c) {
       try {
          rollOut();
       } catch (IllegalArgumentException | ClassCastException f) {
       }
    }

    public static void main(String[] args) {
        new Main().transform("abc");
    }
    
}
