package q_4_correct_one;

class Mammal {
    private void sneeze() {}
    
    public Mammal() {
        System.out.println("Calling Mammal()");
        this(5);
    }

    public Mammal(int age) {
        System.out.print("Mammal");
    } 
}

public class Platypus extends Mammal {
    int sneeze() { return 1; }

    public Platypus() {
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        // new MammalCorrect(5);
        Platypus p = new Platypus();
    } 
}