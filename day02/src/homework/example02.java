package homework;

import java.util.Scanner;

public class example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int square = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int number = in.nextInt();
		
		square = number*number;
		
		System.out.printf("%d 의 제곱은 %d", number, square);
	}

}
