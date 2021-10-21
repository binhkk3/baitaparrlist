package minitest;

import java.util.ArrayList;

public class TeacherManager implements Manager<Teacher> {
    ArrayList<Teacher> listTeacher;
    private int idFirst = 1;

    public TeacherManager(ArrayList<Teacher> arrayList) {
        this.listTeacher = arrayList;
    }

    public TeacherManager() {
        listTeacher = new ArrayList<>();
    }

    @Override
    public void add(Teacher teacher) {
        idFirst++;
        teacher.setId(idFirst);
        listTeacher.add(teacher);
    }

    @Override
    public void print() {
        for (int i = 0; i < listTeacher.size(); i++) {
            System.out.println(listTeacher.get(i));
        }
        System.out.println("học quá ngu");

    }

    public int findTeacherById(int id) {
        // find tìm kiếm
        for (int i = 0; i < listTeacher.size(); i++) {
            if (listTeacher.get(i).getId() == id) {
                System.out.println("có " + id + " có tên là " + listTeacher.get(i).getName());
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(int id, Teacher teacher) {

    }


    @Override
    public void delete(int id) {

    }
}
