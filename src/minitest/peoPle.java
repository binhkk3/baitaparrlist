package minitest;

public class peoPle {
    private int id ;

    private int age;
    private String name;

    public peoPle() {
    }

    public peoPle(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public peoPle(int id, int tuoi, String ten) {
        this.id = id;
        this.age = tuoi;
        this.name = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTen() {
        return name;
    }

    public void setTen(String ten) {
        this.name = ten;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "id=" + id +
                ", tuoi=" + age +
                ", ten='" + name + '\'' +
                '}';
    }
}
