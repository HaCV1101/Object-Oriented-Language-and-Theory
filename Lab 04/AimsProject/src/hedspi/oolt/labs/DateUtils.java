package hedspi.oolt.labs;
import java.util.Arrays;
import java.util.Comparator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

    public class DateUtils {
        public static void compare(MyDate d1, MyDate d2) {
            LocalDate date1 = LocalDate.of(d1.getYear(), Integer.parseInt(d1.getMonth()), Integer.parseInt(d1.getDate()));
            LocalDate date2 = LocalDate.of(d2.getYear(), Integer.parseInt(d1.getMonth()), Integer.parseInt(d1.getDate()));
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);

            if (date1.compareTo(date2) > 0) {
                System.out.printf("%s sau %s.\n", dtf.format(date1), dtf.format(date2));
            } else if (date1.compareTo(date2) < 0) {
                System.out.printf("%s truoc %s.\n", dtf.format(date1), dtf.format(date2));
            } else {
                System.out.printf("%s bang %s.\n", dtf.format(date1), dtf.format(date2));
            }
        }

        public static MyDate[] sortDate(MyDate... list) {
            Arrays.sort(list, (d1, d2) -> {
                LocalDate date1 = LocalDate.of(d1.getYear(),Integer.parseInt(d1.getMonth()), Integer.parseInt(d1.getDate()));
                LocalDate date2 = LocalDate.of(d2.getYear(), Integer.parseInt(d1.getMonth()), Integer.parseInt(d1.getDate()));
                return date1.compareTo(date2);
            });
            return list;
        }
    }
