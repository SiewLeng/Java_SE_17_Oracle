package q_8;

import java.util.stream.LongStream;

public class Flavors {
    private static int counter;

    public static void countIceCreamFlavours() {
        counter = 0;
        Runnable task = () -> counter++;
        LongStream.range(0, 500)
            .forEach(m -> {
                Thread thread = new Thread(task);
                System.out.println("thread name: " + thread.getName());
                thread.run();
            });
        System.out.println(counter);

    }

    public static void countIceCreamFlavours_2() {
        counter = 0;
        Runnable task = () -> counter++;
        LongStream.range(0, 500)
            .forEach(m -> {
                Thread thread = new Thread(task);
                System.out.println("thread name: " + thread.getName());
                thread.start();
            });
        System.out.println(counter);

    }

    public static void main(String[] args) {
        // countIceCreamFlavours();
        countIceCreamFlavours_2();
    }
    
}
