package testing1;

enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private final String expectedVisitors;

    private Season(String expectedVisitors) {
        System.out.println("Season Constructor: " + expectedVisitors);
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    } 
}

public class Test {
    public static void main(String[] args) {
        System.out.println("From main: " + Season.WINTER);
        Season.WINTER.printExpectedVisitors();
    }
}