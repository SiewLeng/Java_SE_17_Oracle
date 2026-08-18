package q_17.correct;

public interface Omnivore {
    int amount = 10;
    static boolean gather = true;
    static void eatGrass() {}
    private static int findMore() { return 2; }
    default float rest() { return 2; }
    private int chew() { return 13; }
    private static void eatLeaves() {}
}

