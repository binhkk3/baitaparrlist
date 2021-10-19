package QuanLySP;

import java.util.ArrayList;

public class QuanLy implements PhuongThuc <SanPham> {
    ArrayList<SanPham> ListsanPam;

    public QuanLy(ArrayList<SanPham> arrayList) {
        this.ListsanPam = arrayList;
    }

    public QuanLy() {
        ListsanPam = new ArrayList<>();
    }

    @Override
    public void them(SanPham sanPham) {
     ListsanPam.add(sanPham);
    }

    @Override
    public void in() {
        for (int i = 0; i < ListsanPam.size(); i++) {
            System.out.println(ListsanPam.get(i));

        }

    }

    @Override
    public void tim(String ten) {
        for (int i = 0; i < ListsanPam.size(); i++) {
            if (ListsanPam.get)
        }
    }

    @Override
    public void sua() {

    }
}
