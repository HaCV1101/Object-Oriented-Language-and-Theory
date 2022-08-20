/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.hedspi.aims.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class MyDate {

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day <= totalDayInMonth(month) && day >= 1) {
            this.day = day;
        } else {
            System.out.println("Invalid-day");
            System.exit(0);
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (day > totalDayInMonth(month)) {
            System.out.println("Invalid-month");
            System.exit(0);
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Ko co tham so nao dat 3 thuoc tinh lam gia tri cua ngay hien tai
    public MyDate() {
        super();
        LocalDate date = java.time.LocalDate.now();
        this.year = date.getYear();
        this.month = date.getMonthValue();
        this.day = date.getDayOfMonth();
    }

    // 3 thong so ngay, thang, nam
    public MyDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.println("Invalid date");
            System.exit(0);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    final String nameMonth[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",
        "Jan.", "Feb.", "Mar.", "Apr.", "", "", "", "Aug.", "Sept.", "Oct.", "Nov.", "Dec.",
        "Jan", "Feb", "Mar", "Apr", "", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    private int checkMonth(String month) {
        month = month.trim();
        for (int i = 0; i < nameMonth.length; i++) {
            if (month.compareToIgnoreCase(nameMonth[i]) == 0) {
                if (i <= 11) {
                    return (i + 1);
                } else if (i >= 12 && i <= 23) {
                    return (i - 11);
                } else {
                    return (i - 23);
                }
            }
        }
        return -1;
    }

    final String abbDay[] = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th",
        "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st", "1", "2",
        "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
        "25", "26", "27", "28", "29", "30", "31"};

    public int totalDayInMonth(String month) {
        int i = 0;
//        System.out.println("Thang nay la: " + month);
        month = month.toLowerCase();
        switch (month) {
            case "april":
            case "apr.":
            case "apr":
            case "4":
            case "june":
            case "jun":
            case "6":
            case "september":
            case "sept.":
            case "sep":
            case "9":
            case "november":
            case "nov.":
            case "nov":
            case "11":
                i = 30;
                break;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                    i = 29;
                } else {
                    i = 28;
                }
                break;
            case "january":
            case "jan.":
            case "jan":
            case "1":
            case "march":
            case "mar.":
            case "mar":
            case "3":
            case "may":
            case "5":
            case "july":
            case "jul":
            case "7":
            case "august":
            case "aug.":
            case "aug":
            case "8":
            case "october":
            case "oct.":
            case "oct":
            case "10":
            case "december":
            case "dec.":
            case "dec":
            case "12":
                i = 31;
                break;
            default:
                i = -1;
                break;
        }
        return i;
    }

    public int totalDayInMonth(int month) {
        int i = -1;
//        System.out.println("Thang nay la: " + month);
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                i = 30;
                break;
            case 2:
                if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                    i = 29;
                } else {
                    i = 28;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                i = 31;
                break;
            default:
                break;
        }
        return i;
    }

    private int checkDay(String day) {
        day = day.trim();
        //String kq = "";
        int dayNo = -1;
        int mark = -1;
        for (int i = 0; i < abbDay.length; i++) {
            if (day.compareToIgnoreCase(abbDay[i]) == 0) {
                mark = i;
                break;
            }
        }
        if (mark < 0) {
            System.out.println("Invalid-day");
        } else if (0 <= mark && mark < 31) {
            dayNo = mark + 1;
        } else {
            dayNo = mark - 30;
        }
        return dayNo;
    }

    // 1 tham so chuoi dai dien cho mot ngay, vi du: February 18th 2019
    public MyDate(String s) {
        s = s.trim();
        String arr[] = s.split(" ");
        this.year = Integer.parseInt(arr[2]);
        int a = checkMonth(arr[0]);
        if (a == -1) {
            System.out.println("Invalid-month");
            this.month = -1;
        } else {
            this.month = a;
        }

        this.day = checkDay(arr[1]);
    }

    //lab03.c
    public void accept() {
        System.out.print("Enter date (Ex: April 2 2022, Apr 2nd 2022): ");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String arr[] = date.split(" ");
        this.year = Integer.parseInt(arr[2]);
        this.month = checkMonth(arr[0]);
        this.day = checkDay(arr[1]);
    }

    //lab03.d
    public void print() {
//        String arr[] = currentDate();
//        System.out.println(nameMonth[Integer.parseInt(arr[1])-1] +" "+  getDayByNumber(arr[2]) +" "+ arr[0]);
        System.out.println("Kyou wa " + this.month + " " + this.day + " " + this.year);
    }

    enum Day {
        first(1), second(2), third(3), fourth(4), fifth(5), sixth(6), seventh(7), eighth(8), ninth(9),
        tenth(10), eleventh(11), twelfth(12), thirteenth(13), fourteenth(14), fifteenth(15), sixteenth(16),
        seventeenth(17), eighteenth(18), nineteenth(19), twentieth(20), twenty_first(21), twenty_second(22),
        twenty_third(23), twenty_fourth(24), twenty_fifth(25), twenty_sixth(26), twenty_seventh(27), twenty_eighth(28),
        twenty_ninth(29), thirtieth(30), thirty_first(31);

        private int value;

        Day(int i) {
            value = i;
        }
    }

    public MyDate(String day, String month, String year) {
        this.day = Day.valueOf(day).value;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(month + " 1 2000", formatter);
        this.month = date.getMonthValue();
        String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] nums = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        for (int i = 0; i < tens.length; i++) {
            year = year.replaceAll(tens[i], (i + 1) + "0");
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            year = year.replaceAll(nums[i], (i + 1) + "");
        }

        String[] dateS = year.split(" ");
        String s1, s2 = "";
        if (dateS[0].contains("-")) {
            s1 = String.valueOf(Integer.parseInt(dateS[0].split("-")[0]) + Integer.parseInt(dateS[0].split("-")[1]));
        } else {
            s1 = String.valueOf(dateS[0]);
        }

        if (dateS.length > 1 && dateS[1].contains("-")) {
            s2 = String.valueOf(Integer.parseInt(dateS[1].split("-")[0]) + Integer.parseInt(dateS[1].split("-")[1]));
        } else if (dateS.length > 1) {
            s2 = dateS[1].length() == 2 ? dateS[1] : "0" + dateS[1];
        } else {
            s2 = "00";
        }
        this.year = Integer.parseInt(s1 + s2);
    }

    public void print(String format) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format, Locale.ENGLISH);
        LocalDate localDate = LocalDate.of(year, month, day);
        System.out.printf("Kyou wa %s\n", dtf.format(localDate));
    }
}
