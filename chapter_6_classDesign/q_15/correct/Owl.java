package q_15.correct;

abstract class Nocturnal {
    abstract boolean isBlind();
    // boolean isBlind() { return true; };
}
public class Owl extends Nocturnal {
    @Override
    public boolean isBlind() { return false; }

    public static void main(String[] args) {
        var nocturnal = (Nocturnal)new Owl();
        System.out.println(nocturnal.isBlind());
    } 
}
