public class q_13 {

    private void whileLoop() {
        boolean keepGoing = true;
        int result = 15, meters = 10;
        do {
            meters--;
            if(meters==8) keepGoing = false;
            result -= 2;
        } while keepGoing;
        System.out.println(result);
    }

    private void whileLoopCorrect() {
        boolean keepGoing = true;
        int result = 15, meters = 10;
        do {
            meters--;
            if(meters==8) keepGoing = false;
            result -= 2;
        } while (keepGoing);
        System.out.println(result);
    }

    public static void main(String[] args) {
        new q_13().whileLoopCorrect();
    }
}