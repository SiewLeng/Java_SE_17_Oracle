import java.util.Arrays;

public class q_19 {
    public static void test() {
        String[] s1 = { "Camel", "Peacock", "Llama"};
        String[] s2 = { "Camel", "Llama", "Peacock"};
        String[] s3 = { "Camel"};
        String[] s4 = { "Camel", null};

        System.out.println("compare(s1, s2): " + Arrays.compare(s1, s2));
        System.out.println("mismatch(s1, s2): " + Arrays.mismatch(s1, s2));
        System.out.println("compare(s3, s4): " + Arrays.compare(s3, s4));
        System.out.println("mismatch (s3, s4): " + Arrays.mismatch (s3, s4));
        System.out.println("compare(s4, s4): " + Arrays.compare(s4, s4));
        System.out.println("mismatch (s4, s4): " + Arrays.mismatch (s4, s4));

    }


    public static void main(String[] args) {
        test();
    }
}