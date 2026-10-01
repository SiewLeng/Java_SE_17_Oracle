package q_1.incorrect;

import java.io.IOException;

public class Test {

    public static void whatHappensNext() throws IOException {
        throw new Exception();
    }

    public static void main(String[] args) { 
        try {
            whatHappensNext();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
