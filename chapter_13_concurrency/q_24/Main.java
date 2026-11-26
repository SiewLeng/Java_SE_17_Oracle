package q_24;

public class Main {
    
    public static void non_thread_safe() {
        TicketManager m1 = TicketManager.getInstance();
        TicketManager m2 = TicketManager.getInstance();

        new Thread(() -> m1.addTickets(10)).start();
        new Thread(() -> m2.addTickets(5)).start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(m1.getTicketCount());
        System.out.println(m2.getTicketCount());

    }

    public static void thread_safe() {
        TicketManager m1 = TicketManager.getInstance();
        TicketManager m2 = TicketManager.getInstance();

        new Thread(() -> m1.sellTickets(10)).start();
        new Thread(() -> m2.sellTickets(10)).start();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(m1.getTicketCount());
        System.out.println(m2.getTicketCount());

    }

    public static void main(String[] args) {
       // non_thread_safe();
       thread_safe();
    }
    

    
}
