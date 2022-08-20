package hust.soict.hedspi.test.utils;
import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

import java.util.List;
import java.util.ArrayList;
public class DateTest {
	public static void main(String[] args) {
		MyDate.print();
		System.out.println(MyDate.wordToNumber("twenty sixteen"));
		MyDate date = new MyDate("second", "September", "twenty sixteen");
		MyDate.anotherPrint();
		System.out.println(date);
		MyDate date1 = new MyDate("first","August", "twenty sixteen");
		System.out.println("" + date1.getDay() + "/"+date1.getMonth()+"/"+date1.getYear());
		try {
			
			System.out.println(DateUtils.compareTwoDate(date1,date));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		List<MyDate>list = new ArrayList<MyDate>();
		list.add(date);
		list.add(date1);
		MyDate date3 = new MyDate("first","August", "twenty nineteen");
		list.add(date3);
		DateUtils.sortingANumberOfDates(list);
		
		System.out.println("list is: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
		
	}
}
