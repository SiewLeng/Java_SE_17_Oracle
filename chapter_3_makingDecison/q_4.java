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

    private String printReptileTwo(int category) {
        // In Java, a default statement is never strictly required by the compiler for traditional switch statements, 
        // but it is mandatory in modern Java for switch expressions and 
        // pattern matching when the cases are not exhaustive.
        // Unlike switch statements, switch expressions (which return a value or are assigned to a variable) 
        // must be exhaustive. Every possible value that the selector expression can take must be accounted for. 
        // If the compiler cannot guarantee that all values are explicitly matched by case labels, 
        // it throws a compilation error unless a default branch is provided.
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
        }
        return "Invalid";
    }

    public static void main(String[] args) {
        System.out.println(new q_4().printReptile(8));
        System.out.println(new q_4().printReptileTwo(10));
    }
    
}
