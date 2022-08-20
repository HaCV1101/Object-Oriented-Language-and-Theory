
// vì năm nhuận với năm không nhuận chỉ khác nhau về ngày trong tháng 2 nên em nhập tháng trước sau đó nếu là tháng 2 mới tiếp tục nhập năm.
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thang: ");
        String month = sc.nextLine();

        if (month.compareTo("1") == 0 || month.compareTo("3") == 0 || month.compareTo("5") == 0
                || month.compareTo("7") == 0 || month.compareTo("8") == 0 || month.compareTo("10") == 0
                || month.compareTo("12") == 0)
            System.out.println("Thang " + month + " co 31 ngay.");
        else if (month.compareTo("January") == 0 || month.compareTo("March") == 0
                || month.compareTo("May") == 0 || month.compareTo("July") == 0 || month.compareTo("August") == 0
                || month.compareTo("October") == 0 || month.compareTo("December") == 0 || month.compareTo("Jan") == 0
                || month.compareTo("Jan.") == 0 || month.compareTo("Mar") == 0 || month.compareTo("Mar.") == 0
                || month.compareTo("Jul") == 0 || month.compareTo("Aug") == 0 || month.compareTo("Aug.") == 0
                || month.compareTo("Oct") == 0 || month.compareTo("Oct.") == 0 || month.compareTo("Dec") == 0
                || month.compareTo("Dec.") == 0)
            System.out.println(month + " has 31 days.\n");

        else if (month.compareTo("4") == 0 || month.compareTo("6") == 0 || month.compareTo("9") == 0
                || month.compareTo("11") == 0)
            System.out.println("Thang " + month + " co 30 ngay.\n");

        else if (month.compareTo("April") == 0 || month.compareTo("Apr.") == 0
                || month.compareTo("Apr") == 0 || month.compareTo("June") == 0 || month.compareTo("Jun") == 0
                || month.compareTo("September") == 0 || month.compareTo("Sept.") == 0 || month.compareTo("Sep") == 0
                || month.compareTo("November") == 0 || month.compareTo("Nov.") == 0 || month.compareTo("Nov") == 0)
            System.out.println(month + " has 30 days.\n");
        else if (month.compareTo("2") == 0 || month.compareTo("February") == 0 || month.compareTo("Feb.") == 0
                || month.compareTo("Feb") == 0)

        {
            System.out.print("Nhap nam: ");
            String year = sc.nextLine();
            if (Integer.parseInt(year) > 0) {
                if ((Integer.parseInt(year) % 4 == 0) && (Integer.parseInt(year) % 100 != 0)
                        || (Integer.parseInt(year) % 400) == 0) {
                    if (month.compareTo("2") == 0)
                        System.out.print("Thang " + month + " co 29 ngay.\n");
                    else if (month.compareTo("February") == 0 || month.compareTo("Feb.") == 0
                            || month.compareTo("Feb") == 0)
                        System.out.print(month + " has 29 days.\n");
                } else {
                    if (month.compareTo("2") == 0)
                        System.out.print("Thang " + month + " co 28 ngay.\n");
                    else if (month.compareTo("February") == 0 || month.compareTo("Feb.") == 0
                            || month.compareTo("Feb") == 0)
                        System.out.print(month + " has 28 days.\n");
                }

            } else
                System.out.println("Ban da nhap sai!");
        } else {
            System.out.print("Ban da nhap sai. Hay nhap lai.\n");
            Calendar.main(args);
            sc.close();
            System.exit(0);
        }
    }
}
