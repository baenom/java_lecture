package animal;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Tiger();
		printDayLife(a);
		a = new Goldfish();
		printDayLife(a);
		Animal[] animals = {new Tiger(),new Goldfish(),new Tiger()};
		
		for(Animal i : animals) {
			printDayLife(i);
		}
	}
	
	public static void printDayLife(Animal a) {
		System.out.println(a);
		a.eat();
		a.move();
		a.sleep();
	}
}
