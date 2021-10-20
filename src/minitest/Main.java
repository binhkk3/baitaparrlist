package minitest;

public class Main {
    public static void main(String[] args) {
        StudentManager quanLyHocSinh = new StudentManager();
        TeacherManager peopleManager = new TeacherManager();
        quanLyHocSinh.add(new Student(13, "ats", 2.8));
        quanLyHocSinh.add(new Student(15, "aes", 9.0));
        quanLyHocSinh.add(new Student(18, "ads", 5.9));
        peopleManager.add(new Teacher(18, "lfaas", "van"));
        peopleManager.print();
        quanLyHocSinh.print();
        //quanLyHocSinh.xoadi(13);
        //quanLyHocSinh.in();
        // quanLyHocSinh.tim(13);
        // quanLyHocSinh.sua(14,new HocVien(15,19,"binh",8));
        // quanLyHocSinh.in();
        // quanLyHocSinh.sapXep();
        // quanLyHocSinh.in();
    }
}
