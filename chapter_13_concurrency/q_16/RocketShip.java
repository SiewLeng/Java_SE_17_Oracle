package q_16;

import java.util.ArrayList;
import java.util.List;

public class RocketShip {
    private volatile int fuel;

    private void launch(int checks) {
        List<Thread> p = new ArrayList<>();
        for (int i = 0; i < checks; i++) {
            p.add(new Thread(() -> {
                fuel = fuel + 1;
            }));
        }
        p.forEach(Thread::interrupt);
        p.forEach(Thread::start);
        p.forEach(Thread::interrupt);
    } 

    public static void main(String[] args) {
        RocketShip ship = new RocketShip();
        ship.launch(100);
        try {
            Thread.sleep(6*1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        System.out.print(ship.fuel);
    }
    
}
