package homework;

import java.util.Scanner;

public class example03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.print("원기둥의 밑면 반지름은? ");
        double radius = in.nextDouble();

        System.out.print("원기둥의 높이는? ");
        double height = in.nextDouble();

        double volume = radius * radius * 3.14 * height;

        System.out.println("원기둥의 부피는 " + volume);
    }
}
