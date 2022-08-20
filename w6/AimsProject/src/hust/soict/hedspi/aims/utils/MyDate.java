package hust.soict.hedspi.aims.utils;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MyDate {
    private String date;
    private String month;
    private int year;
    private static final String arrDate[] = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21th", "22th", "23th", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"};


    // Xay dung cac phuong thuc
    // Constructor 0 tham so
    public MyDate() {
        super();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        setYear(Integer.parseInt(formatter.format(date)));
        formatter.applyPattern("MMMM");
        setMonth(formatter.format(date));
        formatter.applyPattern("dd");
        setDate(arrDate[Integer.parseInt(formatter.format(date)) - 1]);
    }

    // Constructor 3 tham so
    public MyDate(String date, String month, int year) {
        super();
        setDate(date);
        setMonth(month);
        setYear(year);
    }

    // Constructor 3 tham so (Overloading)
    public MyDate(String date, String month, String year) {
        String arrDate[] = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21th", "22th", "23th", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31th"};
        String arrDay[] = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth", "twenty-first", "twenty-second", "twenty-third", "twenty-fourth", "twenty-fifth", "twenty-sixth", "twenty-seventh", "twenty-eighth", "twenty-ninth", "thirtieth", "thirty-first"};
        for (int i = 0; i < 31; i++) {
            if (date.compareTo(arrDay[i]) == 0) {
                setDate(arrDate[i]);
            }
        }
    }

    // Constructor 1 tham so la String
    public MyDate(String aDate) {
        super();
        String token[] = aDate.split("\\s");
        setMonth(token[1]);
        setDate(token[0]);
        setYear(Integer.parseInt(token[2]));

    }

    // Cac phuong thuc get/set
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String arrDate[] = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21th", "22th", "23th", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31th"};
        boolean test = false;
        for (int i = 0; i < 31; i++) {
            if (date.compareTo(arrDate[i]) == 0) {
                this.date = date;
                test = true;
            }
        }
        if (!test) {
            this.date = null;
        }
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        String arrMonth[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        boolean test = false;
        for (int i = 0; i < 12; i++) {
            if (month.compareTo(arrMonth[i]) == 0) {
                this.month = month;
                test = true;
            }
        }
        if (!test) {
            this.month = null;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0)
            this.year = year;
        else
            this.year = 0;
    }

    // Xay dung phuong thuc accept()
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Month/Date/Year: ");
        String aDate = sc.nextLine();
        String token[] = aDate.split("\\s");
        setMonth(token[1]);
        setDate(token[0]);
        setYear(Integer.parseInt(token[2]));
    }

    // Xay dung phuong thuc print()
    public void printDays(String format) {
        String arrMonth[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String arrDate[] = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21th", "22th", "23th", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"};
        LocalDate date;
        int ngay = 0, thang = 0;
        for (int i = 0; i < 31; i++) {
            if (this.date.compareTo(arrDate[i]) == 0) {
                ngay = i + 1;
            }
        }
        for (int i = 0; i < 12; i++) {
            if (this.month.compareTo(arrMonth[i]) == 0) {
                thang = i + 1;
            }
        }
        date = LocalDate.of(year, thang, ngay);
        System.out.println(date.format(DateTimeFormatter.ofPattern(format)));
    }

    public void print() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM");
        System.out.print("Current date: " + formatter.format(date) + " ");
        formatter.applyPattern("dd");
        System.out.print(arrDate[Integer.parseInt(formatter.format(date)) - 1] + " ");
        formatter.applyPattern("yyyy");
        System.out.println(formatter.format(date));
    }

    public void printDate() {
        System.out.println("Date: " + this.month + " " + this.date + " " + this.year);
    }

}

