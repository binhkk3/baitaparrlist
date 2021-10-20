package minitest;

import java.util.ArrayList;

public class TeacherManager implements Manneger<Teacher> {
    ArrayList<Teacher> listTeacher;
    private int idFist = 1;

    public TeacherManager(ArrayList<Teacher> arrayList) {
        this.listTeacher = arrayList;
    }

    public TeacherManager() {
        listTeacher = new ArrayList<>();
    }

    @Override
    public void add(Teacher teacher) {
        idFist++;
        teacher.setId(idFist);
        listTeacher.add(teacher);
    }

    @Override
    public void print() {
        for (int i = 0; i < listTeacher.size(); i++) {
            System.out.println(listTeacher.get(i));
        }
        System.out.println("học quá ngu");

    }

    @Override
    public int find(int id) {
        // find tìm kiếm
        for (int i = 0; i < listTeacher.size(); i++) {
            if (listTeacher.get(i).getId() == id) {
                System.out.println("có " + id + " có tên là " + listTeacher.get(i).getTen());
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(int id, Teacher teacher) {

    }

    @Override
    public void sort() {

    }

    @Override
    public void delete(int id) {

    }
}
