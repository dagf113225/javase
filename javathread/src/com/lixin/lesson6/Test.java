package com.lixin.lesson6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

//C:\Program Files (x86)\Tencent\TIM\Bin\QQScLauncher.exe
public class Test
{
	
	public static void main(String[] args)
	{
		
		//����һ����ʱ��
		Timer  t = new Timer();
		
		String stDate="2018-12-03 09:50:00";
		
		//����ת����ʽ��
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try
		{
			Date  DstDate=sdf.parse(stDate);
			
			t.schedule(new QQTask(), DstDate, 100);
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
