package dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example 
{
	public static void main(String[] args) 
	{
		LocalDate ld= LocalDate.now();
		System.out.println(ld);
		
		DateTimeFormatter format =DateTimeFormatter.ofPattern("eee:dd:MMMM");
		
		String date =ld.format(format);
		System.out.println(date);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String time = lt.format(formatTime);
		System.out.println(time);
	}
	
}
