package homework;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(),Car.getNumOfRedCar());
	}

}
