package homework;

public class Triangle01 {
    private double base;
    private double height;

    public Triangle01(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double findArea() {
        return (base * height) / 2.0;
    }
}
