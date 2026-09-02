package method;

public class Gugudam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		gugudan(num);
		
		
		for(int i = 2;i<10;i++) {
			gugudan(i);
			System.out.println();
		}
	}
	
	public static void gugudan(int num) {
		System.out.println("[구구단 "+ num + "단]");
		for(int i = 1;i < 10;i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
}
