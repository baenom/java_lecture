package array;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] gradeArr = { 90, 70, 80, 79, 82, 50, 70, 90, 89, 89 };
		// 코드 추가
		int sum = 0;
		int average = 0;
		for(int i = 0;i < gradeArr.length;i++) {		
			sum += gradeArr[i];
		}
		average = sum/gradeArr.length;
		System.out.println(">> 합계: " + sum);
		System.out.println(">> 평균: " + average);
	}

}
