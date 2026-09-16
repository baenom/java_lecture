package animal;

public class Eagle extends Animal {
	String wing;
	
	public void flying () {
		System.out.println("난다");
	}
	@Override
	public void eat() {
		System.out.println("고기를 먹는다");
	}
}
