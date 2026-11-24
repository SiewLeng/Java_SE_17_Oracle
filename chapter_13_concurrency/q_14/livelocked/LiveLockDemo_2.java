package q_14.livelocked;

import java.util.concurrent.locks.ReentrantLock;

public class LiveLockDemo_2 {

    public static void sleepThread() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
    
    public static void run() {
        ReentrantLock lock_1 = new ReentrantLock();
        ReentrantLock lock_2 = new ReentrantLock();

        Runnable task_1 = () -> {
            while (true) {
                System.out.println("task_1 entered into loop");
                if (lock_1.tryLock()) {
                    System.out.println("task_1 acquire lock 1");
                    sleepThread();
                    if (lock_2.tryLock()) {
                        System.out.println("task_1 acquire lock 2");
                        sleepThread();
                        lock_2.unlock();
                        break;
                    } else {
                        System.out.println("task_1 cannnot acquire lock 2");
                    }
                    lock_1.unlock();
                } else {
                    System.out.println("task_1 cannnot acquire lock 1");
                }
            }
        };

        Runnable task_2 = () -> {
            while (true) {
                System.out.println("task_2 entered into loop");
                if (lock_2.tryLock()) {
                    System.out.println("task_2 acquire lock 2");
                    sleepThread();
                    if (lock_1.tryLock()) {
                        System.out.println("task_2 acquire lock 1");
                        sleepThread();
                        lock_1.unlock();
                        break;
                    } else {
                        System.out.println("task_2 cannot acquire lock 1");
                    }
                    lock_2.unlock();
                } else {
                    System.out.println("task_2 cannot acquire lock 2");
                }
            }
        };

        new Thread(task_1).start();
        new Thread(task_2).start();
    }

    public static void main(String[] aStrings) {
        run();
    }
    
}
