package q_19.test;

class Parent {
     {System.out.println("Parent class initalizing instance variable");}

    static {
        {System.out.println("Parent class initalizing class variable");}
    }
}

public class Test extends Parent {
    {System.out.println("Test class initalizing instance variable");}

    static {
        {System.out.println("Test class initalizing class variable");}
    }

    public static void main(String[] args) {
        var reptile = new Lizard(1);
        reptile.layEggs();
    } 
}
