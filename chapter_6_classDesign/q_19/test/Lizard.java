package q_19.test;

class Reptile {
    {System.out.print("A");}

    public Reptile(int hatch) {
        System.out.print(" Reptile constructor ");
    }

    void layEggs() {
        System.out.print("Reptile");
    } 
}

public class Lizard extends Reptile {
    static {System.out.print("B");}

    public Lizard(int hatch) {
        super(hatch);
    }

    public final void layEggs() {
        System.out.print("Lizard");
    }

}