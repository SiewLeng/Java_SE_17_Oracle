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

    public static void main(String[] args) {
        test();
    }
}
