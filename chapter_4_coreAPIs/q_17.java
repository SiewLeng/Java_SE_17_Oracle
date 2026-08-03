public class q_17 {
    public static void test() {
        StringBuilder letters = new StringBuilder("abcdefg");
        String s1 = letters.substring(1, 2);
        String s2 = letters.substring(2, 2);
        String s3 = letters.substring(6, 5);
        // String s3 = "";
        String s4 = letters.substring(6, 6);
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
    }

    public static void main(String[] args) {
        test();
    }
}
