package q_2.correct;

class Problem extends Exception {
    public Problem() {}
}

class YesProblem extends Problem {}

public class MyDatabase {
    public static void connectToDatabase() throws Problem {
        throw new YesProblem();
    }

    public static void main(String[] c) throws Exception {
        connectToDatabase();
        System.out.println("This is unreaable code");
    }
    
}
