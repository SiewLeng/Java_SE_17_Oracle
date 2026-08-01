public class q_27 {
    private static void test() {
        byte amphibian = 1;
        String name = "Frog";
        String color = switch(amphibian) {
            case 1 -> { yield "Red"; } 
            case 2 -> { if(name.equals("Frog")) yield "Green"; }
            case 3 -> { yield "Purple"; }
            default -> throw new RuntimeException();
            };
        System.out.print(color);

    }

    private static void testCorrect() {
        byte amphibian = 1;
        String name = "Frog";
        String color = switch(amphibian) {
            case 1 -> { yield "Red"; } 
            case 2 -> { 
                if(name.equals("Frog")) yield "Green"; 
                else yield "Orange";
            }
            case 3 -> { yield "Purple"; }
            default -> throw new RuntimeException();
            };
        System.out.print(color);
    }

    private static String testCorrect2() {
        byte amphibian = 1;
        String name = "Frog";
        // return will exit out of the testCorrect2 method and return to the caller.
        // yield produces a value for an enclosing switch expression and exits just the switch. 
        // yield can only inside a code block ({}) of a switch expression.
        switch(amphibian) {
            case 1:
                return "Red";
            case 2: 
                break;
            case 3:
            default:
                return "Blue";
        }
        return "Green";
    }

    public static void main(String[] args) {
        System.err.println(testCorrect2());
    }
}
