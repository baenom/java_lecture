package circle;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>> 원 : ");
		Circle c = new Circle(5.0);
		printCircleInfo(c);
		
		System.out.println(">>> 구 : ");
		Ball b = new Ball(5.0);
		printCircleInfo(c);
		
		System.out.println(">>> 원통 : ");
		Cylinder cy = new Cylinder(5.0,7.0);
		printCircleInfo(c);
		Cylinder cy2 = (Cylinder)cy;
		System.out.println("높이 : " + cy2.getHeight());
		
		
	}
	
	public static void printCircleInfo(Circle c) {
		System.out.println("반지름 : " + c.getRadius());
		System.out.println("면적 : " + c.getArea());
	}

}
