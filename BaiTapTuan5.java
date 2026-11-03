import java.util.Scanner;

public class BaiTapTuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so sach: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] ma = new String[n];
        String[] ten = new String[n];
        String[] tacGia = new String[n];
        double[] donGia = new double[n];
        int[] soLuong = new int[n];

        // Bai 1: Nhap n sach bang vong lap
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap sach thu " + (i + 1));

            System.out.print("Ma sach: ");
            ma[i] = sc.nextLine();

            System.out.print("Ten sach: ");
            ten[i] = sc.nextLine();

            System.out.print("Tac gia: ");
            tacGia[i] = sc.nextLine();

            System.out.print("Don gia: ");
            donGia[i] = sc.nextDouble();

            System.out.print("So luong: ");
            soLuong[i] = sc.nextInt();
            sc.nextLine();
        }

        // Bai 3: Menu lap den khi chon Thoat
        int chon = 0;
        while (chon != 4) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Hien thi danh sach sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nMa sach: " + ma[i]);
                        System.out.println("Ten sach: " + ten[i]);
                        System.out.println("Tac gia: " + tacGia[i]);
                        System.out.println("Don gia: " + donGia[i]);
                        System.out.println("So luong: " + soLuong[i]);
                    }
                    break;

                case 2:
                    // Bai 2: Tinh tong so luong va tong gia tri sach
                    int tongSoLuong = 0;
                    double tongGiaTri = 0;

                    for (int i = 0; i < n; i++) {
                        tongSoLuong += soLuong[i];
                        tongGiaTri += donGia[i] * soLuong[i];
                    }

                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                case 3:
                    // Bai 4: Tim sach theo ma
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < n; i++) {
                        if (ma[i].equalsIgnoreCase(maTim)) {
                            System.out.println("Ma sach: " + ma[i]);
                            System.out.println("Ten sach: " + ten[i]);
                            System.out.println("Tac gia: " + tacGia[i]);
                            System.out.println("Don gia: " + donGia[i]);
                            System.out.println("So luong: " + soLuong[i]);
                            timThay = true;
                        }
                    }

                    if (timThay == false) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        }

        sc.close();
    }
}
