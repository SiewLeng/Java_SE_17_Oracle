import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {

    private final Lock lock = new ReentrantLock();

    // 1. Immediate non-blocking attempt
    public boolean processIfAvailable(String taskName) {
        if (lock.tryLock()) {
            try {
                System.out.println(Thread.currentThread().getName() + " acquired lock for: " + taskName);
                simulateWork(200);
                return true;
            } finally {
                // Always unlock in finally, ONLY because tryLock() returned true
                lock.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " skipped '" + taskName + "' (lock busy)");
            return false;
        }
    }

    // 2. Timed attempt with timeout & interruption handling
    public boolean processWithTimeout(String taskName, long timeout, TimeUnit unit) {
        try {
            if (lock.tryLock(timeout, unit)) {
                try {
                    System.out.println(Thread.currentThread().getName() + " acquired lock within timeout for: " + taskName);
                    simulateWork(300);
                    return true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " timed out waiting for: " + taskName);
                return false;
            }
        } catch (InterruptedException e) {
            // Restore interrupt status and handle cleanly
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + " was interrupted while waiting");
            return false;
        }
    }

    private void simulateWork(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        TryLockExample example = new TryLockExample();

        Runnable worker1 = () -> example.processWithTimeout("Report Job", 300, TimeUnit.MILLISECONDS);
        Runnable worker2 = () -> {
            // First try right away; if busy, wait up to 400ms
            if (!example.processIfAvailable("Quick Sync")) {
                example.processWithTimeout("Quick Sync (Retry)", 400, TimeUnit.MILLISECONDS);
            }
        };

        Thread t1 = new Thread(worker1, "Worker-1");
        Thread t2 = new Thread(worker2, "Worker-2");

        t1.start();
        t2.start();
    }
}