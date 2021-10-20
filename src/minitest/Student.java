package minitest;

public class Student extends People {
    private double mediumScore;

    public Student(int age, String name, double mediumScore) {
        super(age, name);
        this.mediumScore = mediumScore;
    }

    public Student() {
    }

    public Student(double diemTrungBinh) {
        this.mediumScore = diemTrungBinh;
    }

    public Student(int id, int tuoi, String ten, double diemTrungBinh) {
        super(id, tuoi, ten);
        this.mediumScore = diemTrungBinh;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "  tên là = " + getTen() +
                " ,tuổi = " + getAge() +
                "  DiemTrungBinh=" + mediumScore +
                "  id = " + getId() +
                '}';
//        "Nguoi{" +
//                "id=" + id +
//                ", tuoi=" + tuoi +
//                ", ten='" + ten + '\'' +
//                '}';
    }
}