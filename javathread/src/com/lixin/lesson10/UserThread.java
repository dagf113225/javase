package com.lixin.lesson10;

public class UserThread  extends Thread
{

	
	int sum=0;
	
	public void  run()
	{
		//子线程去求1..100之和
		for(int i=0;i<=100;i++)
		{
			sum+=i;
		}
	}
	
	public  int   getSum()
	{
		return this.sum;
	}
}
