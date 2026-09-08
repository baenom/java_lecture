package chapter05_homework;

import java.util.Scanner;

public class example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("URL을 입력하세요 : ");
            String url = in.nextLine().trim();

            if (url.equalsIgnoreCase("bye")) {
                break;
            }

            if (url.endsWith("com")) {
                System.out.println(url + "은 'com'으로 끝납니다.");
            }
            if (url.contains("java")) {
                System.out.println(url + "은 'java'를 포함합니다.");
            }
        }
	}

}
