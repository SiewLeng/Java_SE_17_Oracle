package q_24.correct;

public class Test implements BigCat {
    public String getName() {
        return "BigCat";
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.hunt());
    }
}
