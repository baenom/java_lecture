package circle;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] circles = {new Circle(5.0), new Ball(5.0), new Cylinder(5.0,7.0)};
		
		for (Circle c : circles) {
			printCircleInfo(c);
		}
	}
	
	public static void printCircleInfo(Circle c) {
		if(c instanceof Ball) {
			System.out.println(">>> 구 : ");
		}else if(c instanceof Cylinder) {
			System.out.println(">>> 원통 : ");
		}else{System.out.println(">>> 원 : ");}
		System.out.println("반지름 : " + c.getRadius());
		if(c instanceof Cylinder) {
			Cylinder cy = (Cylinder)c;
			System.out.println("높이 : " + cy.getHeight());
		}
		System.out.println("면적 : " + c.getArea());
	}

}
