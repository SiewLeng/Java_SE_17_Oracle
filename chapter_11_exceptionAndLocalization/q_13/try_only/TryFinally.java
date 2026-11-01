package q_13.try_only;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryFinally {
    // 'throws IOException' is required because there is no catch block
    public static void readFile() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("q_13\\try_with\\test.txt"));
            // br = new BufferedReader(new FileReader("test.txt")); 
            // the above line will throw FileNotFoundException exception and the exception is not caught. 
            System.out.println(br.readLine());
        } finally {
            if (br != null) {
                br.close();
            }   
            System.out.println("Running Final Block");
        }
        System.out.println("Statement after finally!!");
    }

    public static void main(String[] arg) throws IOException {
        readFile();
    }
}