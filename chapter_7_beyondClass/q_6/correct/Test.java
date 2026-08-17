package q_6.correct;

public class Test extends IsAPlant {
    @Override
    public int chew() {
        return 5;
    }

    @Override
    public void eatGrass() {
        System.out.println("Eat Grass.");
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.chew());
        t.eatGrass();
    }
    
}
