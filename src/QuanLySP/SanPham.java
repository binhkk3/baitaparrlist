package QuanLySP;

public class SanPham {
    private String name;
    private int gia;
    private int id;

    public SanPham() {
    }

    public SanPham(String name, int gia, int id) {
        this.name = name;
        this.gia = gia;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "name='" + name + '\'' +
                ", gia=" + gia +
                ", id=" + id +
                '}';
    }
}
