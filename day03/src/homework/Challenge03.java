package homework;

public class Challenge03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		System.out.println(factorial(1,5));
		System.out.println(factorial(3,5));
		System.out.println(factorial(10,5));
	}
	
	public static int factorial(int x) {
		int r = 1;
		while(x > 0) {
			r *= x;
			x--;
		}
		return r;
	}
	
	public static int factorial(int x,int y) {
		int r = 1;
		if(x <= y) {
			while(x <= y) {
				r *= x;
				x++;
			}
		}else {
			return 1;
		}
		
		return r;
	}

}
