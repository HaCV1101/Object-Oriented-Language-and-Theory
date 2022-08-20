package hust.soict.hedspi.aims.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyDate {

  private static final String[] strDay = new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th",
      "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th",
      "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th",
      "30th", "31st"};
  private static final String[] strDay1 = new String[]{"first", "second", "third", "fourth",
      "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth",
      "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth",
      "twentieth", "twenty-first", "twenty-second", "twenty-third", "twenty-fourth", "twenty-fifth",
      "twenty-sixth", "twenty-seventh", "twenty-eighth", "twenty-ninth", "thirtieth",
      "thirty-first"};
  private static final String[] strMonth = new String[]{"January", "February", "March", "April",
      "May", "June", "July", "August", "September", "October", "November", "December"};
  private static final String[] strYear = new String[]{};
  private int year;
  private int month;
  private int day;

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = Math.max(month, 0);
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = Math.max(year, 1900);
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = Math.max(day, 0);
  }

  public static int currentYear() {
    return LocalDate.now().getYear();
  }

  public static int currentMonth() {
    return LocalDate.now().getMonthValue();
  }

  public static int currentDay() {
    return LocalDate.now().getDayOfMonth();
  }

  public MyDate() {
    super();
    setYear(currentYear());
    setMonth(currentMonth());
    setDay(currentDay());
  }

  public MyDate(int year, int month, int day) {
    super();
    setYear(year);
    setMonth(month);
    setDay(day);
  }

  public MyDate(String format) {
    super();
    try {
      String[] cut = format.replaceAll("\\s+", " ").split("\\s");
      setYear(Integer.parseInt(cut[2]));
      for (int i = 0; i < 31; i++) {
        if (strDay[i].equals(cut[1])) {
          setDay(i + 1);
          break;
        }
      }
      for (int i = 0; i < 12; i++) {
        if (strDay[i].equals(cut[0])) {
          setMonth(i + 1);
          break;
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public MyDate(String day, String month, String year) {

  }

  public void accept(Scanner scanner) {
    System.out.println("Please enter a date (MMMM DDDD YYYY):");
    String aDate = scanner.nextLine();
    try {
      String[] cut = aDate.replaceAll("\\s+", " ").split("\\s");
      setYear(Integer.parseInt(cut[2]));
      for (int i = 0; i < 31; i++) {
        if (strDay[i].equals(cut[1])) {
          setDay(i + 1);
          break;
        }
      }
      for (int i = 0; i < 12; i++) {
        if (strDay[i].equals(cut[0])) {
          setMonth(i + 1);
          break;
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void print() {
    System.out.println(
        strMonth[currentMonth() - 1] + " " + strDay[currentDay() - 1] + " " + currentYear());
  }

  public void printDate(String format) {
    try {
      LocalDate date = LocalDate.of(this.year, this.month, this.day);
      System.out.println(date.format(DateTimeFormatter.ofPattern(format)));
    } catch (Exception e) {
      System.out.println("Out of format");
    }
  }

}