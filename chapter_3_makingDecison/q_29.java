public class q_29 {

    void getFish(Object fish) {
        if (!(fish instanceof String guppy))
            System.out.print("Eat!");
        else if (!(fish instanceof String guppy)) {
            throw new RuntimeException();
        }
        System.out.print("Swim!");
    }

     void getFishCorrect(Object fish) {
        if (!(fish instanceof String guppy))
            System.out.print("Eat!");
        else if (!(fish instanceof String zuppy)) {
            throw new RuntimeException();
        }
        System.out.print("Swim!");
    }

    public static void main(String[] args) {
        new q_29().getFishCorrect("Fish");
    }
    
}
