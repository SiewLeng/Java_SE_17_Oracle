package q_21.correct;

public class AhChoo {
    static class SneezeException extends Exception {}

    static class SniffeException extends SneezeException {}

    public static void main(String[] arg) {
        try {
            throw new SneezeException();
        } catch (SneezeException e) {
        } finally {}
    }
    
}
