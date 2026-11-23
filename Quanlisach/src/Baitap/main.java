
package Baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SachGiaoKhoa> dsSGK = new ArrayList<>();
        ArrayList<SachThamKhao> dsSTK = new ArrayList<>();

        int n;

        System.out.print("Nhap so sach giao khoa: ");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap sach giao khoa thu " + (i + 1));
            SachGiaoKhoa s = new SachGiaoKhoa();
            s.nhap(sc);
            dsSGK.add(s);
        }

        System.out.print("\nNhap so sach tham khao: ");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap sach tham khao thu " + (i + 1));
            SachThamKhao s = new SachThamKhao();
            s.nhap(sc);
            dsSTK.add(s);
        }

        System.out.println("\n===== DANH SACH SACH GIAO KHOA =====");

        for (SachGiaoKhoa s : dsSGK) {
            s.xuat();
            System.out.println("----------------------");
        }

        System.out.println("\n===== DANH SACH SACH THAM KHAO =====");

        for (SachThamKhao s : dsSTK) {
            s.xuat();
            System.out.println("----------------------");
        }

        double tongSGK = 0;
        double tongSTK = 0;

        for (SachGiaoKhoa s : dsSGK) {
            tongSGK += s.thanhTien();
        }

        for (SachThamKhao s : dsSTK) {
            tongSTK += s.thanhTien();
        }

        System.out.println("\nTong tien sach giao khoa: " + tongSGK);
        System.out.println("Tong tien sach tham khao: " + tongSTK);

        double tongDonGia = 0;

        for (SachThamKhao s : dsSTK) {
            tongDonGia += s.donGia;
        }

        if (dsSTK.size() > 0) {
            System.out.println("Trung binh don gia sach tham khao: "
                    + tongDonGia / dsSTK.size());
        } else {
            System.out.println("Khong co sach tham khao.");
        }

        System.out.println("\n===== SACH GIAO KHOA CUA NHA XUAT BAN X =====");

        for (SachGiaoKhoa s : dsSGK) {
            if (s.nhaXuatBan.equalsIgnoreCase("X")) {
                s.xuat();
                System.out.println("----------------------");
            }
        }

        sc.close();
    }
}
