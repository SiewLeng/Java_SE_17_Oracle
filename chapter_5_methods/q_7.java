public class q_7 {
    public int juggle(boolean b, boolean... b2) {
        return b2.length;
    }

    public static void main(String[] args) {
        // new q_7().juggle(true, {true, true});
        boolean[] arr = {true, true};
        System.out.println(new q_7().juggle(true, arr));
    }
    
}
