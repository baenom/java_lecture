package homework;

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("파랑", 200, 1000, 5);
        c.show();

        System.out.println();
        Vehicle v = c;
        v.show();
	}

}
