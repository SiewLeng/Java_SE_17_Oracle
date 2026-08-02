import java.util.Arrays;

public class q_9 {
    public static String getIdentityHashCode(Object o) {
        return Integer.toHexString(System.identityHashCode(o));
    }

    private static void test() {
        int[] arr1 = {1, 2 , 3, 4, 5};
        int[] arr2 = {1, 2 , 3, 4, 5};
        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2));
        System.out.println("arr1.equals(arr2): " + arr1.equals(arr2));
        System.out.println("arr1: " + getIdentityHashCode(arr1));
        System.out.println("arr2: " + getIdentityHashCode(arr2));
    }

    public static void main(String[] args) {
        test();
    }
    
}
