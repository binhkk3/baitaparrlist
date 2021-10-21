package minitest;

import java.util.Scanner;

public class Main {
    private static TeacherManager teacherManager;

    public static void main(String[] args) {
        teacherManager = new TeacherManager();
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("xin chào");
        do {
            System.out.println(" nhập 1 để  nhập");
            System.out.println(" nhâp 2 đê  tìm kiếm");
            System.out.println("nhâp 3 để  xóa");
            System.out.println("nhập 4 để  sửa");
            System.out.println("nhập 5 để  in ra ");
            System.out.println("nhập 6 để  sắp xếp  ra ");
            System.out.println("nhập 0 để thoát");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("nhập tên giáo viên ");
                    String name = scanner1.nextLine();
                    System.out.println(" nhập bộ môn ");
                    String subject = scanner1.nextLine();
                    System.out.println("nhập vào tuổi giáo viên ");
                    int age = scanner1.nextInt();
                    teacherManager.add(new Teacher(age, name, subject));
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    break;
                case 2:
                    System.out.println("nhập vào id bạn muốn tìm ");
                    int idToFind = scanner.nextInt();
                    teacherManager.findTeacherById(idToFind);
                    break;
                case 5:
                    teacherManager.print();
                    break;
            }

        } while (input != 0);
    }


}
