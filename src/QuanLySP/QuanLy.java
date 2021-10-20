package QuanLySP;

import java.util.ArrayList;

public class QuanLy implements PhuongThuc <SanPham> {
    ArrayList<SanPham> ListsanPam;
//    private int index = -1;

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
        System.out.println("..................................");

    }
    @Override
    public int tim(String name) {
        for (int i = 0; i < ListsanPam.size(); i++) {
            if (ListsanPam.get(i).getName().equals(name)){
                System.out.println("có "+name);
                return i;
            }

        }
        return -1;
    }

    @Override
    public void sua(String name, SanPham sanPham) {
        int index = tim(name);
        if (index==-1){
            System.out.println("không co de xoa");
        }
        else {
            ListsanPam.set(index ,sanPham);
        }
    }
    @Override
    public void xoa(String name) {
        int index = tim(name);
        if (index==-1){
            System.out.println("không co de xoa");
        }
        else {
            ListsanPam.remove(index );
        }
    }

}
