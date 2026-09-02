package homework;

import java.util.Scanner;

public class Challenge02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int result;
		System.out.print("팩토리얼 값을 구할 정수");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		result = factorial(n);
		System.out.println(result);
	}
	
	public static int factorial(int x) {
		int r = 1;
		while(x > 0) {
			r *= x;
			x--;
		}
		return r;
	}

}
