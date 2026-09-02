package homework;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int num;
		int sum = 0;
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			num = in.nextInt();
			sum += num % 2 == 0?num:0;
		}while(num > 0);
		System.out.print("양의 정수중에서 짝수의 합은 "+sum);
	}

}
