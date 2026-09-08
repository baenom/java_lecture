package chapter05_homework;

import java.util.Scanner;

public class example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int[] counts = new int[10];

        System.out.println("숫자를 10개 입력하세요.");
        for (int i = 0; i < 10; i++) {
            int num = in.nextInt();

            if (num >= 0 && num < 100) {
                counts[num / 10]++;
            }
        }

        for (int i = 0; i < counts.length; i++) {
            int start = i * 10;
            int end = start + 9;
            System.out.printf("%2d ~ %2d : ", start, end);

            for (int j = 0; j < counts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
