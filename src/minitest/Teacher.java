package minitest;

public class Teacher extends People {
    private String subject; // là môn dạy

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(int age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }

    public Teacher(int id, int age, String name, String subject) {
        super(id, age, name);
        this.subject = subject;
    }

    public Teacher() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                " ,tên là :" + getName() +
                " , tuổi là :" + getAge() +
                " ,id là: " + getId() +
                "  ,subject='" + subject + '\'' +
                '}';
    }
}
