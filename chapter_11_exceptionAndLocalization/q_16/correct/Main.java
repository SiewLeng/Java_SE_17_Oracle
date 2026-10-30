package q_16.correct;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void run() {
        var f = DateTimeFormatter.ofPattern("hh 'o''clock'");
        System.out.println(f.format(LocalDateTime.now()));
        System.out.println(f.format(LocalTime.now()));
        System.out.println(f.format(ZonedDateTime.now()));
    }

    public static void main(String[] args) {
        run();
    }
    
}
