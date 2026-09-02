package homework;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 1; a<=20;a++) {
			for(int b = 1; b<=20;b++) {
				int c = (int)root(a*a + b*b);
				if(c*c == a*a + b*b && a+b+c <= 20) {
					System.out.println("a:"+a+"b:"+b+"c:"+c);
				}
				
			}
		}
	}
	public static double root(double n) {
        double low = 0.0;
        double high = n;
        double mid = 0.0;
        
        for (int i = 0; i < 100; i++) {
            mid = (low + high) / 2.0;
            if (mid * mid < n) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return mid;
	}

}
