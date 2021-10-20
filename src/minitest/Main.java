package minitest;

public class Main {
    public static void main(String[] args) {
        QuanLyHocSinh quanLyHocSinh = new QuanLyHocSinh();
        quanLyHocSinh.them(new HocVien(13,"ats",2.8));
        quanLyHocSinh.them(new HocVien(15,"aes",9.0));
        quanLyHocSinh.them(new HocVien(18,"ads",5.9));
        quanLyHocSinh.in();
        //quanLyHocSinh.xoadi(13);
        //quanLyHocSinh.in();
       // quanLyHocSinh.tim(13);
       // quanLyHocSinh.sua(14,new HocVien(15,19,"binh",8));
       // quanLyHocSinh.in();
       // quanLyHocSinh.sapXep();
       // quanLyHocSinh.in();
    }
}
