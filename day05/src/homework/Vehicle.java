package homework;

class Vehicle {
    String color;
    int speed;

    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void show() {
        System.out.println("색상: " + color);
        System.out.println("속도: " + speed);
    }
}
