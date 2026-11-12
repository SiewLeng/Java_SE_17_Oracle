package test_2;

public class Main {
    
    // need not declare RuntimeException or catch the RuntimeException
    // since RuntimeException is unchecked exception
    public void run() {
        System.out.println("Running the programming before runtime exception");
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        new Main().run();
    }
    
}
