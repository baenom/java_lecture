package method;

import java.util.Arrays;

public class MethodTest {
	public static void main(String[] args) {
		int[] numArr = {3,6,2,4,8};
		System.out.println("getSum의 결과값"+getSum(numArr));

		
		System.out.println("getMax의 결과값"+getMax(numArr));
		
		System.out.println("getCount의 결과값"+getCount(numArr,4));
		
		swapArray(numArr);
		
		System.out.println("swapArray의 결과값"+Arrays.toString(numArr));
		
	//	또는
		System.out.print("swapArray의 결과값: [");
		for(int i = 0;i < numArr.length;i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.print("]");
		
	}
	
	public static int getSum(int[] numArr) {
		int sum = 0;
		
		for(int i = 0;i < numArr.length;i++) {
			
			sum += numArr[i];
		}
		return sum;
	}
	
	public static int getMax(int[] numArr) {
		int Max = numArr[0];
		
		for(int i = 0;i < numArr.length;i++) {
			
			Max = Max >= numArr[i]?Max:numArr[i];
		}
		return Max;
	}
	
	public static int getCount(int[] numArr, int target) {
		int count = 0;
		
		for(int i = 0;i < numArr.length;i++) {
			
			count += target > numArr[i]?0:1;
		}
		return count;
	}
	
	public static void swapArray(int[] numArr) {
		for(int i = 0;i < numArr.length/2;i++) {
			int temp = numArr[i];
			numArr[i] = numArr[numArr.length - 1 - i];
			numArr[numArr.length - 1 - i] = temp;
		}
	}
}
