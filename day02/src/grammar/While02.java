package grammar;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요:");
			int n = in.nextInt();
			
			System.out.print(n%2==0? "짝수":"홀수");
			
			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) :");
			int s = in.nextInt();
			
			if(s == 0) {
				break;
			}
		}
	}

}
