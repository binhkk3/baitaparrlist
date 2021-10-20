package minitest;

import java.util.ArrayList;

public class StudentManager implements Manneger<Student> {
    ArrayList<Student> listHocVien;
    private int idFirst = 1;

    public StudentManager(ArrayList<Student> arrayList) {
        this.listHocVien = arrayList;
    }

    public StudentManager() {
        listHocVien = new ArrayList<>();
    }

    @Override
    public void add(Student hocVien) {
        idFirst++;
        hocVien.setId(idFirst);
        listHocVien.add(hocVien);

    }

    @Override
    public void print() {
        for (int i = 0; i < listHocVien.size(); i++) {
            System.out.println(listHocVien.get(i));
        }
        System.out.println("học quá ngu");
    }

    @Override
    public int find(int id) {
        for (int i = 0; i < listHocVien.size(); i++) {
            if (listHocVien.get(i).getId() == id) {
                System.out.println("có " + id + listHocVien.get(i).getTen());
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(int id, Student hocVien) {
        int index = find(id);
        if (index == -1) {
            System.out.println(" không có để sửa");
        } else {
            listHocVien.set(index, hocVien);
        }

    }

    @Override
    public void sort() {
        listHocVien.sort((a, b) -> (int) (a.getMediumScore() - b.getMediumScore()));
// a, b chỉ là công thức số cứ ghi y nguyên;

    }

    @Override
    public void delete(int id) {
        int index = find(id);
        listHocVien.remove(index);

    }
}
