package com.lixin.lesson2;

import java.util.Date;
import java.util.TimerTask;

//��ʱ�̣߳������߳�
public class UserTask  extends  TimerTask
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"-->run"+new Date());
	}

}
