public class q_6 {
    public static void test() {
        double one = Math.pow(1, 2);
        int two = Math.round(1.0);
        float three = Math.random();
        var doubles = new double[] {one, two, three};
    }

    public static void testCorrect() {
        double one = Math.pow(1, 2);
        long two = Math.round(1.0);
        double three = Math.random();
        var doubles = new double[] {one, two, three};
        System.out.println("doubles: " + doubles[0] + " " + doubles[1] + " " + doubles[2]);
    }

    public static void main(String[] args) {
        testCorrect();
    }
    
}
