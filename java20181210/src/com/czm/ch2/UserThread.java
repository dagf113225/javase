package com.czm.ch2;

public class UserThread extends Thread
{
	double a;
	
	
	int sum=0;

	public UserThread(double a)
	{

		this.a = a;

	}

	public void run()
	{
		synchronized (this)
		{
			for(int i=0;i<=100;i++)
			{
				sum+=i;
			}
			
			//10.099 
			sum=sum+(int)a;//5050+20
			
			//���Ѻ�������ͬһ����������ı��������̼߳�������
			this.notify();
			
		}

	}
	
	public int  getSum()
	{
		return this.sum;
	}

}
