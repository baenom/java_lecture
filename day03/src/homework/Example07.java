package homework;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = input("철수");
		String y = input("영희");
		
		
		whosWin(c,y);
	}
	
	public static String input(String cy) {
		Scanner in = new Scanner(System.in);
		System.out.print(cy+" : ");
		String rsp = in.next();
		return rsp;
	}
	
	public static void whosWin(String challsu,String younghee) {
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
