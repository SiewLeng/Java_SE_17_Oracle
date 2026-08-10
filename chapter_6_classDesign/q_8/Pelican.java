package q_8;

abstract class Bird {
    private final void fly() { System.out.println("Bird"); }

    protected Bird() { System.out.print("Wow- "); }
}

public class Pelican extends Bird {
    public Pelican() { System.out.print("Oh- "); }

    protected void fly() { System.out.println("Pelican"); }

    public static void main(String[] args) {
        var chirp = new Pelican();
        // Pelican chirp = new Pelican();
        // Bird chirp = new Pelican();
        chirp.fly();
    }
    
} 
