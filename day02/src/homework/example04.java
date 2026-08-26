package homework;

import java.util.Scanner;

public class example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

        System.out.print("초 단위 정수를 입력하세요 : ");
        int seconds = in.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int lastSeconds = seconds % 60;

        System.out.println(hours + "시간 " + minutes + "분 " + lastSeconds + "초");
	}

}
