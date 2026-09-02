package homework;

import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		int n;
		System.out.print("팩토리얼 값을 구할 정수");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		result = 1;
//		while(n > 0) {
//			result *= n;
//			n--;
//		}
		while(true) {
			if(n <= 0) {
				break;
			}
			result *= n;
			n--;
			
			
		}
		System.out.println(result);
	}

}
