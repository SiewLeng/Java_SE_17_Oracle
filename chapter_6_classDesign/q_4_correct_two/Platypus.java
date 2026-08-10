package q_4_correct_two;

class Mammal {
    private void sneeze() {}

    public Mammal(int age) {
        System.out.print("Mammal");
    } 
}

public class Platypus extends Mammal {
    int sneeze() { return 1; }

    public Platypus() {
        super(5);
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        // new MammalCorrect(5);
        Platypus p = new Platypus();
    } 
}