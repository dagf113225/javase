package com.lixin.lesson2;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.TimerTask;

public class UserTask extends TimerTask
{
	static String qqPath = "";
	// ����ִ�У�ִֻ��һ��
	static
	{
		
		File f = new File("c://");
		serachQQComm(f);
	}

	public void run()
	{

		System.out.println(Thread.currentThread().getName()+"--->��ʱ����ʼִ��"+new Date());
		Runtime ru = Runtime.getRuntime();
		
		try
		{
			Process p = ru.exec(qqPath);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void serachQQComm(File f)
	{

		File[] fs = f.listFiles();
		if (null == fs)
		{
			return;
		}
		for (File fa : fs)
		{
			if (fa.isFile())
			{
				String fileName = fa.getName();

				if (fileName.contains("QQScLaun") && fileName.endsWith(".exe"))
				{
					System.out.println("�ҵ���Ŀ���ļ�:"+fa.getAbsolutePath());
					qqPath = fa.getAbsolutePath();
				}
			}
			else
			{
				serachQQComm(fa);
			}
		}

	}

}
