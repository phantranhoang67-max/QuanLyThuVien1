import java.util.Scanner;

public class QuanLyNhapSach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CHUONG TRINH QUAN LY NHAP SACH ===");

        System.out.println("\n--- NHAP THONG TIN SACH ---");
        System.out.print("Nhap ma sach: ");
        String maSach = scanner.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = scanner.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = scanner.nextInt();

        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = scanner.nextInt();

        System.out.println("\n--- CHON LOAI SACH ---");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap lua chon (1-4): ");
        int loaiSachOption = scanner.nextInt();

        String loaiSach = "";
        switch (loaiSachOption) {
            case 1:
                loaiSach = "Sach giao khoa";
                break;
            case 2:
                loaiSach = "Sach tham khao";
                break;
            case 3:
                loaiSach = "Sach chuyen nganh";
                break;
            case 4:
                loaiSach = "Sach khac";
                break;
            default:
                loaiSach = "Khong xac dinh";
                break;
        }

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        boolean hopLe = (donGia > 0) && (soLuong >= 0) && (namXuatBan > 0 && namXuatBan <= 2026);

        String phanLoaiTonKho = "";
        if (soLuong == 0) {
            phanLoaiTonKho = "Het sach";
        } else if (soLuong <= 5) {
            phanLoaiTonKho = "Sap het";
        } else if (soLuong <= 20) {
            phanLoaiTonKho = "Con it";
        } else {
            phanLoaiTonKho = "Con nhieu";
        }

        System.out.println("\n================ KET QUA ================");
        System.out.println("Ma sach          : " + maSach);
        System.out.println("Ten sach         : " + tenSach);
        System.out.println("Tac gia          : " + tacGia);
        System.out.println("Nam xuat ban     : " + namXuatBan);
        System.out.println("Loai sach        : " + loaiSach);
        System.out.println("Don gia          : " + donGia);
        System.out.println("So luong         : " + soLuong);
        System.out.println("-----------------------------------------");
        System.out.println("Thanh tien       : " + thanhTien);
        System.out.println("Phi van chuyen   : " + phiVanChuyen);
        System.out.println("TONG TIEN NHAP   : " + tongTienNhap);
        System.out.println("-----------------------------------------");
        System.out.println("Trang thai       : " + (hopLe ? "HOP LE" : "KHONG HOP LE"));
        System.out.println("Ton kho          : " + phanLoaiTonKho);
        System.out.println("=========================================");

        scanner.close();
    }
}