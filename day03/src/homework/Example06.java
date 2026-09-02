package homework;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("철수 : ");
		String challsu = in.next();
		System.out.print("영희 : ");
		String younghee = in.next();
		
		if(!younghee.equals(challsu)) {
			int difference = (int)younghee.charAt(0) - (int)challsu.charAt(0);
			if(difference == -2 || difference == 3 || difference == -1) {
				System.out.print("영희 승");
			}else {
				System.out.print("철수 승");
			}
		}else {
			System.out.print("무승부");
		}
		
		
		
	}

}
