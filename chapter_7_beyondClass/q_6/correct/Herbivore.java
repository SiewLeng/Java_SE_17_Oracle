package q_6.correct;

public abstract interface Herbivore {
    int amount = 10;
    public void eatGrass();
    public abstract int chew();
}

abstract class IsAPlant implements Herbivore {
    Object eatGrass(int season) { return null; }
}
