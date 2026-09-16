package homework;

class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String show() {
        return "학생[이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + studentId + "]";
    }
}
