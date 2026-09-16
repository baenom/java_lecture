package homework;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String show() {
        return "사람[이름 : " + name + ", 나이 : " + age + "]";
    }
}
