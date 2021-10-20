package minitest;

public class HocVien extends   Nguoi   {
private double DiemTrungBinh;

    public HocVien() {
    }

    public HocVien(double diemTrungBinh) {
        DiemTrungBinh = diemTrungBinh;
    }

    public HocVien(int id, int tuoi, String ten, double diemTrungBinh) {
        super(id, tuoi, ten);
        DiemTrungBinh = diemTrungBinh;
    }

    public double getDiemTrungBinh() {
        return DiemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        DiemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                " , tên là = "+ getTen() +
                " ,tuổi = " + getTuoi() +
                "DiemTrungBinh=" + DiemTrungBinh +
                "  id = " + getId() +
                '}';
//        "Nguoi{" +
//                "id=" + id +
//                ", tuoi=" + tuoi +
//                ", ten='" + ten + '\'' +
//                '}';
    }
}
