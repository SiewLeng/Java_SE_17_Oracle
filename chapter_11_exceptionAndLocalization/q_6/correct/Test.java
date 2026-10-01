package q_6.correct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void run() {
        LocalDate date = LocalDate.parse("2022-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }

    public static void main(String[] args) {
        run();
    }
    
}

