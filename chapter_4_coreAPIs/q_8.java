public class q_8 {
    public static void test() {
        var string = "12345";
        var builder = new StringBuilder("12345");
        builder.charAt(4);
        builder.replace(2, 4, "6").charAt(3);
        builder.replace(2, 5, "6").charAt(2);
        string.charAt(5);
        string.length;
        string.replace("123", "1").charAt(2);
    }

    public static void testCorrect() {
        var string = "12345";
        var builder = new StringBuilder("12345");

        char c0 = builder.charAt(4);
        System.out.println("builder.charAt(4): " + c0);

        char c1 = builder.replace(2, 4, "6").charAt(3);
        // builder.replace(2, 5, "6").charAt(2);
        System.out.println("builder.replace(2, 4, \"6\").charAt(3): " + c1);

        char c2 = string.charAt(4); // 5 is out of index
        System.out.println("string.charAt(4): " + c2);

        int length = string.length();
        System.out.println("string.length(): " + length);

        char c3 = string.replace("123", "1").charAt(2);
        System.out.println("string.replace(\"123\", \"1\").charAt(2): " + c3);
        System.out.println("string: " + string);
    }

    public static void main(String[] args) {
        testCorrect();
    }
}
