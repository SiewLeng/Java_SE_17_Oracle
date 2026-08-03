public class q_16 {
    public static void test1() {
        String s1 = "\t";
        String s2 = "\\t";
        System.out.println("s1:" + s1 + ".");
        System.out.println("s2:" + s2 + ".");
    }

    public static void test2() {
        var base = "ewe\nsheep\\t";
        int length = base.length();
        int indent = base.indent(2).length();
        int translate = base.translateEscapes().length();
        var formatted = "%s %s %s".formatted(length, indent, translate);
        System.out.format(formatted);
        System.out.println("base.translateEscapes(): ");
        System.out.println(base.translateEscapes() + ".");
    }

    public static void main(String[] args) {
        test1();
        test2();
    }
}
