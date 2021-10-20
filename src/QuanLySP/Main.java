package QuanLySP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        quanLy.them(new SanPham("ads",12,23));
        quanLy.them(new SanPham("ads2",122,21));
        quanLy.them(new SanPham("ads3",122,22));
        quanLy.them(new SanPham("ads4",122,24));
        quanLy.in();
        //quanLy.sua();
        //quanLy.tim("ads3");
        quanLy.sua("ads3",new SanPham("lá",111,34));
        quanLy.in();


        }

}
