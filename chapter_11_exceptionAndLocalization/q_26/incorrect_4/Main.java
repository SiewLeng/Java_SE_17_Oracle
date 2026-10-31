package q_26.incorrect_4;

public class Main {
    void rollOut() throws ClassCastException {}

    public void transform(String c) {
       try {
          rollOut();
       } catch (IllegalArgumentException | NumberFormatException e) {
       }
    }

    public static void main(String[] args) {
        new Main().transform("abc");
    }
    
}
