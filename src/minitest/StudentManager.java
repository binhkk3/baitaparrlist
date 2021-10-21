package minitest;

import java.util.ArrayList;

public class StudentManager implements Manager<Student> {
    ArrayList<Student> listStudent;
    private int idFirst = 1;

    public StudentManager(ArrayList<Student> arrayList) {
        this.listStudent = arrayList;
    }

    public StudentManager() {
        listStudent = new ArrayList<>();
    }

    @Override
    public void add(Student student) {
        idFirst++;
        student.setId(idFirst);
        listStudent.add(student);

    }

    @Override
    public void print() {
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i));
        }
        System.out.println("học quá ngu");
    }


    public int findStudentById(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                System.out.println("có " + id + listStudent.get(i).getName());
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(int id, Student student) {
        int index = findStudentById(id);
        if (index == -1) {
            System.out.println(" không có để sửa");
        } else {
            listStudent.set(index, student);
        }

    }


    public void sortMinToMax() {
        listStudent.sort((a, b) -> (int) (a.getAverageScore() - b.getAverageScore()));
// a, b chỉ là công thức số cứ ghi y nguyên;

    }

    @Override
    public void delete(int id) {
        int index = findStudentById(id);
        listStudent.remove(index);

    }
}
