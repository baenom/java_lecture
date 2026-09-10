package homework;

public class GolfClub {
    private String name;

    public GolfClub() {
        this("7번 아이언");
    }

    public GolfClub(int number) {
        this(number + "번 아이언");
    }

    public GolfClub(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name + "입니다.");
    }
}
