import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bai 1: Mang so luong 5 cuon sach
        int[] soLuong = new int[5];
        int tong = 0;
        int max;

        System.out.println("===== NHAP SO LUONG 5 CUON SACH =====");

        for (int i = 0; i < 5; i++) {
            System.out.print("Sach " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
            tong += soLuong[i];
        }

        max = soLuong[0];

        System.out.println("\nSo luong sach:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Sach " + (i + 1) + ": " + soLuong[i]);

            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }

        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);
        sc.nextLine();

        // Bai 2, 3: ArrayList luu thong tin sach
        ArrayList<String> danhSachSach = new ArrayList<>();

        int chon = 0;

        // Bai 4: Menu quan ly sach
        while (chon != 8) {
            System.out.println("\n==================================");
            System.out.println("          QUAN LY SACH");
            System.out.println("==================================");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.println("----------------------------------");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    // Them sach
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();

                    System.out.print("Nhap ten sach: ");
                    String ten = sc.nextLine();

                    System.out.print("Nhap tac gia: ");
                    String tacGia = sc.nextLine();

                    System.out.print("Nhap don gia: ");
                    double donGia = sc.nextDouble();

                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    sc.nextLine();

                    String sach = ma + "|" + ten + "|" + tacGia
                            + "|" + donGia + "|" + sl;

                    danhSachSach.add(sach);

                    System.out.println("Them sach thanh cong!");
                    break;

                case 2:
                    // Hien thi sach
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach sach dang rong!");
                    } else {
                        System.out.println("\n=========== DANH SACH SACH ===========");

                        for (int i = 0; i < danhSachSach.size(); i++) {
                            String[] tt = danhSachSach.get(i).split("\\|");

                            System.out.println("\nSach " + (i + 1));
                            System.out.println("Ma sach  : " + tt[0]);
                            System.out.println("Ten sach : " + tt[1]);
                            System.out.println("Tac gia  : " + tt[2]);
                            System.out.println("Don gia  : " + tt[3]);
                            System.out.println("So luong : " + tt[4]);
                        }
                    }
                    break;

                case 3:
                    // Tim sach theo ma
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|");

                        if (tt[0].equalsIgnoreCase(maTim)) {
                            System.out.println("Ma sach  : " + tt[0]);
                            System.out.println("Ten sach : " + tt[1]);
                            System.out.println("Tac gia  : " + tt[2]);
                            System.out.println("Don gia  : " + tt[3]);
                            System.out.println("So luong : " + tt[4]);

                            timThay = true;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    // Xoa sach theo ma
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    timThay = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|");

                        if (tt[0].equalsIgnoreCase(maXoa)) {
                            danhSachSach.remove(i);
                            System.out.println("Xoa sach thanh cong!");
                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 5:
                    // Sua sach theo ma
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();
                    timThay = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|");

                        if (tt[0].equalsIgnoreCase(maSua)) {
                            System.out.print("Nhap ten sach moi: ");
                            ten = sc.nextLine();

                            System.out.print("Nhap tac gia moi: ");
                            tacGia = sc.nextLine();

                            System.out.print("Nhap don gia moi: ");
                            donGia = sc.nextDouble();

                            System.out.print("Nhap so luong moi: ");
                            sl = sc.nextInt();
                            sc.nextLine();

                            sach = tt[0] + "|" + ten + "|" + tacGia
                                    + "|" + donGia + "|" + sl;

                            danhSachSach.set(i, sach);

                            System.out.println("Sua sach thanh cong!");
                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 6:
                    // Tinh tong so luong sach
                    tong = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|");
                        tong += Integer.parseInt(tt[4]);
                    }

                    System.out.println("Tong so luong sach: " + tong);
                    break;

                case 7:
                    // Tinh tong gia tri sach
                    double tongGiaTri = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|");

                        double gia = Double.parseDouble(tt[3]);
                        int so = Integer.parseInt(tt[4]);

                        tongGiaTri += gia * so;
                    }

                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                case 8:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        }

        sc.close();
    }
}