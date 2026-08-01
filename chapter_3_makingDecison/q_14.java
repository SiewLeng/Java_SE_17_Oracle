import java.util.ArrayList;
import java.util.List;

public class q_14 {
    private static void test() {
        for(var penguin : new int[2])
            System.out.println(penguin); 
        var ostrich = new Character[3];
        for(var emu : ostrich)
            System.out.println(emu); 
        List<Integer> parrots = new ArrayList<Integer>();
        for(var macaw  : parrots)
            System.out.println(macaw);
            System.out.println("parrots.size: " + parrots.size());
    }
    public static void main(String[] args) {
        test();
    }
    
}
