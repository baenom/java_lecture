package circle;

import java.util.Scanner;

public class CirArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 : ");
		
		double radius = sc.nextDouble();
		
		Circle c = new Circle(radius);
		
		double area = c.getArea();
		
		System.out.printf("반지름이 %.1f인 원의 넓이는 %.2f입니다", c.getRadius(), area);
		
		area = Circle.getArea(radius);
		
		System.out.printf("[static]반지름이 %.1f인 원의 넓이는 %.2f입니다", radius, area);
	}

}
