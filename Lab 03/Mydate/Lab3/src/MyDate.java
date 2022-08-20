import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate
        extends GregorianCalendar {
    private int day, month, year;

    Calendar calndr = Calendar.getInstance();
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public MyDate() {
        year =calndr.get(Calendar.YEAR);
        month=calndr.get(Calendar.MONTH);
        day=calndr.get(Calendar.DATE);

    }
    public MyDate(int day, int month, int year ) {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public MyDate (String Date) {
        StringTokenizer myTokens=new StringTokenizer(Date," ");
        String Day,Month, Year;
        Month=myTokens.nextToken();
        Day=myTokens.nextToken();
        Year=myTokens.nextToken();
        int ngay=0, thang=0, nam=0;
        //thang
        if(Month.equalsIgnoreCase("January"))
            thang=1;
        else if (Month.equalsIgnoreCase("February"))
            thang=2;
        else if (Month.equalsIgnoreCase("March"))
            thang=3;
        else if (Month.equalsIgnoreCase("April"))
            thang=4;
        else if (Month.equalsIgnoreCase("May"))
            thang=5;
        else if (Month.equalsIgnoreCase("June"))
            thang=6;
        else if (Month.equalsIgnoreCase("July"))
            thang=7;
        else if (Month.equalsIgnoreCase("August"))
            thang=8;
        else if (Month.equalsIgnoreCase("September"))
            thang=9;
        else if (Month.equalsIgnoreCase("October"))
            thang=10;
        else if (Month.equalsIgnoreCase("November"))
            thang=11;
        else if (Month.equalsIgnoreCase("December"))
            thang=12;
        else {
            System.out.println("Invalid Month!");
        }
        // ngay
        if(Day.equalsIgnoreCase("31st"))
            ngay=31;
        else if(Day.equalsIgnoreCase("30th"))
            ngay=30;
        else if(Day.equalsIgnoreCase("29th"))
            ngay=29;
        else if(Day.equalsIgnoreCase("28th"))
            ngay=28;
        else if(Day.equalsIgnoreCase("27th"))
            ngay=27 ;
        else if(Day.equalsIgnoreCase("26th"))
            ngay=26;
        else if(Day.equalsIgnoreCase("25th"))
            ngay=25;
        else if(Day.equalsIgnoreCase("24th"))
            ngay=24;
        else if(Day.equalsIgnoreCase("23th"))
            ngay=23;
        else if(Day.equalsIgnoreCase("22th"))
            ngay=22 ;
        else if(Day.equalsIgnoreCase("21th"))
            ngay=21;
        else if(Day.equalsIgnoreCase("20th"))
            ngay=20;
        else if(Day.equalsIgnoreCase("19th"))
            ngay=19;
        else if(Day.equalsIgnoreCase("18th"))
            ngay=18;
        else if(Day.equalsIgnoreCase("17th"))
            ngay=17;
        else if(Day.equalsIgnoreCase("16th"))
            ngay=16;
        else if(Day.equalsIgnoreCase("15th"))
            ngay=15;
        else if(Day.equalsIgnoreCase("14h"))
            ngay=14;
        else if(Day.equalsIgnoreCase("13th"))
            ngay=13;
        else if(Day.equalsIgnoreCase("12th"))
            ngay=12;
        else if(Day.equalsIgnoreCase("11th"))
            ngay=11;
        else if(Day.equalsIgnoreCase("10th"))
            ngay=10;
        else if(Day.equalsIgnoreCase("9th"))
            ngay=9;
        else if(Day.equalsIgnoreCase("8th"))
            ngay=8;
        else if(Day.equalsIgnoreCase("7th"))
            ngay=7;
        else if(Day.equalsIgnoreCase("6th"))
            ngay=6;
        else if(Day.equalsIgnoreCase("5th"))
            ngay=5;
        else if(Day.equalsIgnoreCase("4th"))
            ngay=4;
        else if(Day.equalsIgnoreCase("3rd"))
            ngay=3;
        else if(Day.equalsIgnoreCase("2nd"))
            ngay=2;
        else if(Day.equalsIgnoreCase("1st"))
            ngay=1;
        else {
            System.out.println("Invalid Date!");
        }
        //nÄƒm
        nam=Integer.parseInt(Year);
        this.day=ngay;
        this.month=thang;
        this.year=nam;

    }

    //print current date
    public void print() {
        System.out.println("The given calendar's"
                + " year is: " + calndr.get(Calendar.YEAR));
        System.out.println("The given calendar's"
                + " month is: " + (calndr.get(Calendar.MONTH)+1));
        System.out.println("The given calendar's"
                + " day is: " + calndr.get(Calendar.DATE));
    }
    public void accept () {
        MyDate Date;
        Scanner ip= new Scanner(System.in);
        String date;
        System.out.print("Input Month/Date/Year: (Ex: February 18th 2019): ");
        date = ip.nextLine();
        Date=new MyDate(date);


    }
}





