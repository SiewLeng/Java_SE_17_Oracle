package q_24.correct;

public interface BigCat {
    abstract String getName();
    default int hunt() { getName(); return 5; }
    default void climb() { rest(); }
    private void roar() { getName();  climb(); hunt(); }
    private boolean sneak() { roar(); return true; }
    private int rest() { return 2; };
}