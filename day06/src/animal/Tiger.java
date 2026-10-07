package animal;

public class Tiger extends Animal{
	@Override
	void eat() {
		System.out.println("먹는다");
	}
	@Override
	void move() {
		System.out.println("뛴다");
	}
	@Override
	void sleep() {
		System.out.println("잔다");
	}
	@Override
	public String toString(){
		return ">>> 호랑이";
	}
	
}
