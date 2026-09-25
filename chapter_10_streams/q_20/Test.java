package q_20;

import java.util.Optional;

public class Test {

    public static void run1() {
        Optional<String> opt = Optional.of("1");

        var opt1 = opt.get();
        System.out.println(opt1);

        var opt2 = opt.orElse("");
        System.out.println(opt2);


        var opt3 = opt.orElseGet(() -> "");
        System.out.println(opt3);
        
        var opt4 = opt.orElseThrow();
        System.out.println(opt4);

        var opt5 = opt.orElseThrow(RuntimeException::new);
        System.out.println(opt5);

    }

   public static void run2() {
        Optional<String> opt = Optional.empty();

        try {
            String opt1 = opt.get();
            System.out.println("optl: " + opt1);
        } catch (Exception e) {
            System.out.println("opt1: " + e);
        }
        
        String opt2 = opt.orElse("");
        System.out.println("opt2: " + opt2);
     
        String opt3 = opt.orElseGet(() -> "");
        System.out.println("opt3: " + opt3);
        
        try {
            String opt4 = opt.orElseThrow();
            System.out.println("opt4: " + opt4);
        } catch (Exception e) {
            System.out.println("opt4: " + e);
        }

        try {
            String opt5 = opt.orElseThrow(RuntimeException::new);
            System.out.println("opt5: " + opt5);
        } catch (Exception e) {
            System.out.println("opt5: " + e);
        }

    }

    public static void main(String[] args) {
        run1();
        System.out.println("*********************");
        run2();
    }
    
}
