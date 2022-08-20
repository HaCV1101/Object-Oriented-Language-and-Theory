/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.hedspi.aims.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author ADMIN
 */
public class DateUtils {

    public static void compare(MyDate d1, MyDate d2) {
        LocalDate date1 = LocalDate.of(d1.getYear(), d1.getMonth(), d1.getDay());
        LocalDate date2 = LocalDate.of(d2.getYear(), d2.getMonth(), d2.getDay());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);

        if (date1.compareTo(date2) > 0) {
            System.out.printf("%s sau %s\n", dtf.format(date1), dtf.format(date2));
        } else if (date1.compareTo(date2) < 0) {
            System.out.printf("%s trước %s\n", dtf.format(date1), dtf.format(date2));
        } else {
            System.out.printf("Hai ngày đều cùng là %s\n", dtf.format(date1));
        }
    }

    public static MyDate[] sortDate(MyDate... list) {
        Arrays.sort(list, (d1, d2) -> {
            LocalDate date1 = LocalDate.of(d1.getYear(), d1.getMonth(), d1.getDay());
            LocalDate date2 = LocalDate.of(d2.getYear(), d2.getMonth(), d2.getDay());
            return date1.compareTo(date2);
        });
        return list;
    }
}
