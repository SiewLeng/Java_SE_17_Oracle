package q_19.test;

class Reptile {
    {System.out.print("A ");}
    
    static
    {System.out.print("Static Reptile ");}


    public Reptile(int hatch) {
        System.out.print("Reptile constructor ");
    }

    void layEggs() {
        System.out.print("Reptile Lay Eggs ");
    } 
}

public class Lizard extends Reptile {
    {System.out.print("B ");}

    static
    {System.out.print("Static Lizard ");}

    public Lizard(int hatch) {
        super(hatch);
        System.out.print("Lizard constructor ");
    }

    public final void layEggs() {
        System.out.print("Lizard Lay Eggs ");
    }

}