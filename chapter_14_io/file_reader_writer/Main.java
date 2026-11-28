package file_reader_writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void run() {
        try(FileReader fr = new FileReader(new File("./file_reader_writer/source.txt"));
            FileWriter fw = new FileWriter(new File("./file_reader_writer/target.txt"));) {
            char[] buf = new char[16];
            int len = 16;
            int lengthRead;
            while ((lengthRead = fr.read(buf, 0, len)) > 0) {
                fw.write(buf, 0, lengthRead);
            }
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        run();
    }
    
}
