package minitest;

public class Student extends People {
    private double averageScore;

    public Student(int age, String name, double averageScore) {
        super(age, name);
        this.averageScore = averageScore;
    }

    public Student() {
    }

    public Student(double averageScore) {
        this.averageScore = averageScore;
    }

    public Student(int id, int age, String name, double averageScore) {
        super(id, age, name);
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "  tên là = " + getName() +
                " ,tuổi = " + getAge() +
                "  DiemTrungBinh=" + averageScore +
                "  id = " + getId() +
                '}';

    }
}
