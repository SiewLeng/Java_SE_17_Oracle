package q_13.try_with;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWith {
    // 'throws IOException' is required because there is no catch block
    public static void readFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("q_13\\try_with\\test.txt"))) {
            System.out.println(br.readLine());
            
        } 
        // No catch or finally needed! Resources auto-close.
    }

    public static void main(String[] arg) throws IOException {
        readFile();
    }
}