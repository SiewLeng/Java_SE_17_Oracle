package q_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void run() {
        try {
            LocalDateTime book = LocalDateTime.of(2022, 4, 5, 12, 30, 20);
            System.out.print(book.format(DateTimeFormatter.ofPattern("m")));
            // System.out.print(book.format(DateTimeFormatter.ofPattern("mm")));
            // System.out.print(book.format(DateTimeFormatter.ofPattern("mmm")));
            System.out.print(book.format(DateTimeFormatter.ofPattern("z")));
            System.out.print(DateTimeFormatter.ofPattern("y").format(book));
        } catch (Throwable e) {}
        }

    public static void main(String[] arg) {
        run();
    }
    
}
