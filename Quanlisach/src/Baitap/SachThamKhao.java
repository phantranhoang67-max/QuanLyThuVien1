
package Baitap;

import java.util.Scanner;

public class SachThamKhao extends Sach {
    private double thue;

    public void nhap(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("Nhap thue: ");
        thue = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double thanhTien() {
        return soLuong * donGia + thue;
    }

    public void xuat() {
        super.xuatThongTin();
        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + thanhTien());
    }
}
