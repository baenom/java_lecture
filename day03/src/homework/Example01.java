package homework;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		System.out.print("나이");
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		
		if(19 <= age) {
			System.out.print("성년");
		}else {
			System.out.print("미성년");
		}
	}
	
}
