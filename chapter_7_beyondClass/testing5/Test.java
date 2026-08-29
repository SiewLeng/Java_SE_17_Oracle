package testing5;

public class Test {
    public static void main(String[] args) {
        User p = new User("Peter Chew", "peter@gmail.com");
        System.out.println(p.userName() + ", " + p.email()); 

        User s = new User("Mary", "Chew", "mary@gmail.com");
        System.out.println(s.userName() + ", " + s.email()); 
    }
    
}
