package com.flipkart.genericlib;

import java.text.DateFormat;
import java.util.Date;

public class TimeStamp 
{
	public static void getTimeStamp()
	{
		DateFormat df = DateFormat.getDateTimeInstance();
		Date dt = new Date();
		String DateValue = df.format(dt);
		
		//replace : with - in time stamp
		//DateValue = DateValue.replaceAll(":", "-");
		
		//replace , with blank space in time stamp
		//DateValue = DateValue.replaceAll(",", " ");

		//print time stamp when it executed
		System.out.println("Test case executed Time Stamp : "+ DateValue);
	}
}
