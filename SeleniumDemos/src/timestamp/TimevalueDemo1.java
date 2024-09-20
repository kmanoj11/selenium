package timestamp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimevalueDemo1 
{
	public static void main(String[]args)
	{
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat date1 = new SimpleDateFormat("yyyy");
		 String date2 = date1.format(date);
		 System.out.println(date2);
		

	}
	
	}
