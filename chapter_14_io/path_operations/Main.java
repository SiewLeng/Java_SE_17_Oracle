package path_operations;

import java.nio.file.Path;

public class Main {
    private static final String PARENT_PATH = "C:/Users/LENOVO/code/Java_SE_17_Oracle/chapter_14_referencing_files_and_directories";
    private static final String PATH_1_STRING = PARENT_PATH + "/path_operations/zoo/shells.txt"; 
    private static final Path path_1 = Path.of(PATH_1_STRING);
    private static final String PATH_2_STRING = "."; 
    private static final Path path_2 = Path.of(PATH_2_STRING);
    
    public static void viewPath() {
        System.out.println("Path is: " + path_1.toString());
        for (int i = 0; i < path_1.getNameCount(); i++) {
            System.out.println("   Element " + i + " is: " + path_1.getName(i));
        }
    }

    public static void creatingPartOfPath() {
        viewPath();
        System.out.println();
        System.out.println("subpath(0,3): " + path_1.subpath(0, 3));
        // System.out.println("subpath(0,3): " + path_1.subpath(0, 9)); // IllegalArgumentExceptio
    }

    public static void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println("   Root is: " + path.getRoot());
        Path currentParent = path;
        while((currentParent = currentParent.getParent()) != null)
            System.out.println("   Current parent is: " + currentParent);
        System.out.println();
    }

    public static void main(String[] args) {
        viewPath();
        creatingPartOfPath();
        printPathInformation(path_1);
        printPathInformation(path_2);
        System.out.println(path_2.toAbsolutePath().normalize());

        
    } 

    
}
