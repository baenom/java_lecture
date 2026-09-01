package grammar;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이 :");
		double w = in.nextDouble();
		
		System.out.print("직사각형의 세로 길이 :");
		double h = in.nextDouble();
		
		System.out.print("직사각형의 넓이는 "+ h*w +"cm 입니다");
		
	}

}
