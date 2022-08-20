package hust.soict.hedspi.aims.utils;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class DateUtils {
	public static int compareTwoDate(MyDate date1, MyDate date2) throws Exception {
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");   
		String date1Str = "" + date1.getDay() + "/"+date1.getMonth()+"/"+date1.getYear();
		Date date1_ = formatter.parse(date1Str);
		String date2Str = "" + date2.getDay() + "/"+date2.getMonth()+"/"+date2.getYear();
		Date date2_ = formatter.parse(date2Str);

		if (date1_.before(date2_)) {
//		    System.out.println("Date1 is before Date2");
		    return -1;
		}
		if(date1_.after(date2_)) {
			return 1;
		}
		return 0;
	}
	
	public static void sortingANumberOfDates(List<MyDate> list) {
		Collections.sort(list, new Comparator<MyDate>() {
            @Override
            public int compare(MyDate o1, MyDate o2){
            	int result=0;
                try {              	
                	result =  compareTwoDate(o1,o2);
                }catch(Exception e) {
                	e.printStackTrace();
                }
                return result;
            }
        });
	}
}
