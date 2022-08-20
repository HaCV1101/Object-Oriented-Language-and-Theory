package hust.soict.hedspi.aims.utils;

import java.util.Arrays;
import java.util.Comparator;

public class DateUtils {

  public static int compareTwoDate(MyDate date1, MyDate date2) {
    int compare = Integer.compare(date1.getYear(), date2.getYear());
    if (compare != 0) {
      return compare;
    }
    compare = Integer.compare(date1.getMonth(), date2.getMonth());
    if (compare != 0) {
      return compare;
    }
    compare = Integer.compare(date1.getDay(), date2.getDay());
    return compare;
  }

  public static void SortingANumberOfDates(MyDate[] dates) {
    Arrays.sort(dates, new Comparator<MyDate>() {
      @Override
      public int compare(MyDate date1, MyDate date2) {
        return DateUtils.compareTwoDate(date1, date2);
      }
    });
    for (MyDate date : dates
    ) {
      date.printDate("MMMM-dd-yyyy");
    }
  }
}
