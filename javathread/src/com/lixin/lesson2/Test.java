package com.lixin.lesson2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Test
{

	public static void main(String[] args)
	{

		// 定时器来启动
		// 创建一个定时器
		Timer t = new Timer();

		// 定时器去调度这个定时任务线程
		// 1.new UserTask() 定时线程类对象
		// 2.1000,延时多少毫秒
		// 3.3000,间隔多少秒，反复执行
		//t.schedule(new UserTask(), 1000, 3000);

		String strDate = "2018-12-03 09:02:00";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// 字符串的日期类转换成Data
		Date startDate = null;
		try
		{
			startDate = sdf.parse(strDate);
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t.schedule(new UserTask(), startDate, 5000);
	}

}
