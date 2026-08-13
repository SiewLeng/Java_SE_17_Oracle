package q_19.test;

public class Test {
    {System.out.println("Test class initalizing instance variable");}

    static {
        {System.out.println("Test class initalizing class variable");}
    }

    public static void main(String[] args) {
        var reptile = new Lizard(1);
        reptile.layEggs();
    } 
}
