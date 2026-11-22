package q_2.no_exception_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Bank {
    private final Lock vault = new ReentrantLock();
    private int total = 0;

    public void deposit(int value) throws InterruptedException {
        if (vault.tryLock()) {
            try {
                total += value;
                Thread.sleep(1000);
            } finally {
                vault.unlock();
            }
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
