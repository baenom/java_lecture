package animal;

public class Eagle extends Animal {
	@Override
	void eat() {
		System.out.println("먹는다");
	}
	@Override
	void move() {
		System.out.println("난다");
	}
	@Override
	public String toString(){
		return ">>> 독수리";
	}
}
