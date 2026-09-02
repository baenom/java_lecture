package homework;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("등수");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		switch (score) {
		case 1: System.out.print("아주잘했습니다");
			break;
		case 2:
		case 3: System.out.print("잘했습니다");
			break;
		case 4:
		case 5:
		case 6: System.out.print("보통입니다");
			break; 
		default: System.out.print("노력하셔야겠습니다");
		}
	}

}
