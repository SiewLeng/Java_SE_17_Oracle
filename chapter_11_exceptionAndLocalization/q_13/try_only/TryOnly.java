package q_13.try_only;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryOnly {
    // 'throws IOException' is required because there is no catch block
    public static void readFile() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("q_13\\try_with\\test.txt"));
            System.out.println(br.readLine());
        } 
    }

    public static void main(String[] arg) throws IOException {
        readFile();
    }
}