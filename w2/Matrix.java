import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhap hang cua Matix
        System.out.print("Nhap hang cua mang hai chieu: ");
        int m = sc.nextInt();
        System.out.println();

        // Nhap cot cua Matrix
        System.out.print("Nhap cot cua mang hai chieu: ");
        int n = sc.nextInt();
        System.out.println();

        // Khai bao mang
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];

        // Nhap mang
        System.out.print("Nhap vao mang 2 chieu: \n");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap phan tu thu [" + i + "," + j + "] cua mang a: ");
                a[i][j] = sc.nextInt();
                System.out.print("\n");
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap phan tu thu [" + i + "," + j + "] cua mang b: ");
                b[i][j] = sc.nextInt();
                System.out.print("\n");
            }
        }

        System.out.print("Mang vua nhap la:");
        System.out.println();

        System.out.print("Mang a: \n");
        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n\n");
        }
        System.out.println();

        System.out.print("Mang b: \n");
        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.print("\n\n");
        }
        System.out.println();

        System.out.print("Tong cua hai ma tran (cung kich thuoc) la: \n");
        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + b[i][j] + "\t");
            }
            System.out.println("\n");
        }
        sc.close();
        System.exit(0);

    }

}
