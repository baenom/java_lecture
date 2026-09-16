package homework;

class Car extends Vehicle {
    int displacement;
    int gears;

    public Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }

    @Override
    public void show() {
        System.out.println("색상: " + color);
        System.out.println("속도: " + speed);
        System.out.println("배기량: " + displacement);
        System.out.println("기어 단수: " + gears);
    }
}
