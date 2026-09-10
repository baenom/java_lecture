package homework;

public class Dice {
    private int face;

    public int roll() {
        face = (int) (Math.random() * 6) + 1;
        return face;
    }

    public int getFace() {
        return face;
    }
}