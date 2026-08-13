package q_26.incorrect_new;

public class Whale {
    public void dive() {};
}

class Orca extends Whale {
    static public int MAX = 3;
    
    public void dive() {
       System.out.println("Orca diving");
    }

    public void dive(int... depth) {
        System.out.println("Orca diving deeper "+MAX);
    } 

    public static void main(String[] args) {
        Whale whale = new Orca();
        whale.dive(3); // Whale has no access to dive(int) which is not declared in Whale class
    }

}