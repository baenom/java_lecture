package grammar;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("숫자를 입력하세요:");
		int n = in.nextInt();
		for(int i = 1 ; i < n+1 ; i++) {
			sum += i;
		}
		System.out.print("1부터 "+n+"까지의 합은"+sum+"입니다");
	}

}
