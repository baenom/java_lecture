package homework;

public class MovablePoint extends Point{
	private int xSpeed,ySpeed;
	
	MovablePoint(int x, int y, int xSpeed, int ySpeed){
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public String toString() {
		return ySpeed + "" + ySpeed;
	}
}
