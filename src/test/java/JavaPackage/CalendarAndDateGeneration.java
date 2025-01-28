package JavaPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class CalendarAndDateGeneration {

	@Test
	public void genarateDate() {
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		String currentdate = formater.format(date);
		System.out.println(currentdate);
		System.out.println(date.toString());
		
	}
	
	@Test
	public void generateByCalendar() {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		
	}
	
	
}
