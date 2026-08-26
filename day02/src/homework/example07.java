package homework;

import java.util.Scanner;

public class example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = in.nextInt();

        boolean order1 = (x % 4 == 0) && (x % 5 == 0);
        boolean order2 = (x % 4 == 0) || (x % 5 == 0);
        boolean order3 = (x % 4 == 0) ^ (x % 5 == 0);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
	}

}
