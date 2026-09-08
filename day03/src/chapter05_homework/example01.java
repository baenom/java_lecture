package chapter05_homework;

public class example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(countChar("hello",'l'));
	}
	public static int countChar(String s,char c) {
		int count = 0;
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == c) {
	            count++;
	        }
	    }
	    return count;
	}

}
