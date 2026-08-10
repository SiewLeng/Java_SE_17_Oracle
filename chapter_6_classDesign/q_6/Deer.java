package q_6;

public class Deer {
    private final Object o = new Object();

    public static void main(String[] args) {
        System.out.println("o: " + new Deer().o.toString());
    }
}
