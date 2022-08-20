import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so luong phan tu: ");
        Integer n = sc.nextInt();

        // Khai bao mang
        int a[] = new int[n];
        nhapMang(a, n, sc);

        // Hien thi mang
        System.out.print("Mang gom cac phan tu: ");
        hienThi(a, n);
        System.out.print("\n");

        // Sap xep mang
        System.out.print("Mang cac phan tu sau khi sap xep tang dan la: ");
        sapXepTangDan(a, n);
        hienThi(a, n);
        System.out.println();

        // Tinh tong
        System.out.print("Tong cac so co trong mang la: ");
        tinhTong(a, n);
        System.out.println();

        // Tinh trung binh
        System.out.print("Trung binh cac so co trong mang la: ");
        tinhTrungBinh(a, n);
        System.out.println();

        sc.close();
        System.exit(0);
    }

    // Nhap mang
    public static void nhapMang(int a[], int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + " la: ");
            a[i] = sc.nextInt();
        }
    }

    // Hien thi mang
    public static void hienThi(int a[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print("\t" + a[i]);
    }

    // Sap xep mang
    public static void sapXepTangDan(int a[], int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }

        }

    }

    // Tinh tong cac so trong mang
    public static void tinhTong(int a[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        System.out.print(sum);
    }

    // Tinh trung binh cac so trong mang
    public static void tinhTrungBinh(int a[], int n) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        avg = sum / n;
        System.out.print(avg);

    }

}
