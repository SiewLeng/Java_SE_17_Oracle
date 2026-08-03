import java.util.Arrays;

public class q_15 {
    public static void test() {
        var arr = new String[] { "PIG", "pig", "123"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, "Pippa"));
    }

    public static void testUnsorted() {
        var arr = new String[] { "PIG", "pig", "123"};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, "123"));
    }

    public static void main(String[] args) {
        // test();
        testUnsorted();

    }
}
