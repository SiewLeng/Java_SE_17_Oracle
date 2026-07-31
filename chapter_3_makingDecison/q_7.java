public class q_7 {
    private static void loopOverArray1() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i=0; ++i<10 && i<arr.length;) {
            // m = min(10, arr.length)
            // ++i < m
            // print arr[1] ... arr[m - 1]
            System.out.print(arr[i] + " ");
        }
    }

     private static void loopOverArray2() {
        System.out.println("");
        int[] arr = {0, 1, 2, 3, 4, 5};
        for (int i=0; ++i<10 && i<arr.length;) {
            // m = min(10, arr.length)
            // ++i < m
            // print arr[1] ... arr[m - 1]           
            System.out.print(arr[i] + " ");
        }
    }

    private static void loopOverArray3() {
        System.out.println("");
        int[] arr = {0, 1, 2, 3, 4, 5};
        for (int i = 0, j = 3; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        loopOverArray1();
        loopOverArray2();
        loopOverArray3();
    }
}