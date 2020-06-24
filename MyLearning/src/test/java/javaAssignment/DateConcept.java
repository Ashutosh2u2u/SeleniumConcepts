package javaAssignment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateConcept
{
public static void main(String arg[])
{
	Date Today=new Date();	
	//required date format
	SimpleDateFormat sdf= new SimpleDateFormat("EEEEEE,MMMM dd,yyyy hh:mm:ss");
	System.out.println(Today.toString());
	Calendar cal=new GregorianCalendar();
	//today date
	cal.setTime(Today);
	//date after 90 days
	cal.add(Calendar.DAY_OF_MONTH, 90);
	Date today90=cal.getTime();
	System.out.println(today90.toString());
	//Format the date
	System.out.println(sdf.format(today90));
}
}
