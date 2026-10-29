package q_14.incorrect_1;

public class Main {
    public static void run() {
        var huey = (String)null;
        Object louie = null;
        if(louie == huey.substring(1)) {
        System.out.println("Quack!");
        }
    }

    public static void main(String[] args) {
        run();
    }
    
}
