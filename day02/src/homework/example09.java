package homework;

import java.util.Scanner;

public class example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

        System.out.print("전공 이수 학점 : ");
        int major = in.nextInt();

        System.out.print("교양 이수 학점 : ");
        int general = in.nextInt();

        System.out.print("일반 이수 학점 : ");
        int elective = in.nextInt();

        int total = major + general + elective;

        boolean majorScore = (total >= 140) && (major >= 70);

        boolean generalScore = (general >= 30 && elective >= 30) || (general + elective >= 80);

        if (majorScore && generalScore) {
            System.out.println("졸업 가능");
        } else {
            System.out.println("졸업 불가");
        }
	}

}
