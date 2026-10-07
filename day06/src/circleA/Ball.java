package circleA;

public class Ball extends CircleTemplate {
	public Ball(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 4*PI*radius*radius;
	}
}
