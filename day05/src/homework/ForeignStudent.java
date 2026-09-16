package homework;

class ForeignStudent extends Student {
    private String nationality;

    public ForeignStudent(String name, int age, int studentId, String nationality) {
        super(name, age, studentId);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String show() {
        return "외국학생[이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + getStudentId() + ", 국적 : " + nationality + "]";
    }
}
