package q_24;

public class TicketManager {
    private volatile int tickets = 100;
    private static TicketManager instance;
    private TicketManager() {};
    
    static synchronized TicketManager getInstance() {
        if (instance == null) {
            instance = new TicketManager();
        }
        return instance;
    }

    public int getTicketCount() { return tickets; }

    public void addTickets(int value) { 
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        tickets += value; 
    }

    public void sellTickets(int value) {
        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            tickets -= value;
        }
    }
    
}
