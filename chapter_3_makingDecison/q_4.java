public class q_4 {

    private String printReptile(int category) {
        switch(category) {
            case 1:
            case 2:
                System.out.println("category is either 1 or 2");
                return "Snake";
            case 3:
            case 4:
                System.out.println("category is either 3 or 4");
                return "Lizard";
            case 5:
            case 6:
                System.out.println("category is either 5 or 6");
                return "Turtle";
            case 7:
            case 8:
                System.out.println("category is either 7 or 8");
                return "Alligator";
            default:
                return "Invalid";

        }
    }

    public static void main(String[] args) {
        System.out.println(new q_4().printReptile(1));
    }
    
}
