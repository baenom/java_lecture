package chapter05_homework;

public class example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 2, 4, 1, 5 };
        int[] b = { 3, 2, 4, 1 };
        int[] c = { 3, 2, 4, 1, 5 };
        int[] d = { 2, 7, 1, 8, 2 };

        System.out.println("a와 b 비교: " + equal(a, b));
        System.out.println("a와 c 비교: " + equal(a, c));
        System.out.println("a와 d 비교: " + equal(a, d));
	}
	public static boolean equal(int[] a, int[] b) {
        if (a == b) return true;
        if (a == null || b == null || a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
