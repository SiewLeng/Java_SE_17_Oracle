package path_operations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    // . refers to the PARENT_PATH
    private static final String PARENT_PATH = "C:/Users/LENOVO/code/Java_SE_17_Oracle/chapter_14_io";
    private static final String PATH_1_STRING = PARENT_PATH + "/path_operations/zoo/shells.txt"; 
    private static final Path path_1 = Path.of(PATH_1_STRING);
    private static final String PATH_2_STRING = "./path_operations/../config"; 
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

    public static void resolvingPaths() {
        // path is absolute when it starts with either / or c:
        // otherwise, the path is relative

        Path base = Path.of(PARENT_PATH);

        // Relative argument
        Path result1 = base.resolve("path_operations/zoo/shells.txt");
        System.out.println("Resolving using relative argument: " + result1);
        System.out.println("file exists: " + Files.exists(result1));

        // Dot / parent segments
        Path result2 = base.resolve("./path_operations/../config");
        System.out.println("Resolving using dot / parent segment: " + result2);
        System.out.println("file exists: " + Files.exists(result2));

        // Absolute argument 
        Path result3 = base.resolve("C:/Users/LENOVO/code/Java_SE_17_Oracle/chapter_13_concurrency");
        System.out.println("Resolving using absolute argument: " + result3);
        System.out.println("file exists: " + Files.exists(result3));

        // Empty argument
        Path result4 = base.resolve("");
        System.out.println("Resolving using empty argument: " + result4);
        System.out.println("file exists: " + Files.exists(result4));
    }

    public static void relativizingPath() {
        // both paths are relative and are in same working directory 
        // working directory is the parent folder both of path_operation and config = PARENT_PATH
        System.out.println("\nBoth paths are relative!");
        Path path1 = Path.of("path_operations/zoo/shell.txt"); 
        Path path2 = Path.of("config/app.propeties"); 
        System.out.println("from path1 to path2: " + path1.relativize(path2)); // how to go to path2 from path1
        System.out.println("from path2 to path1: " + path2.relativize(path1)); // how to go to path1 from path2

        // both paths are absolute
        System.out.println("Both paths are absolute!");
        Path path3 = Path.of(PARENT_PATH + "/path_operations/zoo/shell.txt"); 
        Path path4 = Path.of(PARENT_PATH + "/config/app.propeties"); 
        System.out.println("from path3 to path4: " + path3.relativize(path4)); // how to go to path2 from path1
        System.out.println("from path4 to path3: " + path4.relativize(path3)); // how to go to path1 from path2

        // mixed path used
        try {
            System.out.println("from path1 to path4: " + path1.relativize(path4)); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void normalizingPath() {
        Path path1 = Path.of("./path_operations/zoo/../Main.java");
        System.out.println("\nnormalized path 1: " + path1.normalize());

        Path path2 = Path.of(PARENT_PATH + "/config/../path_operations/Main.java");
        System.out.println("normalized path 2: " + path2.normalize());

        Path path3 = Path.of("../../Java_SE_17_Oracle");
        System.out.println("normalized path 3: " + path3.normalize());
        // System.out.println(Files.exists(path3));
    }

    public static void getRealPath() {
        Path path1 = Path.of("./path_operations/zoo/../Main.java");
        try {
            System.out.println("\nabsolute path 1 : " + path1.toRealPath());
        } catch (IOException e) {
            System.out.println("path 1 does not exists");
        }

        Path path2 = Path.of(PARENT_PATH + "/config/../path_operations/Main.java");
        try {
            System.out.println("absolute path 2 : " + path2.toRealPath());
        } catch (IOException e) {
            System.out.println("path 2 does not exists");
        }

        Path path3 = Path.of("../../Java_SE_17_Oracle");
        try {
            System.out.println("absolute path 3: " + path3.toRealPath());
        } catch (IOException e) {
            System.out.println("path 3 does not exists");
        }
    }

    public static void main(String[] args) {
        viewPath();
        creatingPartOfPath();
        printPathInformation(path_1);
        printPathInformation(path_2);
        resolvingPaths();
        relativizingPath();
        normalizingPath();
        getRealPath();
    } 

}
