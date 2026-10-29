package q_14.incorrect_2;

public class Main {
    public static void run() {
        var huey = (String)null;
        Integer dewey = null;
        Object louie = null;
        if(louie == huey.substring(dewey.intValue())) {
        System.out.println("Quack!");
        }
    }

    public static void main(String[] args) {
        run();
    }
    
}
