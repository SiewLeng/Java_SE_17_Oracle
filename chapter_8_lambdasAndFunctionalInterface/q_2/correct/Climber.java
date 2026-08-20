package q_2.correct;

interface Climb {
    boolean isTooHigh(StringBuilder height, StringBuilder limit);
}

public class Climber {

    public static void main(String[] args) {
        check((h, m) -> h.append(m).isEmpty(), new StringBuilder("5"));
    }

    private static void check(Climb climb, StringBuilder height) {
        if (climb.isTooHigh(height, new StringBuilder("10"))) {
            System.out.println("too high");
        } else {
            System.out.println("ok");
        }
    }
}
