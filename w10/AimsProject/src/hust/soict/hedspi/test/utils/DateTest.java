package hust.soict.hedspi.test.utils;
import hust.soict.hedspi.aims.utils.*;
public class DateTest {

  public static void main(String[] args) {
    MyDate[] dates = new MyDate[5];
    dates[0] = new MyDate(2020, 12, 31);
    dates[1] = new MyDate(2020, 11, 30);
    dates[2] = new MyDate(2019, 12, 31);
    dates[3] = new MyDate(2020, 12, 30);
    dates[4] = new MyDate(2021, 12, 31);
    DateUtils.SortingANumberOfDates(dates);
  }
}
