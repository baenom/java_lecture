package homework;

import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w, h,area;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("직사각형의 가로길이를 입력하세요 : ");
		
		w = in.nextDouble();
		
		System.out.print("직사각형의 세로길이를 입력하세요 : ");
		
		h = in.nextDouble();
		
		area = h * w;
		
		System.out.print("직사각형의 넓이 = " + area);
	}

}
