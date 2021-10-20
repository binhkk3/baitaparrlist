package minitest;

import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
        StudentManager studentManager= new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("xin chào");
            System.out.println(" nhập 1 để nhập");
            System.out.println(" nhâp 2 đê tìm kiếm");
            System.out.println("nhâp 3 để xóa");
            System.out.println("nhập 4 để sửa");
            System.out.println("nhập 5 để in ra ");
            System.out.println("nhập 0 để thoát");
            input = scanner.nextInt();
            switch (input){
                case 1 :
                    System.out.println("nhập tuổi học sinh ");
                    scanner.nextInt();


            }
        }while (

        )

    }
}
