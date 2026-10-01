package q_5;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class Test {
    public void print(double t) {
        System.out.print(NumberFormat.getCompactNumberInstance().format(t));

        System.out.print(NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT).format(t));

        System.out.print(NumberFormat.getCurrencyInstance().format(t));

    }
    
    public static void main(String[] args) {
        new Test().print(100_102.2);
    }
}
