public class q_12 {
    public static void test() {
        var numbers = "012345678".indent(1);
        System.out.print("numbers:" + numbers);
        System.out.println("numbers.length(): " + numbers.length());
        System.out.println("numbers.last: " + (int)numbers.charAt(numbers.length() - 1));
        numbers = numbers.stripLeading();
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7));
        System.out.print(numbers.substring(7));
        System.out.print("end of test");
    }
    public static void main(String[] args) {
        test();
    }
}
