package q_21;

public class Test {
    
    @FunctionalInterface
    public interface Transport {
        public int go();
        public boolean equals(Object o);
    }
    
    @FunctionalInterface
    public abstract class Car {
        public abstract Object swim(double speed, int duration);
    }
    
    @FunctionalInterface
    public interface Locomotive extends Train {
        public int getSpeed();
    }

    @FunctionalInterface
    public interface Train extends Transport {}
    
    @FunctionalInterface
    abstract interface Spaceship extends Transport {
        default int blastOff();
    }

    @FunctionalInterface
    public interface Boat {
        int hashCode();
        int hashCode(String input);
    }

}
