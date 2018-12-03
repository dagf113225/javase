package com.lixin.lesson2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Test
{

	public static void main(String[] args)
	{

		// ��ʱ��������
		// ����һ����ʱ��
		Timer t = new Timer();

		// ��ʱ��ȥ���������ʱ�����߳�
		// 1.new UserTask() ��ʱ�߳������
		// 2.1000,��ʱ���ٺ���
		// 3.3000,��������룬����ִ��
		//t.schedule(new UserTask(), 1000, 3000);

		String strDate = "2018-12-03 09:02:00";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// �ַ�����������ת����Data
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
