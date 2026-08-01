public class q_19 {
    public static void test() {
        double iguana = 0;
        do {
            int snake = 1;
            System.out.print(snake++ + " ");
            iguana-- ;
        } while (snake <= 5);
        System.out.println(iguana); 
    }

    public static void testCorrect() {
        double iguana = 0;
        int snake = 1;
        do {
            System.out.print(snake++ + " ");
            iguana-- ;
        } while (snake <= 5);
        System.out.println(iguana); 
    }
    
    public static void main(String[] args) {
        testCorrect();
    }
    
}
