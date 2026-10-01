package q_6.incorrect;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void run() {
        LocaDate date = LocalDate.parse("2022-04-30", DateTimeFormatter.BASIC_ISO_DATE_TIME);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }

    public static void main(String[] args) {
        run();
    }
    
}
