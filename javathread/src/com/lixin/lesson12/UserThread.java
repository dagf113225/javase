package com.lixin.lesson12;

public class UserThread extends Thread
{
	// synchronizedͬ����ȫ�����η������������������
	//����ס��ǰ��:���̱߳������ͬһ�����������
	@Override
	public synchronized void run()
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getName() + "-->" + i);
		}
	}

}
