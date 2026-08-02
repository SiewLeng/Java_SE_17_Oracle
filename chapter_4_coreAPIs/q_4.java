public class q_4 {
    public static String getIdentityHashCode(String s) {
        return Integer.toHexString(System.identityHashCode(s));
    }

    public static void test() {
        var s = "Hello";
        var t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.intern() == s) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello".intern() == t) System.out.println("five");

        System.out.println("s: " + getIdentityHashCode(s));
        System.out.println("t: " + getIdentityHashCode(t));
        System.out.println("t.intern: " + getIdentityHashCode(t.intern()));
    }
    public static void main(String[] args) {
        test();
    }
    
}
