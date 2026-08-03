public class q_18 {
    public static void test() {
        String s1 = """
            purr""";
        System.out.println(s1 + ".");
        String s2 = "";
        s1.toUpperCase();
        s1.trim();
        s1.substring(1, 3);
        s1 += "two";
        s2 += 2;
        s2 += 'c';
        s2 += false;
        if ( s2 == "2cfalse") System.out.println("==");
        if ( s2.equals("2cfalse")) System.out.println("equals");
        System.out.println(s1.length());
    }

    public static void testIndention() {
        System.out.println("-----------------------");
        String s1 = """
                    \"purr
                        "cat\tb\n
                haha   """;
        System.out.println(s1 + ".");
        // block text strips all trailing whitespace!
        // strips the amount of leading whitespace from every line
        String s2 = "purr cat   haha   ";

    }

    public static void main(String[] args) {
        test();
        testIndention();
    }
}
