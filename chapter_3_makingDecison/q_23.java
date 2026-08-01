public class q_23 {
    private static void test() {
        int penguin = 50, turtle = 75;
        boolean older = penguin >= turtle;
        if (older = true) System.out.println("Success");
        else System.out.println("Failure");
        else if(penguin != 50) System.out.println("Other");
    }

     private static void testCorrect() {
        int penguin = 50, turtle = 75;
        boolean older = penguin >= turtle;
        if (older = true) System.out.println("Success");
        else System.out.println("Failure");

        if (penguin < 20) System.out.println("Penguin too young");
        else if(penguin != 50) System.out.println("Other");
    }

    public static void main(String[] args) {
        test();
    }
}
