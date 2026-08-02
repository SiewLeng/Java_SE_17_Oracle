public class q_1 {
    private static void test() {
        int numFish = 4;
        String fishType = "tuna";
        String anotherFish = numFish + 1;
        System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);
    }

    private static void testCorrect1() {
        int numFish = 4;
        String fishType = "tuna";
        String anotherFish = numFish + 1 + "";
        System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);
    }

    private static void testCorrect2() {
        int numFish = 4;
        String fishType = "tuna";
        // String anotherFish = Integer.toString(numFish + 1);
        String anotherFish = String.valueOf(numFish + 1);
        System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);
    }

    public static void main(String[] args) {
        testCorrect2();
    }
}