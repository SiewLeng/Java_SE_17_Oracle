package q_3.incorrect;

public class Test {
    public static void run(int a, int b) {
        try {
            System.out.print(a/b);
        }  catch (RuntimeException e) {
            System.out.println(-1);
        } catch (ArithmeticException e) {
            System.out.print(0);
        } finally {
            System.err.print("done");
        }
    }

    public static void main(String[] args) {
        run(0, 0);
    }
    
}