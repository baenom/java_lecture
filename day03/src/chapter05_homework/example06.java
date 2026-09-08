package chapter05_homework;

public class example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		System.out.println(reverse(arr));
	}
	public static int[] reverse(int[] org) {
	    int[] reversed = new int[org.length];
	    for (int i = 0; i < org.length; i++) {
	        reversed[i] = org[org.length - 1 - i];
	    }
	    return reversed;
	}
}
