package q_18;

public class Test {

    public static <T> T identity(T t) {
        return t;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(identity(s));
    }
    
}