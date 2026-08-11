package q_16.correct;

public class Rodent {
    public Rodent(){}

    public Rodent(Integer x) {}

    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
}

class Beaver extends Rodent {
    public static Integer chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    } 

    public static void main(String[] args) {
        Beaver b = new Beaver();
        b.chew();
        Beaver.chew();
    }
}
