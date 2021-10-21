package minitest;

import java.util.Scanner;

public class MenuMain {
    private static StudentManager studentManager;


    public static void main(String[] args) {
        studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("xin chào");
        do {
            System.out.println(" nhập 1 để nhập");
            System.out.println(" nhâp 2 đê tìm kiếm");
            System.out.println("nhâp 3 để xóa");
            System.out.println("nhập 4 để sửa");
            System.out.println("nhập 5 để in ra ");
            System.out.println("nhập 6 để sắp xếp  ra ");
            System.out.println("nhập 0 để thoát");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    //scanner.nextInt();
                    System.out.println("nhập tuổi học sinh ");
                    int age = scanner.nextInt();
                    System.out.println("nhập tên học sinh ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("nhập điểm học sinh ");

                    int averageScore = scanner.nextInt();

                    studentManager.add(new Student(age, name, averageScore));
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
                    break;
                case 2:
                    System.out.println("nhập vào id muốn tìm ");
                    int idToFind = scanner.nextInt();
                    studentManager.findStudentById(idToFind);
                    break;
                case 3:
                    System.out.println("nhap vào id muốn xóa :");
                    int idToDelete = scanner.nextInt();
                    studentManager.delete(idToDelete);
                    break;
                case 4:
                    System.out.println("nhạp id muốn sửa ");
                    int idToEdit = scanner.nextInt();
                    if (studentManager.findStudentById(idToEdit) > -1) {
                        System.out.println("nhập tuổi học sinh ");
                        int age1 = scanner.nextInt();
                        System.out.println("nhập tên học sinh ");
                        scanner.nextLine();
                        String name1 = scanner.nextLine();
                        System.out.println("nhập điểm học sinh ");
                        int averageScore1 = scanner.nextInt();

                        Student newStudent = (new Student(age1, name1, averageScore1));
                        studentManager.edit(idToEdit, newStudent);
                    }
                    break;
                case 5:
                    studentManager.print();
                    break;
                case 6:
                    studentManager.sortMinToMax();
                    studentManager.print();
            }
        } while (input != 0);

    }
}
