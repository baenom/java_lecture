package homework;

import java.util.Scanner;

public class Challenge02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		
		number = in.nextInt();

		if(number % 2 == 0) {
			System.out.print("짝수");
		}else {
			System.out.print("홀수");
		}
		
		
	}

}
