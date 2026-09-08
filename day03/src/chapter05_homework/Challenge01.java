package chapter05_homework;

import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];
		
        for (int i = 0; i < scores.length; i++) {
            scores[i] = in.nextInt();
        }
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        
		
	}

}
