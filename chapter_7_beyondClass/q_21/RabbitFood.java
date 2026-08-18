package q_21;

import java.time.LocalDate;
import java.time.Month;

public record RabbitFood(int size, String brand, LocalDate expires) {
    public static int MAX_STORAGE = 100;
    public RabbitFood() {
        this(500, "Star", LocalDate.of(2026, Month.JANUARY, 29));
    }
}

