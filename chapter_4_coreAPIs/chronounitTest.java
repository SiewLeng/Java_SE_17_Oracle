import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class chronounitTest {
    public static void test() {
        var localTime1 = LocalTime.of(5, 15);
        var localTime2 = LocalTime.of(6, 30);
        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2));  
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2));  

        var localDate1 = LocalDate.of(2025, Month.MAY, 15);
        var localDate2 = LocalDate.of(2026, Month.MAY, 15);
        System.out.println(ChronoUnit.YEARS.between(localDate1, localDate2));
        System.out.println(ChronoUnit.MONTHS.between(localDate1, localDate2));
        System.out.println(ChronoUnit.DAYS.between(localDate1, localDate2));
        System.out.println(ChronoUnit.DAYS.between(localDate2, localDate1));
    }

    public static void main(String[] args) {
        test(); 
    }

}