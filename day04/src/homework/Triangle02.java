package homework;

public class Triangle02 {
    private double base;
    private double height;

    public Triangle02(double base, double height) {
        this.base = base;
        this.height = height;
    }



    public double findArea() {
        return (this.base * this.height) / 2.0;
    }

    public boolean isSameArea(Triangle02 t) {
        return this.findArea() == t.findArea();
    }
}
