package com.lixin.lesson28;

import java.util.concurrent.CountDownLatch;

public class LastThread  extends  Thread
{
	CountDownLatch  c ;
	public LastThread(CountDownLatch  c )
	{
		
		this.c=c;
		
	}
	public void  run()
	{
		System.out.println("�������߳���������ִ��....");
		try
		{
			//��ǰ���̱߳�����
			this.c.await();
			
			System.out.println("����Javamail�ʼ����û�������ӱ���û�״̬..");
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
