package com.lixin.lesson14;

public class UserRunn implements Runnable
{
	
	//int  a=10;

	// synchronizedͬ����ȫ�����η������������������
	@Override
	public   void run()
	{
		System.out.println(Thread.currentThread().getName()
				+ "��ӭ����ִ��.........��ʼ");
		
		synchronized(this)//()�� ���ǻ������ݣ���������������,ͬһ������
		{
			// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++)
			{
				System.out.println(Thread.currentThread().getName() + "-->" + i);
			}
		}
		
		System.out.println(Thread.currentThread().getName()
				+ "��ӭ�������.........����");
	}

}
