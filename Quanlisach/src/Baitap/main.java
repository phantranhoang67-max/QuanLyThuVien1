package Baitap;


import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Sach> danhSach = new ArrayList<Sach>();

        Sach Toan = new Sach("S01", "Giai tich", "Nguyen Van A", 2022, 10);
        Sach Ly = new Sach("S02", "Vat li dai cuong", "Tran Van B", 2023, 15);
        Sach Hoa = new Sach("S03", "Hoa hoc moi truong", "Le Van C", 2021, 20);

        danhSach.add(Toan); 
        danhSach.add(Ly);
        danhSach.add(Hoa);

        System.out.println("DANH SACH SACH");

        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("\nThong tin sach thu " + (i + 1));
            danhSach.get(i).hienThiThongTin();
        }
    }
}
