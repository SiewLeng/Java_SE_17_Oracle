import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class q_14 {
    public static void test() {
        var date = LocalDate.now();
        var time = LocalTime.now();
        var dateTime = LocalDateTime.now();
        var zoneId = ZoneId.systemDefault();
        var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        Instant instant = zonedDateTime.toInstant();
        System.out.println("zonedDateTime: " + zonedDateTime);
        System.out.println("instant: " + instant);
    }

    public static void main(String[] args) {
        test();
    }
}