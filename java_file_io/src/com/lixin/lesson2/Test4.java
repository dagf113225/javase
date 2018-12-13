package com.lixin.lesson2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Test4
{

	public static void main(String[] args)
	{
		Timer  timer  = new Timer();
		String startdate="2018-12-13 10:10:00";
		
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		Date startDate =null;
		try
		{
			startDate = sdf.parse(startdate);
			timer.schedule(new UserTask(), startDate, 5000);
			
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
