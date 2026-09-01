package grammar;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int n = in.nextInt();
		System.out.println("[구구단 "+n+"단]");
		for(int i = 1;i < 10;i++){
			
			System.out.println(n+"x"+i+"="+ i * n);
			
		}
		
	}

}
