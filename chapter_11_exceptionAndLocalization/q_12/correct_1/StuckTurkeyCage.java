package q_12.correct_1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StuckTurkeyCage implements AutoCloseable {
    @Override 
    public void close() throws IOException {
        throw new FileNotFoundException("Cage is not closed");
    }

    public static void main(String[] args) {
        try(StuckTurkeyCage t = new StuckTurkeyCage()){
            System.out.println("put turkeys in");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } 
    
}
