package minitest;

import java.util.ArrayList;

public class QuanLyHocSinh implements QuanLy <HocVien> {
    ArrayList<HocVien> listHocVien;
    public QuanLyHocSinh (ArrayList<HocVien> arrayList){
        this.listHocVien = arrayList;
    }
    public QuanLyHocSinh(){
        listHocVien = new ArrayList<>();
    }
    @Override
    public void them(HocVien hocVien) {
listHocVien.add(hocVien);
    }

    @Override
    public void in() {
        for (int i = 0; i < listHocVien.size(); i++) {
            System.out.println(listHocVien.get(i));
        }
        System.out.println("học quá ngu");
    }

    @Override
    public int tim(int id) {
        for (int i = 0; i < listHocVien.size(); i++) {
            if(listHocVien.get(i).getId() == id){
                System.out.println("có " +id +listHocVien.get(i).getTen());
                return i;
            }
            }
        return -1;
    }

    @Override
    public void sua(int id, HocVien hocVien) {
        int index = tim(id);
        if (index==-1){
            System.out.println(" không có để sửa");
        }
        else {
            listHocVien.set(index,hocVien);
        }

    }

    @Override
    public void sapXep() {
listHocVien.sort((a,b)-> (int) (a.getDiemTrungBinh()-b.getDiemTrungBinh()));
// a, b chỉ là công thức số cứ ghi y nguyên;

    }

    @Override
    public void xoadi(int id) {
        int index = tim(id);
        listHocVien.remove(index);

    }
}
