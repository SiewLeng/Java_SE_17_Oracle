public class q_15 {
    private static void test() {
           final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a:
            case 'B': 'C': System.out.print("great ");
            case 'D': System.out.print("good "); break;
            case e:
            case 'F': System.out.print("not good ");
        }
    }

      private static void testCorrect() {
           final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a:
            case 'B': 
            case 'C': System.out.print("great ");
            case 'D': System.out.print("good "); break;
            case e:
            case 'F': System.out.print("not good ");
        }
    }

    public static void main(String[] args) {
        testCorrect();
    }
}