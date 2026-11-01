package q_13.try_only;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch {
    // 'throws IOException' is required because there is no catch block
    public static void readFile() throws IOException {
        BufferedReader br = null;
        try {
            // br = new BufferedReader(new FileReader("q_13\\try_with\\test.txt"));
            br = new BufferedReader(new FileReader("test.txt")); 
            // the above line will throw FileNotFoundException exception and the exception is caught.
            System.out.println(br.readLine());
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Statement after catch!!");
    }

    public static void main(String[] arg) throws IOException {
        readFile();
    }
}