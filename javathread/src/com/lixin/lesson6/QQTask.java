package com.lixin.lesson6;

import java.io.IOException;
import java.util.TimerTask;

public class QQTask extends TimerTask
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		// Java当中有一个运行的的类
		Runtime runtime = Runtime.getRuntime();

		try
		{
			Process pc = runtime
					.exec("C:\\Program Files (x86)\\Tencent\\TIM\\Bin\\QQScLauncher.exe");
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
