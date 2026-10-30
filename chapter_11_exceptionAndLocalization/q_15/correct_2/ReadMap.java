package q_15.correct_2;

import java.util.Locale;

public class ReadMap implements AutoCloseable {
    private Locale locale;
    private boolean closed = false;

    @Override
    public void close() {
        System.out.println("Folding map");
        locale = null;
        closed = true;
    }

    public void open() {
        this.locale = Locale.of("wp", "VM");
    }

    public void use() {
        // Implementation omitted
    }

    public static void main(String[] arg) {
        try(ReadMap rm = new ReadMap()) {
            rm.open();
            rm.use();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}