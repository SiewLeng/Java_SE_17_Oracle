import java.time.LocalDate;

public class q_11 {
    public static void test() {
        var date = LocalDate.of(2022, 4, 3);
        date.plusDays(2);
        date.plusHours(3);
        System.out.println(date.getYear() + " " + date.getMonth()
            + " " + date.getDayOfMonth());
    }

     public static void testCorrect() {
        var date = LocalDate.of(2022, 4, 3);
        date.plusDays(2);
        System.out.println(date.getYear() + " " + date.getMonth()
            + " " + date.getDayOfMonth());
    }

    public static void main(String[] args) {
        testCorrect();
    }
    
}
