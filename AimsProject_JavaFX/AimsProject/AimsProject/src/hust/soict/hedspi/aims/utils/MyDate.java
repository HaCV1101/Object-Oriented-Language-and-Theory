package hust.soict.hedspi.aims.utils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
public class MyDate {
	private int day;
	private int month;
	private int year;
	static HashMap<String, Integer> numbers= new HashMap<String, Integer>();

    static HashMap<String, Integer> tnumbers= new HashMap<String, Integer>();
    
    static HashMap<String, Integer> dnumbers = new HashMap<String,Integer>();

    static {
        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);
        numbers.put("ten", 10);
        numbers.put("eleven", 11);
        numbers.put("twelve", 12);
        numbers.put("thirteen", 13);
        numbers.put("fourteen", 14);
        numbers.put("fifteen", 15);
        numbers.put("sixteen", 16);
        numbers.put("seventeen", 17);
        numbers.put("eighteen", 18);
        numbers.put("nineteen", 19);


        tnumbers.put("twenty", 20);
        tnumbers.put("thirty", 30);
        tnumbers.put("fourty", 40);
        tnumbers.put("fifty", 50);
        tnumbers.put("sixty", 60);
        tnumbers.put("seventy", 70);
        tnumbers.put("eighty", 80);
        tnumbers.put("ninety", 90);

        //numbers.put("", );
        dnumbers.put("second", 2);
        dnumbers.put("first", 1);
        dnumbers.put("third", 3);
        dnumbers.put("fourth", 4);
        dnumbers.put("fifth", 5);
        dnumbers.put("sixth", 6);
        dnumbers.put("seventh", 7);
        dnumbers.put("eigth", 8);
        dnumbers.put("ninth", 9);
        dnumbers.put("tenth", 10);
        dnumbers.put("eleventh", 11);
        dnumbers.put("twelfth", 12);
        dnumbers.put("thirdteenth", 13);
        dnumbers.put("fourteenth", 14);
        dnumbers.put("fifteenth", 15);
        dnumbers.put("sixteenth", 16);
        dnumbers.put("seventeenth", 17);
        dnumbers.put("eighteenth", 18);
        dnumbers.put("nineteenth", 19);
        dnumbers.put("twentieth", 20);
        dnumbers.put("twenty first", 21);
        dnumbers.put("twenty second", 22);
        dnumbers.put("twenty third", 23);
        dnumbers.put("twenty fourth", 24);
        dnumbers.put("twenty fifth", 25);
        dnumbers.put("twenty sixth", 26);
        dnumbers.put("twenty senventh", 27);
        dnumbers.put("twenty eigth", 28);
        dnumbers.put("twenty ninth", 29);
        dnumbers.put("thirtieth", 30);
        dnumbers.put("thirty first", 31);
    }
	
    
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
		super();
		LocalDate currentdate = LocalDate.now();
		this.day = currentdate.getDayOfMonth();
		this.month = currentdate.getMonthValue();
		this.year = currentdate.getYear();
		
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public static String wordToNumber(String input) {
		
        String sum= "";
        Integer temp=null;
//        Integer previous=0;
        String [] splitted= input.toLowerCase().split(" ");
        int flag = 0;
        for(String split:splitted){

            if( numbers.get(split)!=null){
                temp= numbers.get(split);
                if(flag ==1 && temp <10) {
                	sum = ""+(Integer.parseInt(sum)+temp);
                }else {                	
                	sum=sum+temp;
                }
            }
            else if(tnumbers.get(split)!=null){
                temp=tnumbers.get(split);
                flag = 1;
                sum=sum+temp;
            }

        }

        return sum;
    }
	
	private static String DayNumberSuffix(int day) {
	    if (day >= 11 && day <= 13) {
	        return "th";
	    }
	    switch (day % 10) {
	    case 1:
	        return "st";
	    case 2:
	        return "nd";
	    case 3:
	        return "rd";
	    default:
	        return "th";
	    }
	}
	
	public MyDate(String day, String month, String year) {
		super();
		String yearInt = wordToNumber(year);
		day = ""+dnumbers.get(day);
		if(day.length() == 1) {
			day = "0"+ day;
		}
		String Date = month + " "+day +" "+ yearInt;
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM dd yyyy");
		try {
			LocalDate date = LocalDate.parse( Date, dateFormat);
			this.day = date.getDayOfMonth();
			this.month = date.getMonthValue();
			this.year = date.getYear();	
//			System.out.println(date);
		}catch(RuntimeException e){
			System.out.println(e);
		}
	}
	public MyDate(String Date) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM dd yyyy");
		try {
			LocalDate date = LocalDate.parse( Date, dateFormat);
			System.out.println(date);
			this.day = date.getDayOfMonth();
			this.month = date.getMonthValue();
			this.year = date.getYear();	
		}catch(RuntimeException e){
			System.out.println("Date Error!");
		}
	}
	
	public void accept() {
		Scanner keyboard = new Scanner( System.in);
		String Date;
		System.out.println("Nhap date: ");
		Date = keyboard.next();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM dd yyyy");
		try {
			LocalDate date = LocalDate.parse( Date, dateFormat);
			this.day = date.getDayOfMonth();
			this.month = date.getMonthValue();
			this.year = date.getYear();	
		}catch(RuntimeException e){
			System.out.println("Date Error!");
		}
		keyboard.close();	
	}
	
	public static void print() {
		String pattern = "MMMM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		String []splitted = date.split("-");
		String dayTh = DayNumberSuffix(Integer.parseInt(splitted[1]));
		date = splitted[0]+ "-" +splitted[1]+dayTh + "-"+ splitted[2];
		System.out.println(date);
	}
	
	public static void anotherPrint() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
	}
	
	public String toString() {
		String day = ""+this.getDay() + "-"+this.getMonth() +"-"+ this.getYear();
		return day;
	}
}
