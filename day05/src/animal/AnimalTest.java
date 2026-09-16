package animal;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>독수리");
		Eagle e = new Eagle();
		e.eat();
		e.flying();
		e.sleep();
		
		System.out.println(">>호랑이");
		Tiger t = new Tiger();
		t.eat();
		t.run();
		t.sleep();
		
		System.out.println(">>금붕어");
		Goldfish g = new Goldfish();
		g.eat();
		g.sweem();
		g.sleep();
	}

}
