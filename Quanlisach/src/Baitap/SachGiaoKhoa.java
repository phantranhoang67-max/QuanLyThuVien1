
package Baitap;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public void nhap(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("Nhap tinh trang (moi/cu): ");
        tinhTrang = sc.nextLine();
    }

    @Override
    public double thanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }

    public void xuat() {
        super.xuatThongTin();
        System.out.println("Tinh trang: " + tinhTrang);
        System.out.println("Thanh tien: " + thanhTien());
    }
}
