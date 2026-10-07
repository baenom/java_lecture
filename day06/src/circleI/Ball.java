package circleI;

public class Ball implements CircleTemplate {
	private double radius;
	public Ball(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 4*PI*radius*radius;
	}
	
}
