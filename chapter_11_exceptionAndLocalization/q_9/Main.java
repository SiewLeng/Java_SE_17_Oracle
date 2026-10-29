package q_9;
import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {
    public static void run() {
        String pattern = "#,###,000.0#";
        String message = DoubleStream.of(5.21, 8.49, 1234)
        .mapToObj(v -> new DecimalFormat(pattern).format(v))
        .collect(Collectors.joining("> <"));
        System.out.println("<" + message + ">");
    }

    public static void main(String[] args) {
        run();
    }
    
}
