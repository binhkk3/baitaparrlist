package minitest;

public class Nguoi {
    private int id;
    private int tuoi;
    private String ten;

    public Nguoi() {
    }

    public Nguoi(int id, int tuoi, String ten) {
        this.id = id;
        this.tuoi = tuoi;
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "id=" + id +
                ", tuoi=" + tuoi +
                ", ten='" + ten + '\'' +
                '}';
    }
}
