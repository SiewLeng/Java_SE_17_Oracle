package q_28.incorrect;

public abstract class Elephant {
    abstract private class SleepsAlot {
        abstract int sleep();
    } 

    class SleepsAlotExtended extends SleepsAlot {
        public int sleep() {
            return 7;
        }
    }
}