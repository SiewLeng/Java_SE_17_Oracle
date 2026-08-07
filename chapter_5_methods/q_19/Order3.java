package q_19;

public class Order3 {
    final String value1 = "red";
    static String value2 = "blue";
    String value3 = "yellow";
    {
        // CODE SNIPPET 1
        System.out.println("instance initalizer code executed....");
        // value1 = "green";
        value2 = "purple";
        value3 = "orange";

    }
    static {
        // CODE SNIPPET 2
        System.out.println("static initalizer code executed....");
        // value1 = "magenta";
        value2 = "cyan";
        // value3 = "turquoise";
    }
    
    public static void main(String[] args) {
        Order3 o = new Order3();
        System.out.println("value 1: " + o.value1);
        System.out.println("value 2: " + Order3.value2);
        System.out.println("value 3: " + o.value3);
    }
    
}
