package homework;

public class Triangle01 {
    private double base;
    private double height;

    public Triangle01(double base, double height) {
        this.base = base;
        this.height = height;
    }


    public double findArea() {
        return (this.base * this.height) / 2.0;
    }
}
