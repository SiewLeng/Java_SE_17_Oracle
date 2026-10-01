package q_7.correct;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {

    public void tryAgain_1(String s)  {
        // Using try-with-resources automatically closes the reader
        String filePath = "C:\\Users\\LENOVO\\code\\Java_SE_17_Oracle\\chapter_11_exceptionAndLocalization\\q_7\\correct\\test.txt";
        try (FileReader r = null; FileReader p = new FileReader(filePath)) {
            System.out.println("X");
            throw new IllegalArgumentException();
        } catch (Exception e_1) {
            try {
                System.out.println("A");
                throw new FileNotFoundException();
            } catch (FileNotFoundException e_2) {
                System.out.println(e_1 + ", " + e_2);
            } 
        } finally {
            // The finally block always executes, whether or not an exception occurs
            System.out.println("O");
        }
    }

    public void tryAgain_2(String s) throws FileNotFoundException {
        // Using try-with-resources automatically closes the reader
        String invalidFilePath = "test.txt";
        try (FileReader r = null; FileReader p = new FileReader(invalidFilePath)) {
            System.out.print("X");
            throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.print("A");
            throw new FileNotFoundException();
        } finally {
            // The finally block always executes, whether or not an exception occurs
            System.out.print("O");
        }
    }

    public void tryAgain_3(String s)  {
        // Using try-with-resources automatically closes the reader
        String filePath = "C:\\Users\\LENOVO\\code\\Java_SE_17_Oracle\\chapter_11_exceptionAndLocalization\\q_7\\correct\\test.txt";
        try (FileReader r = null; FileReader p = new FileReader(filePath)) {
            System.out.println("X");
            throw new IllegalArgumentException();
        } catch (Exception e_1) {
            System.out.println("A");
        } finally {
            // The finally block always executes, whether or not an exception occurs
            System.out.println("O");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Test().tryAgain_1("Cat");
        System.out.println("**********************");
        new Test().tryAgain_3("Cat");
        System.out.println("**********************");
        new Test().tryAgain_2("Cat");
       
    }

}
