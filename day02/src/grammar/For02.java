package grammar;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(int i = 0;i < 5;i++){
			System.out.print("숫자를 입력하세요:");
			int n = in.nextInt();
			
			sum += n;
		}
		System.out.print("5개 숫자의 합은 "+ sum +"입니다");
	}

}
