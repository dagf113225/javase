package com.lixin.lesson15;

public class UserThread extends Thread
{
	//Object  obj  =new Object();
	Object  obj =null;
	public  UserThread(	Object  obj)
	{
		this.obj=obj;
	}
	
	// synchronizedͬ����ȫ�����η������������������
	//����ס��ǰ��:���̱߳������ͬһ�����������
	@Override
	public  void run()
	{
		//Object  obj  =new Object();
		
		System.out.println(Thread.currentThread().getName() +"��ӭ����ִ��.........��ʼ");
		
		synchronized(obj)
		{
			// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++)
			{
				System.out.println(Thread.currentThread().getName() + "-->" + i);
			}
		}
		
		System.out.println(Thread.currentThread().getName() +"��ӭ�������.........����");
	}

}
