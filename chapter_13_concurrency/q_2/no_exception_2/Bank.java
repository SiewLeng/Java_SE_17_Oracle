package q_2.no_exception_2;

import java.util.stream.IntStream;

public class Bank {
    private int total = 0;

    public void deposit(int value) throws InterruptedException {
        synchronized(this) {
            total += value;
            Thread.sleep(30);
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        IntStream.range(1, 10).parallel()
            .forEach(s -> {
                try {
                    bank.deposit(s);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            });
        System.out.println(bank.total);
    }
    
}
