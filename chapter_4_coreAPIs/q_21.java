import java.time.LocalDate;
import java.time.Month;

public class q_21 {
    public static void test() {
        var date = LocalDate.of(2022, Month.APRIL, 30);
        var date1 = date.plusDays(2);
        var date2 = date.plusYears(3);
        System.out.println(date.getYear() + " " + date.getMonth() 
        + " " + date.getDayOfMonth());
        System.out.println(date1.getYear() + " " + date1.getMonth() 
        + " " + date1.getDayOfMonth());
        System.out.println(date2.getYear() + " " + date2.getMonth() 
        + " " + date2.getDayOfMonth());
    }

    public static void main(String[] args) {
        test();
    }
}
