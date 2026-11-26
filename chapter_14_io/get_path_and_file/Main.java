package get_path_and_file;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    private static final String PARENT_PATH = "C:/Users/LENOVO/code/Java_SE_17_Oracle/chapter_14_io";
    private static final String PATH_1 = PARENT_PATH + "/get_path_and_file/Main.java"; // exists
    private static final String PATH_2 = PARENT_PATH + "/config/app.properties"; // does not exist
    

    public static void run_file() {
        File file_1 = new File(PATH_1);
        System.out.println("file_1 exists: " + file_1.exists());

        File file_2 = new File(PATH_2);
        System.out.println("file_2 exists: " + file_2.exists());
    }

    public static void run_path() {
        Path file_1 = Path.of(PATH_1);
        System.out.println("file_1 exists: " + Files.exists(file_1));

        Path file_2 = Path.of(PATH_2);
        System.out.println("file_2 exists: " + Files.exists(file_2));
    }

    public static void run_paths() {
        Path file_1 = Paths.get(PATH_1);
        System.out.println("file_1 exists: " + Files.exists(file_1));

        Path file_2 = Paths.get(PATH_2);
        System.out.println("file_2 exists: " + Files.exists(file_2));
    }

    public static void run_fileSystems() {
        FileSystem fs = FileSystems.getDefault();
        Path file_1 = fs.getPath(PATH_1);
        System.out.println("file_1 exists: " + Files.exists(file_1));

        Path file_2 = fs.getPath(PATH_2);
        System.out.println("file_2 exists: " + Files.exists(file_2));
    }

    public static void main(String[] args) {
        run_file();
        System.out.println("-----------------------------");
        run_path();
        System.out.println("-----------------------------");
        run_paths();
        System.out.println("-----------------------------");
        run_fileSystems();
    }
    
}
